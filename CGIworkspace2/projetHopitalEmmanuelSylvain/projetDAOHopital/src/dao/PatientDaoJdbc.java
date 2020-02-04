package dao;

import java.sql.*;
import java.util.ArrayList;

import model.Patient;

public class PatientDaoJdbc implements PatientDao {

	public Patient findById(Integer id) {

		Patient p = null;
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

			String sql = "select * from patient where id =" + id;

			st = conn.createStatement();
			rs = st.executeQuery(sql);

		} catch (SQLException e) {

			e.printStackTrace();
		}

		try {
			if (rs.next()) {
				p = new Patient();
				p.setId(rs.getInt("id"));
				p.setNom(rs.getString("nom"));
				p.setPrenom(rs.getString("prenom"));
				p.setComplement(rs.getString("complement"));
			}
		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			if (conn != null)
				try {
					st.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return p;

	}

	public ArrayList<Patient> findAll() throws ClassNotFoundException, SQLException {
		//
		// ArrayList<Patient> alp = new ArrayList<Patient>();
		//
		// Class.forName("com.mysql.jdbc.Driver");
		// Connection conn =
		// DriverManager.getConnection("jdbc:mysql://localhost:3306/hopital",
		// "root", "root");
		//
		// String sql = "Select *from patient";
		// Statement st = conn.createStatement();
		//
		// ResultSet rs = st.executeQuery(sql);
		// while (rs.next()) {
		// Patient p = new Patient();
		// p.setId(rs.getInt("id"));
		// p.setNom(rs.getString("nom"));
		// p.setPrenom(rs.getString("prenom"));
		// p.setComplement(rs.getString("complement"));
		// alp.add(p);
		// }
		// st.close();
		// conn.close();
		// return alp;
		return null;

	}

	public void create(Patient p) {

		Connection conn = null;
		PreparedStatement ps = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		}
		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hopital", "root", "root");

			String sql = "insert into patient values(?,?,?,?)";
			ps = conn.prepareStatement(sql);
			ps.setInt(1, p.getId());
			ps.setString(2, p.getNom());
			ps.setString(3, p.getPrenom());
			ps.setString(4, p.getComplement());

			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (conn != null)
				try {
					ps.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	public void updateComplement(int id, String complement) {

		Connection conn = null;
		PreparedStatement ps = null;

		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hopital", "root", "root");

			String sql = "update patient set complement = ? where id = ?";
			ps = conn.prepareStatement(sql);

			ps.setString(1, complement);
			ps.setInt(2, id);
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (conn != null)
				try {
					ps.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	public void update(Patient p) throws ClassNotFoundException, SQLException {
		// Class.forName("com.mysql.jdbc.Driver");
		// Connection conn =
		// DriverManager.getConnection("jdbc:mysql://localhost:3306/hopital",
		// "root", "root");
		//
		// String sql = "update patient set nom = ?, prenom = ?, complement = ?
		// where id = ?";
		// PreparedStatement ps = conn.prepareStatement(sql);
		//
		// ps.setString(1, p.getNom());
		// ps.setString(2, p.getPrenom());
		// ps.setString(3, p.getComplement());
		// ps.setInt(4, p.getId());
		//
		// ps.executeUpdate();
		//
		// ps.close();
		// conn.close();

	}

	public void delete(Patient p) throws ClassNotFoundException, SQLException {

		// Class.forName("com.mysql.jdbc.Driver");
		// Connection conn =
		// DriverManager.getConnection("jdbc:mysql://localhost:3306/hopital",
		// "root", "root");
		//
		// String sql = "delete from patient where id=?";
		// PreparedStatement ps = conn.prepareStatement(sql);
		// ps.setInt(1, p.getId());
		//
		// ps.executeUpdate();
		//
		// ps.close();
		// conn.close();
	}

}
