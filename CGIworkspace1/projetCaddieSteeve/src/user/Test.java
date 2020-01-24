package user;

import model.*;

public class Test {
	public static void main(String[] args) {
		test1();
	}

	public static void test1() {
		Boisson coca = new Boisson("coca", 2, EBoisson.petit);

		Gateau choco = new Gateau("triannon", EGateau.choco);

		Ligne l1 = new Ligne(coca, 3);
		Ligne l2 = new Ligne(choco, 2);

		Caddie c1 = new Caddie("Jean Valjean");
		c1.ajouter(l1);
		c1.ajouter(l2);

		System.out.println("facture detaillée : "+c1);
		System.out.println("juste le prix "+c1.getPrixTotal());
	}
}
