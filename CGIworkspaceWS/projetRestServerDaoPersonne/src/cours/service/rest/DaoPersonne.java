package cours.service.rest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/Dao")
public class DaoPersonne {

	public DaoPersonne() {

	}

	@GET
	@Path("/selectAll")
	@Produces(MediaType.APPLICATION_JSON)
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

			System.out.println("coucou");
			st.close();
			conn.close();

			return personnes;

		} catch (ClassNotFoundException | SQLException e) {
			System.out.println(e.getMessage());

		}
		return null;

	}

	@GET
	@Path("/findById/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Personne findById(@PathParam(value="id")int id) {
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

	@POST
	@Path("/create")
	@Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	@Consumes(MediaType.APPLICATION_JSON)
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
	
	@PUT
	@Path("/update/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public void update(@PathParam("id") int id, Personne p)  {
		try {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/cgi", "root", "root");

		String sql = "UPDATE personnes SET  nom=?, prenom=? WHERE id=?";
		PreparedStatement st = conn.prepareStatement(sql);

		st.setString(1, p.getNom());
		st.setString(2, p.getPrenom());
		st.setInt(3, p.getId());

		st.executeUpdate();
		conn.close();
		}catch(ClassNotFoundException | SQLException e) {
			System.out.println(e.getMessage());
		}
	}
	
	@DELETE
	@Path("/delete/{id}")
	public void delete(@PathParam("id")Integer id ) {
		try{
		Class.forName("com.mysql.jdbc.Driver");
		
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/cgi", "root", "root");

		String sql = "DELETE FROM personnes WHERE id=" +id;
		Statement st = conn.createStatement();

		st.executeUpdate(sql);
		conn.close();
		}catch(ClassNotFoundException | SQLException e) {
			System.out.println(e.getMessage());
		}
	}

//	@GET
//	@Path("/Addv0")
//	@Produces(MediaType.APPLICATION_JSON)
//	public double getAdd() {
//
//		return 10;
//	}
//	
//	@GET
//	@Path("/Info")
//	@Produces(MediaType.APPLICATION_JSON)
//	public Personne getInfo() {
//
//		Personne c=new Personne();
//		c.setA(10);
//		c.setB(20);
//		
//		return c;
//	}
//
//
//	
//	@POST
//	@Path("/Add")
//	@Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
//	@Consumes(MediaType.APPLICATION_JSON)
//	public int Add(Personne info) {
//
//		return info.getA() + info.getB();
//	}

}
