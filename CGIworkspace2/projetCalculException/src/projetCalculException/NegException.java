package projetCalculException;

public class NegException extends Exception {
	public NegException(String msg, double a, double b) {
		super(msg + " : a=" + a + " b=" + b);
	}

}
