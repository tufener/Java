package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import model.Visite;

public class VisiteDaoJDBC {

	public void create(int idPatient, int numSalle, int medecin) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hopital", "root", "root");

		String sql = "INSERT INTO visite(id_patient,date,num_salle,medecin) VALUES(?,sysdate(),?,?)";
		PreparedStatement st = conn.prepareStatement(sql);
		st.setInt(1, idPatient);
		st.setInt(2, numSalle);
		st.setInt(3, medecin);

		st.executeUpdate();
		conn.close();
	}

	public ArrayList<Visite> selectAll() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hopital", "root", "root");

		String sql = "SELECT * FROM visite";
		Statement st = conn.createStatement();

		ResultSet rs = st.executeQuery(sql);

		ArrayList<Visite> visites = new ArrayList<Visite>();

		while (rs.next()) {
			Visite v = new Visite();
			v.setIdVisite(rs.getInt(1));
			v.setIdPatient(rs.getInt(2));
			v.setDate(rs.getString(3));
			v.setNumSalle(rs.getInt(4));
			v.setMedecin(rs.getInt(5));
			v.setTarif(rs.getInt(6));
			v.setOrdonnance(rs.getString(7));

			visites.add(v);
		}

		st.close();
		conn.close();
		return visites;
	}

	public ArrayList<Visite> selectAllMedecin(int medecin) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hopital", "root", "root");

		String sql = "SELECT * FROM visite where medecin=" + medecin;
		Statement st = conn.createStatement();

		ResultSet rs = st.executeQuery(sql);

		ArrayList<Visite> visites = new ArrayList<Visite>();

		while (rs.next()) {
			Visite v = new Visite();
			v.setIdVisite(rs.getInt(1));
			v.setIdPatient(rs.getInt(2));
			v.setDate(rs.getString(3));
			v.setNumSalle(rs.getInt(4));
			v.setMedecin(medecin);
			v.setTarif(rs.getInt(6));
			v.setOrdonnance(rs.getString(7));

			visites.add(v);
		}

		st.close();
		conn.close();
		return visites;
	}

	public ArrayList<Visite> selectAllpatient(int idpatient) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hopital", "root", "root");

		String sql = "SELECT * FROM visite where medecin=" + idpatient;
		Statement st = conn.createStatement();

		ResultSet rs = st.executeQuery(sql);

		ArrayList<Visite> visites = new ArrayList<Visite>();

		while (rs.next()) {
			Visite v = new Visite();
			v.setIdVisite(rs.getInt(1));
			v.setIdPatient(idpatient);
			v.setDate(rs.getString(3));
			v.setNumSalle(rs.getInt(4));
			v.setMedecin(rs.getInt(5));
			v.setTarif(rs.getInt(6));
			v.setOrdonnance(rs.getString(7));

			visites.add(v);
		}
		st.close();
		conn.close();
		return visites;
	}

	public Visite getVisiteById(int idVisite) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hopital", "root", "root");

		String sql = "select * from visite where id_visite=" + idVisite;
		Statement st = conn.createStatement();

		ResultSet rs = st.executeQuery(sql);
		Visite v = new Visite();

		while (rs.next()) {
			v.setIdVisite(rs.getInt(1));
			v.setIdPatient(rs.getInt(2));
			v.setDate(rs.getString(3));
			v.setNumSalle(rs.getInt(4));
			v.setMedecin(rs.getInt(5));
			v.setTarif(rs.getInt(6));
			v.setOrdonnance(rs.getString(7));
		}

		st.close();
		conn.close();
		return v;
	}

	public void OrdonnanceByVisite(int tarif, String ordonnance, int visiteId)
			throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hopital", "root", "root");

		String sql = "UPDATE visite SET tarif=" + tarif + ", ordonnance='" + ordonnance + "' WHERE id_visite="
				+ visiteId;
		PreparedStatement st = conn.prepareStatement(sql);

		st.executeUpdate();
		conn.close();
		st.close();
	}

	public Visite getVisiteByPatientAndMed(int idpatient, int medecin) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hopital", "root", "root");

		String sql = "select * from visite where id_patient=" + idpatient + " and medecin=" + medecin;
		Statement st = conn.createStatement();

		ResultSet rs = st.executeQuery(sql);
		Visite v = new Visite();

		while (rs.next()) {
			v.setIdVisite(rs.getInt(1));
			v.setIdPatient(rs.getInt(2));
			v.setDate(rs.getString(3));
			v.setNumSalle(rs.getInt(4));
			v.setMedecin(rs.getInt(5));
			v.setTarif(rs.getInt(6));
			v.setOrdonnance(rs.getString(7));
		}

		st.close();
		conn.close();
		return v;
	}

}