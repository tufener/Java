package model;

import java.util.Arrays;

public class Groupe {
	private String nom;
	private Personne[] tab;

	public Groupe(String nom, int taille) { // constructeur
		this.nom = nom;
		tab = new Personne[taille];
	}

	public boolean remove(int id) { // rajouter une personne au sein du
		// groupe
		boolean res = false; // on positionne toujours le boolean à false (cas
		// le plus défavorable)
		for (int i = 0; i < tab.length; i++)
			if (tab[i] != null && tab[i].getId() == id) {
				tab[i] = null;
				res = true;
				break;

			}
		return res;

	}

	public boolean ajouter(Personne p) { // rajouter une personne au sein du
											// groupe
		boolean res = false; // on positionne toujours le boolean à false (cas
								// le plus défavorable)
		for (int i = 0; i < tab.length; i++)
			if (tab[i] == null) {
				tab[i] = p;
				res = true;
				break;

			}
		return res;

	}

	@Override
	public String toString() {
		String res = "Groupe[nom= " + nom;
		for (Personne p : tab)
			if (p != null)
				res += "\n" + p;
		return res;

	}

	public int getCount() {

		int compteur = 0;
//		for(Personne p : tab)
//		if(p!=null)
//			compteur++;
		for (int i = 0; i < tab.length; i++) {
			if (tab[i] != null)
				compteur++;

		}
		return compteur;

	}

	public int getCount(String nom) {

		int compteur = 0;
		
		for(Personne p : tab){
			if(p !=null && p.getNom().equalsIgnoreCase(nom))
			compteur++;
		}
//		for (int i = 0; i < tab.length; i++) {
//			if (tab[i] != null && tab[i].getNom() == nom)
//				compteur++;
//		}
		
		return compteur;

	}

}
