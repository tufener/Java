package DAO;

import java.sql.*;
import model.Personne;

public class Dao {
//	CREATE
	
	public void create(Personne p)throws ClassNotFoundException, SQLException{
		Class.forName("com.mysql.jdbc.Driver") ;
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/cgi", "root", "root" );
		String sql = "insert into personnes values( "+p.getId()+", '"+p.getNom()+"','"+p.getPrenom()+"' )";
		Statement st=conn.createStatement();
		st.executeUpdate(sql);
		st.close();
		conn.close();
	
	}
}
