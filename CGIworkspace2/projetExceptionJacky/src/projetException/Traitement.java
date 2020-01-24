package projetException;

public class Traitement {

	public static int increment(String str) throws ConversionException {
		int a = 0;
		try {
			a = Integer.parseInt(str);
			a++;
		} catch (Exception e) {
			throw new ConversionException(e.getMessage()," voila le probleme");
		}

		return a;
	}

	public static int div(int a, int b) {
		if (b == 0)

			throw new ArithmeticException("dans div");

		return a / b;
	}

	public static int div2(int a, int b) throws Exception {
		if (b == 0) {
			Exception x = new Exception("dans div2");
			throw x;
		}

		return a / b;
	}

	public static int mult(int a, int b) throws MultException {
		String message = "probleme dans mult avec un 0";

		if (a == 0)
			throw new MultException(message, "a");
		else if (b == 0)
			throw new MultException(message, "b");
		return a * b;
	}

	public static int calcul(int a, int b) {
		if (b == 0) {
			ArithmeticException x = new ArithmeticException("dans calcul");
			throw x;
		}

		return a / b;
	}

}
