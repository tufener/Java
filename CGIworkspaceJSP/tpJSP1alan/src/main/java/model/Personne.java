package model;

public class Personne {
		private int id;
		private String nom;
		private String prenom;
		
		
		public Personne(int id, String nom, String prenom) {
			
			this.id = id;
			this.nom = nom;
			this.prenom = prenom;
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





		public String toString() {
			return "Bienvenu Monsieur/Madame" + " " + nom + " " + " " + prenom + " " +  "votre identifiant est" + " " + id ;
		}
		
		
		
		
		
}
