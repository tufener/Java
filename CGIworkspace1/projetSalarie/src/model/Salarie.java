package model;

public class Salarie {
	private int id;
	private String nom;
	private String prenom;
	private Status status;
	private Rib rib;
	


	public Salarie(int id, String nom, String prenom, Rib rib,int expe) {
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.rib = rib;
		status = new Status(expe);
	}
	
	
	public int getId() {
		return id;
	}


	public String getNom() {
		return nom;
	}


	public String getPrenom() {
		return prenom;
	}


	public Status getStatus() {
		return status;
	}


	public Rib getRib() {
		return rib;
	}


	@Override
	public String toString() {
		return "id= " + id + ", nom= " + nom + ", prenom= " + prenom + ", status= " + status + ", rib= " + rib
				+ "]";
	}
	

}
