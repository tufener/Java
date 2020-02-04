package model;

public class Medicament {
	
	private int idMedicament;
	private String nomMedicament;
	private double prix;
	private int quantite;
	
	public int getIdMedicament() {
		return idMedicament;
	}
	public void setIdMedicament(int idMedicament) {
		this.idMedicament = idMedicament;
	}
	public String getNomMedicament() {
		return nomMedicament;
	}
	public void setNomMedicament(String nomMedicament) {
		this.nomMedicament = nomMedicament;
	}
	public double getPrix() {
		return prix;
	}
	public void setPrix(double prix) {
		this.prix = prix;
	}
	public int getQuantite() {
		return quantite;
	}
	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}
	public Medicament(int idMedicament, String nomMedicament, double prix, int quantite) {
		super();
		this.idMedicament = idMedicament;
		this.nomMedicament = nomMedicament;
		this.prix = prix;
		this.quantite = quantite;
	}
	public Medicament() {
		super();
	}
	@Override
	public String toString() {
		return "\n"+nomMedicament+"\t ref: "+idMedicament+ "\n\t En stock: "+quantite+"\tValeur unitaire: "+prix+" £";
				
	}
	
	
	

}
