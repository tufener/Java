package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import model.Commande;

public class DaoCommandeJdbc {
	
	private Connection getConnection() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        return DriverManager.getConnection("jdbc:mysql://localhost:3306/mutsumi", "root", "root");

    }
    public void create(Commande c) throws ClassNotFoundException, SQLException {
        Connection conn = this.getConnection();

        String sql = "INSERT INTO commande(idclient,date,total,info) VALUES(?,?,?,?)";
        PreparedStatement ps = conn.prepareStatement(sql);
        
        ps.setInt(1, c.getIdclient());
        ps.setDate(2, new java.sql.Date(c.getDate().getTime()));
        ps.setDouble(3, c.getTotal());
        ps.setString(4, c.getInfo());
        

        ps.executeUpdate();

        ps.close();
        conn.close();
    }
	
	
}
