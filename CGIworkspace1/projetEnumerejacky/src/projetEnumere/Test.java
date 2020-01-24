package projetEnumere;

import java.text.Format;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		testFormationv5();

	}
	static void testFormationv5()
	{
		Scanner sc=new Scanner(System.in);
		Formation[] tab=Formation.values();
		System.out.println("choisir depuis la liste");
		for(Formation f: tab)
			System.out.print(f.name()+"\t");
		String choix=sc.nextLine();
		Formation x=Formation.valueOf(choix);
		System.out.println(x);
		
		
	}
	static void testFormationv4()
	{
		Formation f=Formation.java;
		System.out.println(f.toString());
		System.out.println(f.name());
		
		
	}
	static void testFormationv3()
	{
		Formation f=Formation.java;
		System.out.println(f.getPrix());
		
		System.out.println(Formation.python+"   "+Formation.python.getLieu()+
				"  "+Formation.python.getPrix());
	}
	static void testFormationv2()
	{
		Formation f=Formation.java;
		System.out.println(f.getPrix());
		
		System.out.println(Formation.python+"   "+Formation.python.getLieu()+
				"  "+Formation.python.getPrix());
	}
	static void testFormationv1()
	{
		System.out.println(Formation.java);
		Formation f=Formation.python;
		System.out.println(f.toString()); // le toString implicite (non crée) aura la même valeur que la méthode name() !!
		System.out.println(f.name());
		
	}
	static void testCivilitev2()
	{
		Civilite mrbis=Civilite.mr;
		String str=Civilite.mr.toString();
		System.out.println(mrbis);
		System.out.println(Civilite.mme.toString());

		
	}
	static void testCivilite()
	{
		System.out.println(Civilite.mr+" dupond");

		
	}
	static void testSemaine()
	{
		System.out.println(Semaine.we);
		System.out.println(CSemaine.lundi);
		
	}

}
