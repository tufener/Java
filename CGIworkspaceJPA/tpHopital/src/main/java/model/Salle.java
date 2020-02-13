package model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Salle {
	private int idSalle; 
	
	private String nomSalle; 
	
	private Hopital hopital;
	
	@OneToOne(mappedBy = "salles")
	private Medecin medecin; 
	
	
	public Salle(int idSalle, String nomSalle, Hopital hopital) {
		
		this.idSalle = idSalle;
		this.nomSalle = nomSalle;
		this.hopital = hopital;
	}
	public Salle() {
		
	}
	@Id
	public int getIdSalle() {
		return idSalle;
	}
	public void setIdSalle(int idSalle) {
		this.idSalle = idSalle;
	}
	public String getNomSalle() {
		return nomSalle;
	}
	public void setNomSalle(String nomSalle) {
		this.nomSalle = nomSalle;
	}
	
	@ManyToOne
	@JoinColumn(name="HOPITAL_ID")
	public Hopital getHopital() {
		return hopital;
	}
	public void setHopital(Hopital hopital) {
		this.hopital = hopital;
	}
	@Override
	public String toString() {
		return "Salle [idSalle=" + idSalle + ", nomSalle=" + nomSalle + ", hopital=" + hopital + "]";
	} 
	
	

}
