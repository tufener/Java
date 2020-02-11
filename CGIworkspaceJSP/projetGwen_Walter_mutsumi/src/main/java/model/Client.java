package model;

public class Client {
	private int id;
	private String password;
	private String nom;
	private String prenom;
	private String adresse;

	public Client(int id, String password, String nom, String prenom, String adresse) {
		this.id = id;
		this.password = password;
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
	}

	public int getId() {
		return id;
	}

	public String getPassword() {
		return password;
	}

	public String getNom() {
		return nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public String getAdresse() {
		return adresse;
	}

	@Override
	public String toString() {
		return "Client{" +
				"id=" + id +
				", password='" + password + '\'' +
				", nom='" + nom + '\'' +
				", prenom='" + prenom + '\'' +
				", adresse='" + adresse + '\'' +
				'}';
	}
}
