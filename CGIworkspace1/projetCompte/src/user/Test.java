package user;
import model.*;

public class Test {

	public static void main(String[] args) {
		
		CompteSimple c1 = new CompteSimple("toto");
		CompteSimple c2 = new CompteSimple("titi");
		c1.Crediter(1000);

		c1.Virement(100, c2);
		System.out.println(c1);
		System.out.println(c2);
	}
}

		// CompteVIP c2 = new CompteVIP("titi", 1000000);
		// CompteCB c3 = new CompteCB("tata", ECB.MC);
		// c1.Crediter(1000);
		// c1.Debiter(100);
		// c2.Crediter(10);
		// c2.Debiter(100000);
		// c3.Crediter(100);
		// c3.Debiter(1000);
		// c3.Virement(1000, c2);
		// System.out.println(c1);
		// System.out.println(c2);
		// System.out.println(c3);
//		test1();
//
//	}
//	
//	static void test1(){
//		CompteSimple s1 = new CompteSimple("Hasret");
//		System.out.println(s1);
//		s1.Crediter(450);
//		System.out.println(s1);
//		s1.Debiter(200);
//		System.out.println(s1);
//		CompteSimple s2 = new CompteSimple("Hasret", 2500);
//		
//		
//	}
//	
//	static void test2(){
//	CompteCB c1 = new CompteCB("ha" , CB.Amex);
//		
//		
//	}


