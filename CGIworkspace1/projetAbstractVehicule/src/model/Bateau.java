package model;

public class Bateau extends Vehicule {
	
	private EBateau ebateau;

	public Bateau(String marque, int prix, EBateau bateau) {
		super(marque, prix);
		this.ebateau = bateau;
		
	}
	
	
	
	public String avancer(){
		return "Je flotte";
	}

	@Override
	public String toString() {
		return "Bateau : " + super.toString() + " " + this.ebateau.toString();
	}



	@Override
	public String demarrer() {
		// TODO Auto-generated method stub
		return "bateau demarr�e";
	}
	
	
	
	
	
	

}