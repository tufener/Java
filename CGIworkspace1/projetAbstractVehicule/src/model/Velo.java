package model;

public class Velo extends Vehicule {
	
	public Velo(String marque, int prix){
		super(marque, prix);
	}

	public String avancer(){
		return super.avancer() + " � 2 roues";
	}

	@Override
	public String demarrer() {
		// TODO Auto-generated method stub
		return "velo demarr�e";
	}
}
