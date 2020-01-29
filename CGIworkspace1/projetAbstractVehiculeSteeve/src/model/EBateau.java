package model;

public enum EBateau {
	petit(2), moyen(10), grand(50);

	// attribut
	private int taille;
	
	//constructeur
	private EBateau(int taille){
		this.taille=taille;
	}

	// toString
	public String toString() {
		return this.name() + " (" + this.taille + ")";
	}
}
