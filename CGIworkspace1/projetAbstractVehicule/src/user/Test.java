package user;

import model.*;

public class Test {

	public static void main(String[] args) {
		test5();

	}

	static void test5() {
		// creation des instances
		Velo v2 = new Velo("Ciraptor", 550);
		Voiture v3 = new Voiture("K2000", 40000);
		Bateau v4 = new Bateau("Caravelle", 2000, EBateau.grande);
		testDemarrer(v2);
		testDemarrer(v3);
		testDemarrer(v4);

	}

	static void testDemarrer(Vehicule v) {
		System.out.println(v.demarrer());
	}

	static void test4() {
		// creation des instances
		Vehicule[] tab = { new Velo("Ciraptor", 550), new Voiture("K2000", 40000),
				new Bateau("Caravelle", 2000, EBateau.grande) };
		for (Vehicule v : tab) {
			System.out.println(
					v.avancer()); /*
									 * // methode avancer est polymorphe // car
									 * elle change selon le // vehicule // Le
									 * polymorphisme offre aux objets la
									 * possibilité d ’appartenir à // plusieurs
									 * catégories // à la fois (velo, voiture,
									 * vehicule, bateau)
									 */
			System.out.println(v.demarrer());
		}
	}

	static void test3() {
		// creation des instances

		Voiture voiture = new Voiture("K2000", 40000);

		Vehicule vehicule = new Voiture("ORNI", 0);

		Velo velo = new Velo("Ciraptor", 550);

		Bateau bateau = new Bateau("Caravelle", 2000, EBateau.grande);

		Vehicule[] tab = { velo, voiture, vehicule, bateau };
		for (Vehicule v : tab)
			System.out.println(v.avancer()); // methode avancer est polymorphe
												// car elle change selon le
												// vehicule
		// Le polymorphisme offre aux objets la possibilité d ’appartenir à
		// plusieurs catégories
		// à la fois (velo, voiture, vehicule, bateau)
	}

	static void test1() {
		Velo velo = new Velo("Ciraptor", 550);
		Voiture voiture = new Voiture("K2000", 40000);
		Vehicule vehicule = new Voiture("ORNI", 0);
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
