package model;

public class Clients {
	private int id;
	private String password;
	private String nom;
	private String prenom;
	private String adresse;

	public Clients(int id, String password, String nom, String prenom, String adresse) {
		super();
		this.id = id;
		this.password = password;
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;

	}
	
	public Clients(int id, String password, String nom, String prenom, String adresse) {
		super();
		this.id = id;
		this.password = password;
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;

	}

	public Clients() {
		
	}

	@Override
	public String toString() {
		return "Id= " + id + ", Password= " + password + ", Nom= " + nom + ", Prenom=" + prenom + ", Adresse="
				+ adresse;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
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

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

}
