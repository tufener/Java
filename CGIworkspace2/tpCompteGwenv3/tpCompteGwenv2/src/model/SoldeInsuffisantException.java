package model;

public class SoldeInsuffisantException extends Exception {
	private String info;

	public SoldeInsuffisantException(String message, String info) {
		super(message);
		this.info = info;
	}

	@Override
	public String toString() {
		return "SoldeInsuffisantException " + this.getMessage() + " -> " + this.info;
	}

}
