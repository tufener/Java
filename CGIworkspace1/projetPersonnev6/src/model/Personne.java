package model;

public class Personne {
	private String nom;
	private String prenom;
	private Adresse adresse;
	private Info info;
	
	
	public Info getInfo() {
		return info;
	}


	public Personne(String nom, String prenom, int poids, double taille) {
		this.nom = nom;
		this.prenom = prenom;
		this.info = new Info(poids, taille);
	}

	public Personne(String nom, String prenom, Adresse adresse, int poids, double taille) {
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		this.info = new Info(poids, taille);
		
	}

	public Personne(String nom, String prenom, Adresse adresse) {
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
	}
	
	public Personne(String nom, String prenom) {
		this.nom = nom;
		this.prenom = prenom;
	}
	@Override
	public String toString() {
		String response = "Personne [nom=" + nom + ", prenom=" + prenom;
		response += (adresse != null)? "\n adresse=" + adresse.toString() : " " ;
		response += (info != null)? "\n info=" + info.toString() : " " ;
		
		return response;
	}

	public Adresse getAdresse() {
		return adresse;
	}


	
	


}
