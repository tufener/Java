package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import model.Patient;

public class DAOPatient {

	public void create(Patient p) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbhopital", "root", "root");

		String sql = "INSERT INTO patient(id,nom,prenom, complement) VALUES(?,?,?,?)";
		PreparedStatement st = conn.prepareStatement(sql);
		st.setInt(1, p.getId());
		st.setString(2, p.getNom());
		st.setString(3, p.getPrenom());
		st.setString(4, p.getComplement());
		
		st.executeUpdate();
		conn.close();
	}
	
	public Patient findById(int numero) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbhopital", "root", "root");
		String sql = "SELECT * FROM patient WHERE id=" +numero;
		Statement st = conn.createStatement();

		ResultSet rs = st.executeQuery(sql);
		
		Patient p = null;
		
		if (rs.next()) {
		p = new Patient();
		p.setId(rs.getInt("id"));
		p.setNom(rs.getString("nom"));
		p.setPrenom(rs.getString("prenom"));
		p.setComplement(rs.getString("complement"));
		}
		st.close();
		conn.close();
		return p;
	}
	
	public void update(Patient p) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbhopital", "root", "root");
		
		String sql = "UPDATE patient set complement =? where id =?";
		
		PreparedStatement st = conn.prepareStatement(sql);
		st.setString(1, p.getComplement());
		st.setInt(2, p.getId());
		
		st.executeUpdate();
		conn.close();
	}
}
