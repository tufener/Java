package model;

public class Medicament {
	private int id;
	private String nom;
	private int prix;
	private int stock;
	
	public Medicament() {
		
	}
	
	public Medicament(int id, String nom, int prix, int stock) {
		super();
		this.id = id;
		this.nom = nom;
		this.prix = prix;
		this.stock = stock;
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

	@Override
	public String toString() {
		String res = "";
		res += "ID\tNOM\tPRIX\tSTOCK";
		res += id + "\t" + nom + "\t " + prix + "\t" + stock;
		return res;
	}
	
	

}
