package model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Version;

@Entity
public class Personne {
	private String nom, prenom;
	private int id, age;
	private int version; 
	private Computer pc; 
	
	
	
	public void setPc(Computer pc) {
		this.pc = pc;
	}

//	@OneToOne
	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="COMPUTER_ID")
	public Computer getPc() {
		return pc;
	}
	
	@Version
	public int getVersion() {
		return version;
	}
	public void setVersion(int version) {
		this.version = version;
	}
	public Personne(String nom, String prenom, int id, int age) {
		this.nom = nom;
		this.prenom = prenom;
		this.id = id;
		this.age = age;
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
	

	
	@Override
	public String toString() {
		return "Personne [nom=" + nom + ", prenom=" + prenom + ", id=" + id + ", age=" + age + "]";
	}
	
	
}