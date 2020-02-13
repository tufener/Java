package model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Version;

@Entity
public class Salle {

	@Id
	private int id;

	private String name;

	@Version
	private int version;

	@ManyToOne
	@JoinColumn(name = "hopital_id")
	private Hopital hopital;

	@OneToOne(mappedBy = "salle")
	private Medecin medecin;

	public Salle() {
	}

	public Salle(int id, String name) {
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

	public Hopital getHopital() {
		return hopital;
	}

	public void setHopital(Hopital hopital) {
		this.hopital = hopital;
	}

	public Medecin getMedecin() {
		return medecin;
	}

	public void setMedecin(Medecin medecin) {
		this.medecin = medecin;
	}

	@Override
	public String toString() {
		return "Salle [id=" + id + ", name=" + name + ", version=" + version + ", medecin=" + medecin + "]";
	}

}
