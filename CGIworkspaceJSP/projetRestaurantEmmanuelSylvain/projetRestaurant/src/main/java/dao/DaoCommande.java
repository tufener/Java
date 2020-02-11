package dao;

import java.sql.*;

import model.*;

public class DaoCommande {
	public void create(Commande c) throws SQLException, ClassNotFoundException{
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn =  DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurant", "root", "root");
		String sql = "insert into commande (login, Date, Total, Info) values (?,now(),?,?)";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setString(1, c.getLogin());
		ps.setInt(2, c.getTotal());
		ps.setString(3, c.getInfo());
		ps.executeUpdate();
		ps.close();
		conn.close();
	}
}
