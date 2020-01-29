
public enum ECB {
	visa(5), MC(10), AMEX(15);
	
	private int prix = 0;
	
	private ECB(int prix){
		this.prix = prix;
	}
	
	public int getPrix(){
		return prix;
	}
	
}
