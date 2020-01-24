package model;

public class Info {
	int poids;
	double taille;
	


	public Info(int poids, double taille) {
		this.poids = poids;
		this.taille = taille;
	}

	public double getTaille() {
		return taille;
	}

	public void setPoids(int poids) {
		this.poids = poids;
	}
	
	@Override
	public String toString() {
		return "Info [poids=" + poids + ", taille=" + taille + "]";
	}

}
