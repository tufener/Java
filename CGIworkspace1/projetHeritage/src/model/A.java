package model;

public class A {
	public void m1() {
		System.out.println("je suis m1 de A");
	}

	public void m() {
		System.out.println("je suis m de A");
	}

	public String toString() {
		return "cest la toString de A" + " " + getClass().getName(); // getClass
																		// et
																		// getName
																		// c'est
																		// pour
																		// avoir
																		// la
																		// class
																		// et la
																		// nom
																		// de la
																		// class
	}

}
