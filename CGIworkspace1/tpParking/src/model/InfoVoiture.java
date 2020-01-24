package model;

public class InfoVoiture {
	private String matricule;
	private String marque;
	
	

	public String getMatricule() {
		return matricule;
	}
	public String getMarque() {
		return marque;
	}
	public InfoVoiture(String matricule, String marque) {
		this.matricule = matricule;
		this.marque = marque;
	}
	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}
	public void setMarque(String marque) {
		this.marque = marque;
	}
	@Override
	public String toString() {
		return "InfoVoiture [matricule=" + matricule + ", marque=" + marque + "]";
	}
	

	
}
