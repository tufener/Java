package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import model.Medicament;

public class MedicamentDaoJdbc implements MedicamentDao {

	@Override
	public Medicament findById(Integer idMed) {
		Medicament m = null;
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

			String sql = "select * from medicament where idMed =" + idMed;

			st = conn.createStatement();
			rs = st.executeQuery(sql);

		} catch (SQLException e) {

			e.printStackTrace();
		}

		try {
			if (rs.next()) {
				m = new Medicament();
				m.setIdMed(rs.getInt("idMed"));
				m.setNom(rs.getString("nom"));
				m.setPrix(rs.getInt("prix"));
				m.setQuantite(rs.getInt("quantite"));
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
		return m;

	}

	@Override
	public ArrayList<Medicament> findAll() {

		ArrayList<Medicament> alm = new ArrayList<Medicament>();
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

			String sql = "Select *from medicament";
			st = conn.createStatement();

			rs = st.executeQuery(sql);
			while (rs.next()) {
				Medicament m = new Medicament();
				m.setIdMed(rs.getInt("idMed"));
				m.setNom(rs.getString("nom"));
				m.setPrix(rs.getInt("Prix"));
				m.setQuantite(rs.getInt("quantite"));
				alm.add(m);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (conn != null)
				try {
					st.close();
					conn.close();
				} catch (SQLException e) {

				}
		}
		return alm;

	}

	@Override
	public void create(Medicament obj) throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub

	}

	public void updateQte(int idMed, int quantite) {
		Connection conn = null;
		PreparedStatement ps = null;

		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hopital", "root", "root");

			String sql = "update medicament set quantite = ? where idMed = ?";
			ps = conn.prepareStatement(sql);

			ps.setInt(1, quantite);
			ps.setInt(2, idMed);
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

	@Override
	public void delete(Medicament obj) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub

	}

	public ArrayList <Medicament> commencePar(String nom) {
		ArrayList<Medicament> alm = new ArrayList<Medicament>();

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

			String sql = "select * from medicament where nom like'" + nom + "%'";
			st = conn.createStatement();

			rs = st.executeQuery(sql);

			while (rs.next()) {
				Medicament m = new Medicament();
				m.setIdMed(rs.getInt("idMed"));
				m.setNom(rs.getString("nom"));
				m.setPrix(rs.getInt("Prix"));
				m.setQuantite(rs.getInt("quantite"));
				alm.add(m);
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
		return alm;
	}

	

	@Override
	public void update(Medicament obj) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub

	}

}
