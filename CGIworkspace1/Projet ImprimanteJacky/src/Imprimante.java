
public class Imprimante {
	private String nom;

	public Imprimante(String nom) {
		this.nom = nom;

	}

	public void print(String message) {
		System.out.println(message + nom);
	}

}
