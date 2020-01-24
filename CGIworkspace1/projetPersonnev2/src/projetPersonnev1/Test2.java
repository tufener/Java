package projetPersonnev1;

import java.util.Random;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test3();

	}

	static void test3() {
		Personne2 x = new Personne2 ("dfd", "bfsdfsdb", 15);
		Personne2[] tab = { 
				new Personne2(), 
				new Personne2("aa", "bb"), 
				new Personne2("aa", "bb", 10), 
				x };
		for (Personne2 y : tab)
			System.out.println(y.getInfo() + "\n-----------------------------");

	}

	
	// Random r = new Random(); // ce Random() est un constructeur par défaut !
	// car il n'y a rien des les paranthèses
	// lors de Ctrl+space
	// Scanner sco = new Scanner(System.in); Scanner est un constructeur
	// d'initialisation car il y a des éléments dans les paranthèses lors de
	// Ctrl+space

	

	static void test2() {
		Personne2 p1 = new Personne2();

	}

	static void test1() {
		Personne2 p1 = new Personne2(); // new personne() ==> constructeur
										// implicite
		p1.nom = "dupond";
		p1.prenom = "jfh";
		p1.age = 15;
		System.out.println(p1.getInfo());

		// new Personne2();
		// new Personne2();
		// System.out.println(new Personne2().getInfo());

	}

}
