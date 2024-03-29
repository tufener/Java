package model;

public class Patient {
	private int id;
	private String nom;
	private String prenom;
	private String complement = "NA";
	
	public Patient() {
		
	}
	
	public Patient(int id, String nom, String prenom) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
	}
	
	public Patient(int id, String nom, String prenom, String complement) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.complement = complement;
	}
	

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
	
	public String getComplement() {
		return complement;
	}


	public void setComplement(String complement) {
		this.complement = complement;
	}

	@Override
	public String toString() {
		return "Patient [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", complements=" + complement + "]";
	}
	
	
	

}
