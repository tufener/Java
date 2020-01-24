package model;

public class CompteSimple {
	protected String nom;
	protected int solde;
	private final int cadeau = 20;
	private final int comm = 1;
	private boolean crediter;
	private boolean debiter;
	private boolean virement;

	public CompteSimple(String nom) {
		this.nom = nom;
		this.solde = cadeau;
//		solde+=cadeau; //cette écriture est possible aussi
	}

	public CompteSimple(String nom, int solde) {

		this.nom = nom;
		this.solde = solde + cadeau;

	}

	public boolean Virement(int solde, CompteSimple C){
		Debiter(solde);
		C.Crediter(solde);
		if(crediter ==true && debiter== true)
			virement = true;
		return virement;
		
	}

	public boolean Crediter(int somme) {
		if(somme<0)
			throw new OpNegException("Montant négatif" , "méthode créidter", somme);
		if (solde > 0) {
			solde += somme - comm;
			return true;
		} 
		return false;
	}

	public boolean Debiter(int somme) {
		if (somme > 0 && solde >= somme + comm) {
			solde -= somme + comm;
			debiter = true;
		}
		return debiter;

	}

	@Override
	public String toString() {
		return "CompteSimple [nom=" + nom + ", solde=" + solde + ", cadeau=" + cadeau + ", comm=" + comm + ", crediter="
				+ crediter + ", debiter=" + debiter + ", virement=" + virement + "]";
	}

	

}
