import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
//		testWhile();
//		testFor();
//		testForv2();
//		testIfandFor();
//		testIfandWhile();
		testDoWhile();

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
