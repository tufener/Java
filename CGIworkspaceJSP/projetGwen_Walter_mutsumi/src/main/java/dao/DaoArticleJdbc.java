package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.Article;

public class DaoArticleJdbc implements DaoArticle {

	private Connection getConnection() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		return DriverManager.getConnection("jdbc:mysql://localhost:3306/mutsumi", "root", "root");

	}

	@Override
	public List<Article> find() throws ClassNotFoundException, SQLException {
		Connection connection = this.getConnection();

		String sql = "SELECT * FROM articles";
		Statement st = connection.createStatement();

		ResultSet rs = st.executeQuery(sql);

		List<Article> Liste = new ArrayList<>();
		while (rs.next()) {
			Article art = new Article();
			art.setId(rs.getInt("idarticle"));
			art.setNom(rs.getString("article"));
			art.setPrix(rs.getDouble("prix"));
			art.setImage(rs.getString("image"));
			art.setDescription(rs.getString("description"));
			Liste.add(art);
		}

		return Liste;
	}

	@Override
	public Article findById(Integer id) throws ClassNotFoundException, SQLException {
		Connection connection = this.getConnection();

		String sql = "SELECT * FROM articles where idarticle=" + id;
		PreparedStatement st = connection.prepareStatement(sql);

		ResultSet rs = st.executeQuery(sql);

		Article art = new Article();
		while (rs.next()) {
			art.setId(rs.getInt("idarticle"));
			art.setNom(rs.getString("article"));
			art.setPrix(rs.getInt("prix"));
			art.setImage(rs.getString("image"));
			art.setDescription(rs.getString("description"));

		}

		return art;
	}

	@Override
	public void create(Article obj) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(Article obj) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(Article obj) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub

	}
}
