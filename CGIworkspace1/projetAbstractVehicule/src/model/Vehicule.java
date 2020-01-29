package model;

public abstract class Vehicule {
	protected String marque;
	protected int prix;

	public Vehicule(String marque, int prix) {
		this.marque = marque;
		this.prix = prix;

	}

	@Override
	public String toString() {
		return "[marque=" + marque + ", prix=" + prix + "]" ;
	}

	public String avancer() {
		return "Je roule";
	}
	
	public abstract String demarrer();

}
