package model;

public enum EBateau {

	petit(2), moyen(10), grande(50);

	private int taille;
	
	

	public int getTaille() {
		return taille;
	}


	private EBateau(int taille) {
		this.taille = taille;
	}

	private EBateau() {

	}

	public String toString(){
		return "nom:" + this.name() + " taille:" + this.taille ;
	}
	
	
	
	

}
