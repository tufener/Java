package projetCommercial;

public class Commercial {
	
	
	private int secuIdentifiant;
	private String nom;
	private String prenom; 
	
	private Client client;
	

	public Commercial(int secuIdentifiant, String nom, String prenom, Client client) {
		this.secuIdentifiant = secuIdentifiant;
		this.nom = nom;
		this.prenom = prenom;
		this.client = client;
	}
	
	

	public Commercial(int secuIdentifiant, String nom, String prenom) {
		this.secuIdentifiant = secuIdentifiant;
		this.nom = nom;
		this.prenom = prenom;
	}

	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + secuIdentifiant;
		return result;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Commercial other = (Commercial) obj;
		if (secuIdentifiant != other.secuIdentifiant)
			return false;
		return true;
	}



	@Override
	public String toString() {
		return "Identifiant= " + this.secuIdentifiant + ", Nom= " + this.nom + ", Prenom= " + this.prenom + "\n" + this.client ;
	}
	
	
	
	
	
	
	
	
	

}
