package model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Personne {
	private String nom, prenom; 
	private int id, age;
	
	
	public Personne(int id, String nom, String prenom, int age) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.id = id;
		this.age = age;
	}
	

	public Personne() {
		super();
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

	@Override
	public String toString() {
		return "Personne [nom=" + nom + ", prenom=" + prenom + ", id=" + id + ", age=" + age + "]";
	} 

	
	
}
