package model;

public class B extends A { // extends pour dire que B hérite de A

	public void m4() {
		System.out.println("je suis m4 de B");
		m1(); // methode m1 public elle passe en héritage
		m2(); // mi-chemin entre la public et la private (on ne peut pas appeler
				// la méthode m2 depuis la class Test mais on peut l'appeler
				// dans
				// cette class uniquement sauf si nous sommes dans le même
				// package (exmple Test dans le package model et non user) !!!
		// m3();// pas d'héritage car en private dans la class A.
	}

}
