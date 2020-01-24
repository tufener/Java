package model;

public abstract class Article {
	private String nom;
	private int prix;

	public Article(String nom, int prix) {
		this.nom = nom;
		this.prix = prix;
	}

	// toString()
	public String toString() {
		return this.getClass().getSimpleName() + " : " + this.nom + ", " + this.prix + "€ l'unité";
	}

	public int getPrix() {
		return this.prix;
	}

}
