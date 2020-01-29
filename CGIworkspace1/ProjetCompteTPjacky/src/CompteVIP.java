
public class CompteVIP extends CompteSimple {
	public CompteVIP(String nom, int solde) {
		super(nom, solde);
		// TODO Auto-generated constructor stub
	}

	public CompteVIP(String nom) {
		super(nom);
		// TODO Auto-generated constructor stub
	}

	public boolean crediter(int somme) {
		boolean b = false;
		if (somme > 0) {
			solde += somme;
			b = true;

		}

		return b;
	}

	public boolean debiter(int somme) {
		boolean b = false;
		if (somme > 0) {
			solde -= somme;
			b = true;

		}
		return b;
	}

}
