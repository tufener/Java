package model;

public class Personne {
	private String nom;
	private String prenom;
	private int age;
	
	public Personne(String nom, String prenom, int age) {
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
	}
	public Personne(String nom, String prenom) {
		this.nom = nom;
		this.prenom = prenom;
	}
	//@Override
	public String toString() {
		return " [nom=" + nom + ", prenom=" + prenom + ", age=" + age + "]";
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getNom() {
		return nom;
	}
	public String getPrenom() {
		return prenom;
	}

}
