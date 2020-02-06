package model;

import java.util.Arrays;

public class Authentification {
	private String nom;
	private String[] tab = { "toto", "paul", "harry", "lola", "wilson" };
	private String message;

	@Override
	public String toString() {
		return "Authentification [nom=" + nom + "]";
	}

	public Authentification(String nom) {

		this.nom = nom;
		checkNom();
	}

	public boolean checkNom() {
		for (int i = 0; i < tab.length; i++) {
			if (nom == tab[i]) {
				message = "Ok c'est bon";
				return true;
			}
			else
				message = "Non c'est pas bon";
		}
		return false;

	}

	public String getNom() {
		return nom;
	}

}
