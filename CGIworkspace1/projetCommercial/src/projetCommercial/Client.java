package projetCommercial;

public class Client {
	private String nom; 
	private int nbSalarie;
	
	private EPole epole;

	public Client(String nom, int nbSalarie, EPole epole) {
		this.nom = nom;
		this.nbSalarie = nbSalarie;
		this.epole = epole;
	}
	
	

	public Client(String nom, EPole epole) {
		this.nom = nom;
		this.epole = epole;
	}



	@Override
	public String toString() {
		return "Client= " + this.nom + ", Nombre de Salarie= " + this.nbSalarie + ", Pole= " + this.epole.name() ;
	}
	
	
	
	

	
	
	

}
