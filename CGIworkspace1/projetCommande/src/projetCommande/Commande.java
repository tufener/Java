package projetCommande;

public class Commande {
	private String nom;
	private Boisson boisson;
	private Plat plat;
	private Dessert dessert;

	public Commande(String nom, Boisson boisson, Plat plat, Dessert dessert) {
		this.nom = nom;
		this.boisson = boisson;
		this.plat = plat;
		this.dessert = dessert;
	}

	public Boisson getBoisson() {
		return boisson;
	}

	public Plat getPlat() {
		return plat;
	}

	public Dessert getDessert() {
		return dessert;
	}

	@Override
	public String toString() {
		return "NOM: " + nom.toUpperCase() + "\nBOISSON: " + boisson.getPrix() + "€" + " - " + boisson.name()
				+ "\nPLAT: " + plat.getPrix() + "€" + " - " + plat.name() + "\nDESSERT: " + dessert.getPrix() + "€"
				+ " - " + dessert.name();
	}

	public int getPrixTotal() {
		return getBoisson().getPrix() + getPlat().getPrix() + getDessert().getPrix();

	}

}
