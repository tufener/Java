package dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.Authentification;

public class AuthentificationDaoJdbcMysql {

	private final String connId="jdbc:mysql://localhost:3306/hopital";
	private final String hostname="root";
	private final String pwd="root";
	
public ArrayList<Authentification> findAll() throws ClassNotFoundException, SQLException{
	Class.forName("com.mysql.jdbc.Driver");
	Connection conn=DriverManager.getConnection(connId, hostname,pwd );
		String sql="select * from Authentification" ;
		PreparedStatement pstmt = conn.prepareStatement(sql);
			
			ResultSet rs = pstmt.executeQuery();
			ArrayList<Authentification> select=new ArrayList<Authentification>();
			
			while (rs.next()){
				Authentification ind=new Authentification();
				ind.setLogin(rs.getString("login"));
				ind.setMdp(rs.getString("mdp"));
				ind.setNom(rs.getString("nom"));
				select.add(ind);
				}
			
			conn.close();
			return select;
		
		}

public  Authentification findByLogin(String nom, String mdp) throws ClassNotFoundException, SQLException{
	Class.forName("com.mysql.jdbc.Driver");
	Connection conn=DriverManager.getConnection(connId, hostname,pwd );
	String sql="select * from authentification where login= ? and mdp=?" ;
	PreparedStatement pstmt = conn.prepareStatement(sql);
	pstmt.setString(1,nom);
	pstmt.setString(2,mdp);
	ResultSet rs = pstmt.executeQuery();
	Authentification ind=null;
	while (rs.next()){
		ind=new Authentification();
		ind.setNom(rs.getString("nom"));
		ind.setMetier(rs.getInt("metier"));
		}
	
	conn.close();
	return ind;

}

public  Authentification findByNom(String nom) throws ClassNotFoundException, SQLException{
	Class.forName("com.mysql.jdbc.Driver");
	Connection conn=DriverManager.getConnection(connId, hostname,pwd );
		String sql="select * from authentification where nom= ?" ;
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1,nom);
		ResultSet rs = pstmt.executeQuery();
		Authentification ind=null;
		while (rs.next()){
			ind=new Authentification();
			ind.setLogin(rs.getString("login"));
			ind.setMdp(rs.getString("mdp"));
			ind.setMetier(rs.getInt("metier"));
			}
		
		conn.close();
		return ind;

	}

	public void create(Authentification Authentification) throws ClassNotFoundException, SQLException{
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn=DriverManager.getConnection(connId, hostname,pwd );
		String sql="insert into authentification values (?,?,?,?)" ;
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, Authentification.getLogin());
		pstmt.setString(2, Authentification.getMdp());
		pstmt.setString(3, Authentification.getNom());
		pstmt.setInt(4, Authentification.getMetier());
		
		pstmt.executeUpdate();

		
		conn.close();

	}

	public void update(Authentification Authentification) throws ClassNotFoundException, SQLException{
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn=DriverManager.getConnection(connId, hostname,pwd );
		String sql="update authentification set metier=? ,nom=?, mdp=? where login=?" ;
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(4, Authentification.getLogin());
		pstmt.setString(3, Authentification.getMdp());
		pstmt.setInt(1, Authentification.getMetier());
		pstmt.setString(2, Authentification.getNom());
		pstmt.executeUpdate();

		
		conn.close();

	}


	public void delete(Authentification Authentification) throws ClassNotFoundException, SQLException{
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn=DriverManager.getConnection(connId, hostname,pwd );
		String sql="delete from authentification where login=?";
		PreparedStatement ps = conn.prepareStatement(sql);
		  
		// you can replace 1,2,3 with column names if your driver
		// supports a recent enough JDBC standard
		
		ps.setString(1,Authentification.getLogin());

		ps.executeUpdate();

		conn.close();

	}


	}


