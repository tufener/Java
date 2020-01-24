
public enum EPlat {
	sans, platDuJour(4), sandwich(1),salade(3);
	private int prix = 0;

	private EPlat() {
	}

	private EPlat(int prix) {
		this.prix = prix;
	}

	public String toString() {
		return name() + " " + prix + " €)";
	}

	public int getPrix() {
		return prix;
	}
}
