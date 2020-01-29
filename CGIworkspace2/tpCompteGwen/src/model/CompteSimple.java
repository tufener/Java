package model;

public class CompteSimple {
	private String nom = "NA";
	protected int solde;
	private static final int CADEAU = 20;
	private static final int COMMISSION = 1;

	public CompteSimple(String nom) {
		this.nom = nom;
		this.solde += CADEAU;
	}

	public CompteSimple(String nom, int solde) {
		this.nom = nom;
		this.solde = solde + CADEAU;
	}

	public boolean crediter(int s) throws OperationNegException {
		boolean success = false;
		if (s < 0) {
			throw new OperationNegException("operation négative", "méthode créditer");
		}
		solde += (s - COMMISSION);
		success = true;
		return success;
	}

	public boolean debiter(int s) throws SoldeInsuffisantException {
		boolean success = false;
		if (s < 0 || (s + COMMISSION) >= this.solde) {
			throw new SoldeInsuffisantException("solde insuffisant", "méthode débiter");
		}
		solde -= (s + COMMISSION);
		success = true;
		return success;
	}

	public boolean virement(int somme, CompteSimple c) throws SoldeInsuffisantException, OperationNegException {
		boolean success = false;
		try {
			success = this.debiter(somme) && c.crediter(somme);
		} catch (SoldeInsuffisantException e) {
			throw new SoldeInsuffisantException(e.getMessage(), "méthode virement");
		} catch (OperationNegException e) {
			throw new OperationNegException(e.getMessage(), "méthode virement");
		}
		return success;

	}

	@Override
	public String toString() {
		return "________________\n" + this	.getClass()
											.getSimpleName()
				+ " du client: " + nom + "\nsolde: " + solde + "€";
	}

	public int getSolde() {
		return solde;
	}

}
