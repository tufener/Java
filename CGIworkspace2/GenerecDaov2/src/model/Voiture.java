package model;

public class Voiture {
	private String matricule;
	private String marque;

	public String getMarque() {
		return marque;
	}


	public Voiture(String matricule, String marque) {
		this.matricule = matricule;
		this.marque = marque;
	}


	public void setMarque(String marque) {
		this.marque = marque;
	}


	public String getMatricule() {
		return matricule;
	}


	@Override
	public String toString() {
		return "Voiture [matricule=" + matricule + ", marque=" + marque + "]";
	}


	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}

	

}
