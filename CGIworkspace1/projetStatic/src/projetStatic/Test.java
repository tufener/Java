package projetStatic;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test4();

	}

	static void test4() {
		Personne p1 = new Personne("jean");
		Personne p2 = new Personne("marie");
		Personne p3 = new Personne("lisa");
		new Personne("luc"); // on peut utiliser cette méthode si on ne veut pas
								// nommer la personne
		new Personne("masr");
		new Personne("marco");

		System.out.println(Personne.getCompteur());

	}

	static void test3() {
		Personne p1 = new Personne("jean");
		Personne p2 = new Personne("marie");
		System.out.println(p1);
		System.out.println(p2);
		p1.setPrenom("addf");
		System.out.println(p1);
		Personne.setNom("durand");
		System.out.println(p1);
		System.out.println(p2);

	}

	static void test2() {
		double resultat = Traitement.calcul(10, 12, "+");

		System.out.println(resultat);

	}

	static void test1() {
		A.m1(); // methode static exemple Math.pow()
		A a = new A(); /*
						 * méthode d'instance (non static) exemple méthode
						 * Random
						 */
		a.m3(); // suite méthode d'instance
		a.m1();
		new A().m4();

	}

}
