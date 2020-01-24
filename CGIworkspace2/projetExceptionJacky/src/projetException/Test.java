package projetException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		testConversion();

	}

	static void testConversion() {
		String str = "10b";
		try {
			int x = Traitement.increment(str);

			System.out.println(x);
		} catch (ConversionException e) {
			System.out.println(e);
		}

	}

	static void testMult() {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("nb1");
			int nb1 = sc.nextInt();
			System.out.println("nb2");
			int nb2 = sc.nextInt();

			int res = Traitement.mult(nb1, nb2);
			System.out.println("mult : " + res);

		}

		catch (ArithmeticException e) {
			System.out.println("division par zero");
			System.out.println(e.getMessage());
		}

		catch (InputMismatchException e) {
			System.out.println("saisie incorrect");
		}

		catch (RuntimeException e) {
			System.out.println("runtime par zero");
		} catch (MultException e) {
			System.out.println(e);

		}

		catch (Exception e) {
			System.out.println(e.getMessage());

		}

		System.out.println("fin du programme!!!!");
	}

	static void testDiv2() {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("nb1");
			int nb1 = sc.nextInt();
			System.out.println("nb2");
			int nb2 = sc.nextInt();

			int res = Traitement.div2(nb1, nb2);
			System.out.println(res);

		}

		catch (ArithmeticException e) {
			System.out.println("division par zero");
			System.out.println(e.getMessage());
		}

		catch (InputMismatchException e) {
			System.out.println("saisie incorrect");
		}

		catch (RuntimeException e) {
			System.out.println("runtime par zero");
		}

		catch (Exception e) {
			System.out.println("erreur incorrect");
		}

		System.out.println("fin du programme!!!!");
	}

	static void testDiv() {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("nb1");
			int nb1 = sc.nextInt();
			System.out.println("nb2");
			int nb2 = sc.nextInt();

			int res = Traitement.div(nb1, nb2);
			System.out.println(res);

		}

		catch (ArithmeticException e) {
			System.out.println("division par zero");
			System.out.println(e.getMessage());
		}

		catch (InputMismatchException e) {
			System.out.println("saisie incorrect");
		}

		catch (RuntimeException e) {
			System.out.println("runtime par zero");
		}

		catch (Exception e) {
			System.out.println("erreur incorrect");
		}

		System.out.println("fin du programme!!!!");
	}

	static void test4() {
		Scanner sc = new Scanner(System.in);
		System.out.println("avant");
		System.out.println("saisir chiffre dans une chaine");
		String saisie = sc.nextLine();

		try {
			int res = Integer.parseInt(saisie);
			res++;
			System.out.println("res++  " + res);
		}
		// catch (Exception e) {
		// System.out.println("exception gerée!!!");
		// }
		finally {
			System.out.println("dans le finally");
		}
		System.out.println("apres");
	}

	static void test3() {

		int[] tab = { 1, 5, 6 };
		System.out.println(tab[3]);

	}

	static void test1() {

		System.out.println("avant");
		String str = "2a";
		int a = Integer.parseInt(str);
		System.out.println(a);
		System.out.println("apres");

	}

	static void test2() {

		int a = 10;
		int b = 0;
		int c = a / b;
		System.out.println(c);

	}

}
