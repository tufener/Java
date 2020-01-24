package model;

public abstract class Article {
	private String nom; 
	private int prix;

	
	
	
	public Article(String nom, int prix) {
		this.nom = nom;
		this.prix = prix;
	}
	
	




	public int getPrix() {
		return prix;
	}






	public Article(String nom) {
		this.nom = nom;
	}






	@Override
	public String toString() {
		return "nom=" + nom + ", prix=" + prix;
	}
	
	
	
	
	

}
