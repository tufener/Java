package model;

public class OpNegException extends Exception {

	public void NegException(String msg, String methode, int s) {
		super(+ msg + " --> " + methode +  s);
	}

}
