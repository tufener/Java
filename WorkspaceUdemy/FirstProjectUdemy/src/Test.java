import java.util.Arrays;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
//		testWhile();
//		testFor();
//		testForv2();
//		testIfandFor();
//		testIfandWhile();
//		testDoWhile();
//		testSwitch();
//		deleteDuplicateElement();
		multiDimensionalArrays();

	}
	
	static void multiDimensionalArrays() { //take in mind this exercise... and try to make it again 
		int[][] numbers = {
				{1,2,3},{5,2,8,7},{4,3,8,3,9}, {1,2,3,4,5,6}
		};
		
		for(int x = 0 ; x < numbers.length ; x++) {
			for(int y = 0 ; y < numbers[x].length ; y++) {
				System.out.print(numbers[x][y] + "\t");
			}
			System.out.println();
		}
	}
	
	
	

	static void deleteDuplicateElement() { // delete duplicate value in an array.. do this exercise !!
		int a[] = { 7, 2, 4, 5, 7, 3, 2, 1, 10, 7 };
		int s = a.length;
		for (int i = 0; i < s - 1; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {

					a[i] = 0;

//					 a[i]=a[j];
//					 System.out.println(a[i]+""+a[j]);

				}

			}

		}
		for (int i = 0; i < s; i++) {
			System.out.println(a[i]);

		}

	}

	static void testSwitch() {
		Scanner inputText = new Scanner(System.in);
		Scanner inputInt = new Scanner(System.in);

		System.out.println("Please enter the first value of your calculation: ");
		int value = inputInt.nextInt();
		System.out.println("-------------------");
		System.out.println("Please enter your second value of your calculation: ");
		int value1 = inputInt.nextInt();
		System.out.println("Which action of calculation are you want to do ?" + "\n" + "add" + "\n" + "mult" + "\n"
				+ "sub" + "\n" + "div");
		String choice = inputText.nextLine();
		switch (choice) {
		case "add":
			addForSwitch(value, value1);
			break;
		case "mult":
			multiplyForSwitch(value, value1);
			break;
		case "sub":
			substractionForSwitch(value, value1);
			break;
		case "div":
			divisionForSwitch(value, value1);
			break;
		default:
			System.out.println("You enter wrong value please check it. See you soon my friend...");
		}
		inputText.close();
		inputInt.close();

	}

	static void addForSwitch(int a, int b) { // for switchTest

		int resultat = a + b;
		String réponse = "Le resultat de l'addition est: " + resultat;
		System.out.println(réponse);
	}

	static void multiplyForSwitch(int a, int b) { // for switchTest

		int resultat = a * b;
		String réponse = "Le resultat de la multiplication est: " + resultat;
		System.out.println(réponse);
	}

	static void divisionForSwitch(int a, int b) { // for switchTest

		int resultat = a / b;
		String réponse = "Le resultat de la division est: " + resultat;
		System.out.println(réponse);
	}

	static void substractionForSwitch(int a, int b) { // for switchTest

		int resultat = a - b;
		String réponse = "Le resultat de la soustraction est: " + resultat;
		System.out.println(réponse);
	}

	static void testDoWhile() {
		Scanner scr = new Scanner(System.in);

		int input = 0;
		int response = 8;
		do {
			String message = "Enter a value friend: ";
			System.out.println(message);
			input = scr.nextInt();
			String message2 = "You entered a value : " + input;
			System.out.println(message2 + ", but You're not find the correct answer try again !!");
			System.out.println("--------------");

		} while (input != response);
		System.out.println("You find the correct answer dude...! Congratulation !!!");

		scr.close();
	}

	static void testWhile() {
//		boolean loop = true; 

		int value = 0;

		while (value < 10) {
			value++;
			System.out.println(value + " Hello");
		}
		System.out.println(value);

	}

	static void testIfandWhile() {
		int x = 10;
		int y = 0;
		int mediane = 5;

		while (y < x) {
			y++;
			System.out.println(y);
			if (y == mediane) {
				System.out.println("Well I am finish");
				break;// sans le break il va continuer jusqu'à 10
			}
		}

	}

	static void testFor() {
		int p = 10;
		for (int i = 0; i < p; i++) {
			System.out.println("Hello my friend, the value of i is: " + i);
			System.out.println(i);
			System.out.println("---------");
		}
	}

	static void testForv2() {
		int p = 10;
		for (int i = 0; i < p; i++) {
			String res = "Hello my friend, the value of i is: ";
			res += i;
			System.out.println(res);
			System.out.println(i);
			System.out.println("--------");

		}

	}

	static void testIfandFor() {
		int x = 10;
		int y = 5;
		for (int i = 0; i < x; i++) {
//			System.out.println(i);
			if (i == y) {
				System.out.println("Well I am finish");
				break;// sans le break il va continuer jusqu'à 10
			}
			System.out.println(i);

		}

	}
}
