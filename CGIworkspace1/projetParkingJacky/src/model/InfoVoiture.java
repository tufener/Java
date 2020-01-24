package model;

public class InfoVoiture {
	
	/* ATTRIBUTS */
	private String matricule;
	private String marque;
	
	/* CONSTRUCTEURS */
	public InfoVoiture(String matricule, String marque) {
		this.matricule = matricule;
		this.marque = marque;
	}

	/* METHODES */
	@Override
	public String toString() {
		return "InfoVoiture [matricule=" + matricule + ", marque=" + marque + "]";
	}

	/* ACCESSEURS */
	public String getMatricule() {
		return matricule;
	}
	
	public String getMarque() {
		return marque;
	}
	
	
	
}
