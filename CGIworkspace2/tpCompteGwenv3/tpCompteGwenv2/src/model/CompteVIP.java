package model;

public class CompteVIP extends CompteSimple {

	public CompteVIP(String nom) {
		super(nom);
	}

	public CompteVIP(String nom, int solde) {
		super(nom, solde);
	}

	@Override
	public boolean crediter(int s) {
		boolean success = false;
		if (s > 0) {
			solde += s;
			success = true;
		}
		return success;
	}

	@Override
	public boolean debiter(int s) {
		boolean success = false;
		if (s > 0) {
			solde -= s;
			success = true;
		}
		return success;
	}

}
