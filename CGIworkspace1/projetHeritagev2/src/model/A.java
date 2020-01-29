package model;

public class A {
	
	public A(){ // constructeur par défaut
		System.out.println("const de A");
	}
	public void m1() {
		System.out.println("je suis m1 de A");
	}

	protected void m2() {
		System.out.println("je suis m2 de A");
	}
	
	private void m3() {
		System.out.println("je suis m3 de A");
	}



}
