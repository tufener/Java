package model;

public class Boisson extends Article {
	private EBoisson eboisson;

	// constructeur
	public Boisson(String nom, int prix, EBoisson eboisson) {
		super(nom, prix);
		this.eboisson = eboisson;
	}

	// toString
	public String toString(){
		return super.toString() + ", " + this.eboisson;
	}

}
