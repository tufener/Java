package model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Version;

@Entity
public class Personne {
	private String nom, prenom;
	private int id, age;
	private int version;
	private Department dp; 

	public Personne(String nom, String prenom, int id, int age, int version) {
		
		this.nom = nom;
		this.prenom = prenom;
		this.id = id;
		this.age = age;
		this.version = version;
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

	@Version
	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}


	@ManyToOne //(fetch=FetchType.LAZY)
	@JoinColumn(name="Department_ID")
	public Department getDp() {
		return dp;
	}

	public void setDp(Department dp) {
		this.dp = dp;
	}

	@Override
	public String toString() {
		return "Personne [nom=" + nom + ", prenom=" + prenom + ", id=" + id + ", age=" + age + ", version=" + version
				+ ", dp=" + dp + "]";
	}
	
	
	
}
