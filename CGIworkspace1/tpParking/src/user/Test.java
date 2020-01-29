package user;
import model.*;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		test();

	}
	
	static void test2() {
		String matricule1 = "456ghi21";
		String matricule2 = "987def98";
		String matricule3 = "123abc65";
		String matricule4 = "183abc69";
		

		InfoProprio infoProprio1 = new InfoProprio("Dupond", "Toto");
		InfoProprio infoProprio2 = new InfoProprio("Fernand", "Titi");
		InfoProprio infoProprio3 = new InfoProprio("Quatorze", "Louis");
		Voiture v = new Voiture( matricule1 ,"Renault",infoProprio1 );
		Voiture v2 = new Voiture( matricule2, "Peugeot", infoProprio2 );
		Voiture v3 = new Voiture(matricule3, "Ferrari", infoProprio3);
		Voiture v4 = new Voiture( matricule4, "Ferrari",infoProprio3 );
		

		
		/* Test gestion du parking */
		System.out.println("-----------------------------------------");
		System.out.println("TEST PARKING");
		Parking parking = new Parking("Parking Vinci",5);
		parking.garer(v);
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
		Voiture v1 = new Voiture( "456ghi21" ,"Renault",infoProprio1 );
		Voiture v2 = new Voiture( matricule2, "Peugeot", infoProprio2 );
		Voiture v3 = new Voiture(matricule3, "Ferrari", infoProprio3);
		Voiture v4 = new Voiture( matricule4, "Ferrari",infoProprio3 );
		
		/* Test voitures et vitesses */
		System.out.println("TEST VOITURES ET VITESSES");
		System.out.println(v3.getFlash());
		v3.setVitesse(150);
		v3.setVitesse(250);
		System.out.println(v3);
		v3.setVitesse(50);
		System.out.println(v3);
		v3.setVitesse(400);
		System.out.println(v3);
		v3.setVitesse(298);
		System.out.println(v3);
		System.out.println(v3.getFlash());
		
		/* Test gestion du parking */
		System.out.println("-----------------------------------------");
		System.out.println("TEST PARKING");
		Parking parking = new Parking("Parking Vinci",5);
		parking.garer(v1);
		parking.garer(v2);
		parking.garer(v3);
		parking.garer(v4);
		System.out.println(parking);
		System.out.println(parking.getCount());
		parking.quitterparking(matricule2);
		System.out.println(parking);
		System.out.println(parking.getCount());
		System.out.println(parking.getCountMarque("Ferrari"));
		System.out.println(parking.getCountMarque("Renault"));
	}


}
