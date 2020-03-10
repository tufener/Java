package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Table_Catalogue_Produit")
public class Produit {
	@Id
	@GeneratedValue
	private int id_produit;

	@ManyToOne
	@JoinColumn(name = "famille_repas_id")
	private FamilleRepas familleRepas;

	private String libelle_produit_commerciale;
	private String libelle_produit_technique;
	private double prix;
	private String description;
	private String dispo;
	private String imageUrl;
	private double quantite;
	private int stock;
	private String composition;
	private int nbrVente;

	public Produit(int id_produit, String libelle_produit_commerciale, String libelle_produit_technique, double prix,
			String description, String dispo, String imageUrl, double quantite, int stock, String composition,
			int nbrVente) {
		this.id_produit = id_produit;
		this.libelle_produit_commerciale = libelle_produit_commerciale;
		this.libelle_produit_technique = libelle_produit_technique;
		this.prix = prix;
		this.description = description;
		this.dispo = dispo;
		this.imageUrl = imageUrl;
		this.quantite = quantite;
		this.stock = stock;
		this.composition = composition;
		this.nbrVente = nbrVente;
	}

	public Produit() {

	}

	public int getId_produit() {
		return id_produit;
	}

	public void setId_produit(int id_produit) {
		this.id_produit = id_produit;
	}

	public String getLibelle_produit_commerciale() {
		return libelle_produit_commerciale;
	}

	public void setLibelle_produit_commerciale(String libelle_produit_commerciale) {
		this.libelle_produit_commerciale = libelle_produit_commerciale;
	}

	public String getLibelle_produit_technique() {
		return libelle_produit_technique;
	}

	public void setLibelle_produit_technique(String libelle_produit_technique) {
		this.libelle_produit_technique = libelle_produit_technique;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String isDispo() {
		return dispo;
	}

	public void setDispo(String dispo) {
		this.dispo = dispo;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public double getQuantite() {
		return quantite;
	}

	public void setQuantite(double quantite) {
		this.quantite = quantite;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public String getComposition() {
		return composition;
	}

	public void setComposition(String composition) {
		this.composition = composition;
	}

	public int getNbrVente() {
		return nbrVente;
	}

	public void setNbrVente(int nbrVente) {
		this.nbrVente = nbrVente;
	}

}
