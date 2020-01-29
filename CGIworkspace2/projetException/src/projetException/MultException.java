package projetException;

public class MultException extends Exception{ //multexception class surveillée
	
	private String info; 
	
	
	public MultException(String message, String info){
		super(message);
		this.info = info;
	}
	
	public String toString(){
		return getMessage() + "   " + info;
	}
	

}
