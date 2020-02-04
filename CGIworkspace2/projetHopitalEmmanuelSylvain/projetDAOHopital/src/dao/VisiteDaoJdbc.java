package dao;

import java.sql.*;
import java.util.*;

import model.Visite;

public class VisiteDaoJdbc implements VisiteDao {

	public Visite findById(Integer idPatient) throws ClassNotFoundException, SQLException {
		// Class.forName("com.mysql.jdbc.Driver");
		// Connection conn =
		// DriverManager.getConnection("jdbc:mysql://localhost:3306/hopital",
		// "root", "root");
		//
		// String sql = "select * from visite where id_patient=" + idPatient;
		// Statement st = conn.createStatement();
		//
		// ResultSet rs = st.executeQuery(sql);
		//
		// Visite v = null;
		//
		// if (rs.next()) {
		// v = new Visite();
		// v.setNbVisite(rs.getInt("nbVisite"));
		// v.setIdPatient(rs.getInt("id_patient"));
		// v.setDate(rs.getString("date"));
		// v.setNumeSalle(rs.getInt("nume_salle"));
		// v.setMedecin(rs.getString("medecin"));
		// v.getTarif();
		// }
		//
		// st.close();
		// conn.close();
		// return v;
		return null;
	}

	public ArrayList<Visite> findAll() throws ClassNotFoundException, SQLException {
		// ArrayList<Visite> alv = new ArrayList<Visite>();
		//
		// Class.forName("com.mysql.jdbc.Driver");
		// Connection conn =
		// DriverManager.getConnection("jdbc:mysql://localhost:3306/hopital",
		// "root", "root");
		//
		// String sql = "Select *from visite";
		// Statement st = conn.createStatement();
		//
		// ResultSet rs = st.executeQuery(sql);
		// while (rs.next()) {
		// Visite v = new Visite();
		// v.setNbVisite(rs.getInt("nbVisite"));
		// v.setIdPatient(rs.getInt("id_patient"));
		// v.setDate(rs.getString("date"));
		// v.setNumeSalle(rs.getInt("nume_salle"));
		// v.setMedecin(rs.getString("medecin"));
		// v.getTarif();
		// alv.add(v);
		// }
		// st.close();
		// conn.close();
		// return alv;
		return null;
	}

	public void create(Visite v) {

		Connection conn = null;
		PreparedStatement ps = null;

		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hopital", "root", "root");

			String sql = "insert into visite (id_patient, date, nume_salle, medecin, tarif, ordonance) values(?,now(),?,?,?,?)";
			ps = conn.prepareStatement(sql);
			ps.setInt(1, v.getIdPatient());
			ps.setInt(2, v.getNumeSalle());
			ps.setString(3, v.getMedecin());
			ps.setInt(4, v.getTarif());
			ps.setString(5, v.getOrdonnance());

			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (conn != null)
				try {
					ps.close();
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
		}

	}

	public void update(Visite v) throws ClassNotFoundException, SQLException {
		// Class.forName("com.mysql.jdbc.Driver");
		// Connection conn =
		// DriverManager.getConnection("jdbc:mysql://localhost:3306/hopital",
		// "root", "root");
		//
		// String sql = "update visite set id_patient = ?, date = ?, nume_Salle
		// = ?, medecin= ?, tarif=? where nbVisite = ?";
		// PreparedStatement ps = conn.prepareStatement(sql);
		//
		// ps.setInt(1, v.getIdPatient());
		// ps.setString(2, v.getDate());
		// ps.setInt(3, v.getNumeSalle());
		// ps.setString(4, v.getMedecin());
		// ps.setInt(5, v.getTarif());
		// ps.setInt(6, v.getNbVisite());
		//
		// ps.executeUpdate();
		//
		// ps.close();
		// conn.close();

	}

	public void delete(Visite v) throws ClassNotFoundException, SQLException {
		// Class.forName("com.mysql.jdbc.Driver");
		// Connection conn =
		// DriverManager.getConnection("jdbc:mysql://localhost:3306/hopital",
		// "root", "root");
		//
		// String sql = "delete from visite where id_patient=?";
		// PreparedStatement ps = conn.prepareStatement(sql);
		// ps.setInt(1, v.getIdPatient());
		//
		// ps.executeUpdate();
		//
		// ps.close();
		// conn.close();

	}

	@Override
	public ArrayList<Visite> findByMedecin(String nom) {

		ArrayList<Visite> alv = new ArrayList<Visite>();
		Connection conn = null;
		Statement st = null;
		ResultSet rs = null;

		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hopital", "root", "root");

			String sql = "select * from visite where medecin='" + nom + "'";
			st = conn.createStatement();

			rs = st.executeQuery(sql);

			Visite v = null;

			while (rs.next()) {
				v = new Visite();
				v.setNbVisite(rs.getInt("nbVisite"));
				v.setIdPatient(rs.getInt("id_patient"));
				v.setDate(rs.getString("date"));
				v.setNumeSalle(rs.getInt("nume_salle"));
				v.setMedecin(rs.getString("medecin"));
				v.getTarif();
				alv.add(v);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (conn != null)
				try {

					st.close();
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
		}
		return alv;
	}

	public ArrayList<Visite> findByPatient(Integer idPatient) {

		Connection conn = null;
		Statement st = null;
		ResultSet rs = null;
		ArrayList<Visite> alv = new ArrayList<Visite>();

		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hopital", "root", "root");

			String sql = "select * from visite where id_patient=" + idPatient;
			st = conn.createStatement();

			rs = st.executeQuery(sql);

			while (rs.next()) {
				Visite v = new Visite();
				v.setNbVisite(rs.getInt("nbVisite"));
				v.setIdPatient(rs.getInt("id_patient"));
				v.setDate(rs.getString("date"));
				v.setNumeSalle(rs.getInt("nume_salle"));
				v.setMedecin(rs.getString("medecin"));
				v.getTarif();
				alv.add(v);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		finally {
			if (conn != null)
				try {
					st.close();
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
		}
		return alv;
	}

	public void updateOrdonnance(int nbVisite, String ordonnance, int prix) {
		Statement st = null;
		Connection conn = null;

		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hopital", "root", "root");

			String sql = "update visite set ordonance= '" + ordonnance + "', tarif =" + prix + " where nbVisite="
					+ nbVisite;
			st = conn.createStatement();
			st.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}

		finally {
			if (conn != null)
				try {
					st.close();

					conn.close();
				} catch (SQLException e) {

					e.printStackTrace();
				}
		}
	}
}