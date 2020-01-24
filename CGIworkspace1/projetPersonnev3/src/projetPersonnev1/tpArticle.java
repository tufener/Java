package projetPersonnev1;

public class tpArticle {

	private String marque;
	private int prix;
	
	private String status;

	public final int prixMin = 0; 
	public final int prixPivot = 100;
	
	

	public String getMarque() {
		return marque.toUpperCase();

	}

	public tpArticle(String marque) {
		this.marque = marque;
	}

	public tpArticle(String marque, int prix) {
		this.marque = marque;

		setPrix(prix);

	}

	

	public void setPrix(int prix) {
		if (prix > prixMin) {
			this.prix = prix;
			condition();

		}

	}

	private void condition() {

		if (prix < prixPivot)
			status = "pas cher";
		else
			status = "cher";

	}
	
	public int getPrix() {
		return prix;

	}

	private String status() {

		return status;

	}

	public String toString() {
		String reponse = "MARQUE: " + this.getMarque();
		reponse += " PRIX: " + prix;
		reponse += " \nSTATUs: " + status;
		// reponse += (prix < prixPivot) ? " Pas cher" : " Cher"; // condition
		// Ternaire
		return reponse;

	}

}
