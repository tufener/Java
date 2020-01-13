package exerciceHasret;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		tableau();

	}

	static void tableau() {

		int[] tab = { 1, 2, 1, 3, 1, 2, 4 };
		System.out.println("choisir un chiffre de la liste");
		affichetableau(tab);
		Scanner sc = new Scanner(System.in);
		int choix = sc.nextInt();
		int reponse = comptetableau(tab, choix);
		System.out.println("ce chiffre saisie apparait: " + reponse + " fois");

	}
	
	static int comptetableau(int[] x, int y) {
		int j = 0;
		for (int i = 0; i < x.length; i++) // ou foreach (int s : X)
			if (x[i] == y)
				j++;

		return j;
		
		
		
	}
	
	static void affichetableau(int[] Z) {
		for (int e : Z)
			System.out.print(e + "\t");
		System.out.println();
			
		
	}

}
