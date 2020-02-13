package model;

import java.util.Collection;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Version;

@Entity
public class Patient {

	@Id
	private int id;

	private String name;

	@Version
	private int version;

	@Embedded
	private Coordonnee coordonnee;

	@ManyToMany(mappedBy = "patients")
	private Collection<Hopital> hopitals;

	public Patient() {
	}

	public Patient(int id, String name) {
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

	public Coordonnee getCoordonnee() {
		return coordonnee;
	}

	public void setCoordonnee(Coordonnee coordonnee) {
		this.coordonnee = coordonnee;
	}

	public Collection<Hopital> getHopitals() {
		return hopitals;
	}

	public void setHopitals(Collection<Hopital> hopitals) {
		this.hopitals = hopitals;
	}

	@Override
	public String toString() {
		return "Patient [id=" + id + ", name=" + name + ", version=" + version + ", coordonnee=" + coordonnee + "]";
	}

}
