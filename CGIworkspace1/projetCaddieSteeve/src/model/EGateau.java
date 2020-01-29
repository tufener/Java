package model;

public enum EGateau {
	choco(1), vanille(2);

	// atribut
	private int prix;

	private EGateau(int prix){
		this.prix = prix;
	}

	// toString()
	public String toString() {
		return "parfum " + this.name();
	}

	public int getPrix() {
		return prix;
	}
}
