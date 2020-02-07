package dao;

import java.sql.*;

public class DAOPersonne {

	public void create(int id, String nom, String prenom) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/cgi", "root", "root");

		String sql = "INSERT INTO personnes(id ,nom , prenom) VALUES(?,?,?)";
		PreparedStatement st = conn.prepareStatement(sql);
		st.setInt(1, id);
		st.setString(2, nom);
		st.setString(3, prenom);

		st.executeUpdate();
		conn.close();
	}
}
