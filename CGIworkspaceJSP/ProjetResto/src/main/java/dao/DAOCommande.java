package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import model.Client;

public class DAOCommande {
	public void create(int id, int total) throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurant", "root", "root");

		String sql = "INSERT into commandes (idClient, date, total) VALUES(?, sysdate(), ?)";
		PreparedStatement st = conn.prepareStatement(sql);
		st.setInt(1, id);
		st.setInt(2, total);
		
		st.executeUpdate();
		conn.close();

	}

}
