package model;

import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import dao.DAOVisite;

public class Visite {
	
	private int id;
	private int idPatient;
	private int num_salle;
	private String nomMedecin;
	private int tarif = 20;
	private String date;
	private ArrayList<Medicament> ordo = new ArrayList<Medicament>();
	
		public Visite() {
	}
	
	public ArrayList<Medicament> getListe() {
		return ordo;
	}
	public Visite(int idPatient, int num_salle, String medecin, ArrayList<Medicament> ordo) {
		
	this.idPatient = idPatient;
	this.num_salle = num_salle;
	this.nomMedecin = medecin;
	this.ordo = ordo;
	for (Medicament m : ordo) {
		tarif += m.getPrix()* m.getStock();
	}
	DateFormat Format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	Calendar calendar = Calendar.getInstance();
	date =Format.format(calendar.getTime());
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getIdPatient() {
		return idPatient;
	}

	public void setIdPatient(int idPatient) {
		this.idPatient = idPatient;
	}

	public int getNum_salle() {
		return num_salle;
	}

	public void setNum_salle(int num_salle) {
		this.num_salle = num_salle;
	}

	public String getNomMedecin() {
		return nomMedecin;
	}

	public void setNomMedecin(String nomMedecin) {
		this.nomMedecin = nomMedecin;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public int getTarif() {
		return tarif;
	}

	public void setTarif(int tarif) {
		this.tarif = tarif;
	}

	public ArrayList<Medicament> getOrdo() {
		return ordo;
	}

	public void setOrdo(ArrayList<Medicament> ordo) {
		this.ordo = ordo;
	}

	public void saveVisite() throws ClassNotFoundException, SQLException{
		DAOVisite dao = new DAOVisite();
		dao.saveVisite(this);
	}

	@Override
	public String toString() {
		return idPatient + "\t" + num_salle + "\t"	+ nomMedecin + "\t" + tarif + "\t" + date + "\t" + ordo;
		 
	}
	
	

}