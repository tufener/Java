package formationSpring.beans;

public class Guitariste implements Musicien {
	public String nom;
	private InstrumentCorde instrument;
	

	
	public InstrumentCorde getInstrument() {
		return instrument;
	}

	public void setInstrument(InstrumentCorde instrument) {
		this.instrument = instrument;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Guitariste(String nom) {
		super();
		this.nom = nom;
	}
	public Guitariste(){
		
	}
	public void Perform(){
		System.out.println(getNom() +  "  est un guitariste");
		instrument.jouer();
	 }
}
