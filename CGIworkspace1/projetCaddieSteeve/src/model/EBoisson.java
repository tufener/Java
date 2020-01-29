package model;

public enum EBoisson {
	petit(1), moyen(2), grand(3);

	// atribut
	private int taille; // en litres

	// constructeur
	private EBoisson(int taille) {
		this.taille = taille;
	}

	// toString()
	public String toString(){
		return this.name() + " (" + this.taille + "L)";
	}
}
