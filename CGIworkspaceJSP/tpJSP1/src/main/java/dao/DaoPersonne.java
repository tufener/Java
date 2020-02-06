package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import model.Personne;

public class DaoPersonne {
	
	public void create(Personne p) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/cgi", "root", "root");

		String sql = "INSERT INTO personnes(id,nom,prenom) VALUES(?,?,?)";
		PreparedStatement st = conn.prepareStatement(sql);
		st.setInt(1, p.getId());
		st.setString(2, p.getNom());
		st.setString(3, p.getPrenom());

		st.executeUpdate();
		conn.close();
	}

}
