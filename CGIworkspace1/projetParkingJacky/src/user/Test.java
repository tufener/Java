package user;

import model.InfoProprio;
import model.InfoVoiture;
import model.Parking;
import model.Voiture;

public class Test {

	public static void main(String[] args) {
		test2();
	}
	
	static void test2() {
		String matricule1 = "456ghi21";
		String matricule2 = "987def98";
		String matricule3 = "123abc65";
		String matricule4 = "183abc69";
		

		InfoProprio infoProprio1 = new InfoProprio("Dupond", "Toto");
		InfoProprio infoProprio2 = new InfoProprio("Fernand", "Titi");
		InfoProprio infoProprio3 = new InfoProprio("Quatorze", "Louis");
		Voiture v1 = new Voiture( infoProprio1, "456ghi21", "Renault");
		Voiture v2 = new Voiture( infoProprio2, matricule2, "Peugeot");
		Voiture v3 = new Voiture( infoProprio3, matricule3, "Ferrari");
		Voiture v4 = new Voiture( infoProprio3, matricule4, "Ferrari");
		

		
		/* Test gestion du parking */
		System.out.println("-----------------------------------------");
		System.out.println("TEST PARKING");
		Parking parking = new Parking("Parking Vinci",5);
		parking.garer(v1);
		parking.garer(v2);
		parking.garer(v3);
		parking.garer(v4);
		System.out.println(parking);
		
	}

	static void test() {
		String matricule1 = "456ghi21";
		String matricule2 = "987def98";
		String matricule3 = "123abc65";
		String matricule4 = "183abc69";
		

		InfoProprio infoProprio1 = new InfoProprio("Dupond", "Toto");
		InfoProprio infoProprio2 = new InfoProprio("Fernand", "Titi");
		InfoProprio infoProprio3 = new InfoProprio("Quatorze", "Louis");
		Voiture v1 = new Voiture( infoProprio1, "456ghi21", "Renault");
		Voiture v2 = new Voiture( infoProprio2, matricule2, "Peugeot");
		Voiture v3 = new Voiture( infoProprio3, matricule3, "Ferrari");
		Voiture v4 = new Voiture( infoProprio3, matricule4, "Ferrari");
		
		/* Test voitures et vitesses */
		System.out.println("TEST VOITURES ET VITESSES");
		System.out.println(v3.getCountFlash());
		v3.setVitesse(150);
		v3.setVitesse(250);
		System.out.println(v3);
		v3.setVitesse(50);
		System.out.println(v3);
		v3.setVitesse(400);
		System.out.println(v3);
		v3.setVitesse(298);
		System.out.println(v3);
		System.out.println(v3.getCountFlash());
		
		/* Test gestion du parking */
		System.out.println("-----------------------------------------");
		System.out.println("TEST PARKING");
		Parking parking = new Parking("Parking Vinci",5);
		parking.garer(v1);
		parking.garer(v2);
		parking.garer(v3);
		parking.garer(v4);
		System.out.println(parking);
		System.out.println(parking.getNbVoitures());
		parking.quitter(matricule2);
		System.out.println(parking);
		System.out.println(parking.getNbVoitures());
		System.out.println(parking.getNbVoituresByMarque("Ferrari"));
		System.out.println(parking.getNbVoituresByMarque("Renault"));
	}

}
