package codingGame;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
//		doesTheNumberExist();
//		countTheNumber();
		inverseTextTreatment();

	}

	static void inverseTextTreatment() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a text: ");
		String str = sc.nextLine();

		String res = textTreatment(str);
		System.out.println("The new text it's this one: " + res);
		sc.close();

	}

	static String textTreatment(String x) {
		String[] tab = x.split(" ");
		String[] newTab = invertUsingFor(tab);
		String reponse = assemblerTableau(newTab);

		return reponse;

	}

	static String[] invertUsingFor(String[] array) {
		String[] tab = new String[array.length];
		for (int i = 0; i < tab.length; i++) {
			tab[tab.length - i - 1] = array[i];
			assemblerTableau(tab);

		}
		return tab;

	}

	static String assemblerTableau(String[] x) {
		String str = "";
		for (String s : x)
			str += s + " ";

		return str;

	}

	static void doesTheNumberExist() {
//		int[] a = {1,2,3,4};
//		boolean contains = IntStream.of(a).anyMatch(x -> x == 5);
//		System.out.println(contains);

		int[] ints = { 9, 4, 2, 3 };
		System.out.println(tableExist.exist(ints, 9));

	}

	static void countTheNumber() {
		int[] numbers = { 5, 2, 3, 7, 5, 6, 1, 9, 8, 3, 2, 4, 5, 7, 9, 6, 5, 7, 2, 3, 1 };
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number between 1 - 9 please.");
		int num = input.nextInt();
		String result = "Here the result: " + tableExist.duplicateValueCount(numbers, num);
		System.out.println(result);
		input.close();

	}

}
