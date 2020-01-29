package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import model.Authentification;
import model.Patient;

public class AuthentificationDaoJDBC implements AuthentificationDao {

	public Authentification findByLoginAndPassword(String log, String pass, String metier2) throws ClassNotFoundException {
		Authentification a = null;
		Class.forName("com.mysql.jdbc.Driver");
		String sql = "select * from authentification where login like '" + log + "' and password like '" + pass
				+ "' and metier like '" + metier2 + "'";
		try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hopital", "root", "root");
				Statement st = conn.createStatement();
				ResultSet rs = st.executeQuery(sql)) {

			while (rs.next()) {
				if (rs.getString("login") != null && rs.getString("password") != null)
					a = new Authentification();
				a.setId(rs.getInt("id"));
				a.setLogin(rs.getString("login"));
				a.setPassword(rs.getString("password"));
				a.setMetier(rs.getInt("metier"));
			}
			st.close();
			conn.close();
		} catch (SQLException e) {
			throw new RuntimeException("Error executing sql:\n" + sql, e);
		}
		return a;
	}

	@Override
	public Authentification findById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Authentification findByLogin(String log) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Authentification findByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Authentification> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void create(Authentification obj) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(Authentification obj) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(Authentification obj) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean findByLoginAndPassword(String log, String pass) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Patient findById(int id) throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
		return null;
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

	@Override
	public Patient create(int id, String nom, String prenom, String complements)
			throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Authentification findByLoginAndPassword(String log, String pass, int metier) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

}
