package codingGame;

import java.util.stream.IntStream;

public class tableExist {

	static boolean exist(int[] ints, int k) {

		int[] value = { 9, 4, 2, 3 };
		for (int i = 0 ; i<value.length ; i++) {
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

}
