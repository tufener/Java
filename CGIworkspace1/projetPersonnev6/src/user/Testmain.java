package user;

import model.*;

public class Testmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test1();

	}
	
//	static void test4(){
//		
//		Info info = new Info(70, 1.9);
//		Adresse adr = new Adresse(161, "verdun", "45545" );
//		Personne p = new Personne ("marc" ,"jean", adr, info);
//		System.out.println(p);
//		p.getInfo().setPoids(75);
//		System.out.println(p);
//		System.out.println("---------");
//		System.out.println(p.getInfo().getTaille());
//		
//		
//		//depuis p
//		//lire la taille et l'afficher
//		//modifier le poids
//		
//		
//	}
	
//	static void test3(){
//		
//		Info info = new Info(70, 1.80);
//		Adresse adr = new Adresse(161, "verdun", "45545" );
//		Personne p = new Personne ("marc" ,"jean", adr, info);
//		System.out.println(p);
//		adr.setNumero(162);
//		System.out.println(adr);
//		
//		
//	}
	
//	static void test2(){
//		
//		Personne p = new Personne ("marc" ,"jean");
//		System.out.println(p);
//		
//		
//	}

	static void test1(){
		Adresse adr = new Adresse (161 , " verdun " , "94 200");
		int poids=70;
		double taille = 1.50;
		
		
		Personne p = new Personne ("jean","marc", adr, poids, taille);
		p=null;
		System.out.println(adr);
		
		
	}
}
