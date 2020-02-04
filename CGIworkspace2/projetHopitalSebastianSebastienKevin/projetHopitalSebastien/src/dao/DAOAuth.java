package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import model.Employe;

public class DAOAuth {

	public Employe findById(String login) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbhopital", "root", "root");
		String sql = "SELECT * FROM auth WHERE login= '"+login+"'";
		Statement st = conn.createStatement();

		ResultSet rs = st.executeQuery(sql);
		
		Employe emp = null;
		
		if (rs.next()) {
		emp = new Employe();
		emp.setNom(rs.getString("nom"));
		emp.setMdp(rs.getString("mdp"));
		emp.setMetier(rs.getInt("metier"));
		}
		
		st.close();
		conn.close();
		return emp;
	}
}
	