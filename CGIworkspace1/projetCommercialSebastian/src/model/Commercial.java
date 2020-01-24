package model;

public class Commercial {
	private String nom,prenom;
	private int secu;
	public Commercial(String nom, String prenom, int secu) {
		this.nom = nom;
		this.prenom = prenom;
		this.secu = secu;
	}
	public Commercial(int secu) {
		this.secu = secu;
	}
	public String toString() {
		return secu+" "+Utils.firstUpper(nom)+" "+Utils.firstUpper(prenom);
	}
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + secu;
		return result;
	}
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Commercial other = (Commercial) obj;
		if (secu != other.secu)
			return false;
		return true;
	}
}
