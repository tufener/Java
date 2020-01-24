package user;

import model.CB;
import model.CompteCB;
import model.CompteSimple;
import model.OperationNegException;
import model.SoldeInsuffisantException;

public class Test {

	public static void main(String[] args) {
		test4();

	}

	private static void test4() {
		CompteSimple c1 = new CompteSimple("toto");
		CompteSimple c2 = new CompteSimple("titi");
		try {
			c1.virement(100, c2);
		} catch (SoldeInsuffisantException | OperationNegException e) {
			System.out.println(e);
		}

	}

	private static void test2() {
		CompteSimple c = new CompteSimple("toto");
		try {
			c.crediter(-100);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	private static void test3() {
		CompteSimple c = new CompteSimple("toto");
		try {
			c.debiter(100);
		} catch (SoldeInsuffisantException | OperationNegException e) {
			System.out.println(e);
		}

	}

	private static void test1() {
		CompteCB cb = new CompteCB("Capitaine Haddock", CB.AMEX);
		// System.out.println(cb);

		CompteSimple simple = new CompteSimple("Professeur Tournesol");
		System.out.println("va rater");
		try {
			simple.crediter(-101);
		} catch (OperationNegException e) {
			System.out.println(e);
		}

		System.out.println("va réussir");
		try {
			simple.crediter(101);
		} catch (OperationNegException e) {
			System.out.println(e);
		}

		System.out.println("va rater");
		try {
			simple.virement(-100, cb);
		} catch (SoldeInsuffisantException | OperationNegException e) {
			System.out.println(e);
		}

		// System.out.println(cb);
		// System.out.println(simple);

		System.out.println("va rater");
		try {
			simple.debiter(500);
		} catch (SoldeInsuffisantException | OperationNegException e) {
			System.out.println(e);
		}

		// System.out.println(cb);
		// System.out.println(simple);

		// CompteVIP vip = new CompteVIP("Tintin Etmilou");
		// vip.debiter(500);
		// System.out.println(vip);
		// vip.virement(100, simple);
		// System.out.println(vip);
		// System.out.println(simple);

	}

}
