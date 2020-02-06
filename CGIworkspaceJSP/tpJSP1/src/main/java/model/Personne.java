package model;

public class Personne {
	private int id; 
	private String nom;
	private String prenom;
	
	
	@Override
	public String toString() {
		return "Bienvenue: " + "\n" + "id= " + id + "\n" + "nom= " + nom + "\n" + "prenom= " + prenom ;
	}


	public Personne(int id, String nom, String prenom) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
	}


	public int getId() {
		return id;
	}


	public String getNom() {
		return nom;
	}


	public String getPrenom() {
		return prenom;
	}
	
	

	
}
