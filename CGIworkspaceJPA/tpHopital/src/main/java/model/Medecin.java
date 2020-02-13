package model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Medecin {
	private int idMedecin; 
	private String nomMedecin;
	private Salle salles;
	
	public Medecin(int idMedecin, String nomMedecin, Salle salles) {
		
		this.idMedecin = idMedecin;
		this.nomMedecin = nomMedecin;
		this.salles = salles;
	}

	public Medecin() {
		
	}
	@Id
	public int getIdMedecin() {
		return idMedecin;
	}

	public void setIdMedecin(int idMedecin) {
		this.idMedecin = idMedecin;
	}

	public String getNomMedecin() {
		return nomMedecin;
	}

	public void setNomMedecin(String nomMedecin) {
		this.nomMedecin = nomMedecin;
	}
	@OneToOne
	public Salle getSalles() {
		return salles;
	}

	public void setSalles(Salle salles) {
		this.salles = salles;
	}

	@Override
	public String toString() {
		return "Medecin [idMedecin=" + idMedecin + ", nomMedecin=" + nomMedecin + ", salles=" + salles + "]";
	} 
	

	
	
	
	
	
	

}
