package model;

public class Medicaments {
	private int idMed;
	private String nomMed;
	private int prix;
	private int quantiteStock;
	
	public Medicaments(int id, String nom, int prix, int quantite) {
		this.idMed = id;
		this.nomMed = nom;
		this.prix = prix;
		this.quantiteStock = quantite;
	}

	public Medicaments() {
	}

	public int getIdMed() {
		return idMed;
	}

	public void setIdMed(int idMed) {
		this.idMed = idMed;
	}

	public String getNomMed() {
		return nomMed;
	}

	public void setNomMed(String nomMed) {
		this.nomMed = nomMed;
	}

	public int getPrix() {
		return prix;
	}

	public void setPrix(int prix) {
		this.prix = prix;
	}

	public int getQuantiteStock() {
		return quantiteStock;
	}

	public void setQuantiteStock(int quantiteStock) {
		this.quantiteStock = quantiteStock;
	}

	@Override
	public String toString() {
		return "Medicament " + idMed + " : [nom du médicament: " + nomMed + ", prix: " + prix + "€, quantite en stock: " + quantiteStock + "]";
	}

	
	
}
