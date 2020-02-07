package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import model.*;

public class DAOClient {
	
	public void create(Client c) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurant", "root", "root");

		String sql = "INSERT into clients(id, password, nom, prenom, adresse) VALUES(?,?,?,?,?)";
		PreparedStatement st = conn.prepareStatement(sql);
		st.setInt(1, c.getId());
		st.setString(2, c.getPassword());
		st.setString(3, c.getNom());
		st.setString(4, c.getPrenom());
		st.setString(5, c.getAddresse());

		st.executeUpdate();
		conn.close();
	}
	
	public Client findById(int id) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurant", "root", "root");

		String sql = "SELECT * FROM clients WHERE id=" + id;
		Statement st = conn.createStatement();

		ResultSet rs = st.executeQuery(sql);

		Client c = null;

		if (rs.next()) {
			c = new Client();
			c.setId(rs.getInt(1));
			c.setPassword(rs.getString(2));
			c.setNom(rs.getString(3));
			c.setPrenom(rs.getString(4));
			c.setAddresse(rs.getString(5));
		}

		st.close();
		conn.close();
		System.out.println(c);
		return c;
	}

}