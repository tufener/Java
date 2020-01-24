package model;

public enum CB {
	Amex(5),
	Visa(15),
	MasterCard(10);
	
	private int prix;

	private CB(int prix) {
		this.prix = prix;
	}

	public int getPrix() {
		return prix;
	}
	
	public String toString() {
		return "Carte Bancaire: " + name() + "le prix de la carte est de: " +  getPrix() + " €";
	}
	
	

}
