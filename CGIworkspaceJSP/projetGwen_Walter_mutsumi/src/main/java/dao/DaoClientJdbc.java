package dao;

import model.Client;

import java.sql.*;
import java.util.List;

public class DaoClientJdbc implements DaoClient{

    private Connection getConnection() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        return DriverManager.getConnection("jdbc:mysql://localhost:3306/mutsumi", "root", "root");

    }

    @Override
    public List<Client> find() throws ClassNotFoundException, SQLException {
        return null;
    }

    public Client findById(Integer id) throws ClassNotFoundException, SQLException {
        Connection connection = this.getConnection();

        String sql = "SELECT * FROM clients WHERE id=" + id;
        Statement st = connection.createStatement();

        ResultSet rs = st.executeQuery(sql);

        Client client = null;
        while (rs.next()) {
            client = new Client(rs.getInt("id"), rs.getString("password"), rs.getString("nom"),rs.getString("prenom"),rs.getString("adresse"));
        }

        rs.close();
        st.close();
        connection.close();

        return client;
    }

    public void create(Client c) throws ClassNotFoundException, SQLException {
        Connection conn = this.getConnection();

        String sql = "INSERT INTO clients VALUES(?,?,?,?,?)";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setInt(1, c.getId());
        ps.setString(2, c.getPassword());
        ps.setString(3, c.getNom());
        ps.setString(4, c.getPrenom());
        ps.setString(5, c.getAdresse());

        ps.executeUpdate();

        ps.close();
        conn.close();
    }

    @Override
    public void update(Client obj) throws ClassNotFoundException, SQLException {

    }

    @Override
    public void delete(Client obj) throws ClassNotFoundException, SQLException {

    }
}
