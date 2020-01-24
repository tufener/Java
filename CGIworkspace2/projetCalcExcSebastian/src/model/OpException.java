package model;

public class OpException extends Exception{
	private String op;
	public OpException(String msg, String op){
		super(msg);
		this.op = op;
	}
	public String toString(){
		return getMessage()+" : "+op;
	}
}
