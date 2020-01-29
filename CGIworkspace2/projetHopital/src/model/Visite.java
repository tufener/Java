package model;

public class Visite {
	private int idVisite;
	private int idPatient;
	private String date; 
	private int numSalle; 
	private int medecin; 
	private int tarif; 
	private String ordonnance;
	
	public Visite(int idVisite, int idPatient, String date, int numSalle, int medecin, int tarif, String ordonnance) {
		super();
		this.idVisite = idVisite;
		this.idPatient = idPatient;
		this.date = date;
		this.numSalle = numSalle;
		this.medecin = medecin;
		this.tarif = tarif;
		this.ordonnance = ordonnance;
	}

	public Visite() {
		
	}

	public int getIdVisite() {
		return idVisite;
	}

	public void setIdVisite(int idVisite) {
		this.idVisite = idVisite;
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

	public int getNumSalle() {
		return numSalle;
	}

	public void setNumSalle(int numSalle) {
		this.numSalle = numSalle;
	}

	public int getMedecin() {
		return medecin;
	}

	public void setMedecin(int medecin) {
		this.medecin = medecin;
	}

	public int getTarif() {
		return tarif;
	}

	public void setTarif(int tarif) {
		this.tarif = tarif;
	}

	public String getOrdonnance() {
		return ordonnance;
	}

	public void setOrdonnance(String ordonnance) {
		this.ordonnance = ordonnance;
	}

	@Override
	public String toString() {
		return "Visite " + idVisite + "\nPatient=" + idPatient + ", date=" + date + ", numéro de salle=" + numSalle
				+ ", medecin=" + medecin + ", tarif=" + tarif + ", ordonnance=" + ordonnance +"\n----------------------------------" ;
	} 
	
	
	
	

}
