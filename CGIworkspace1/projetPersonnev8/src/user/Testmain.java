package user;

import model.*;

public class Testmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test1();

	}
	

	static void test1(){
		Adresse adr = new Adresse (161 , " verdun " , "94 200");
		Personne p = new Personne ("jean","marc");
		p.setAdresse(adr);
		adr.setPersonne(p);
		
		//System.out.println(p.getNom());
		//System.out.println(adr.getPersonne().getNom());
		//System.out.println(p.getAdresse().getCp());
		
		System.out.println(p.getAdresse().getCp());
		System.out.println(adr.getPersonne().getNom());
		
		
	}
}
