package formationSpring.beans;

public class Adresse {
	private int num;
	private String rue;
	private int codePostal;
	private String ville;
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
