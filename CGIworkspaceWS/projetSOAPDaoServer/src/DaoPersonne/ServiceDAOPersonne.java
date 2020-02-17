package DaoPersonne;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.mysql.jdbc.PreparedStatement;

@WebService(name = "DAOPersonneWS")
public class ServiceDAOPersonne {

	@WebMethod(operationName = "selectAll")
	public ArrayList<Personne> selectAll() {
		try {
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
				p.setPrenom(rs.getString(3));

				personnes.add(p);
			}

			st.close();
			conn.close();
			return personnes;

		} catch (ClassNotFoundException | SQLException e) {
			System.out.println(e.getMessage());

		}
		return null;

	}

	public Personne findById(int id) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/cgi", "root", "root");

			String sql = "SELECT * FROM personnes WHERE id=" + id;
			Statement st = conn.createStatement();

			ResultSet rs = st.executeQuery(sql);

			Personne p = null;

			if (rs.next()) {
				p = new Personne();
				p.setId(rs.getInt(1));
				p.setNom(rs.getString(2));
				p.setPrenom(rs.getString(3));
			}

			st.close();
			conn.close();
			return p;
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println(e.getMessage());
		}
		return null;
	}

	public void create(Personne p) {
		try {

			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/cgi", "root", "root");

			String sql = "INSERT INTO personnes(id,nom,prenom) VALUES(?, ?, ?)";
			PreparedStatement st = (PreparedStatement) conn.prepareStatement(sql);
			st.setInt(1, p.getId());
			st.setString(2, p.getNom());
			st.setString(3, p.getPrenom());

			st.executeUpdate();
			conn.close();
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println(e.getMessage());
		}

	}

}
