package projetNote;

public class Eleves {
	private String nom;
	private int note;
	private Professeur prof;
	
	



	public Eleves(String nom) {
		this.nom = nom;
		
	}

	public void setProf(Professeur p){
		this.prof = p;
	}

	
	public void notif() {
		note = prof.getNote();
	}
	



	@Override
	public String toString() {
		return "Eleves [nom=" + nom + ", note=" + note;
	}


	
}
