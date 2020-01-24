package model;

public class Gateau extends Article {
	private EGateau egateau;

	// constructeur
	public Gateau(String nom, EGateau egateau) {
		super(nom, egateau.getPrix());
		this.egateau = egateau;

	}

	// toString
	public String toString() {
		return super.toString() + ", " + this.egateau;
	}
}
