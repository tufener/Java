package model;

public class C extends A {
	public void m3() {
		System.out.println("je suis m3 de C");
	}

	public void m(int a) { // on peut recoder la m�thode m afin de la
							// red�finir... gr�ce � la m�thode partielle
		System.out.println("je suis m de C");
		super.m(); // red�finition partielle !!
	}

}
