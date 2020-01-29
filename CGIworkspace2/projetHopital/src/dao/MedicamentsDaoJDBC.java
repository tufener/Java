package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import model.Medicaments;

public class MedicamentsDaoJDBC {

	public ArrayList<Medicaments> selectAll() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hopital", "root", "root");

		String sql = "SELECT * FROM medicaments";
		Statement st = conn.createStatement();

		ResultSet rs = st.executeQuery(sql);

		ArrayList<Medicaments> med = new ArrayList<Medicaments>();

		while (rs.next()) {
			Medicaments v = new Medicaments();
			v.setIdMed(rs.getInt(1));
			v.setNomMed(rs.getString(2));
			v.setPrix(rs.getInt(3));
			v.setQuantiteStock(rs.getInt(4));

			med.add(v);
		}

		st.close();
		conn.close();
		return med;
	}

	public Medicaments getMedbyId(int idMed) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hopital", "root", "root");

		String sql = "select * from medicaments where id_med=" + idMed;
		Statement st = conn.createStatement();

		ResultSet rs = st.executeQuery(sql);
		Medicaments v = new Medicaments();

		while (rs.next()) {

			v.setIdMed(rs.getInt(1));
			v.setNomMed(rs.getString(2));
			v.setPrix(rs.getInt(3));
			v.setQuantiteStock(rs.getInt(4));
		}

		st.close();
		conn.close();
		return v;
	}

	public void updateQuantite(int idMed, int quantiteActuel, int quantiteDemande)
			throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hopital", "root", "root");

		int quantiteUpdate = quantiteActuel - quantiteDemande;
		String sql = "UPDATE medicaments SET quantite ='" + quantiteUpdate + "' WHERE id_med=" + idMed;
		PreparedStatement st = conn.prepareStatement(sql);

		st.executeUpdate();
		conn.close();
		st.close();
	}
}