package user;

import model.*;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test5();

	}
	
	static void test5() {
		A a = new A();
		System.out.println(a.toString());
		B b = new B();
		System.out.println(b.toString());
		
	}

	static void test4() {
		A a = new A();
		B b = new B();
		C c = new C();
		D d = new D();
		// a.m1();
		a.m();
		b.m();
		// b.m1();
		c.m();
		// c.m1();
		d.m();
		// d.m1();

	}

	static void test3() {
		D d = new D();
		d.m4();
		d.m2();
		d.m1(); // grâce à extends que l'on a mis on peut tout récupérer dans la
				// classe D (voir schéma cours-feuille)

	}

	static void test2() {
		B b = new B();
		b.m2();
		b.m1(); // grâce à extends que l'on a mis dans la class B

	}

	static void test1() {
		A a = new A();
		a.m1();

	}

}
