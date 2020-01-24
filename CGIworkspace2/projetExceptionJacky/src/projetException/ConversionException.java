package projetException;

public class ConversionException extends Exception {

	private String info;
	public ConversionException(String message, String info)
	{
		super(message);
		this.info=info;
	}
	public  String toString()
	{
		return getMessage()+"    "+info;
	}
}
