package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.Patient;

public class PatientDaoJdbcMysql implements DaoPatient {
	
	private final String connId="jdbc:mysql://localhost:3306/hopital";
	private final String hostname="root";
	private final String pwd="root";

 
	public ArrayList<Patient> findAll() throws ClassNotFoundException, SQLException{
		Class.forName("com.mysql.jdbc.Driver");
		Connection connection=DriverManager.getConnection(connId, hostname,pwd );
		
		String sql="select * from patient" ;
		PreparedStatement pstmt = connection.prepareStatement(sql);
		
		ResultSet rs = pstmt.executeQuery();
		ArrayList<Patient> select=new ArrayList<Patient>();
		
		while (rs.next()){
			Patient ind=new Patient();
			ind.setId(rs.getInt("id"));
			ind.setNom(rs.getString("nom"));
			ind.setPrenom(rs.getString("prenom"));
			ind.setComplement(rs.getString("commentaire"));
			select.add(ind);
			}
		
		connection.close();
		return select;
	
	}

public  Patient findById(int id) throws ClassNotFoundException, SQLException{
	Class.forName("com.mysql.jdbc.Driver");
	Connection connection=DriverManager.getConnection(connId, hostname,pwd );
	String sql="select * from patient where id= ?" ;
	PreparedStatement pstmt = connection.prepareStatement(sql);
	pstmt.setInt(1, id);
	ResultSet rs = pstmt.executeQuery();
	Patient ind=null;
	while (rs.next()){
		ind=new Patient();
		ind.setId(rs.getInt("id"));
		ind.setNom(rs.getString("nom"));
		ind.setPrenom(rs.getString("prenom"));
		ind.setComplement(rs.getString("commentaire"));
		}
	
	connection.close();
	return ind;

}

public void create(Patient patient) throws ClassNotFoundException, SQLException{
	Class.forName("com.mysql.jdbc.Driver");
	Connection connection=DriverManager.getConnection(connId, hostname,pwd );
	String sql="insert into patient (id,nom ,prenom ,commentaire) values (?,?,?,?)" ;
	PreparedStatement pstmt = connection.prepareStatement(sql);
	pstmt.setInt(1,patient.getId());
	pstmt.setString(2, patient.getNom());
	pstmt.setString(3, patient.getPrenom());
	pstmt.setString(4, patient.getComplement());
	
	pstmt.executeUpdate();

	
	connection.close();

}

public void update(Patient p) throws ClassNotFoundException, SQLException{
	
	Connection connection = null;
	PreparedStatement ps = null;


}

public void updateComplement(int id,String Complement) throws ClassNotFoundException, SQLException{
	Class.forName("com.mysql.jdbc.Driver");
	Connection connection=DriverManager.getConnection(connId, hostname,pwd );
	String sql=("update patient set commentaire=? where id=?");
	PreparedStatement pstmt= connection.prepareStatement(sql);
	pstmt.setString(1, Complement);
	pstmt.setInt(2, id);
	pstmt.executeUpdate();

	connection.close();


}


public void delete(Patient p) throws ClassNotFoundException, SQLException{
	Class.forName("com.mysql.jdbc.Driver");
	Connection connection=DriverManager.getConnection(connId, hostname,pwd );
	
	String sql="delete from patient where id=?";
	PreparedStatement ps = connection.prepareStatement(sql);
	  
	// you can replace 1,2,3 with column names if your driver
	// supports a recent enough JDBC standard
	
	ps.setInt(1,p.getId());

	ps.executeUpdate();

	connection.close();

}

@Override
public Patient findById(Long id) throws ClassNotFoundException, SQLException {
	// TODO Auto-generated method stub
	return null;
}


}
