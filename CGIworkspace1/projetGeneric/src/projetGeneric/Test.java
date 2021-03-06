package projetGeneric;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		test5();

	}

	static void test6() {
		ArrayList<Integer> a = new ArrayList<Integer>();
		ArrayList<Personne> b = new ArrayList<Personne>();

	}

	static void test5() {
		// si on veut des int
		Traitement<Object> t1 = new Traitement<Object>();
		Traitement t2 = new Traitement(); // c'est object de base 
		System.out.println(t1.getA());

	}

	static void test4() {
		// si on veut une chaine de caractere nom prenom
		Traitement<Personne> t1 = new Traitement<Personne>();
		Personne p = new Personne("Jean", "marc");
		t1.setA(p);
		Personne p2 = t1.getA(); // pas besoin de caste implicite grace �
									// Template

		// si on veut des int
		Traitement<Integer> t2 = new Traitement<Integer>();
		t2.setA(10);
		int a = t2.getA();

	}

	static void test3() { // avec la m�me instance on utilise des String, int et
		// personne (g�n�ricit�)
		Traitement t1 = new Traitement();
		Personne p = new Personne("Jean", "marc");
		t1.setA(p);
		System.out.println(t1.getA()); // pas possible d'avoir le nom et prenom
		//Personne p2 = t1.getA() ; // caste implicite mais perdu en capacit� pas possible d'avoir le nom et pr�nom
		
		Personne p2 = (Personne) t1.getA(); // caste explicite
		
		System.out.println(p2.getNom());
	}

	static void test2() { // avec la m�me instance on utilise des String, int et
		// personne (g�n�ricit�)
		Traitement t1 = new Traitement();
		t1.setA(10);
		System.out.println(t1.getA());

		Traitement t2 = new Traitement();
		t2.setA("toto");
		System.out.println(t2.getA());

		Personne p = new Personne("jean", "marc");
		Traitement t3 = new Traitement();
		t3.setA(p);
		System.out.println(t3.getA());

	}

	static void test1() {
		Traitement a = new Traitement();
		a.setA(100);
		System.out.println(a.getA());

	}

}
