package projet2;

import java.util.Scanner;

public class Projet2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		testAffiche();

	}

	static void hello(String x) { // casquette de développeur, utilisation avec
									// des parametres différents.
		System.out.println("Hello " + x);

	}

	static void testhello() { // même résultat que celui d'avant.
		hello("toto");
		String s = "titi";
		String nom = "abcd";
		hello(s);
		hello(nom);

	}

	static void testhello2(String nom) { //
		String reponse = "hello\t" + nom;
		System.out.println(reponse);

	}

	static void testinfo() { // ceci est la partie test... (partie console juste
								// en-bas).

		System.out.println("Votre nom ? ");
		Scanner clavier = new Scanner(System.in);
		String resnom = clavier.nextLine();

		System.out.println("Votre prenom ?");
		// Scanner clavier = new Scanner(System.in);
		String resprenom = clavier.nextLine();

		System.out.println("Votre age ?");
		Scanner clavier2 = new Scanner(System.in);
		int age = clavier.nextInt();

		info(resnom, resprenom, age);

	}

	static void info(String nom, String prenom, int age) { // ceci est la partie
															// dev. (testinfo et
															// info sont des
															// exercices
															// jointes/ensembles.
		String resultat = "NOM: " + nom.toUpperCase() + "\t";
		resultat += "PRENOM: " + prenom.toLowerCase() + "\n";
		resultat += "AGE: " + age + "\t";
		resultat += "STATUS: " + ((age < 18) ? "mineur" : "majeur");
		System.out.println(resultat);

	}

	static void tpcalcalculsalaire() {
		// saisir nom
		System.out.println("Votre nom ?");
		Scanner string = new Scanner(System.in);
		String str = string.nextLine();
		// saisir salaire annuel brute
		System.out.println("Votre salaire annuel brute ?");
		Scanner integer = new Scanner(System.in);
		double nb = integer.nextDouble();
		// calcul salaire (nom , salaire --> double)
		// cela appelle le nom
		// le salaire mensuel net (/12 ; -23%)
		calculsalaire(str, nb);
	}

	static void calculsalaire(String nom, double salaireAnnuel) { // "tpcalculsalaire"
																	// et
																	// "calculsalaire"
																	// sont tous
																	// les deux
																	// ensembles.
		String res = "NOM: " + nom.toUpperCase() + "\t";
		res += "Salaire annuel brute : " + salaireAnnuel + "\n";
		res += "Salaire mensuel brute: " + (salaireAnnuel / 12) + "\n";
		res += "Salaire mensuel net: " + ((salaireAnnuel - salaireAnnuel * 23 / 100) / 12);
		System.out.println(res);

	}

	static void testSwap() { //
		int x = 10;
		int y = 15;
		System.out.println("x: " + x + "y: " + y);
		swap(x, y);
		System.out.println("x: " + x + "y: " + y);

	}

	static void swap(int a, int b) { //
		int tmp = a;
		a = b;
		b = tmp;

	}

	static void testAdd() {
		int resultat = add(10, 15);
		System.out.println("resultat: " + resultat);
		System.out.println("resultat: " + add(15, 15));
		add(10, 15);
	}

	static int add(int a, int b) {
		int res = a + b;
		return res;

	}

	static void testsomme() {
		somme(10, 15);
		somme(12, 15);

	}

	static void somme(int a, int b) {
		int res = a + b;
		System.out.println("res: " + res);

	}

	static void testAffiche() { // surcharge de méthode (Overload en anglais)
		//String str = affiche("toto");
		affiche("toto"); // pour cet appel ça peut demander aux deux c'est pour
							// ça que c'est pas considéré comme une surcharge.
							// ça peut faire appel  à d'autre valeur que l'on ne veut pas se servir. 

	}

	static void affiche() { // surcharge de méthode (Overload en anglais)
		System.out.println("hello");

	}

	static void affiche(String nom) { // surcharge de méthode (Overload en
										// anglais)
		System.out.println("hello" + nom);

	}

	static void affiche(String nom, String prenom) { // surcharge de méthode
														// (Overload en anglais)
		System.out.println("hello nom: " + nom + " prenom: " + prenom);

	}

	static void affiche(String nom, int age) { // surcharge de méthode (Overload
												// en anglais)
		System.out.println("hello nom: " + nom + " prenom: " + age);

	}

	static void affiche(int age, String adresse) { // surcharge de méthode
													// (Overload en anglais)
		System.out.println("hello nom: " + age + " prenom: " + adresse);

	}
	/*
	 * static void affiche(String nom,String adresse){ // surcharge de méthode
	 * (Overload en anglais) System.out.println("hello nom: " + nom +
	 * " prenom: " + prenom);
	 * 
	 * }
	 */

}
