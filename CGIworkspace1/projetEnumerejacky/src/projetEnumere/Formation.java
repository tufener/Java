package projetEnumere;

public enum Formation {
	java(500, "Paris"), python(300, "Marseille"), cpp(100), html, csharp(5);

	private int prix;
	private String lieu = "NA";

	private Formation(int prix, String lieu) {
		this.prix = prix;
		this.lieu = lieu;
	}

	private Formation(int prix) {
		this.prix = prix;
	}

	private Formation() {

	}

	public int getPrix() {
		return prix;
	}

	public String getLieu() {
		return lieu;
	}

	public String toString() {
		return "nom: "+name()+" lieu : " + lieu + " prix:" + prix;
	}
}
