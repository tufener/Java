package model;

import javax.persistence.Embeddable;

@Embeddable
public class Coordonnees {
	private String adresse;
	private String telephone;

	public Coordonnees(String adresse, String telephone) {
		this.adresse = adresse;
		this.telephone = telephone;
	}

	public Coordonnees() {
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	@Override
	public String toString() {
		return "Coordonnees [adresse=" + adresse + ", telephone=" + telephone + "]";
	}

}
