package model;

import java.util.Date;;

public class Visite {
	private long id;
	private int idPatient;
	private Date date;
	private int num_salle;
	private String medecin;
	private double tarif = 20;
	private String ordonnance;

	public String getOrdonnance() {
		return ordonnance;
	}

	public void setOrdonnance(String ordonnance) {
		this.ordonnance = ordonnance;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public int getIdPatient() {
		return idPatient;
	}

	public void setIdPatient(int idPatient) {
		this.idPatient = idPatient;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public int getNum_salle() {
		return num_salle;
	}

	public void setNum_salle(int num_salle) {
		this.num_salle = num_salle;
	}

	public String getMedecin() {
		return medecin;
	}

	public void setMedecin(String medecin) {
		this.medecin = medecin;
	}

	public Visite(int idPatient, Date date, int num_salle, String medecin) {
		super();

		this.idPatient = idPatient;
		this.date = date;
		this.num_salle = num_salle;
		this.medecin = medecin;
		

	}

	public double getTarif() {
		return tarif;
	}

	public void setTarif(double tarif) {
		this.tarif = tarif;
	}

	public Visite() {
		super();
	}

	@Override
	public String toString() {
		return "\n\nVisite n° "+id+" du patient "+id+ "\n\tDate: "+date+"\tsalle N° "+num_salle+"\n\tDoc. "+medecin+ "\ttarif: "+tarif+"£"+"\n\tOrdonnance: "+"\n\t"+ordonnance; 
	}

}
