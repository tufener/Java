package model;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Department {
	private int CP, version ; 
	private String nameCp;
	private Collection<Personne> personne; 
	
	public Department(int cP, String nameCp, int version) {
		CP = cP;
		this.nameCp = nameCp;
		this.version = version;
	}

	public Department() {
	}

	@Id
	public int getCP() {
		return CP;
	}

	public void setCP(int cP) {
		CP = cP;
	}

	public String getNameCp() {
		return nameCp;
	}

	public void setNameCp(String nameCp) {
		this.nameCp = nameCp;
	}
	

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}


	

	@Override
	public String toString() {
		return "Department [CP=" + CP + ", nameCp=" + nameCp + "]";
	}


	@OneToMany(mappedBy = "dp", fetch=FetchType.EAGER)
	public Collection<Personne> getPersonne() {
		return personne;
	}

	public void setPersonne(Collection<Personne> personne) {
		this.personne = personne;
	} 
	
	
	
	

}
