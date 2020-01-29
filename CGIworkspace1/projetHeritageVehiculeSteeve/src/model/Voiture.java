package model;

public class Voiture extends Vehicule {
	private boolean gps;

	// constructeur
	public Voiture(String marque, int prix) {
		super(marque, prix);
	}
	
	// methode
	public void gpsOnOff() {
		this.gps = !this.gps;
	}

	// toString()
	public String toString() {
		String etatGPS = (gps == true) ? "activ�" : "d�sactiv�";
		return "Voiture : " + super.toString() + " GPS : " + etatGPS;
	}
	
	public  String demarrer(){
		return "voiture demarr�e";
	}



}
