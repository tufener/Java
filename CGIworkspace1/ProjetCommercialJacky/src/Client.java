
public class Client {
	private String nom ="NA";
	private Pole pole;
	
	public Client(String nom, Pole pole) {
		this.nom = nom;
		this.pole = pole;
	}

	public String toString() {
		return "Client [nom=" + nom + ", pole=" + pole + "]";
	}
	
	
}
