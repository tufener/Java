package projetTriable;

public class Article {
	private String marque; 
	private int prix;
	
	
	public Article(String marque, int prix) {
		this.marque = marque;
		this.prix = prix;
	}
	@Override
	public String toString() {
		return "Marque= " + marque.toUpperCase() + "\t " + "Prix= " + prix + " �";
	}
	
	
	public String getMarque() {
		return marque;
	}
	
	
	public int getPrix() {
		return prix;
	} 
	
	
//	public int compareTo(Personne x) { //tri par l'age
//		Integer i = new Integer(this.age); // cette instance marche aussi
//		i.compareTo(x.age);
//		
//		return i;
//	}
//		
// caste implicite 
//		//return (Integer)this.age).compareTo(x.age); // cette m�thode marche aussi
//		
//		Integer p = this.age; 
//		return p.compareTo(x.age);
//	}
		
		
	
//public int compareTo(Personne x) { //tri par le nom
//		
//		String p = this.nom; 
//		
//		//ascending order
//		return p.compareTo(x.nom);}
//		
//		//descending order
//		//return compareQuantity - this.quantity;
	
	

}
