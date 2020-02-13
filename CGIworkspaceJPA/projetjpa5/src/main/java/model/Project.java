package model;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Version;

@Entity
public class Project {
	private int project, version;
	private String name;
	private Collection<Personne> personne;

	public Project(int project, int version, String name, Collection<Personne> personne) {
		
		this.project = project;
		this.version = version;
		this.name = name;
		this.personne = personne;
	}

	public Project() {
		
	}
	@Id
	public int getProject() {
		return project;
	}

	public void setProject(int project) {
		this.project = project;
	}
	@Version
	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@ManyToMany(mappedBy = "projects", fetch = FetchType.LAZY)
	public Collection<Personne> getPersonne() {
		return personne;
	}

	public void setPersonne(Collection<Personne> personne) {
		this.personne = personne;
	}

}
