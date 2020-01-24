
public class Commercial {
	private int id = 0;
	private String nom = "NA";
	private String prenom = "NA";

	public String toString() {
		return "Commercial [id=" + id + ", nom=" + nom + ", prenom=" + prenom + "]";
	}

	public Commercial(int id, String nom, String prenom) {
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
	}

	public int hashCode() {
		Integer a = (Integer) id;
		Integer a1 = new Integer( id);
		return a1.hashCode();

	}
	
	public boolean equals(Object o){
		//return this.id == ((Commercial)o).id;
		return ((Integer)this.id).equals(((Commercial)o).id);
	}	
	

}
