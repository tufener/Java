package model;

public class InfoProprio {

	/* ATTRIBUTS */
	private String nom;
	private String prenom;

	/* CONSTRUCTEURS */
	public InfoProprio(String nom, String prenom) {
		this.nom = nom;
		this.prenom = prenom;
	}

	/* METHODES */
	@Override
	public String toString() {
		return "InfoProprio [nom=" + nom + ", prenom=" + prenom + "]";
	}

	/* ACCESSEURS */

}
