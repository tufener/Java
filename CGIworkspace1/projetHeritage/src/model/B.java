package model;

public class B extends A { // extends pour dire que B hérite de A

	public void m2() {
		System.out.println("je suis m2 de B");
	}

	// c'est la méthode over ride (au contraire de la surcharge overloading)
	public void m() {
		System.out.println("je suis m de B");
	}
	
	public String toString() {
		return super.toString() + " " + "cest la toString de B" + " " + getClass().getName(); // getClass
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
