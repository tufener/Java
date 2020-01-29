package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.ArrayList;
import java.util.List;

import model.Personne;

public class PersonneDaoJdbc implements PersonneDao {

	@Override
	public Personne findById(Integer id) {
		Personne personne = null;
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
	
		return personne;
	}


	public List<Personne> findAll() {
		List<Personne> personnes = new ArrayList<Personne>();
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
			
			

		return personnes;
	}

	@Override
	public void create(Personne personne) {
	//???
		
			
			
		
	}

	@Override
	public void update(Personne personne) {
		Connection conn = null;
		PreparedStatement ps = null;
		
	}

	@Override
	public void delete(Personne personne) {
		Connection conn = null;
		PreparedStatement ps = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/formation1", "root", "root");

			ps = conn.prepareStatement("DELETE FROM PERSONNE WHERE ID = ?");
			ps.setLong(1, personne.getId());

			ps.executeUpdate();

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				ps.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

}
