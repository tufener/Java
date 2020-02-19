package formationSpring.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("Personnage")
public class Personne {
	private String nom = "Martin";
	private String prenom = "Luther King Jr";
	private int age = 91;
	
	@Autowired
	@Qualifier("Adress")
	private Adresse adresse;

	public Personne() {

	}

	public Personne(String nom, String prenom, int age, Adresse adresse) {

		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
		this.adresse = adresse;
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

	public Adresse getAdresse() {
		return adresse;
	}

	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}

	@Override
	public String toString() {
		return "Personne: nom= " + nom + ", prenom= " + prenom + ", age= " + age + " ans" + "\n" + adresse ;
	}

}
