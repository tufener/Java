package model;

public class Gateau extends Article {
	private EGateau egateau;

	public Gateau(String nom, EGateau egateau) {
		super(nom, egateau.getPrix());
		this.egateau = egateau;
	}


	@Override
	public String toString() {
		return "Gateau: " + egateau.name() + "Volume: " + egateau.getPrix();
	}

}