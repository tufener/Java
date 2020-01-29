package projetException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// test1();
		// test2();
		// test3();
		// test4();
		// test5();
		// test6();
		// testdiv2();
		// testmultDiv() ;
		testInc();

	}

		private static void testInc(){
			Scanner sc=new Scanner(System.in);
			System.out.println("Saisir la valeur � incr�menter");
			try{
				System.out.println(Traitement.inc(sc.nextLine()));
			}
			catch(ConvException ce){System.out.println(ce);}
			finally{sc.close();}
		}
		
		

	
	
	

	static void testmultDiv() {
		Scanner sc = new Scanner(System.in);

		try {
			System.out.println("nb1");
			int nb1 = sc.nextInt();
			System.out.println("nb2");
			int nb2 = sc.nextInt();
			int res = Traitement.mult(nb1, nb2);
			System.out.println(res);

		} catch (ArithmeticException e) { // catch pour g�rer les erreur
											// math�matique div par z�ro
			System.out.println("mult par z�ro");

		} catch (InputMismatchException e) { // catch pour g�rer l'erreur de
												// saisie
			System.out.println("erreur de saisie");

		} catch (RuntimeException e) { // catch pour g�rer l'erreur de saisie

			System.out.println("runtime par z�ro");

		} catch (MultException e) { // catch pour g�rer l'erreur de saisie

			System.out.println(e.toString());

		} catch (Exception e) { // catch pour g�rer les erreurs g�n�rales
			System.out.println(e.getMessage());
			System.out.println(e.toString());
			System.out.println("erreur incorrect");
		}
		System.out.println("fin du programme");
		sc.close();

	}

	static void testdiv2() { // mettre throws Exception avant l'acolade
		Scanner sc = new Scanner(System.in);

		try {
			System.out.println("nb1");
			int nb1 = sc.nextInt();
			System.out.println("nb2");
			int nb2 = sc.nextInt();
			int res = Traitement.div2(nb1, nb2);
			System.out.println(res);
		} catch (ArithmeticException e) { // catch pour g�rer les erreur
											// math�matique div par z�ro
			System.out.println("division par z�ro");
			System.out.println(e.getMessage());
			System.out.println(e.toString());
		} catch (InputMismatchException e) { // catch pour g�rer l'erreur de
												// saisie
			System.out.println("erreur de saisie");
		} catch (RuntimeException e) { // catch pour g�rer l'erreur de saisie
			System.out.println("runtime par z�ro");
		} catch (Exception e) { // catch pour g�rer les erreurs g�n�rales
			System.out.println("erreur incorrect");
		}
		System.out.println("fin du programme");
		sc.close();

	}

	static void test6() {
		Scanner sc = new Scanner(System.in);

		try {
			System.out.println("nb1");
			int nb1 = sc.nextInt();
			System.out.println("nb2");
			int nb2 = sc.nextInt();
			double res = Traitement.div(nb1, nb2);
			System.out.println(res);

			System.out.println("div 2 : nb1");
			int nb3 = sc.nextInt();
			System.out.println("div 2 : nb2");
			int nb4 = sc.nextInt();
			double res2 = Traitement.calcul(nb3, nb4);
			System.out.println(res2);

		} catch (ArithmeticException e) { // catch pour g�rer les erreur
											// math�matique div par z�ro
			System.out.println("division par z�ro");
			System.out.println(e.getMessage());
			System.out.println(e.toString());
		} catch (InputMismatchException e) { // catch pour g�rer l'erreur de
												// saisie
			System.out.println("erreur de saisie");
		} catch (RuntimeException e) { // catch pour g�rer l'erreur de saisie
			System.out.println("runtime par z�ro");
		} catch (Exception e) { // catch pour g�rer les erreurs g�n�rales
			System.out.println("erreur incorrect");
		}
		System.out.println("fin du programme");
		sc.close();

	}

	static void testdiv() {
		Scanner sc = new Scanner(System.in);

		try {
			System.out.println("nb1");
			int nb1 = sc.nextInt();
			System.out.println("nb2");
			int nb2 = sc.nextInt();
			int res = Traitement.div(nb1, nb2);
			System.out.println(res);
		} catch (ArithmeticException e) { // catch pour g�rer les erreur
											// math�matique div par z�ro
			System.out.println("division par z�ro");
			System.out.println(e.getMessage());
			System.out.println(e.toString());
		} catch (InputMismatchException e) { // catch pour g�rer l'erreur de
												// saisie
			System.out.println("erreur de saisie");
		} catch (RuntimeException e) { // catch pour g�rer l'erreur de saisie
			System.out.println("runtime par z�ro");
		} catch (Exception e) { // catch pour g�rer les erreurs g�n�rales
			System.out.println("erreur incorrect");
		}
		System.out.println("fin du programme");
		sc.close();

	}

	static void test4() { // g�rer l'erreur avec le bloc try et catch
							// (encapsulation pour �viter le plantage !!)
		Scanner sc = new Scanner(System.in);
		System.out.println("avant");
		System.out.println("saisir chiffre dans une chaine");
		String saisie = sc.nextLine();
		try {
			int res = Integer.parseInt(saisie);
			res++;
			System.out.println("res++ = " + res);
		} catch (Exception e) {
			System.out.println("exception g�r�e");
		} finally {
			System.out.println("dans le finally");
		}
		// System.out.println("apr�s");

	}

	static void test3() { // out of band (tableau petit compar� notre demande)
		int[] tab = { 1, 5, 8 };
		System.out.println(tab[3]);

	}

	static void test2() { // division par 0 !
		int a = 10;
		int b = 0;
		double c = a / b;
		System.out.println(c);

	}

	static void test1() {
		String str = "2a";
		int a = Integer.parseInt(str);
		System.out.println(a);

	}

}
