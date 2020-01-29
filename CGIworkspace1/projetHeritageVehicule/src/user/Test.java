package user;
import model.*;

public class Test {

	public static void main(String[] args) {
		test1();

		
	}
	
	static void test1(){
		Velo velo = new Velo("Ciraptor", 550);
		Voiture voiture = new Voiture("K2000", 40000);
		Vehicule vehicule = new Vehicule("ORNI", 0);
		Bateau bateau = new Bateau("Caravelle", 2000, EBateau.grande);

		// Test avancer() et toString()
		System.out.println("Vélo : " + velo + "\t" + velo.avancer());
		System.out.println(voiture + "\t" + voiture.avancer());
		System.out.println(vehicule + "\t" + vehicule.avancer());
		System.out.println(bateau + "\t" + bateau.avancer());

		// test gpsOnOff()
		voiture.gpsOnOff();
		System.out.println("\n" + voiture);
		
	}

}
