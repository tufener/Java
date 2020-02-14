package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import model.Client;

public class DAOClient {

	public boolean createClient(Client c) throws ClassNotFoundException, SQLException {
		boolean res = false;
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurant", "root", "root");

		String sql = "SELECT * FROM client WHERE id = '" + c.getId() + "'";
		StringBuilder sb = new StringBuilder();

		Statement st = conn.createStatement();

		ResultSet rs = st.executeQuery(sql);

		if (!rs.first()) {
			String sql2 = "INSERT INTO client(id, password, nom, prenom, adresse) VALUES(?,?,?,?,?)";
			StringBuilder sb2 = new StringBuilder();

			PreparedStatement st2 = conn.prepareStatement(sql2);

			st2.setInt(1, c.getId());
			st2.setString(2, c.getPassword());
			st2.setString(3, c.getNom());
			st2.setString(4, c.getPrenom());
			st2.setString(5, c.getAdresse());
			st2.executeUpdate();
			res = true;
		}
		conn.close();
		return res;
	}

	public Client login(int login) throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurant", "root", "root");

		String sql = "SELECT * FROM client WHERE id = '" + login + "'";
		StringBuilder sb = new StringBuilder();

		Statement st = conn.createStatement();

		ResultSet rs = st.executeQuery(sql);
		Client c = new Client();
		if (rs.next()) {
			c.setId(rs.getInt("id"));
			c.setPassword(rs.getString("password"));
			c.setNom(rs.getString("nom"));
			c.setPrenom(rs.getString("prenom"));
			c.setAdresse(rs.getString("adresse"));
		}
		conn.close();
		System.out.println(c.getId() + c.getPassword() + c.getNom() + c.getPrenom() + c.getAdresse());
		return c;
	}
}
