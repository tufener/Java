package projetEnumerer;

public enum Formation {

	java(500, "Paris"), cpp(300, "Marseille"), html(200, "Lyon"), python(150, "Nancy"), csharp(5);

	private int prix;
	
	public int getPrix(){
		return prix;
	}
	
	private String lieu="NA";
	
	
	

	private Formation(int prix) {
		this.prix = prix;
	}
	
	private Formation(int prix, String lieu) {
		this.prix = prix;
		this.lieu = lieu;
	}
	
	public String getLieu(){
		return lieu;
	}

	private Formation() { // ==> constructeur par défaut, car si on enleve les prix
							// dans les paranthese ca ne marchera pas donc il
							// faut les deux constructeurs

	}
	
	public String toString(){ // on doit forcer la création du toString en le créant manuellement !!
		return "nom:" + name() + " lieu:" + lieu + " prix:" + prix;
	}
	
	
}
