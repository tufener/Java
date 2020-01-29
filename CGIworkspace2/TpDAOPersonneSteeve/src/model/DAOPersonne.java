package model;

import java.sql.*;
import java.util.ArrayList;

public class DAOPersonne {

	public DAOPersonne() {

	}

	public ArrayList<Personne> selectAll() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/cgi", "root", "root");

		String sql = "SELECT * FROM personnes";
		Statement st = conn.createStatement();

		ResultSet rs = st.executeQuery(sql);

		ArrayList<Personne> personnes = new ArrayList<Personne>();

		while (rs.next()) {
			Personne p = new Personne();
			p.setId(rs.getInt(1));
			p.setNom(rs.getString(2));
			p.setPrenom(rs.getString("prenom"));

			personnes.add(p);
		}

		st.close();
		conn.close();
		return personnes;
	}

	public Personne findById(int id) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/cgi", "root", "root");

		String sql = "SELECT * FROM personnes WHERE id=" + id;
		Statement st = conn.createStatement();

		ResultSet rs = st.executeQuery(sql);

		Personne p = new Personne();

		if (rs.next()) {
			p.setId(rs.getInt(1));
			p.setNom(rs.getString(2));
			p.setPrenom(rs.getString("prenom"));
		}

		st.close();
		conn.close();
		return p;
	}

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

	public void update(Personne p) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/cgi", "root", "root");

		String sql = "UPDATE personnes SET  nom=?, prenom=? WHERE id=?";
		PreparedStatement st = conn.prepareStatement(sql);

		st.setString(1, p.getNom());
		st.setString(2, p.getPrenom());
		st.setInt(3, p.getId());

		st.executeUpdate();
		conn.close();
	}

	public void delete(Personne p) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/cgi", "root", "root");

		String sql = "DELETE FROM personnes WHERE id=" + p.getId();
		Statement st = conn.createStatement();

		st.executeUpdate(sql);

		conn.close();
	}

	public void delete(int id) throws ClassNotFoundException, SQLException {
		Personne p = this.findById(10);
		this.delete(p);
	}

	public ArrayList<Personne> findByRange(int idMin, int idMax) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/cgi", "root", "root");

		String sql = "SELECT * FROM personnes WHERE id BETWEEN ? AND ?";
		PreparedStatement st = conn.prepareStatement(sql);
		st.setInt(1, idMin);
		st.setInt(2, idMax);

		ResultSet rs = st.executeQuery();

		ArrayList<Personne> personnes = new ArrayList<Personne>();

		while (rs.next()) {
			Personne p = new Personne();
			p.setId(rs.getInt(1));
			p.setNom(rs.getString(2));
			p.setPrenom(rs.getString("prenom"));
			personnes.add(p);
		}

		st.close();
		conn.close();
		return personnes;
	}
}
