package dao;

import java.util.List;

import java.sql.*;

import model.Patient;

public class PatientDaoJDBC implements PatientDao {

	@Override
	public Patient findById(int id) throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hopital", "root", "root");

		String sql = "SELECT * FROM patient WHERE id=" + id;
		Statement st = conn.createStatement();

		ResultSet rs = st.executeQuery(sql);

		Patient p = null;

		if (rs.next()) {
			p = new Patient();
			p.setId(rs.getInt(1));
			p.setNom(rs.getString(2));
			p.setPrenom(rs.getString(3));
			p.setComplement(rs.getString(4));
		}

		st.close();
		conn.close();
		return p;
	}

	@Override
	public Patient findByLogin(Integer log) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Patient findByName(Integer name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Patient> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Patient create(int id, String nom, String prenom, String complements)
			throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hopital", "root", "root");

		String sql = "INSERT INTO patient(id, nom, prenom, complements) VALUES(?, ?, ?, ?)";
		PreparedStatement st = (PreparedStatement) conn.prepareStatement(sql);

		st.setInt(1, id);
		st.setString(2, nom);
		st.setString(3, prenom);
		st.setString(4, complements);

		st.executeUpdate();
		conn.close();

		Patient p = new Patient();
		p.setId(id);
		p.setNom(nom);
		p.setPrenom(prenom);
		p.setComplement(complements);

		return p;

	}

	@Override
	public void update(Patient obj) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(Patient obj) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean findByLoginAndPassword(String log, String pass) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Patient findById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void create(Patient obj) {
		// TODO Auto-generated method stub

	}

	@Override
	public void create(String nom, String prenom, String complements) throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
	}

	@Override
	public Patient selectByInfo(String nom, String prenom, String complements)
			throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

}
