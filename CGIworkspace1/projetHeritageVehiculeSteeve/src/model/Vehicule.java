package model;

public class Vehicule {
	protected String marque;
	protected int prix;

	// constructeur
	public Vehicule(String marque, int prix) {
		this.marque = marque;
		this.prix = prix;
	}

	// toString()
	public String toString() {
		return "marque : " + marque + ", prix : " + prix;
	}

	// méthode
	public String avancer() {
		return "Je roule";
	}

}
