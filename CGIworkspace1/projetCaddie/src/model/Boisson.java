package model;

public class Boisson extends Article {
	private EBoisson eboisson;

	public Boisson(String nom, int prix, EBoisson eboisson) {
		super(nom, prix);
		this.eboisson = eboisson;
	}

	@Override
	public String toString() {
		return this.toString() + this.eboisson;
	}

}