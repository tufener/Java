package villejar.JAR;

public class Model_ville {

	private String nom;
	private String capital;
	private String pays;
	private double nbHabitant;
	private String categorie = "NA";

	public final String regle = "0-1-petit;1-3-moyen;3-10-grand";
	public final double nbrHabitantMin = 0;
	public final double nbrHabitantMax = 10;

	private boolean isCapital;

	public Model_ville(String nom, String capital,  String pays, double nbHabitant) {
		this.nom = nom;
		this.pays = pays;
		this.capital = capital;
		setnbHabitant(nbHabitant);
		this.isCapital = nom.equalsIgnoreCase(capital);

	}

	public void setnbHabitant(double nbHabitant) {

		if (nbHabitant >= nbrHabitantMin && nbHabitant <= nbrHabitantMax) {
			this.nbHabitant = nbHabitant;
			condition();

		}
	}

	public void condition() {

		String[] tab = regle.split(";");
		for (String localReg : tab) {
			String[] localSplit = localReg.split("-");
			if (nbHabitant > Double.parseDouble(localSplit[0]) && nbHabitant <= Double.parseDouble(localSplit[1])) {
				categorie = localSplit[2];
				break;
			}
		}

	}

	public String toString() {
		String res = nom + ", capitale " + capital + ", pays " + pays + ", " + nbHabitant + " millions d\'habitants";
		res += ", " + (isCapital == true ? "est" : "n\'est pas") + " la capitale";
		res += ", catégorie : " + categorie;
		return res;
	}

}
