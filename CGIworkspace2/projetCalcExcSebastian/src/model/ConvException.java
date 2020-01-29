package model;

public class ConvException extends Exception{
	private String info;
	public ConvException(String msg, String info){
		super(msg);
		this.info=info;
	}
	public String getInfo(){
		return info;
	}
	public String toString(){
		return getMessage()+" "+info;
	}
}
