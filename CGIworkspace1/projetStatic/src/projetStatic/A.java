package projetStatic;

public class A {
	
	
	
	public  static void m1() {
		m2();
		System.out.println("je suis m1 static");

	}
	
	public static  void m2() {
		System.out.println("je suis m2 static");

	}
	
	public  void m3() {
		m1();
		System.out.println("je suis m3");

	}

	public  void m4() {
		System.out.println("je suis m4");

	}







}
