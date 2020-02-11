package model;

public class Client {
	private int id;
	private String nom;
	private String prenom;
	private String password;
	private String addresse;

	public Client() {
	}

	public Client(int id, String nom, String password) {
		this.id = id;
		this.nom = nom;
		this.password = password;
	}

	public Client(String nom, String prenom, String password, String addresse) {
		this.nom = nom;
		this.prenom = prenom;
		this.password = password;
		this.addresse = addresse;
	}

	public String getNom() {
		return nom;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAddresse() {
		return addresse;
	}

	public void setAddresse(String addresse) {
		this.addresse = addresse;
	}

	@Override
	public String toString() {
		return "Client [nom=" + nom + ", prenom=" + prenom + ", password=" + password + ", addresse=" + addresse + "]";
	}

}
