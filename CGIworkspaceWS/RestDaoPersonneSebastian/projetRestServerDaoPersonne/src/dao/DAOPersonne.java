package dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import model.Personne;

public class DAOPersonne {
	private final String base="jdbc:mysql://localhost:3306/cgi";
	private final String user="root";
	private final String mdp="root";
	
	public ArrayList<Personne> find() throws ClassNotFoundException, SQLException{
		ArrayList<Personne> list=new ArrayList<Personne>();
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn=DriverManager.getConnection(base,user,mdp);
		String sql="select * from personnes";
		Statement st=conn.createStatement();
		ResultSet rs=st.executeQuery(sql);
		while(rs.next()){
			Personne p=new Personne();
			p.setId(rs.getInt("id"));
			p.setNom(rs.getString("nom"));
			p.setPrenom(rs.getString("prenom"));
			list.add(p);
		}
		
		st.close();
		conn.close();
		
		return list;
	}
	public Personne findById(int id) throws ClassNotFoundException, SQLException{
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn=DriverManager.getConnection(base,user,mdp);
		String sql="select * from personnes where id="+id;
		Statement st=conn.createStatement();
		ResultSet rs=st.executeQuery(sql);
		Personne p=null;
		while(rs.next()){
			p=new Personne();
			p.setId(rs.getInt("id"));
			p.setNom(rs.getString("nom"));
			p.setPrenom(rs.getString("prenom"));
		}
		
		st.close();
		conn.close();
		return p;
	}
	public ArrayList<Personne> findByRange(int idMin,int idMax) throws ClassNotFoundException, SQLException{
		ArrayList<Personne> list=new ArrayList<Personne>();
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn=DriverManager.getConnection(base,user,mdp);
		String sql="select * from personnes where id between ? and ?";
		PreparedStatement ps=conn.prepareStatement(sql);
		ps.setInt(1, idMin);
		ps.setInt(2, idMax);
		ResultSet rs=ps.executeQuery();
		while(rs.next()){
			Personne p=new Personne();
			p.setId(rs.getInt("id"));
			p.setNom(rs.getString("nom"));
			p.setPrenom(rs.getString("prenom"));
			list.add(p);
		}
		
		ps.close();
		conn.close();
		return list;
	}
	public void create(Personne p)throws ClassNotFoundException, SQLException{
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn=DriverManager.getConnection(base,user,mdp);
		String sql="insert into personnes values(?,?,?)";
		PreparedStatement ps=conn.prepareStatement(sql);
		ps.setInt(1, p.getId());
		ps.setString(2, p.getNom());
		ps.setString(3, p.getPrenom());
		ps.executeUpdate();
		ps.close();
		conn.close();
	}
	public void update(Personne p) throws ClassNotFoundException, SQLException{
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn=DriverManager.getConnection(base,user,mdp);
		String sql="update personnes set nom=?,prenom=? where id=?";
		PreparedStatement ps=conn.prepareStatement(sql);
		ps.setInt(3, p.getId());
		ps.setString(1, p.getNom());
		ps.setString(2, p.getPrenom());
		ps.executeUpdate();
		
		ps.close();
		conn.close();
	}
	public void delete(Personne p) throws ClassNotFoundException, SQLException{
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn=DriverManager.getConnection(base,user,mdp);
		String sql="delete from personnes where id="+p.getId();
		Statement st=conn.createStatement();
		st.executeUpdate(sql);
		
		st.close();
		conn.close();
	}
	
}
