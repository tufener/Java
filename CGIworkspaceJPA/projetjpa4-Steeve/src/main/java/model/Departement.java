package model;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.*;
import model.Personne;

@Entity
public class Departement {
	
private int id,version;
private String nom;
private Collection<Personne> personnes;

//constructeur
public Departement() {
	super();
}

//toString()
public String toString() {
	return "Departement " + id + ", " + nom;
}

//accesseurs
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

@OneToMany(mappedBy="departement")
public Collection<Personne> getPersonnes() {
	return personnes;
}

public void setPersonnes(Collection<Personne> personnes) {
	this.personnes = personnes;
}

@Version
public int getVersion() {
	return version;
}

public void setVersion(int version) {
	this.version = version;
}

}
