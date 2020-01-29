package projetStatic;

public class Personne {
	private static String nom = "dupond";
	private String prenom;
	private static final int ageMin = 0;
	private static int compteur; // création d'un compteur on le met en statique
									// si non il ne va pas se souvenir / prendre
									// en compte les nouvelles personnes que
									// l'on va rentrer dans la partie test



	public Personne(String prenom) {

		this.prenom = prenom;
		compteur++;
	}

	public static int getCompteur() {
		return compteur;
	}

	public static void setNom(String nom) {
		Personne.nom = nom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;

	}

	@Override
	public String toString() {
		return "Personne [nom=" + nom + ", prenom=" + prenom + "]";
	}

}
