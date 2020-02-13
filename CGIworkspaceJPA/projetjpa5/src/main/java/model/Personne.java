package model;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Version;

@Entity
public class Personne {
	private String nom, prenom;
	private int id, age;
	private int version;
	private Project project;
	private Collection<Project> projects;

	public Personne(String nom, String prenom, int id, int age, int version, Project project,
			Collection<Project> projects) {

		this.nom = nom;
		this.prenom = prenom;
		this.id = id;
		this.age = age;
		this.version = version;
		this.project = project;
		this.projects = projects;
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

	
	@ManyToMany//(fetch = FetchType.LAZY)
	@JoinTable(joinColumns = @JoinColumn(name = "PERSONNE_ID"), inverseJoinColumns = @JoinColumn(name = "PROJECT_ID"))
	public Collection<Project> getProjects() {
		return projects;
	}

	public void setProjects(Collection<Project> projects) {
		this.projects = projects;
	}

	@Override
	public String toString() {
		return "Personne [nom=" + nom + ", prenom=" + prenom + ", id=" + id + ", age=" + age + ", version=" + version
				+ ", project=" + project + "]";
	}

}
