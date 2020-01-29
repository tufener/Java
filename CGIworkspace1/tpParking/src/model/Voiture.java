package model;

public class Voiture {
	private InfoVoiture infovoiture;
	private InfoProprio infoproprio;
	private int flash = 0;
	private int vitesse;
	
	public final int vitesseMin = 0;
	public final int vitesseMax = 300;
	public final int vitesseFlash = 120;
	
	
	public Voiture(String matricule , String marque, InfoProprio proprio, int vitesse, int flash) {
		this.infovoiture = new InfoVoiture (matricule, marque);
		this.infoproprio = proprio;
		this.vitesse = vitesse;
		this.flash = flash;
	}

	public Voiture(String matricule , String marque, InfoProprio infoproprio) {
		this.infovoiture = new InfoVoiture (matricule, marque);
		this.infoproprio = infoproprio;
	}

	@Override
	public String toString() {
		return "Voiture [voiture=" + infovoiture + ", proprio=" + infoproprio + ", vitesse=" + vitesse + ", vitesseMin="
				+ vitesseMin + ", vitesseMax=" + vitesseMax + ", vitesseFlash=" + vitesseFlash + ", flash=" + flash
				+ "]";
	}

	public int getFlash() {
		return flash;
	}

	public void setVitesse(int vitesserecu) {
		if(vitesse >= vitesseMin && vitesse < vitesseMax)
			if(this.vitesse < vitesseFlash && vitesse > vitesseFlash)
				flash++;
		this.vitesse = vitesserecu;
		
	}

	public Voiture(InfoVoiture infovoiture, InfoProprio infoproprio) {
		this.infovoiture = infovoiture;
		this.infoproprio = infoproprio;
	}

	public InfoVoiture getVoiture() {
		return infovoiture;
	}
	
	
	
	
	

	
	
	
	
	

}
