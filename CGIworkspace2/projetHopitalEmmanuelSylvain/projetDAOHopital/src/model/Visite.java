package model;

public class Visite {

	private int nbVisite;
	private int idPatient;
	private String date;
	private int numeSalle;
	private String medecin;
	private int tarif = 23;
	private String ordonnance;

	public void setTarif(int tarif) {
		this.tarif = tarif;
	}

	public Visite() {

	}

	public Visite(int idPatient, int numeSalle, String medecin) {
		super();
		this.idPatient = idPatient;
		this.numeSalle = numeSalle;
		this.medecin = medecin;
		
	}

	public String getOrdonnance() {
		return ordonnance;
	}

	public void setOrdonnance(String ordonnance) {
		this.ordonnance = ordonnance;
	}

	public int getNbVisite() {
		return nbVisite;
	}

	public void setNbVisite(int nbVisite) {
		this.nbVisite = nbVisite;
	}

	public int getIdPatient() {
		return idPatient;
	}

	public void setIdPatient(int idPatient) {
		this.idPatient = idPatient;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public int getNumeSalle() {
		return numeSalle;
	}

	public void setNumeSalle(int numeSalle) {
		this.numeSalle = numeSalle;
	}

	public String getMedecin() {
		return medecin;
	}

	public void setMedecin(String medecin) {
		this.medecin = medecin;
	}

	public int getTarif() {
		return tarif;
	}

	
	
	@Override
	public String toString() {
		return  nbVisite + "\t" + idPatient + "\t" + date + "\t"
				+ numeSalle + "\t" + medecin + "\t" + tarif +"\t"+ordonnance;
	}

}
