package model;

public class Poste {
	private String nom;
	
	public Poste(String nom) {
		this.nom = nom;
	}

	public void print(String message) {

		Centraliseur.getInstance().print(nom+message);
		
	}
}
