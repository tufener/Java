package user;

import model.*;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test1();

	}

	static void test3() {

		B b = new B();
		b.m4();

	}
	
	
	static void test2() {

		B b = new B();
		b.m4();

	}

	static void test1() {
		A a = new A();

		B b = new B();
		b.m4();
//		b.m2(); // mi-chemin entre la public et la private (on ne peut pas appeler
		// la méthode m2 depuis la class Test mais on peut l'appeler dans
		// cette class uniquement sauf si nous sommes dans le même package
		// (exmple Test dans le package model et non user) !!!
		
		

	}

}
