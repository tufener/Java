
public enum EBoisson {
	sans, coca(2), eau(1), biere(5);
	private int prix = 0;

	private EBoisson() {
	}

	private EBoisson(int prix) {
		
		this.prix = prix;
	}

	public String toString() {

		return name() + " (" + ((prix==0)?"":prix + " €)");
	}

	public int getPrix() {
		return prix;
	}

}
