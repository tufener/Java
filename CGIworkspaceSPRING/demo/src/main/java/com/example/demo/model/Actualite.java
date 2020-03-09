package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Tableactualite")
public class Actualite {
	@Id
	@GeneratedValue
	private int id;
	
	private String title;
	private String description;
	private String ImageUrl;
	private String DateCreation;
	private String DateFinDeValidite;

	public Actualite(int id, String title, String description, String imageUrl, String dateCreation,
			String dateFinDeValidite) {
		
		this.id = id;
		this.title = title;
		this.description = description;
		ImageUrl = imageUrl;
		DateCreation = dateCreation;
		DateFinDeValidite = dateFinDeValidite;
	}

	public Actualite() {

	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getImageUrl() {
		return ImageUrl;
	}

	public void setImageUrl(String imageUrl) {
		ImageUrl = imageUrl;
	}

	public String getDateCreation() {
		return DateCreation;
	}

	public void setDateCreation(String dateCreation) {
		DateCreation = dateCreation;
	}

	public String getDateFinDeValidite() {
		return DateFinDeValidite;
	}

	public void setDateFinDeValidite(String dateFinDeValidite) {
		DateFinDeValidite = dateFinDeValidite;
	}

}
