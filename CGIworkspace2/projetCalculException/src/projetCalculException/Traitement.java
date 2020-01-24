package projetCalculException;

public class Traitement {

	public static String calcul(double op1, double op2, String operateur)
			throws NegException, OpException, ArithmeticException {
		if (op1 < 0 || op2 < 0)
			throw new NegException("Valeur n�gative d�tect�e", op1, op2);
		switch (operateur) {
		case "":
			throw new OpException("Op�rateur pas renseign�", operateur);
		case "+":
		case "add":
			return (op1 + " + " + op2 + " =" + add(op1, op2));

		case "-":
		case "sous":
			return (op1 + " + " + op2 + " =" + sous(op1, op2));

		case "*":
		case "mult":
			return (op1 + " + " + op2 + " =" + mult(op1, op2));

		case "/":
		case "div":
			return (op1 + " + " + op2 + " =" + div(op1, op2));

		default:
			throw new OpException("op�rateur non connu", operateur);

		}
	}

	static double sous(double a, double b) {

		return a - b;
	}

	static double mult(double a, double b) {
		return a * b;

	}

	static double div(double a, double b) throws ArithmeticException {
		if (b == 0)
			throw new ArithmeticException("Pas de division par 0");
		return a / b;
	}

	static double add(double a, double b) {
		return a + b;

	}

}
