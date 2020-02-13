package model;

import java.util.Collection;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Patient {
	private int id;
	private String nom;
	private String prenom;
	private int age;
	private Collection<Hopital> hopital;
	private Coordonnees coordonnees;

	public Patient(int id, String nom, String prenom, int age, Collection<Hopital> hopital, Coordonnees coordonnees) {

		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
		this.hopital = hopital;
		this.coordonnees = coordonnees;
	}

	public Patient() {

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

	@ManyToMany(mappedBy = "patient", fetch = FetchType.LAZY)
	public Collection<Hopital> getHopital() {
		return hopital;
	}

	public void setHopital(Collection<Hopital> hopital) {
		this.hopital = hopital;
	}
	
	
	@Embedded
	public Coordonnees getCoordonnees() {
		return coordonnees;
	}

	public void setCoordonnees(Coordonnees coordonnees) {
		this.coordonnees = coordonnees;
	}

	@Override
	public String toString() {
		return "Patient [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", age=" + age + ", hopital=" + hopital
				+ "]";
	}

}
