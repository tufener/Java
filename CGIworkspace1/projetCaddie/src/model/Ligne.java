package model;

public class Ligne {
	private Article article;
	private int quantite;

	public Ligne(Article article,  int quantite) {
		this.article = article;
		this.quantite = quantite;
		
	}

	@Override
	public String toString() {
		return this.quantite + this.article + this.get;
	}

	public int getQuantite() {
		return quantite;
	}

	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}

	public Article getArticle() {
		return article;
	}

	public void setArticle(Article article) {
		this.article = article;
	}
	

}