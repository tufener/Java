package model;

import java.util.ArrayList;

public class Caddie {

	private String client;
	private ArrayList<Ligne> lignes;

	// constructeur
	public Caddie(String client) {
		this.client = client;
		this.lignes = new ArrayList<Ligne>();
	}

	// toString()
	public String toString() {
		String res = "Client : " + this.client + "\n";
		for (Ligne l : this.lignes) {
			res += l.toString() + "\n";
		}
		res += "Prix total : " + this.getPrixTotal();
		return res;
	}

	// méthodes
	public void ajouter(Ligne ligne) {
		this.lignes.add(ligne);
	}

	public int getPrixTotal() {
		int res = 0;
		for (Ligne l : this.lignes) {
			res += l.getPrix();
		}
		return res;
	}


}
