package projetTableau;

public class PorjetTableau {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		testsplit();

	}

	static void testcalcul() {
		int x = 10;
		int y = 5;
		int[] res = calcul(x, y);
		System.out.println(x + "\t\t" + y);
		System.out.println(res[0] + "\t\t" + res[1]);

	}

	static int[] calcul(int a, int b) {
		int[] tab = new int[2];
		System.out.println(tab[0]);
		tab[0] = a + b;
		tab[1] = a - b;
		return tab;

	}

	static void testIntv1() {
		int[] tab = new int[3];
		System.out.println(tab[0]);
		tab[0] = 10;
		System.out.println(tab[0]);

	}

	static void testIntv2() {
		int[] tab = new int[3];
		tab[0] = 10;
		tab[2] = 100;
		for (int i = 0; i < tab.length; i++) // tab.length permet de d�terminer
												// automatiquement la taille du
												// tableau = pas besoin de
												// manipuler des chiffres en dur
			System.out.println(tab[i]);

	}

	static void testIntv3() {
		// int[] tab = new int[3];
		// tab[0] = 10;
		// tab[1] = 50;
		// tab[2] = 100;
		int[] tab = { 1, 10, 100 };

		for (int i = 0; i < tab.length; i++) // tab.length permet de d�terminer
												// automatiquement la taille du
												// tableau = pas besoin de
												// manipuler des chiffres en dur
			System.out.println(tab[i]);

	}

	static void testIntv4() {

		int[] tab = { 1, 10, 100 };
		for (int e : tab)
			System.out.println(e);

		/*
		 * for (int i = 0; i < tab.length; i++) System.out.println(tab[i]);
		 */

	}

	static void testStringv1() {
		String[] tab = { "aa", "bb", null, "cc" };

		for (int i = 0; i < tab.length; i++)
			if (tab[i] != null)
				System.out.println(tab[i].toUpperCase()); // tab.length permet
															// de d�terminer
															// automatiquement
															// la taille du
															// tableau = pas
															// besoin de
															// manipuler des
															// chiffres en dur

	}

	static void afficheTab() {
		int[] tab1 = { 1, 4, 8, 9, 7 };
		int[] tab2 = { 41, 14, 28, 59, 67 };
		String[] tab3 = { "aa", "bb", "cc", "dd" };
		testafficheTab(tab1);
		testafficheTab(tab2);
		testafficheTabstr(tab3);

		/*
		 * for (int e : tab1) System.out.println(e + "\t");
		 * System.out.println(); for (int e : tab2) System.out.println(e +
		 * "\t");
		 */

	}

	static void testafficheTab(int[] x) { // on a donn� dans les param�tres les
											// �l�ments concernant notre tableau
											// ce qui va nous permettre de
											// diminuer des lignes de codes dans
											// la m�thode juste au-dessus
		for (int e : x)
			System.out.println(e + "\t");
		System.out.println();

	}

	static void testafficheTabstr(String[] x) { // on a donn� dans les param�tres
												// les
		// �l�ments concernant notre tableau
		// ce qui va nous permettre de
		// diminuer des lignes de codes dans
		// la m�thode juste au-dessus
		for (String e : x)
			System.out.println(e + "\t");
		System.out.println();

	}

	static void testsplit(){
		String sepa = ";";
		String str = "aa;bb;cc  dd-ee;ff";
		String[] tab = str.split(sepa);
		testafficheTabstr(tab);
		
		
	}
	
	
}
