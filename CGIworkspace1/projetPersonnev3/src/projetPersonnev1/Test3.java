package projetPersonnev1;

import java.util.Random;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test4();

	}
	

	
	static void test4() {
		Personne3 p1 = new Personne3("dupond", "jfh");
		System.out.println(p1);
		p1.setNom ("durand");
		System.out.println(p1.getNom());
		System.out.println(p1);
		p1.setNom("");
		System.out.println(p1);

		

	}

	static void test3() {
		Personne3 p1 = new Personne3("dupond", "jfh");
		p1.nom = "durand";
		String str = p1.nom;
		System.out.println(p1.nom);

	}

	static void test2() {
		Personne3 p1 = new Personne3("dupond", "jfh");
		System.out.println(p1);
		p1.setAge(15);
		System.out.println(p1);
		p1.setAge(0);
		System.out.println(p1);

	}

	static void test1() {
		Personne3 p1 = new Personne3("dupond", "jfh", 20); // new personne() ==>
															// constructeur
		// implicite

		System.out.println(p1.toString());
		// System.out.println(p1); //même chose que dessus
		// String str = p1 + ""; même chose que le premier
		// String str2 = p1.toString(); //même chose que le premier

	}

}
