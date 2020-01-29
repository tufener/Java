package model;

public class Voiture {

	/* ATTRIBUTS */

	private int vitesse;
	private int countFlash;
	private InfoProprio infoProprio;
	private InfoVoiture infoVoiture;

	private final int vitesseMin = 0;
	private final int vitesseMax = 300;
	private final int vitesseFlash = 120;

	/* CONSTRUCTEURS */
	public Voiture( InfoProprio infoProprio,String matricule,String marque) {
		
		this.infoProprio = infoProprio;
		this.infoVoiture = new InfoVoiture(matricule, marque);
	}

	/* METHODES */

	public void setVitesse(int vitesse) {

		// Test des bornes min et max de la vitesse
		if (vitesse >= vitesseMin && vitesse < vitesseMax) {
			
			if (this.vitesse <= vitesseFlash && vitesse > vitesseFlash)
				countFlash++;
			this.vitesse = vitesse;
			
		}

	}

	public String toString() {
		String str = "Voiture  vitesse=" + vitesse + ", countFlash=" + countFlash;
		if (infoProprio != null)
			str += ", " + infoProprio.toString();
		if (infoVoiture != null)
			str += ", " + infoVoiture.toString();
		return str;
	}

	/* ACCESSEURS */
	public int getCountFlash() {
		return countFlash;
	}

	public InfoVoiture getInfoVoiture() {
		return infoVoiture;
	}
	public String getInfoVoitureMat() {
		return this.getInfoVoiture().getMatricule();
		
	}

}
