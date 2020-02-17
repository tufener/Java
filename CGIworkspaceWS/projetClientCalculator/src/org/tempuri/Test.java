package org.tempuri;

public class Test {

	public static void main(String[] args) {

		System.out.println("coucou"); 
		CalculatorSoap c = new Calculator().getCalculatorSoap(); 
		System.out.println(c.add(10, 10));
		

	}

}
