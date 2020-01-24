package model;

public class Voiture extends Vehicule {
	
	private boolean gps;

	public Voiture(String marque, int prix) {
		super(marque, prix);

	}

	
	public void gpsOnOff(){
		this.gps = !this.gps;
		
		
	}
	
	public String toString(){
		String etatGPS = (gps == true) ? "activé" : "désactivé";
		return "Voiture : " + super.toString() + " GPS : " + etatGPS;
	}

}
