package formationSpring.beans;

public class Guitariste implements Musicien {
	private String nom;
	private InstrumentCorde instrumentCorde;

	public Guitariste() {

	}

	public Guitariste(String nom, InstrumentCorde instrumentCorde) {

		this.nom = nom;
		this.instrumentCorde = instrumentCorde;
	}

	@Override
	public String toString() {
		return "Guitariste [nom=" + nom + ", instrumentCorde=" + instrumentCorde + "]";
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public InstrumentCorde getInstrumentCorde() {
		return instrumentCorde;
	}

	public void setInstrumentCorde(InstrumentCorde instrumentCorde) {
		this.instrumentCorde = instrumentCorde;
	}

	@Override
	public String performer() { 
		String action = instrumentCorde.Jouer();
		return this.nom + " " + action;
	}

}
