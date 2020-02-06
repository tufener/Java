package model;

public class Personne {
	private String nom; 
	private String prenom; 
	private int age; 
	private String status = "mineur";
	
	@Override
	public String toString() {
		return "Personne [nom=" + nom + ", prenom=" + prenom + ", age=" + age + ", status=" + status + "]";
	}
	public Personne(String nom, String prenom, int age) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
	} 
	
	
	private void setStatus() {
		if(age>18)
			status = "majeur";
		
	}
	public String getNom() {
		return nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public int getAge() {
		return age;
	}
	public String getStatus() {
		return status;
	}
	
	

}
