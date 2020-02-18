package projetSoapDaoServer;

import java.sql.DriverManager;
import java.util.ArrayList;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.ResultSet;
import com.mysql.jdbc.Statement;

@WebService(name = "DaoPersonneWS")
public class ServiceDaoPersonne {

	@WebMethod(operationName = "SelectAll")
	public ArrayList<Personne> selectAll() {

		ArrayList<Personne> al = new ArrayList<Personne>();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/cgi", "root",
					"root");

			String sql = "select * from personnes";
			Statement st = (Statement) conn.createStatement();

			ResultSet rs = (ResultSet) st.executeQuery(sql);
			while (rs.next()) {
				Personne p = new Personne();
				p.setId(rs.getInt("id"));
				p.setNom(rs.getString("nom"));
				p.setPrenom(rs.getString("prenom"));
				al.add(p);
			}
			st.close();
			conn.close();

		} catch (Exception e) {
		}
		return al;
	}

	@WebMethod(operationName = "findById")
	public Personne findById(@WebParam(name = "x") int id) {

		Personne p = null;

		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/cgi", "root",
					"root");

			String sql = "select * from personnes where id=" + id;
			Statement st = (Statement) conn.createStatement();

			ResultSet rs = (ResultSet) st.executeQuery(sql);

			if (rs.next()) {
				p = new Personne();
				p.setId(rs.getInt("id"));
				p.setNom(rs.getString("nom"));
				p.setPrenom(rs.getString("prenom"));
			}

			st.close();
			conn.close();
		} catch (Exception e) {
		}
		return p;
	}

	@WebMethod(operationName = "create")
	public void create(Personne p) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/cgi", "root",
					"root");

			String sql = "insert into personnes values(?,?,?)";
			PreparedStatement ps = (PreparedStatement) conn.prepareStatement(sql);
			ps.setInt(1, p.getId());
			ps.setString(2, p.getNom());
			ps.setString(3, p.getPrenom());

			ps.executeUpdate();

			ps.close();
			conn.close();

		} catch (Exception e) {
		}
	}
}
