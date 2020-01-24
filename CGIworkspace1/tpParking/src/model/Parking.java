package model;

import java.util.Arrays;

public class Parking {
	private String nom;
	private Voiture tab[];
	

	@Override
	public String toString() {
		return "Parking [nom=" + nom + ", tab=" + Arrays.toString(tab) + "]";
	}

	public Parking(String nom, int taille) {
		this.nom = nom;
		Voiture tab[] = new Voiture[taille];
	}

	public boolean garer(Voiture v) { // 
		boolean res = false; 
		for (int i = 0; i < tab.length; i++){
			if (tab[i] == null) {
				tab[i] = v;
				tab[i].setVitesse(0);
				res = true;
				break;

			}
		}
		return res;
	}
	
	public boolean quitterparking(String matricule) { // rajouter une personne au sein du
		// groupe
		boolean res = false; // on positionne toujours le boolean à false (cas
		// le plus défavorable)
		for (int i = 0; i < tab.length; i++)
			if (tab[i] != null && tab[i].getVoiture().getMatricule().equalsIgnoreCase(matricule)) {
				tab[i] = null;
				res = true;
				break;

			}
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
	
	public int getCountMarque(String marque) {

		int compteur = 0;
		
		for(Voiture p : tab){
			if(p !=null && p.getVoiture().getMarque().equalsIgnoreCase(marque))
			compteur++;
		}
//		for (int i = 0; i < tab.length; i++) {
//			if (tab[i] != null && tab[i].getNom() == nom)
//				compteur++;
//		}
		
		return compteur;

	}

}
