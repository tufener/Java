package dao;

import java.sql.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;

import model.*;

public class DAOVisite {
	
	public final static String path = "jdbc:mysql://localhost:3306/dbhopital";
	public final static String log = "root"; 
	public final static String pass = "root";
	
	public ArrayList<Visite> findVisitebyNumero(int numero) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbhopital", "root", "root");
		String sql = "SELECT visite.id, id_patient, date, nume_salle, medecin, ordo FROM visite, patient WHERE visite.id_patient = patient.id and patient.id = " + numero;
		Statement st = conn.createStatement();

		ResultSet rs = st.executeQuery(sql);
		
		ArrayList<Visite> liste = new ArrayList<Visite>();
		
		Visite v = new Visite() ;

		while (rs.next()) {
			v = new Visite();
			v.setId(rs.getInt("visite.id"));
			v.setIdPatient(rs.getInt("id_patient"));
			
			v.setNomMedecin(rs.getString("medecin"));
			v.setDate(rs.getString("date"));
			ArrayList<Medicament> ordo = new ArrayList<Medicament>();
			if (rs.getString("ordo").length() > 0) {
				String [] medicament = rs.getString("ordo").split(";"); 
				
				int prixTotal = 0;
				for (int i = 0; i < medicament.length; i++) {
					String [] medicament2 = medicament[i].split("/");
					Medicament m = new Medicament();
					m.setId(Integer.parseInt(medicament2[0]));
					m.setNom(medicament2[1]);
					int quantite = Integer.parseInt(medicament2[2]);
					prixTotal = Integer.parseInt(medicament2[3]);
					int prixUnitaire = prixTotal / quantite; 
					m.setPrix(prixUnitaire);
					m.setStock(quantite);
					ordo.add(m);
				}
				v.setTarif(prixTotal);
			}
			
			v.setOrdo(ordo);
			liste.add(v);
		}
		
		st.close();
		conn.close();
		return liste;
		
	}
	
	public ArrayList<Visite> findVisitebyMedecin(String nom) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbhopital", "root", "root");
		String sql = "SELECT n, id_patient, date, nume_salle, tarif, ordo FROM visite, patient WHERE visite.id_patient = patient.id and visite.medecin = '"+nom+"'";
		Statement st = conn.createStatement();

		ResultSet rs = st.executeQuery(sql);
		
		ArrayList<Visite> liste = new ArrayList<Visite>();
		
		Visite v = null ;
		
		while (rs.next()) {
			v = new Visite();
				v.setId(rs.getInt("n"));
				v.setIdPatient(rs.getInt("id_patient"));
				v.setTarif(rs.getInt("tarif"));
				v.setDate(rs.getString("date"));
				String [] medicament = rs.getString("ordo").split(";"); 
				ArrayList<Medicament> ordo = new ArrayList<Medicament>();
				int prixTotal = 0;
				for (int i = 0; i < medicament.length; i++) {
					String [] medicament2 = medicament[i].split("/");
					Medicament m = new Medicament();
					m.setId(Integer.parseInt(medicament2[0]));
					m.setNom(medicament2[1]);
					int quantite = Integer.parseInt(medicament2[2]);
					prixTotal = Integer.parseInt(medicament2[3]);
					int prixUnitaire = prixTotal / quantite; 
					m.setPrix(prixUnitaire);
					m.setStock(quantite);
					ordo.add(m);
				}
				v.setOrdo(ordo);
				liste.add(v);
		}
		
		st.close();
		conn.close();
		return liste;
		
	}
	
	public void saveVisite(Visite v) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection(path, log, pass);
		String sql = "INSERT INTO visite(id_patient, date, nume_salle, medecin, tarif, ordo) VALUES(?,?,?,?,?,?)";
		StringBuilder sb = new StringBuilder();
		for (Medicament m :v.getOrdo()) {
			sb.append(m.getId());
			sb.append("/");
			sb.append(m.getNom());
			sb.append("/");
			sb.append(m.getStock());
			sb.append("/");
			sb.append(m.getPrix() * m.getStock());
			sb.append(";");
		}
		PreparedStatement st = conn.prepareStatement(sql);
		st.setInt(1, v.getIdPatient());
		st.setString(2,  v.getDate());
		st.setInt(3,  v.getNum_salle());
		st.setString(4, v.getNomMedecin());
		st.setInt(5, v.getTarif());
		
		st.setString(6, sb.toString());
		
		st.executeUpdate();
		conn.close();
	}
	

	
}
