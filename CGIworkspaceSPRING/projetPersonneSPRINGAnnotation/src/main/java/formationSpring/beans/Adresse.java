package formationSpring.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("Adress")
public class Adresse {
	private int num = 55;
	private String rue = "Rue Maurice Gunsbourg";
	private int codePostal = 94200;
	private String ville = "Ivry Sur Seine";
	
	@Autowired
	@Qualifier("Personnage")
	private Personne personne;

	public Adresse() {

	}

	public Adresse(int num, String rue, int codePostal, Personne personne) {
		this.num = num;
		this.rue = rue;
		this.codePostal = codePostal;
		this.personne = personne;
		this.ville = ville;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getRue() {
		return rue;
	}

	public void setRue(String rue) {
		this.rue = rue;
	}

	public int getCodePostal() {
		return codePostal;
	}

	public void setCodePostal(int codePostal) {
		this.codePostal = codePostal;
	}

	public Personne getPersonne() {
		return personne;
	}

	public void setPersonne(Personne personne) {
		this.personne = personne;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	@Override
	public String toString() {
		return "Adresse: " + num + " " +  rue + " " + codePostal + " " + ville;
	}



}
