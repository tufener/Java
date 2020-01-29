package model;

public class InfoProprio {
	private String nom;
	private String prenom;
	
	public InfoProprio(String nom, String prenom) {
		this.nom = nom;
		this.prenom = prenom;
	}

	@Override
	public String toString() {
		return "InfoProprio [nom=" + nom + ", prenom=" + prenom + "]";
	}
	
	
}
