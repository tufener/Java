package projetInterface;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class B implements I1,I3 {

	@Override
	public void m1() {
		System.out.println("je suis m1 de B");
		
	}
	public void mB(){
		System.out.println("je suis mB de B");
	}
	
	public void m(int a) {
		System.out.println("je suis String de A");
		
	}
	@Override
	public void m2() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void m(String str) {
		// TODO Auto-generated method stub
		
	}

}
