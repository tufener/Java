package codingGame;

import java.util.Scanner;
import java.util.stream.IntStream;

public class tableExist {

	static boolean exist(int[] ints, int k) {

		int[] value = { 9, 4, 2, 3 };
		for (int i = 0; i < value.length; i++) {
			if (k == value[i])
				return true;
		}
		return false;
	}

	static boolean exist2(int[] ints2, int k2) {
		int[] a = { 1, 2, 3, 4 };
		boolean contains = IntStream.of(a).anyMatch(x -> x == 4);
		return contains;

	}

	static String duplicateValueCount(int[] tab, int s) {
		int[] numbers = { 5, 2, 3, 7, 5, 6, 1, 9, 8, 3, 2, 4, 5, 7, 9, 6, 5, 7, 2, 3, 1 };
		int count = 0;
		for (int i = 0; i < numbers.length; i++) {
			if (s == numbers[i]) {
				count++;

			}
		}
		return "The number that you enter exist: " + count + " times...";
	}

	public boolean sleepIn(boolean weekday, boolean vacation) {
		boolean notWeekday = true;
		boolean Vacation = true;
		if (Vacation && notWeekday) {
			System.out.println("we sleep In");
			return true;
		}

		return false;

	}
}
