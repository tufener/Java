package model;

public class B extends A { // extends pour dire que B h�rite de A

	public void m4() {
		System.out.println("je suis m4 de B");
		m1(); // methode m1 public elle passe en h�ritage
		m2(); // mi-chemin entre la public et la private (on ne peut pas appeler
				// la m�thode m2 depuis la class Test mais on peut l'appeler
				// dans
				// cette class uniquement sauf si nous sommes dans le m�me
				// package (exmple Test dans le package model et non user) !!!
		// m3();// pas d'h�ritage car en private dans la class A.
	}

}
