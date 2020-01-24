
public class TestBanque {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CompteSimple c1 = new CompteSimple("toto");
		CompteSimple c2 = new CompteSimple("titi");
		c1.crediter(1000);

		c1.virement(100, c2);
		System.out.println(c1);
		System.out.println(c2);

		// CompteVIP c2 = new CompteVIP("titi", 1000000);
		// CompteCB c3 = new CompteCB("tata", ECB.MC);
		// c1.crediter(1000);
		// c1.debiter(100);
		// c2.crediter(10);
		// c2.debiter(100000);
		// c3.crediter(100);
		// c3.debiter(1000);
		// c3.virement(1000, c2);
		// System.out.println(c1);
		// System.out.println(c2);
		// System.out.println(c3);

	}

}
