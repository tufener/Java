package formationSpring.beans;

public class Guitariste implements Musicien {
	// attribut
	private String nom;
	private InstrumentCorde instrumentCorde;

	// constructeur
	public Guitariste() {
		super();
	}

	// méthode
	public void performer() {
		System.out.print(this.nom + " le guitariste, ");
		instrumentCorde.jouer();
	}

	// accesseur
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
}
