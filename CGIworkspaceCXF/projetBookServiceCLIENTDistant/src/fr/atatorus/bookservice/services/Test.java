package fr.atatorus.bookservice.services;

public class Test {

	public static void main(String[] args) {
		Hello c = new HelloService().getHelloPort(); 
		System.out.println(c.hello("Benoit"));

	}

}
