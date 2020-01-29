package model;

public class OperationNegException extends Exception {
	private String info;

	public OperationNegException(String message, String info) {
		super(message);
		this.info = info;
	}

	@Override
	public String toString() {
		return "OperationNegException " + this.getMessage() + " -> " + this.info;
	}

}
