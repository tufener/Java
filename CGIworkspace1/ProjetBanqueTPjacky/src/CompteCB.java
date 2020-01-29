
public class CompteCB extends CompteSimple {
	private ECB cb ;

	
	

	public CompteCB(String nom, ECB cb) {
		super(nom);
		this.cb = cb;
		this.solde -= cb.getPrix();
	}

	public CompteCB(String nom, int solde, ECB cb) {
		super(nom, solde);
		this.cb = cb;
		this.solde -= cb.getPrix();
	}
	
	

	public String toString() {
		return super.toString() + cb.name() + cb.getPrix();
	}

	
}
