package dao;

import java.sql.*;

import model.*;

public class DaoClient {
	public void create(Client c) throws SQLException, ClassNotFoundException{
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn =  DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurant", "root", "root");
		String sql = "insert into client values(?,?,?,?,?)";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setString(1, c.getLogin());
		ps.setString(2, c.getNom());
		ps.setString(3, c.getPrenom());
		ps.setString(4, c.getMdp());
		ps.setString(5,  c.getAdresse());
		ps.executeUpdate();
		ps.close();
		conn.close();
	}
	
	public Client findbylogin(String login) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurant", "root", "root");
		String sql = "select * from client where login='" + login + "'";
		Statement st = conn.createStatement();
		ResultSet rs = st.executeQuery(sql);
		Client p= null;
		if(rs.next()){
			p = new Client();
			p.setLogin(rs.getString("login"));
			p.setNom(rs.getString("nom"));
			p.setPrenom(rs.getString("prenom"));
			p.setMdp(rs.getString("mdp"));
			p.setAdresse(rs.getString("Adresse"));
		}
		st.close();
		conn.close();
		return p;
	}
}
