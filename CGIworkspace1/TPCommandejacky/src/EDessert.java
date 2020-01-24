
public enum EDessert {
	sans, gateau(4), fruit(1),yaourt(3);
	private int prix = 0;

	private EDessert() {
	}

	private EDessert(int prix) {
		this.prix = prix;
	}

	public String toString() {
		return name() + " (" + prix + " €)";
	}

	public int getPrix() {
		return prix;
	}
}
