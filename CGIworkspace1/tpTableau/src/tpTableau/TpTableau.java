package tpTableau;

import java.util.Scanner;

public class TpTableau {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		tpTraitementTextJacky();

	}

	static void tpTableauJacky() {
		Scanner clavier = new Scanner(System.in);
		System.out.print("Veuillez saisir la taille du tableau (de chaine) souhait�e: ");
		int taille = clavier.nextInt();

		String[] Tab = new String[taille];

		Scanner clavierStr = new Scanner(System.in);
		for (int i = 0; i < Tab.length; i++) {
			System.out.print("Veuillez saisir l'�l�ment n�" + (i + 1) + " du tableau:");

			Tab[i] = clavierStr.nextLine();

		}

		System.out.println("Voici un affichage du tableau demand�: ");
		for (int i = 0; i < Tab.length; i++) // on peut aussi �crire ==>
												// for(String e:Tab)<== --> � la
												// ligne Sysoutprintln(e)
			System.out.println("element " + (i + 1) + " : " + Tab[i]);

	}

	static void testDoubleTableauv2() {
		int[] tab1 = { 10, 20, 30, 40 };
		afficheTableau(tab1);// 10 20 30 40
		int[] tab2 = doubleTableau(tab1);
		afficheTableau(tab2);// 20 40 60 80
	}

	static void afficheTableau(int[] x) { // on a donn� dans les param�tres les
		// �l�ments concernant notre tableau
		// ce qui va nous permettre de
		// diminuer des lignes de codes dans
		// la m�thode juste au-dessus
		for (int e : x)
			System.out.print(e + "\t");
		System.out.println();

	}

	static int[] doubleTableau(int[] x) {
		int[] y = new int[x.length];
		for (int i = 0; i < x.length; i++)
			y[i] = x[i] * 2;
		return y;
	}

	static void testDoubleTableauv3() { // autre m�thode pour changer le tableau
										// d'origine...
		int[] tab1 = { 10, 20, 30, 40 };
		afficheTableau(tab1);// 10 20 30 40
		int[] tab2 = doubleTableauv3(tab1);
		afficheTableau(tab1);// 20 40 60 80
	}

	static int[] doubleTableauv3(int[] x) { // autre m�thode pour changer le
											// tableau d'origine...
		for (int i = 0; i < x.length; i++)
			x[i] *= 2;
		return x;
	}

	static void tpOccurence() {
		int[] tab = { 1, 2, 1, 3, 1, 2, 4 };
		System.out.println("choisir un chiffre de la liste");
		afficheTableau(tab);
		Scanner sc = new Scanner(System.in);
		int choix = sc.nextInt();
		int reponse = occurence(tab, choix);
		System.out.println("apparait : " + reponse + " fois");
	}

	static int occurence(int[] X, int Y) {
		int j = 0;
		for (int i = 0; i < X.length; i++) // ou foreach (int s : X)
			if (X[i] == Y)
				j++;

		return j;

	}

	static void tpOccurenceString() {
		String[] tab3 = { "aa", "bb", "aa", "cc" };
		System.out.println("choisir un chaine de la liste");
		System.out.print(tab3);
		Scanner sc = new Scanner(System.in);
		String choix = sc.nextLine();
		int reponse = occurence(tab3, choix);
		System.out.println("la chaine apparait : " + reponse + " fois");
	}

	static int occurence(String[] X, String Y) {
		int j = 0;
		for (int i = 0; i < X.length; i++) // ou foreach (int s : X)
			if (X[i].equals(Y))
				j++;
		return j;
	}

	static void tpReverse() {
		int[] Tab1 = { 1, 3, 5, 7, 9, 2 };
		int[] Tab2 = reverse(Tab1);

		System.out.println("Avant reverse");
		afficheTableau(Tab1);

		System.out.println("Apres reverse");
		afficheTableau(Tab2);
	}

	static int[] reverse(int[] X) {
		int[] Y = new int[X.length];
		for (int i = 0; i < Y.length; i++) {
			Y[i] = X[Y.length - i - 1];
		}
		return Y;
	}

	static void tpTraitementTextJacky() {
		Scanner clavierStr = new Scanner(System.in);
		System.out.print("Veuiller saisir une phrase : ");
		String saisie = clavierStr.nextLine();
		String resultat = traitementTextJacky(saisie);
		System.out.println("La nouvelle phrase est : " + resultat);
	}

	static String traitementTextJacky(String str) {

		String[] T1 = str.split(" "); // le tableau T1 contient les �lements du
		String[] T2 = reverseString(T1);// Tableau retourn�

		String str2 = assembleTableau(T2); // formation d'un string � partir du
											// tableau

		return str2.toUpperCase();
	}

	static String[] reverseString(String[] X) {
		String[] Y = new String[X.length];
		for (int i = 0; i < Y.length; i++) {
			Y[Y.length - i - 1] = X[i];
		}
		return Y;
	}

	static String assembleTableau(String[] T) {
		String Str = "";
		for (String s : T)
			Str += s + " ";
		return Str;
	}

}