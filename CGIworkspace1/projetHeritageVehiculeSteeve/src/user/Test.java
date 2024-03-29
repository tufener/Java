package user;

import model.Bateau;
import model.EBateau;
import model.Vehicule;
import model.Velo;
import model.Voiture;

public class Test {

	public static void main(String[] args) {
		test6();

	}
	
	static void test7() {
		// creation des instances

		Vehicule v1 = new Voiture("ORNI", 0);
		Vehicule v2 = v1;
		//Velo v4 = (Velo)v2;
		
		Voiture v3=null;
		v3=(Voiture)v2;
//		if(v2 instanceof Voiture)
//			v3 = (Voiture)v2;
		
		
		
	
	}

	static void test6() {
		// creation des instances

		Vehicule v1 = new Voiture("ORNI", 0);
		
		Velo v2 = new Velo("Ciraptor", 550);
		
		Voiture v3 = new Voiture("K2000", 40000);

		Bateau v4 = new Bateau("Caravelle", 2000, EBateau.grand);
		testAvancer(v1);
		testAvancer(v2);
		testAvancer(v3);
		testAvancer(v4);
	}

	static void testAvancer(Vehicule v) {
		System.out.println(v.avancer());

	}

	static void test5() {
		// creation des instances

		Voiture v1 = new Voiture("RENAULT", 5000);
		Vehicule v2 = v1; // Caste implicite de v1 vers v2 (fille vers la mere)
							// mais on aura pas acc�s � gps etc.

		System.out.println(v1);
		System.out.println(v2);
		Voiture v3 = (Voiture) v2; // cast explicite (avec ceci on aura l'acc�s
									// � gps etc.
		

	}

	static void test4() {
		// creation des instances

		Vehicule vehicule = new Voiture("ORNI", 0);
		Object vehicule2 = new Vehicule("DESZ", 5);
		System.out.println(vehicule2.toString()); // la m�thode avancer �
													// disparu car dans Objet il
													// n'existe pas
		// toString ce sera celle de vehicule et non l'objet !!! c'est comme ca
		// dans JAVA
		Vehicule voiture = new Voiture("ASD", 50);
		Object voiture2 = new Voiture("ASD", 50);
		Object bateau = new Bateau("SDF", 6000, EBateau.grand);
		System.out.println(bateau);

	}

	static void test3() {
		// creation des instances

		Voiture voiture = new Voiture("K2000", 40000);

		Vehicule vehicule = new Voiture("ORNI", 0);

		Velo velo = new Velo("Ciraptor", 550);

		Bateau bateau = new Bateau("Caravelle", 2000, EBateau.grand);

		Vehicule[] tab = { velo, voiture, vehicule, bateau };
		for (Vehicule v : tab)
			System.out.println(v.avancer()); // methode avancer est polymorphe
												// car elle change selon le
												// vehicule
		// Le polymorphisme offre aux objets la possibilit� d �appartenir �
		// plusieurs cat�gories
		// � la fois (velo, voiture, vehicule, bateau)
	}

	static void test2() {
		// creation des instances

		Voiture voiture1 = new Voiture("K2000", 40000);
		System.out.println(voiture1.avancer());
		voiture1.gpsOnOff();
		Vehicule voiture2 = new Voiture("ORNI", 0);
		// voiture2.gps --> nous n'avons pu acc�s � le m�thode gpsOnOff()... il
		// reste visible que les m�thodes de la mere
		// mais ce qu'il fixe l'�xecution c'est la fille
		Vehicule velo1 = new Velo("Ciraptor", 550);
		System.out.println(velo1.avancer()); // c'est toujours la m�thode de la
												// fille qui s'�xecute car il y
												// a un override

	}

	static void test1() {
		// creation des instances
		Velo velo = new Velo("Ciraptor", 550);
		Voiture voiture = new Voiture("K2000", 40000);
		Vehicule vehicule = new Vehicule("ORNI", 0);
		Bateau bateau = new Bateau("Caravelle", 2000, EBateau.grand);

		// Test avancer() et toString()
		System.out.println("V�lo : " + velo + "\t" + velo.avancer());
		System.out.println(voiture + "\t" + voiture.avancer());
		System.out.println(vehicule + "\t" + vehicule.avancer());
		System.out.println(bateau + "\t" + bateau.avancer());

		// test gpsOnOff()
		voiture.gpsOnOff();
		System.out.println("\n" + voiture);

	}

}
