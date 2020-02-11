package dao;

import java.sql.*;
import java.util.*;

import model.*;

public class DaoArticle {
	public ArrayList<Article> findAll() throws ClassNotFoundException, SQLException {
		ArrayList<Article> articles = new ArrayList<Article>();
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurant", "root", "root");
		String sql = "select * from article";
		Statement st = conn.createStatement();
		ResultSet rs = st.executeQuery(sql);
		while (rs.next()) {
			Article a = new Article();
			a.setId(rs.getInt("id"));
			a.setArticle(rs.getString("Article"));
			a.setDescription(rs.getString("Description"));
			articles.add(a);
		}
		st.close();
		conn.close();
		return articles;
	}
	
	public Article findbyId(int id) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurant", "root", "root");
		String sql = "select * from article where id=" + id;
		Statement st = conn.createStatement();
		ResultSet rs = st.executeQuery(sql);
		Article a= null;
		if(rs.next()){
			a = new Article();
			a.setId(rs.getInt("id"));
			a.setArticle(rs.getString("article"));
			a.setDescription(rs.getString("description"));
			a.setPrix(rs.getInt("prix"));
		}
		st.close();
		conn.close();
		return a;
	}
}
