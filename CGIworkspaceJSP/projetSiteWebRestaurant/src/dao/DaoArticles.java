package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import model.*;

public class DaoArticles {
	
	public ArrayList<Articles> selectAll() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurant", "root", "root");

		String sql = "SELECT * FROM articles";
		Statement st = conn.createStatement();

		ResultSet rs = st.executeQuery(sql);

		ArrayList<Articles> articles = new ArrayList<Articles>();

		while (rs.next()) {
			Articles a = new Articles();
			a.setIdArticles(rs.getInt(1));
			a.setArticles(rs.getString(2));
			a.setDescription(rs.getString(3));
			a.setPrix(rs.getInt(4));
			

			articles.add(a);
		}

		st.close();
		conn.close();
		return articles;
	}
	
	public Articles findByPrix(int prix) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurant", "root", "root");

		String sql = "SELECT * FROM clients WHERE prix=" + prix;
		Statement st = conn.createStatement();

		ResultSet rs = st.executeQuery(sql);

	Articles a = null;

		if (rs.next()) {
			a = new Articles();
			a.setIdArticles(rs.getInt(1));
			a.setArticles(rs.getString(2));
			a.setDescription(rs.getString(3));
			a.setPrix(rs.getInt(4));
		}

		st.close();
		conn.close();
		return a;
	}

}
