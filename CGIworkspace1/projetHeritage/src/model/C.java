package model;

public class C extends A {
	public void m3() {
		System.out.println("je suis m3 de C");
	}

	public void m(int a) { // on peut recoder la méthode m afin de la
							// redéfinir... grâce à la méthode partielle
		System.out.println("je suis m de C");
		super.m(); // redéfinition partielle !!
	}

}
