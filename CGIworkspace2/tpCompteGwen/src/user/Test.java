package user;

import model.CB;
import model.CompteCB;
import model.CompteSimple;
import model.OperationNegException;
import model.SoldeInsuffisantException;

public class Test {

	public static void main(String[] args) {
		test1();

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
		} catch (SoldeInsuffisantException e) {
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
