package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import model.Medicament;

public class DAOMedicament {
	public ArrayList<Medicament> findAll() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbhopital", "root", "root");
		String sql = "SELECT * FROM medicament";
		
		Statement st = conn.createStatement();

		ResultSet rs = st.executeQuery(sql);
		
		ArrayList<Medicament> liste = new ArrayList<Medicament>();
		
		while(rs.next()) {
			Medicament m = new Medicament();
			m.setId(rs.getInt("id"));
			m.setNom(rs.getString("nom"));
			m.setPrix(rs.getInt("prix"));
			m.setStock(rs.getInt("stock"));
			
			liste.add(m);
		}
		
		st.close();
		conn.close();
		return liste;
	}
	
	public ArrayList<Medicament> findLike(String like) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbhopital", "root", "root");
		String sql = "SELECT * FROM medicament where nom like '%"+like+"%'";
		
		Statement st = conn.createStatement();

		ResultSet rs = st.executeQuery(sql);
		
		ArrayList<Medicament> liste = new ArrayList<Medicament>();
		
		while(rs.next()) {
			Medicament m = new Medicament();
			m.setId(rs.getInt("id"));
			m.setNom(rs.getString("nom"));
			m.setPrix(rs.getInt("prix"));
			m.setStock(rs.getInt("stock"));
			
			liste.add(m);
		}
		
		st.close();
		conn.close();
		return liste;
	}
	
	public Medicament findById(int id) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbhopital", "root", "root");

		String sql = "SELECT * FROM medicament WHERE id=" + id;
		Statement st = conn.createStatement();

		ResultSet rs = st.executeQuery(sql);

		Medicament m = new Medicament();

		if (rs.next()) {
			m = new Medicament();
			m.setId(rs.getInt("id"));
			m.setNom(rs.getString("nom"));
			m.setPrix(rs.getInt("prix"));
			m.setStock(rs.getInt("stock"));
		}

		st.close();
		conn.close();
		return m;
	}
	
	public void update(Medicament m) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbhopital", "root", "root");
		String sql = "UPDATE medicament SET stock=? WHERE id=?";
		PreparedStatement st = conn.prepareStatement(sql);
		
		st.setInt(1, m.getStock());
		st.setInt(2, m.getId());
		
		st.executeUpdate();
		conn.close();
	}
	
	
}
