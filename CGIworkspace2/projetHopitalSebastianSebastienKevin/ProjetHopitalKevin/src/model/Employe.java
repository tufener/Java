package model;

public class Employe{
	private String nom;
	private String mdp;
	private int metier;
	
	public Employe() {
		
	}
	
	public Employe(String nom, int metier) {
		this.nom = nom;
		this.metier = metier;
	}

	public String getNom() {
		return nom;
	}

	public int getMetier() {
		return metier;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public void setMetier(int metier) {
		this.metier = metier;
	}
	
	public String getMdp() {
		return mdp;
	}
	
	public void setMdp(String mdp) {
		this.mdp = mdp;
	}

	@Override
	public String toString() {
		return "Employe [nom=" + nom + ", metier=" + metier + "]";
	}
	
	

}
