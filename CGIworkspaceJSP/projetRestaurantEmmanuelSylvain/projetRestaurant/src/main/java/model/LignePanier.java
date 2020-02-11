package model;

public class LignePanier {
	private String article;
	private int quantite;
	private int prixT;

	public LignePanier() {
	}
	
	public LignePanier(String article, int quantite, int prixT) {
		this.article = article;
		this.quantite = quantite;
		this.prixT = prixT;
	}

	public String toString() {
		return "LignePanier [article=" + article + ", quantite=" + quantite + ", prixT=" + prixT + "]";
	}

	public String getArticle() {
		return article;
	}

	public void setArticle(String article) {
		this.article = article;
	}

	public int getQuantite() {
		return quantite;
	}

	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}

	public int getPrixT() {
		return prixT;
	}

	public void setPrixT(int prixT) {
		this.prixT = prixT;
	}
	
	
}
