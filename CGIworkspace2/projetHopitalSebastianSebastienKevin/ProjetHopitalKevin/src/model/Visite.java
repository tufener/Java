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
	private String nomMedecin;
	private int tarif = 20;
	private int num_salle;
	private String date;
	private ArrayList<Medicament> ordo = new ArrayList<Medicament>();
	public Visite() {
		
	}
	
	public Visite(int idPatient, String nomMedecin, int num_salle, int tarif, ArrayList<Medicament> ordo) {
		super();
		this.idPatient = idPatient;
		this.nomMedecin = nomMedecin;
		this.tarif = tarif;
		this.num_salle = num_salle;
		this.ordo = ordo;
		for (Medicament m : ordo) 
			this.tarif += m.getPrix() * m.getStock();
		DateFormat format = new SimpleDateFormat("yyyy-mm-dd HH:mm:ss");
		Calendar calendar = Calendar.getInstance();
		date = format.format(calendar.getTime()); 
	}
	
	public int getId() {
		return id;
	}

	public int getIdPatient() {
		return idPatient;
	}

	public String getNomMedecin() {
		return nomMedecin;
	}

	public int getTarif() {
		return tarif;
	}

	public String getDate() {
		return date;
	}

	public void setId(int id) {
		this.id = id;
	}

	

	public int getNum_salle() {
		return num_salle;
	}



	public void setNum_salle(int num_salle) {
		this.num_salle = num_salle;
	}



	public void setIdPatient(int idPatient) {
		this.idPatient = idPatient;
	}



	public void setNomMedecin(String nomMedecin) {
		this.nomMedecin = nomMedecin;
	}



	public void setTarif(int coutVisite) {
		this.tarif = coutVisite;
	}	

	public ArrayList<Medicament> getOrdo() {
		return ordo;
	}

	public void setOrdo(ArrayList<Medicament> ordo) {
		this.ordo = ordo;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String afficherVisiteParId(int numero) throws ClassNotFoundException, SQLException {
		ArrayList<Visite> liste = new DAOVisite().findVisitebyNumero(numero);
		
		if (liste.size() > 0 )  {
			System.out.println("Liste size " + liste.size());
			String res = "";
			res = "Liste des visite du patient n°" + numero + "\n";
			res += "ID\tMEDECIN\tDATE\tTARIF \n";
			for (Visite v : liste)
				res += v.id + "\t" + v.nomMedecin + "\t"  + v.date + "\t" + v.tarif + "€";
			return res;
		}
		else 
		{
			return "Soit la liste est vide soit le numéro de sécu ne correspond à aucun patient";
		}
	}
	
	public String afficherVisiteParMedecin(String nom) throws ClassNotFoundException, SQLException {
		ArrayList<Visite> liste = new DAOVisite().findVisitebyMedecin(nom);
		
		if (liste.size() > 0 )  {
			System.out.println("Liste size " + liste.size());
			String res = "";
			res = "Liste des visite du patient n°" + nom + "\n";
			res += "ID\tPATIENT\tDATE\t\t\tTARIF \n";
			for (Visite v : liste)
				res += v.id + "\t" + v.idPatient+ "\t"  + v.date + "\t" + v.tarif + "€ \n";
			return res;
		}
		else 
		{
			return "Soit la liste est vide soit le nom ne correspond à aucun médecin";
		}
	}

	@Override
	public String toString() {
		return "Visite [id=" + id + ", idPatient=" + idPatient + ", nomMedecin=" + nomMedecin + ", tarif="
				+ tarif + ", date=" + date + "]";
	}
}
