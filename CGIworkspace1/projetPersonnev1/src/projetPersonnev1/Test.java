package projetPersonnev1;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test6();

	}

	static void test6() {
		Personne p = new Personne();
		p.nom = "dupond";
		p.prenom = "jfh";

		Personne p2 = new Personne();
		p2.nom = "dupond";
		p2.prenom = "jfh";

		Personne p3 = new Personne();
		p3.nom = "dupond";
		p3.prenom = "dgh";

		System.out.println(p.getInfo());
		System.out.println(p2.getInfo());
		System.out.println(p3.getInfo());

		// Personne[] tab = new Personne[3];
		Personne[] tab = { p, p2, null, p3 };
		 	for(Personne x : tab)
		 		if (x != null)
		 			System.out.println(x.getInfo());

		// for(int i = 0;i<tab.length;i++)
		// Sysout (tab[i]);

		tab[0].nom = "machin";
		System.out.println(p.getInfo());

	}

	static void test5() {
		Personne p = new Personne();
		p.nom = "dupond";
		p.prenom = "jfh";

		Personne p2 = new Personne();
		p2 = p;
		System.out.println(p.getInfo());
		System.out.println(p2.getInfo());
		p = null;
		p = p2; // on réacffecte à p, est p revient à sa fonction donc on annule
				// le code juste au-dessus.
		System.out.println(p.getInfo());
		System.out.println(p2.getInfo());

	}

	static void test4() {
		Personne p = new Personne();
		p.nom = "dupond";
		p.prenom = "jfh";

		Personne p2 = p;
		p2.prenom = "titip";
		System.out.println(p.getInfo());

	}

	static void test3() {
		int a;
		Personne p; // declaration
		p = new Personne(); // instance==>new
		// valeur par defaut

		// valeur utilisateur
		p.nom = "dupond";
		// p.prenom = "jfh";
		String str = p.getInfo();
		System.out.println(str);

	}

	static void test2() {
		Personne p = new Personne(); // new personne() ==> constructeur
		// implicite
		p.nom = "dupond";
		p.prenom = "jfh";

		Personne p2 = new Personne(); // new personne() ==> constructeur
										// implicite
		p2.nom = "dupond";
		p2.prenom = "titi";

		String str = p.getInfo();
		System.out.println(str);

		System.out.println(p2.getInfo()); // cette méthode est la meme que celui
											// juste au-dessus

	}

	static void test1() {
		Personne p = new Personne(); // new personne() ==> constructeur
										// implicite
		p.nom = "dupond";
		p.prenom = "jfh";
		System.out.println(p.getInfo());

	}

}
