package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import model.Article;

public class DAOArticle {
	
	public ArrayList<Article> selectAll() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurant", "root", "root");
		String sql = "SELECT * FROM article";
		Statement st = conn.createStatement();

		ResultSet rs = st.executeQuery(sql);
		
		ArrayList<Article> liste = new ArrayList<Article>();
		
		Article a = null ;
		
		while (rs.next()) {
			a = new Article();
				a.setId(rs.getInt("id"));
				a.setNom(rs.getString("nom"));
				a.setDescription(rs.getString("description"));
				a.setPrix(rs.getInt("prix"));
				a.setType(rs.getInt("type"));
				a.setImg(rs.getString("img"));
				liste.add(a);
		}
		st.close();
		conn.close();
		return liste;
	}
	
	public Article findVisitebyNumero(int numero) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurant", "root", "root");
		String sql = "SELECT * FROM article WHERE id = " + numero;
		Statement st = conn.createStatement();

		ResultSet rs = st.executeQuery(sql);
		
		Article a = new Article();

		if(rs.next()) {
			a.setId(rs.getInt("id"));
			a.setNom(rs.getString("nom"));
			a.setDescription(rs.getString("description"));
			a.setPrix(rs.getInt("prix"));
			a.setType(rs.getInt("type"));
			a.setImg(rs.getString("img"));
		}
		
		st.close();
		conn.close();
		return a;
		
	}
}
