package model;

public class Parking {

	/* ATTRIBUTS */
	private String nom;
	private Voiture[] tab;

	/* CONSTRUCTEURS */
	public Parking(String nom, int taille) {
		this.nom = nom;
		tab = new Voiture[taille];
	}

	/* METHODES */
	public String toString() {
		String reponse = "\t" + nom + "\n";
		for (Voiture v : tab) {
			if (v != null)
				reponse += v.toString() + "\n";
		}
		return reponse;
	}

	public boolean garer(Voiture v) {
		boolean reponse = false;
		for (int i = 0; i < tab.length; i++) {
			if (tab[i] == null) {
				v.setVitesse(0);
				tab[i] = v;
				
				reponse = true;
				break;
			}
		}
		return reponse;
	}

	public boolean quitter(String matricule) {
		boolean reponse = false;
		for (int i = 0; i < tab.length; i++) {
			if (tab[i] != null && tab[i].getInfoVoiture().getMatricule().equalsIgnoreCase(matricule)  ) {
		//	if (tab[i] != null && tab[i].getInfoVoitureMarque().equalsIgnoreCase(matricule)  ) {	
			tab[i] = null;
				reponse = true;
				break;
			}
		}
		return reponse;
	}

	public int getNbVoitures() {
		int count = 0;
		for (Voiture v : tab) {
			if (v != null)
				count++;
		}
		return count;
	}
	
	public int getNbVoituresByMarque(String marque) {
		int count = 0;
		for (Voiture v : tab) {
			if (v != null && v.getInfoVoiture().getMarque().equalsIgnoreCase(marque))
				count++;
		}
		return count;
	}

	/* ACCESSEURS */

}
