package model;

public class Client {
	private String nom;
	private int nbSal;
	private EPole pole;
	public Client(String nom, int nbSal, EPole pole) {
		this.nom = nom;
		this.nbSal = nbSal;
		this.pole = pole;
	}
	public String toString() {
		return Utils.firstUpper(nom) + " (" + nbSal + " salariés, pôle " + pole+")";
	}
}
