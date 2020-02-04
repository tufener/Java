package dao;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;

import model.Visite;

public class VisiteDaoJdbcMysql implements DaoVisite {
	private final String connId="jdbc:mysql://localhost:3306/hopital";
	private final String hostname="root";
	private final String pwd="root";

	public ArrayList<Visite> findAll() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn=DriverManager.getConnection(connId, hostname,pwd );
		String sql = "select * from visite";
		PreparedStatement pstmt = conn.prepareStatement(sql);

		ResultSet rs = pstmt.executeQuery();
		ArrayList<Visite> select = new ArrayList<Visite>();

		while (rs.next()) {
			Visite ind = new Visite();
			ind.setId(rs.getInt("id"));
			ind.setIdPatient(rs.getInt("idPatient"));
			ind.setDate(rs.getDate("date"));
			ind.setNum_salle(rs.getInt("numSalle"));
			ind.setMedecin(rs.getString("medecin"));
			ind.setTarif(rs.getDouble("tarif"));
			ind.setOrdonnance(rs.getString("ordonnance"));
			select.add(ind);
		}

		conn.close();

		return select;

	}

	public ArrayList<Visite> historiqueMedecin(String nomMedecin) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn=DriverManager.getConnection(connId, hostname,pwd );
		String sql = "select * from visite where medecin=?";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, nomMedecin);
		ResultSet rs = pstmt.executeQuery();
		ArrayList<Visite> select = new ArrayList<Visite>();

		while (rs.next()) {
			Visite ind = new Visite();
			ind.setId(rs.getInt("id"));
			ind.setIdPatient(rs.getInt("idPatient"));
			ind.setDate(rs.getDate("date"));
			ind.setNum_salle(rs.getInt("numSalle"));
			ind.setMedecin(rs.getString("medecin"));
			ind.setTarif(rs.getDouble("tarif"));
			ind.setOrdonnance(rs.getString("ordonnance"));
			select.add(ind);
		}

		conn.close();

		return select;

	}

	public Visite findById(Long id) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn=DriverManager.getConnection(connId, hostname,pwd );
		String sql = "select * from visite where id= ?";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setLong(1, id);
		ResultSet rs = pstmt.executeQuery();
		Visite ind = null;
		while (rs.next()) {
			ind = new Visite();
			ind.setId(rs.getInt("id"));
			ind.setIdPatient(rs.getInt("idPatient"));
			ind.setDate(rs.getDate("date"));
			ind.setNum_salle(rs.getInt("numSalle"));
			ind.setMedecin(rs.getString("medecin"));
			ind.setTarif(rs.getDouble("tarif"));
			ind.setOrdonnance(rs.getString("ordonnance"));
		}

		conn.close();
		return ind;

	}

	public void create(Visite visite) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn=DriverManager.getConnection(connId, hostname,pwd );
		String sql = "insert into visite (idPatient,date,numSalle,medecin,tarif,ordonnance) values (?,?,?,?,?,?)";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1, visite.getIdPatient());
		pstmt.setDate(2, new java.sql.Date(visite.getDate().getTime()));
		pstmt.setInt(3, visite.getNum_salle());
		pstmt.setString(4, visite.getMedecin());
		pstmt.setDouble(5, visite.getTarif());
		pstmt.setString(6,visite.getOrdonnance());

		pstmt.executeUpdate();

		conn.close();

	}

	public ArrayList<Visite> historiquePatient(int idPatient) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn=DriverManager.getConnection(connId, hostname,pwd );
		String sql = "select * from visite where idPatient= ?";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1, idPatient);
		ResultSet rs = pstmt.executeQuery();
		ArrayList<Visite> ind = new ArrayList<Visite>();
		while (rs.next()) {
			Visite indi = new Visite();
			indi.setId(rs.getInt("id"));
			indi.setIdPatient(rs.getInt("idPatient"));
			indi.setDate(rs.getDate("date"));
			indi.setNum_salle(rs.getInt("numSalle"));
			indi.setMedecin(rs.getString("medecin"));
			indi.setTarif(rs.getDouble("tarif"));
			indi.setOrdonnance(rs.getString("ordonnance"));
			ind.add(indi);
		}

		conn.close();
		return ind;

	}

	public void delete(Visite visite) {
		Connection conn = null;
		PreparedStatement ps = null;

	}

	@Override
	public void update(Visite obj) {
		// TODO Auto-generated method stub

	}

}
