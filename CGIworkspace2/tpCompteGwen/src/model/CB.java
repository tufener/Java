package model;

public enum CB {
	VISA(15),
	AMEX(5),
	MC(10);

	private int prix;

	private CB(int prix) {
		this.prix = prix;
	}

	public int getPrix() {
		return prix;
	}

}
