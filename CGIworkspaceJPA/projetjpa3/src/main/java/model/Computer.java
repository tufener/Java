package model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Version;

@Entity
public class Computer {
	private String SerialNumber, model;
	private int version;
	private Personne personne;
	
	
//	@OneToOne(mappedBy = "pc")
	@OneToOne(mappedBy = "pc", fetch=FetchType.LAZY)
	public Personne getPersonne() {
		return personne;
	}

	public Computer(String serialNumber, String model, int version, Personne personne) {
		
		SerialNumber = serialNumber;
		this.model = model;
		this.version = version;
		this.personne = personne; 
		
	}

	public Computer() {
		
	}

	@Id
	public String getSerialNumber() {
		return SerialNumber;
	}

	public void setSerialNumber(String serialNumber) {
		SerialNumber = serialNumber;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	@Version
	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	public void setPersonne(Personne personne) {
		this.personne = personne;
	}



}
