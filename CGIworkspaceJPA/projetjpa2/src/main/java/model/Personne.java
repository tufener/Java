package model;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Personne {
	private String nom, prenom;
	private int id, age;
	private Adresse adresse;

	public Personne(String nom, String prenom, int id, int age, Adresse adresse) {
		
		this.nom = nom;
		this.prenom = prenom;
		this.id = id;
		this.age = age;
		this.adresse = adresse;
	}

	public Personne() {
		
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

	@Id
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Embedded
	public Adresse getAdresse() {
		return adresse;
	}

	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}

	@Override
	public String toString() {
		return "Personne [nom=" + nom + ", prenom=" + prenom + ", id=" + id + ", age=" + age + ", adresse=" + adresse
				+ "]";
	}

}
