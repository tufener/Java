package jpaSpring.entity;

import javax.persistence.*;

//@NamedQueries({ @NamedQuery(name = "Personne.findAll", query = "select p  from personnes p ") })
@Entity(name="personnes")
public class Personne {
	private int version;
	private String nom,prenom;
	private int id,age;
	public String getNom() {
		return nom;
	}
	public Personne() {
	}
	public Personne(int id, String nom, String prenom, int age) {
		this.nom = nom;
		this.prenom = prenom;
		this.id = id;
		this.age = age;
	}
	@Version
	public int getVersion() {
		return version;
	}
	public void setVersion(int version) {
		this.version = version;
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
		return "Personne [nom=" + nom + ", prenom=" + prenom + ", version=" + version + ", age=" + age + "]";
	}
}
