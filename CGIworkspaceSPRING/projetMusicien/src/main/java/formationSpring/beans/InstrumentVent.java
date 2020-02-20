package formationSpring.beans;

public interface InstrumentVent extends Instrument {
	@Override
	default String Jouer() {
		
		return "Je joue du Saxo";
	}

}
