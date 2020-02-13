package model;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Version;

@Entity
public class Hopital {

	@Id
	private int id;

	private String name;

	@Version
	private int version;

	@ManyToMany
	@JoinTable(name = "hopital_patient", joinColumns = @JoinColumn(name = "hopital_id"), inverseJoinColumns = @JoinColumn(name = "patient_id"))
	private Collection<Patient> patients;

	@OneToMany(mappedBy = "hopital")
	private Collection<Salle> salles;

	public Hopital() {
	}

	public Hopital(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	public Collection<Patient> getPatients() {
		return patients;
	}

	public void setPatients(Collection<Patient> patients) {
		this.patients = patients;
	}

	public Collection<Salle> getSalles() {
		return salles;
	}

	public void setSalles(Collection<Salle> salles) {
		this.salles = salles;
	}

	@Override
	public String toString() {
		return "Hopital [id=" + id + ", name=" + name + ", version=" + version + ", patients=" + patients + ", salles="
				+ salles + "]";
	}

}
