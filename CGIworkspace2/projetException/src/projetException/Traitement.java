package projetException;

public class Traitement {

	public static int div(int a, int b) {
		if (b == 0) {
			// ce que fait la jvm (IMPLICITEMENT) en cas de division par zero
			// ArithmeticException x = new ArithmeticException("dans la m�thode
			// div");
			// throw x;
			throw new ArithmeticException("dans la m�thode div");
		}

		return a / b;
	}

	public static int div2(int a, int b) throws Exception { // Exception surveill� 
		if (b == 0) {
			// ce que fait la jvm (IMPLICITEMENT) en cas de division par zero
			Exception x = new Exception("dans la m�thode div2");
			throw x;
		}

		return a / b;
	}

	public static int mult(int a, int b) throws MultException {
		String message = "probleme dans mult avec un 0 dans: ";
		
		if(a==0 )
			throw new  MultException(message, "a");
		else if (b==0)
			throw new  MultException(message, "b");
		return a * b;
	}

	public static int calcul(int a, int b) {
		if (b == 0) {
			// ce que fait la jvm (IMPLICITEMENT) en cas de division par zero
			ArithmeticException x = new ArithmeticException("/ by zero dans la m�thode calcul");
			throw x;
		}
		return a / b;
	}

		public static int inc(String s) throws ConvException{
			int res=0;
			try{
				res=Integer.parseInt(s)+1;
			}
			catch(Exception e){throw new ConvException(e.getMessage(),"ahah");}
			return res;
	
}
}
