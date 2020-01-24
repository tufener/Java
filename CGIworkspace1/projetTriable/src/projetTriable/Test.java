package projetTriable;

import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		// testInt();
		// testString();
		testArtcileTrierparPrix();

	}

	static void testArtcileTrierparPrix() {
		Article[] tab = { new Article("Volskwagen", 35000), new Article("Renault", 25000),
				new Article("Ferrari", 250000), new Article("Porsche", 350000) };
		for (Article a : tab)
			System.out.println(a);
		Arrays.sort(tab, new ComparePrix());
		System.out.println("-------------------");
		for (Article a : tab)
			System.out.println(a);

	}

	static void testArtcileTrierparMarque() {
		Article[] tab = { new Article("Volskwagen", 35000), new Article("Renault", 25000),
				new Article("Ferrari", 250000), new Article("Porsche", 350000) };
		for (Article a : tab)
			System.out.println(a);
		Arrays.sort(tab, new CompareMarque());
		System.out.println("-------------------");
		for (Article a : tab)
			System.out.println(a);

	}

	static void testInt() {
		int[] tab = { 2, 1, 6, 5, 9, 8 };
		affiche(tab);
		Arrays.sort(tab);

		affiche(tab);

	}

	static void testString() {
		String[] tab = { "a", "f", "z", "g", "x" };
		affiche(tab);
		Arrays.sort(tab);
		affiche(tab);

	}

	static void testPersonne() {
		Personne[] tab = { new Personne("jean", "Zoe", 25), new Personne("luca", "dupond", 28),
				new Personne("eric", "malus", 24) };
		affiche(tab);
		// Comparable<T>; // � regarder pour d�terminer la m�thode
		Arrays.sort(tab);
		affiche(tab);

	}

	static void affiche(int[] tab) {
		for (int e : tab)
			System.out.print(e + "\t");
		System.out.println();

	}

	static void affiche(String[] tab) {
		for (String e : tab)
			System.out.print(e + "\t");
		System.out.println();

	}

	static void affiche(Personne[] tab) {
		for (Personne e : tab)
			System.out.println(e + "\t");
		System.out.println();

	}

}
