package model;

public class Personne {
	private int id;
	private String nom;
	private String prenom;

	// constructeurs(s)
	public Personne() {
	}

	public Personne(int id, String nom, String prenom) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
	}

	// toString()
	public String toString() {
		return id + "\t" + nom.toUpperCase() + "\t" + prenom.toLowerCase();
	}

	// accesseurs
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

}
