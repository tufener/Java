package model;

public class Medicament {
	
	private int idMed;
	private String nom;
	private int prix;
	private int quantite;

	public Medicament(int idMed, String nom, int prix, int quantite) {
		super();
		this.idMed = idMed;
		this.nom = nom;
		this.prix = prix;
		this.quantite = quantite;
	}

	public Medicament() {
		super();
	}

	public int getIdMed() {
		return idMed;
	}

	public void setIdMed(int idMed) {
		this.idMed = idMed;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getPrix() {
		return prix;
	}

	public void setPrix(int prix) {
		this.prix = prix;
	}

	public int getQuantite() {
		return quantite;
	}

	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}

	@Override
	public String toString() {
		return   idMed + " \t" + nom + "\t\t" + prix + "\t" + quantite;
	}

}
