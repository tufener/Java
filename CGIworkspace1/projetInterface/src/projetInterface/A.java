package projetInterface;

public class A extends X implements I1, I2 {
	
	public void mA(){
		System.out.println("je suis mA de A");
	}
	

	public void m1(){
		System.out.println("je suis m1 de A");
	}
	
	public void m2(){
		System.out.println("je suis m2 de A");
	}



	public void m(String str) {
		System.out.println("je suis String de A");
		
	}



	public void m(int a) {
		System.out.println("je suis int de A");
		
	}
}
