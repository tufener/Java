package model;

public class Caddie {
	private Ligne ligne;
	private String client;
	private int prixTotal;
	
	
	public Caddie(Ligne ligne, String client, int prixTotal) {
		this.ligne = ligne;
		this.client = client;
		this.prixTotal = prixTotal;
	}

	@Override
	public String toString() {
		return "Caddie [ligne=" + ligne + ", client=" + client + "]";
	}
	
	public void ajouter(int quantite, String article){
		this.ligne.setQuantite(quantite) ;
		this.ligne.getArticle() ;
		
	}
	
	

}
