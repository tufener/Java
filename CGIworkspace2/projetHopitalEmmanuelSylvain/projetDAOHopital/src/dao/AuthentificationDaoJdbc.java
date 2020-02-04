package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.Employe;

public class AuthentificationDaoJdbc implements AuthentificationDao {

	public Employe findById(String log) throws ClassNotFoundException, SQLException {

		// Class.forName("com.mysql.jdbc.Driver");
		// Connection conn =
		// DriverManager.getConnection("jdbc:mysql://localhost:3306/hopital",
		// "root", "root");
		//
		// String sql = "select * from authentification where login ='" + log
		// +"'";
		// Statement st = conn.createStatement();
		//
		// ResultSet rs = st.executeQuery(sql);
		//
		// Employe e = null;
		//
		// if (rs.next()) {
		// e = new Employe();
		// e.setLogin(rs.getString("login"));
		// e.setMdp(rs.getString("mdp"));
		// e.setNom(rs.getString("nom"));
		// e.setMetier(rs.getInt("metier"));
		// }
		//
		// st.close();
		// conn.close();
		// return e;
		return null;

	}

	@Override
	public ArrayList<Employe> findAll() throws ClassNotFoundException, SQLException {

		// ArrayList<Employe> ale = new ArrayList<Employe>();
		//
		// Class.forName("com.mysql.jdbc.Driver");
		// Connection conn =
		// DriverManager.getConnection("jdbc:mysql://localhost:3306/hopital",
		// "root", "root");
		//
		// String sql = "Select *from authentification";
		// Statement st = conn.createStatement();
		//
		// ResultSet rs = st.executeQuery(sql);
		// while (rs.next()) {
		// Employe e = new Employe();
		// e.setLogin(rs.getString("login"));
		// e.setMdp(rs.getString("mdp"));
		// e.setNom(rs.getString("nom"));
		// e.setMetier(rs.getInt("metier"));
		// ale.add(e);
		// }
		// st.close();
		// conn.close();
		// return ale;
		return null;
	}

	@Override
	public void create(Employe e) throws SQLException, ClassNotFoundException {

		// Class.forName("com.mysql.jdbc.Driver");
		// Connection conn =
		// DriverManager.getConnection("jdbc:mysql://localhost:3306/hopital",
		// "root", "root");
		//
		// String sql = "insert into authentification values(?,?,?,?)";
		// PreparedStatement ps = conn.prepareStatement(sql);
		// ps.setString(1, e.getLogin());
		// ps.setString(2, e.getMdp());
		// ps.setString(3, e.getNom());
		// ps.setInt(4, e.getMetier());
		//
		// ps.executeUpdate();
		//
		// ps.close();
		// conn.close();
	}

	@Override
	public void update(Employe e) throws ClassNotFoundException, SQLException {
		// Class.forName("com.mysql.jdbc.Driver");
		// Connection conn =
		// DriverManager.getConnection("jdbc:mysql://localhost:3306/hopital",
		// "root", "root");
		//
		// String sql = "update authentification set mdp = ?, nom = ?, metier =
		// ? where login = ?";
		// PreparedStatement ps = conn.prepareStatement(sql);
		//
		// ps.setString(1, e.getMdp());
		// ps.setString(2, e.getNom());
		// ps.setInt(3, e.getMetier());
		// ps.setString(4, e.getLogin());
		//
		// ps.executeUpdate();
		//
		// ps.close();
		// conn.close();

	}

	@Override
	public void delete(Employe e) throws ClassNotFoundException, SQLException {

		// Class.forName("com.mysql.jdbc.Driver");
		// Connection conn =
		// DriverManager.getConnection("jdbc:mysql://localhost:3306/hopital",
		// "root", "root");
		//
		// String sql = "delete from authentification where login=?";
		// PreparedStatement ps = conn.prepareStatement(sql);
		// ps.setString(1, e.getLogin());
		//
		// ps.executeUpdate();
		//
		// ps.close();
		// conn.close();
	}

	public Employe findByLogin(String login, String mdp) {

		Employe em = null;
		Connection conn = null;
		PreparedStatement ps = null;

		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hopital", "root", "root");

			String sql = "select * from authentification where login = ? and mdp =? ";

			ps = conn.prepareStatement(sql);
			ps.setString(1, login);
			ps.setString(2, mdp);

			ResultSet rs = ps.executeQuery();

			if (rs.next()) {
				em = new Employe();
				em.setLogin(rs.getString("login"));
				em.setMdp(rs.getString("mdp"));
				em.setNom(rs.getString("nom"));
				em.setMetier(rs.getInt("metier"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		finally {
			if (conn != null)
				try {
					ps.close();
				} catch (SQLException e) {

					e.printStackTrace();
				}
			try {
				conn.close();
			} catch (SQLException e) {

			}
		}
		return em;
	}

}
