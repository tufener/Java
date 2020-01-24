package model;

public class CompteCB extends CompteSimple {

	private CB cb;

	public CompteCB(String nom, CB cb) {
		super(nom);
		this.cb = cb;
		this.solde -= cb.getPrix();
	}

	public CompteCB(String nom, int solde, CB cb) {
		super(nom, solde);
		this.cb = cb;
		this.solde -= cb.getPrix();
	}

	@Override
	public String toString() {
		return super.toString() + "\nCB: " + cb;
	}

}
