package model;

public class Medicament {
	
	private String nom;
	private int id;
	private int prix;
	private int stock;
	
	public Medicament() {
		}

	public Medicament(int id, String nom, int prix, int stock) {
		this.id = id;
		this.nom = nom;
		this.prix = prix;
		this.stock = stock;
		
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

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return id + "\t" + nom + "\t" + prix + "\t" + stock;
	}
	
	
}
