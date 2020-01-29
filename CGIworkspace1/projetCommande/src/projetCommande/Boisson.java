package projetCommande;

public enum Boisson {
	coca(3), eau(1), sansboisson;

	
	
	
	private int prix;



	private Boisson(int prix) {
		this.prix = prix;

	}
	
	public int getPrix() {
		return prix;
	}
	
	private Boisson() {
		
	}
	
	

	public String toString() {
		return name() + prix;
	}

}
