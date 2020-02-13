package model;

import javax.persistence.*;

@Entity
public class Personne {

	private int id;
	private String nom;
	private String prenom;
	private int age;
	private int version;
	
	private Departement departement;

	// constructeurs
	public Personne() {
		super();
	}

	@Override
	public String toString() {
		return "[id : " + id + ", " + prenom + " " + nom.toUpperCase() + ", " + age + " ans, département n°"+ departement.getId() + "]";
	}

	// accesseurs
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

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	@ManyToOne
	@JoinColumn(name="departement_id")
	public Departement getDepartement() {
		return departement;
	}

	public void setDepartement(Departement departement) {
		this.departement = departement;
	}
}
