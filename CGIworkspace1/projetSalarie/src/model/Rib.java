package model;

public class Rib {
	private String banque;
	private String compte;
	
	
	public Rib(String banque, String compte) {
		this.banque = banque;
		this.compte = compte;
	}


	@Override
	public String toString() {
		return "banque= " + banque + ", compte= " + compte ;
	}
	
	
	
	

}
