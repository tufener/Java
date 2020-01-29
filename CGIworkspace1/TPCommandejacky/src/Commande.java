

public class Commande {
	private String nom;
	private EBoisson boisson;
	private EPlat plat;
	private EDessert dessert;


	public Commande(String nom,EBoisson boisson,EPlat p,EDessert d) {
		this.nom= nom;
		this.boisson=boisson;
		this.plat=p;
		this. dessert=d;
}

	public String toString() {
		return "Commande au nom de "+nom+"\nVoici ce que vous avez commandé:\n" + boisson.toString() + "\n" + plat.toString() + "\n"
				+ dessert.toString()+"\n prix total "+getPrixTotale() ;
	}
	
	public int getPrixTotale(){
		return boisson.getPrix()+plat.getPrix()+dessert.getPrix();
	}
}
