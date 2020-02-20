package model;

import javax.persistence.*;

@Entity
@NamedQueries({ @NamedQuery(name = "Personne.findAll", query = "select p  from Personne p "),
	@NamedQuery(name = "Personne.findAll2", query = "select p  from Personne p ")
})
//@table (name="personne")
public class Personne {
	private int id;
	private String nom;
	private String prenom;
	private int age;
	
	
	private int version;
	
	@Version
	public int getVersion() {
		return version;
	}
	public void setVersion(int version) {
		this.version = version;
	}
	@Id
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
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Personne [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", age=" + age + "]";
	}
	public Personne() {
	}
	public Personne(int id, String nom, String prenom, int age) {
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
	}
	
	
}
