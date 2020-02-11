package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import model.Articles;

public class DAOArticles {
	
	public Articles findById(int id) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurant", "root", "root");

		String sql = "SELECT * FROM articles WHERE idArticles=" + id;
		Statement st = conn.createStatement();

		ResultSet rs = st.executeQuery(sql);

		Articles a = null;

		if (rs.next()) {
			a = new Articles();
			a.setIdArticles(rs.getInt(1));
			a.setName(rs.getString(2));
			a.setDescription(rs.getString(3));
			a.setPrice(rs.getInt(4));
		}

		st.close();
		conn.close();
		System.out.println(a);
		return a;
	}

}
