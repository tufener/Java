package projet1;

import java.util.Random;
import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		m18();

	}

	// static void m1, m2 etc... permet de créer une méthode et écrire le code
	// ailleurs que en dessous du static void main
	static void m1() {
		System.out.println("Hello World m1");
		System.out.println("Hello");
		System.out.println("What's up ?");

		double x = Math.pow(2, 3);
		System.out.println(x);

		double y = Math.pow(2, 4);
		System.out.println(y);
	}

	// c'est la méthode qui fait ...
	static void m2() {
		System.out.println("Hello World m2");
		String str = "1";
		int a = Integer.parseInt(str);
		int z = 10;
		double b = 10.5;
		String c = "toto";
		char d = 'a';
		boolean e = true;

	}

	// c'est la méthode qui fait ...
	static void m3() {
		System.out.println("Hello World m3");
		int x = 25;
		System.out.println(x);
		// conquaténation : fusioner des chaines de carctère
		String s1 = "Bonjour";
		String s2 = "toto";
		String s3 = s1 + s2;
		System.out.println(s3);
		String s4 = 0 + "toto" + 0;
		System.out.println(s4);
		String s5 = "toto" + 1 + 2;
		System.out.println(s5);

	}

	static void m4() {
		int a = 10;
		a = a + 20;
		a += 20;
		// c'est la même chose que ce qui est écrit juste au-dessus...

		// les opérateurs relationnels
		int y = 5;
		int b;
		b = y++;
		// ici on aura 6 et 5 car b est d'abord égale à 6 et ensuite y
		// s'incréente soit égale à 6
		System.out.println(y);
		System.out.println(b);

	}

	// cette méthode sert à demander au développeur de rentrer des valeurs...
	// (mode console)
	static void m5() {
		System.out.println("nom???");
		Scanner clavier = new Scanner(System.in);
		String nom = clavier.nextLine();
		String s = "bienvenue " + nom;
		System.out.println(s);

	}

	static void m6() {
		Scanner clavier = new Scanner(System.in);
		int age = clavier.nextInt();
		if (age < 18)
			System.out.println("mineur");
		System.out.println("A bientot");

	}

	static void m7() {
		Scanner clavier = new Scanner(System.in);
		int age = clavier.nextInt();
		if (age < 18)
			System.out.println("mineur");
		else
			System.out.println("majeur");
		System.out.println("A bientot");

	}

	static void m8() // test égalité chiffres
	{
		int a = 10;
		int b = 10;
		if (a == b)
			System.out.println("Ok");
		else
			System.out.println("KO");

	}

	static void m9() // test égalité string
	{
		String s1 = "toto";
		Scanner clavier = new Scanner(System.in);
		System.out.println("s2?");
		String s2 = clavier.nextLine();

		// if (s1==s2)
		if (s1.equals(s2))
			System.out.println("Ok");
		else
			System.out.println("KO");

	}

	static void m10() // test des blocs (intérieur du bloc et extérieur d'une
						// autre variable "c" par exemple)
	{
		int a = 10;
		int b = 10;
		if (a == b) {
			System.out.println("Ok");
			System.out.println();
		}
		System.out.println(a);

	}

	static void m11() // Methode Ternaire
	{
		Scanner clavier = new Scanner(System.in);
		System.out.println("age??");
		int age = clavier.nextInt();
		String reponse;
		// if (age<18)
		// reponse = "mineur";
		// else
		// reponse ="majeur";
		// Sysout(reponse);
		reponse = (age < 18) ? "mineur" : "majeur";
		System.out.println(reponse);

	}

	static void m12() // Methode Switch si on enlève le break il passera à la
						// valeur suivante de celui supprimé
	{

		System.out.print("Donner un nombre:\n");
		Scanner clavier = new Scanner(System.in);
		int nb = clavier.nextInt();
		switch (nb) {
		case 1:
			System.out.println("Lundi");
			System.out.println("Début de semaine");
			break;
		case 2:
			System.out.println("Mardi");
			break;
		case 3:
			System.out.println("Mercredi");
			break;
		case 4:
			System.out.println("Jeudi");
			break;
		case 5:
			System.out.println("Vendredi");
			break;
		case 6:
			System.out.println("we");
			break;
		case 7:
			System.out.println("we");
			break;
		default:
			System.out.println("erreur de saisie");
			break;
		}

	}

	static void m13() // boucle for dans ce cas "i" est dans la boucle for donc
						// nous ne pouvons mettre Sysout en dessous de celui
						// existant dans le code ci-dessous
	{

		for (int i = 0; i < 10; i++)
			System.out.println("I=" + i);

	}

	static void m14() // boucle "for" : avec break avec dans le cas ou "i" est
						// externalisé cad : en dehors de la boucle for (ce
						// qu'il y a entre parenthèse)
	{

		int x = 10;
		for (int i = 0; i < 10; i++) {
			x--;
			if (x == 5)
				break;
		}
		System.out.println(x);

	}

	static void m15() // boucle "for" : continue
	{

		for (int i = 0; i < 10; i++) {
			if (i == 5)
				continue;
			System.out.println(i);
		}

	}

	static void m16()// test While
	{
		int s = 0;
		int i = 0;
		while (i < 10) {
			s += i;
			System.out.println("I= " + i);
			i++;
		}
		System.out.println("Somme=" + s);

	}

	static void m17()// doWhile
	{
		int s = 0;
		int i = 0;
		do {
			s += i;
			System.out.println("I= " + i);
			i++;
		} while (i < 10);
		System.out.println("Somme=" + s);
	}

	static void m18()// test Random  chiffre au hasard entre 0 et 10 il suffit de rentrer un chiffre dans nextInt()...
	{
		
		Random rand = new Random();
		int res = rand.nextInt(10);
		System.out.println(res);
		
	}
}
