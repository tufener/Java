package model;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class Hopital {
	private int idHopital;
	private String nomHopital;
	private Collection<Salle> salles;
	private Collection<Patient> patient;

	public Hopital(int idHopital, String nomHopital, Collection<Salle> salles, Collection<Patient> patient) {

		this.idHopital = idHopital;
		this.nomHopital = nomHopital;
		this.salles = salles;
		this.patient = patient;
	}

	public Hopital() {

	}

	@Id
	public int getIdHopital() {
		return idHopital;
	}

	public void setIdHopital(int idHopital) {
		this.idHopital = idHopital;
	}

	public String getNomHopital() {
		return nomHopital;
	}

	public void setNomHopital(String nomHopital) {
		this.nomHopital = nomHopital;
	}

	@OneToMany(mappedBy = "hopital")
	public Collection<Salle> getSalles() {
		return salles;
	}

	public void setSalles(Collection<Salle> salles) {
		this.salles = salles;
	}
	
	@ManyToMany//(fetch = FetchType.LAZY)
	@JoinTable(name = "hopital_patient", joinColumns = @JoinColumn(name = "PATIENT_ID"), inverseJoinColumns = @JoinColumn(name = "HOPITAL_ID"))
	public Collection<Patient> getPatient() {
		return patient;
	}

	public void setPatient(Collection<Patient> patient) {
		this.patient = patient;
	}

	@Override
	public String toString() {
		return "Hopital [idHopital=" + idHopital + ", nomHopital=" + nomHopital + ", salles=" + salles + ", patient="
				+ patient + "]";
	}

}
