package projetEnumerer;

import java.util.Scanner;

import projetEnumerer.Formation;

public class TEst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		testFormationv5();

	}

	static void testFormationv5() {
	
		
		Formation [] tab =Formation.values();
		Scanner dc =new Scanner(System.in);
		
		System.out.println("choisir depuis la liste");
		for(Formation f:tab)
			System.out.print(f.name() + "\t");
		String choix = dc.nextLine();
		Formation x = Formation.valueOf(choix);
		System.out.println(x);
	}
	
	
	static void testFormationv4() {

		Formation f = Formation.java;
		System.out.println(f.toString());
		System.out.println(f.name());

	}

	static void testFormationv3() {

		Formation f = Formation.java;
		System.out.println(f.getPrix());
		System.out.println(Formation.python + " " + Formation.python.getLieu() + " " + Formation.python.getPrix());

	}

	static void testFormationv2() {

		Formation f = Formation.java;
		System.out.println(f.getPrix());
		System.out.println(Formation.cpp.getLieu());
		System.out.println(Formation.cpp + " " + Formation.cpp.getLieu() + " " + Formation.cpp.getPrix());

	}

	static void testFormationv1() {

		System.out.println(Formation.java);
		Formation f = Formation.python;
		System.out.println(f.toString());
		System.out.println(f.name());

	}

	static void testCivilitev2() {
		Civilite mrbis = Civilite.mr; // Civilite.mr ==> est un objet
		String str = Civilite.mr.toString(); // toString permet d'appeler une
												// autre variable
		System.out.println(mrbis);
		System.out.println(Civilite.mr.toString());

	}

	static void testCivilite() {

		System.out.println(Civilite.mr);

	}

	static void testSemaine() {

		System.out.println(Semaine.lundi);

	}

}
