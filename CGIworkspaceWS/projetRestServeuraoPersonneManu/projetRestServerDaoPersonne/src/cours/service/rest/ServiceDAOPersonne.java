package cours.service.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;



import java.sql.*;

import java.util.*;

@Path("/Dao")
public class ServiceDAOPersonne {
	public ServiceDAOPersonne() {
	}
	
	
	@GET
	@Path("/personne")
	@Produces(MediaType.APPLICATION_JSON)
	public ArrayList<Personne> getSelectAll() {
		Connection conn = null;
		ArrayList<Personne> alp = null;
		Statement st = null;
		try {
			alp = new ArrayList<Personne>();
			Class.forName("com.mysql.jdbc.Driver");
			conn =  DriverManager.getConnection("jdbc:mysql://localhost:3306/cgi", "root", "root");

			String sql = "Select * from personnes";
			st = conn.createStatement();

			ResultSet rs =  st.executeQuery(sql);
			while (rs.next()) {
				Personne p = new Personne();
				p.setId(rs.getInt("id"));
				p.setNom(rs.getString("nom"));
				p.setPrenom(rs.getString("prenom"));
				alp.add(p);
			}
			st.close();
			conn.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return alp;
	}

	@GET
	@Path("/personne/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Personne findById(@PathParam(value="id")Integer id) {

		Personne p = null;
		Connection conn = null;
		Statement st = null;
		ResultSet rs = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		}
		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/cgi", "root", "root");

			String sql = "select * from personnes where id =" + id;

			st =  conn.createStatement();
			rs = st.executeQuery(sql);

		} catch (SQLException e) {

			e.printStackTrace();
		}

		try {
			if (rs.next()) {
				p = new Personne();
				p.setId(rs.getInt("id"));
				p.setNom(rs.getString("nom"));
				p.setPrenom(rs.getString("prenom"));
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
	
	
	@POST
	@Path("/personne")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public void create(Personne p) {

		Connection conn = null;
		PreparedStatement ps = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		}
		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/cgi", "root", "root");

			String sql = "insert into personnes values(?,?,?)";
			ps = conn.prepareStatement(sql);
			ps.setInt(1, p.getId());
			ps.setString(2, p.getNom());
			ps.setString(3, p.getPrenom());

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
	
	@DELETE
	@Path("/personne/{id}")
	public void delete(@PathParam(value="id")int id)  {
		try{
		 Class.forName("com.mysql.jdbc.Driver");
		 Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/cgi", "root", "root");
		
		 String sql = "delete from personnes where id=?";
		 PreparedStatement ps =  conn.prepareStatement(sql);
		 ps.setInt(1, id);
		
		 int c=ps.executeUpdate();
		System.out.println("c  "+c);
		 ps.close();
		 conn.close();
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
	
	@PUT
	@Path("/personne/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public void update(@PathParam(value="id") int id, Personne p) {
		try{
		Class.forName("com.mysql.jdbc.Driver");
		 Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/cgi", "root", "root");
		
		 String sql = "update personnes set id = ?, nom = ?, prenom = ? where id = " + id;
		 PreparedStatement ps = conn.prepareStatement(sql);
		
		 ps.setInt(1, id);	
		 ps.setString(2, p.getNom());
		 ps.setString(3, p.getPrenom());
		
		 ps.executeUpdate();
		
		 ps.close();
		 conn.close();
		}catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	
}
