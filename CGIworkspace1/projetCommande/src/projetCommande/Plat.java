package projetCommande;

public enum Plat {
	duJour(5),
	salade(3),
	riz(4);
	
	private int prix;
	
	

	
	private Plat (int prix) {
		this.prix = prix;
	}
	
	public int getPrix() {
		return prix;
	}

	
	

	public String toString() {
		return  name()  + prix;
	}
	
	

}
