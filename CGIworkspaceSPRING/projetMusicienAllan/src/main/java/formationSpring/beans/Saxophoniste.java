package formationSpring.beans;

public class Saxophoniste implements Musicien {
	public String nom;
	private InstrumentVent instrument;
	

	
	public String getNom() {
		return nom;
	}



	public void setNom(String nom) {
		this.nom = nom;
	}



	public InstrumentVent getInstrument() {
		return instrument;
	}



	public void setInstrument(InstrumentVent instrument) {
		this.instrument = instrument;
	}

	
	


	public Saxophoniste(String nom, InstrumentVent instrument) {
		super();
		this.nom = nom;
		this.instrument = instrument;
	}


	public Saxophoniste(){
		
	}
	public void Perform(){
		System.out.println(getNom() +  "  est un saxophoniste");
		instrument.jouer();
	 }
}
