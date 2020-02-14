package dao;

import model.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DAOCommande {
	
	public void saveCommande(Commande c) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurant", "root", "root");
		String sql = "INSERT INTO commande(id_client, date, total, info) VALUES(?,?,?,?)";
		StringBuilder sb = new StringBuilder();
		for (Ligne l : c.getCom()) {
			sb.append(l.getArticle().getId());
			sb.append("/");
			sb.append(l.getQuantite());
			sb.append("/");
			sb.append(l.getQuantite() * l.getArticle().getPrix());
			sb.append(";");
		}
		System.out.println("to String : " + sb.toString());
		PreparedStatement st = conn.prepareStatement(sql);
		st.setInt(1, c.getIdClient());
		st.setString(2,  c.getDate());
		st.setInt(3,  c.getTotal());
		st.setString(4, sb.toString());
		
		st.executeUpdate();
		conn.close();
	}
}
