package user;

import model.*;

public class Testmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test1();

	}

	static void test1(){
		Groupe g = new Groupe("CGI",10);
		Personne p1 = new Personne(1,"jean","lic", 10);
		Personne p2 = new Personne(7,"pat","toto", 15);
		Personne p3 = new Personne(4,"pierre","titi", 20);
		g.ajouter(p1);
		g.ajouter(p2);
		
		boolean b = g.ajouter(p3);
		if(b)
			System.out.println("p3 ok");
		else
			System.out.println("p3 ko");
		System.out.println(g);
		
//		g.remove(4);
		System.out.println(g);
		
		
		System.out.println(g.getCount());
		
		System.out.println(g.getCount("jean"));
		
		
		
		
		
		
	}
}
