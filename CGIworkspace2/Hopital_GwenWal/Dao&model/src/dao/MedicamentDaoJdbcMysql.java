package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


import model.Medicament;


public class MedicamentDaoJdbcMysql implements DaoMedicament {
	
	private final String connId="jdbc:mysql://localhost:3306/hopital";
	private final String hostname="root";
	private final String pwd="root";
	
	
	public ArrayList<Medicament> findAll() throws ClassNotFoundException, SQLException{
		Class.forName("com.mysql.jdbc.Driver");
		Connection connection=DriverManager.getConnection(connId, hostname,pwd );
		
		String sql="select * from medicament" ;
		PreparedStatement pstmt = connection.prepareStatement(sql);
		
		ResultSet rs = pstmt.executeQuery();
		ArrayList<Medicament> select=new ArrayList<Medicament>();
		
		while (rs.next()){
			Medicament ind=new Medicament();
			ind.setIdMedicament(rs.getInt("idMedicament"));
			ind.setNomMedicament(rs.getString("nomMedicament"));
			ind.setPrix(rs.getFloat("prix"));
			ind.setQuantite(rs.getInt("quantite"));
			select.add(ind);
			}
		
		connection.close();
		return select;
	}
	
	public  ArrayList<Medicament> findByChar( String Char) throws ClassNotFoundException, SQLException{
		Class.forName("com.mysql.jdbc.Driver");
		Connection connection=DriverManager.getConnection(connId, hostname,pwd );
		String sql="select * from medicament where nomMedicament like '"+Char+"%'" ;
		PreparedStatement pstmt = connection.prepareStatement(sql);
		
		ResultSet rs = pstmt.executeQuery();
		ArrayList<Medicament> ind= new ArrayList<Medicament>();
		while (rs.next()){
			Medicament indi=new Medicament();
			indi.setIdMedicament(rs.getInt("idMedicament"));
			indi.setNomMedicament(rs.getString("nomMedicament"));
			indi.setPrix(rs.getDouble("prix"));
			indi.setQuantite(rs.getInt("quantite"));
			ind.add(indi);
			}
		
		connection.close();
		return ind;
	}
	public void create(Medicament Medicament) throws ClassNotFoundException, SQLException{
		Class.forName("com.mysql.jdbc.Driver");
		Connection connection=DriverManager.getConnection(connId, hostname,pwd );
		String sql="insert into medicament values (?,?,?,?)" ;
		PreparedStatement pstmt = connection.prepareStatement(sql);
		pstmt.setInt(1, Medicament.getIdMedicament());
		pstmt.setString(2, Medicament.getNomMedicament());
		pstmt.setDouble(3, Medicament.getPrix());
		pstmt.setInt(4, Medicament.getQuantite());
		
		pstmt.executeUpdate();

		
		connection.close();

	}

	@Override
	public Medicament findById(Integer i) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection connection=DriverManager.getConnection(connId, hostname,pwd );
		String sql="select * from medicament where idMedicament="+i ;
		PreparedStatement pstmt=connection.prepareStatement(sql);
		
		ResultSet rs = pstmt.executeQuery();
		Medicament indi=null;
		while (rs.next()){

			indi=new Medicament();
			indi.setIdMedicament(rs.getInt("idMedicament"));
			indi.setNomMedicament(rs.getString("nomMedicament"));
			indi.setPrix(rs.getDouble("prix"));
			indi.setQuantite(rs.getInt("quantite"));
		
		}
		return indi;
	}

	@Override
	public void update(Medicament Medicament) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection connection=DriverManager.getConnection(connId, hostname,pwd );
		String sql="update medicament set quantite=? where idMedicament=?" ;
		PreparedStatement pstmt = connection.prepareStatement(sql);
		pstmt.setInt(1, Medicament.getQuantite());
		pstmt.setInt(2, Medicament.getIdMedicament());
		
		pstmt.executeUpdate();

		
		connection.close();
		
	}

	@Override
	public void delete(Medicament obj) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
	}








}
