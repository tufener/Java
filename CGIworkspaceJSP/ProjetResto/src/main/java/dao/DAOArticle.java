package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.mysql.jdbc.Driver;

import model.Article;

public class DAOArticle {

	public Article findById(int id) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurant", "root", "root");

		String sql = "SELECT * FROM articles WHERE idArticles=" + id;
		Statement st = conn.createStatement();

		ResultSet rs = st.executeQuery(sql);

		Article a = null;

		if (rs.next()) {
			a = new Article();
			a.setId(rs.getInt(1));
			a.setName(rs.getString(2));
			a.setDesc(rs.getString(3));
			a.setPrice(rs.getInt(4));
		}

		st.close();
		conn.close();
		return a;
	}
	
	public ArrayList<Article> getAll() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurant", "root", "root");

		String sql = "SELECT * FROM articles";
		Statement st = conn.createStatement();

		ResultSet rs = st.executeQuery(sql);

		ArrayList<Article> articles = new ArrayList<Article>();

		while (rs.next()) {
			Article a = new Article();
			a.setId(rs.getInt(1));
			a.setName(rs.getString(2));
			a.setDesc(rs.getString(3));
			a.setPrice(rs.getInt(4));

			articles.add(a);
		}

		st.close();
		conn.close();
		return articles;
	}
}
