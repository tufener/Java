package model;

public class Centraliseur {

	private static Centraliseur instance=new Centraliseur();  ;
	
	public static Centraliseur getInstance() {	
		return instance;
	}
	private Centraliseur() {
	}
	
	////////////////////////////////////////
	
	private Imp[] tab={new Imp("IP1"),new Imp("IP2")};
	private boolean b ;
	
	public void print(String message) {
		if (b)
			tab[1].print(message );
		else
			tab[0].print(message );
		b=!b;
	}
	//private Imprimante[] tab=new Imprimante[2];
	
	
//		tab[0]=new Imprimante("IP1");
//		tab[1]=new Imprimante("IP2");
		
	
}
