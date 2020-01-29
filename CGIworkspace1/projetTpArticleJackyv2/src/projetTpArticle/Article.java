package projetTpArticle;

public class Article {
	private String marque;
	private int prix;

	private String status;
	

	public final int prixMin = 0;
	public final int prixpivot = 100;

	public Article(String marque, int prix) {
		this.marque = marque;
		setPrix(prix);
		
	}

	public Article(String marque) {
		this.marque = marque;

	}

	public int getPrix() {
		return prix;
	}

	public void setPrix(int prix) {
		if (prix > prixMin) {
			this.prix = prix;
			computeStatus();
		}
	}

	private void computeStatus() {
		if (prix < prixpivot)
			status = " pas cher ";
		else
			status = "  cher ";
	}

	public String getStatus() {
		return status;
	}

	public String getMarque() {
		return marque;
	}

	public String toString() {
		return " [marque=" + marque + ", prix=" + prix + "]" + status;
	}

}
