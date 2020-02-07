package model;

public class Personne {
	private String nom;
	private String prenom;
	private int id;

	public Personne(String nom, String prenom, int id) {
		this.nom = nom;
		this.prenom = prenom;
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public int getId() {
		return id;
	}

	public String toString() {
		return "Personne [nom=" + nom + ", prenom=" + prenom + ", id=" + id + "]";
	}

}
