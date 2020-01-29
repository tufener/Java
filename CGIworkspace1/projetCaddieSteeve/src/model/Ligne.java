package model;

public class Ligne {

	private int quantite;
	private Article article;

	// constructeur
	public Ligne(Article article, int quantite) {
		this.article = article;
		this.quantite = quantite;
	}

	// toString()
	public String toString() {
		return this.quantite + " " + this.article + "\t" + this.getPrix() + "€ au total";
	}

	public int getPrix(){
		return this.quantite * this.article.getPrix();
	}

}
