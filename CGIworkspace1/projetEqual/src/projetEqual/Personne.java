package projetEqual;

public class Personne {
	private String nom;
	private String prenom;
	private int age;

	public Personne(String nom, String prenom, int age) {
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
	}

	public String toString() {
		return "Nom=" + nom.toUpperCase() + ", Prenom=" + prenom.toUpperCase() + ", Age=" + age;
	}

	@Override
	public int hashCode() { 
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((nom == null) ? 0 : nom.hashCode());
		result = prime * result + ((prenom == null) ? 0 : prenom.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) { //methode hashCode ==> dans fen�tre Source 
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Personne other = (Personne) obj;
		if (age != other.age)
			return false;
		if (nom == null) {
			if (other.nom != null)
				return false;
		} else if (!nom.equals(other.nom))
			return false;
		if (prenom == null) {
			if (other.prenom != null)
				return false;
		} else if (!prenom.equals(other.prenom))
			return false;
		return true;
	}

//	public boolean equals(Object x) { // cette m�thode fonctionne aussi pour v�rifier l'�galit� des param�tres selon les attributs.
										//pareil que la m�thode du dessus. 
//		return this.nom.equals(((Personne)x).nom);
//		
//		
//	}


}

