
public class CompteSimple {
	protected String nom = "NA";
	protected int solde = 0;
	private static final int com = 1;
	private static final int cadeau = 20;

	public CompteSimple(String nom) {
		this.nom = nom;
		solde += cadeau;
	}

	public CompteSimple(String nom, int solde) {
		this.nom = nom;

		this.solde = solde + cadeau;
	}

	public boolean crediter(int somme) {
		//boolean b = false;
		if (somme > 0) {
			solde += somme - com;
			return true;
		
		}
		return false;
	}

	public boolean debiter(int somme) {
		boolean b = false;
		if (somme > 0 && somme < solde) {
			solde -= (somme + com);
			b = true;
		
		}
		return b;
	}

	public boolean virement(int somme, CompteSimple c) {
/*		boolean b = false;
		if (this.debiter(somme)) {
			c.crediter(somme);
			b = true;
		}
		return b;*/
		if (debiter(somme))
			return c.crediter(somme);
		return false;
		
		
		
	}

	public String toString() {
		return getClass().getSimpleName() + " [nom=" + nom + ", solde=" + solde + "]";
	}

}
