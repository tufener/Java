package projetPersonnev1;

public class Test {

	public static void main(String[] args) {

		test6();
	}

	static void test6() {
		Personne p1 = new Personne();
		p1.nom = "dupond";
		p1.prenom = "toto";

		Personne p2 = new Personne();
		p2.nom = "durand";
		p2.prenom = "toto";

		Personne p3 = new Personne();
		p3.nom = "dupond";
		p3.prenom = "titi";

		// System.out.println(p1.getInfo());
		// System.out.println(p2.getInfo());
		// System.out.println(p3.getInfo());

		// Personne[] tab=new Personne[3];
		Personne[] tab = { p1, p2, null, p3 };
//		for (Personne p : tab)
//			if (p != null)
//				System.out.println(p.getInfo());

		// for(int i=0;i<tab.length;i++)
		// System.out.println(tab[i].getInfo());
		tab[0].nom="machin";
		System.out.println(p1.getInfo());
	}

	static void test5() {
		Personne p1 = new Personne();
		p1.nom = "dupond";
		p1.prenom = "toto";

		Personne p2 = new Personne();
		p2 = p1;
		System.out.println(p1.getInfo());
		System.out.println(p2.getInfo());
		p1 = null;
		p1 = p2;
		System.out.println(p2.getInfo());
		System.out.println(p1.getInfo());

	}

	static void test4() {
		Personne p1 = new Personne();
		p1.nom = "dupond";
		p1.prenom = "toto";

		Personne p2 = p1;
		p2.prenom = "titi";
		System.out.println(p1.getInfo());

	}

	static void test3() {
		int a;
		Personne p;// declaration
		p = new Personne();// instance
		// defaut

		// valeur utilisateur
		p.nom = "dupond";
		// p.prenom="toto";

		System.out.println(p.getInfo());

	}

	static void test2() {
		Personne p1 = new Personne();
		p1.nom = "dupond";
		p1.prenom = "toto";

		Personne p2 = new Personne();
		p2.nom = "dupond";
		p2.prenom = "titi";

		String str = p1.getInfo();
		System.out.println(str);

		System.out.println(p2.getInfo());
	}

	static void test1() {
		Personne p = new Personne();
		p.nom = "dupond";
		p.prenom = "toto";
		p.prenom = "titi";
		System.out.println(p.getInfo());
		p = null;
		// a suivre
	}

}
