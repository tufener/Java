package model;

public class Commandes {
	private int idCommandes;
	private int idClients;
	private String date;
	private int prixTotal;
	private String info;

	public Commandes(int idCommandes, int idClients, String date, int prixTotal, String info) {
		super();
		this.idCommandes = idCommandes;
		this.idClients = idClients;
		this.date = date;
		this.prixTotal = prixTotal;
		this.info = info;
	}

	@Override
	public String toString() {
		return "idCommandes= " + idCommandes + ", idClients= " + idClients + ", Date= " + date + ", Prix Total= "
				+ prixTotal + ", Info= " + info ;
	}

	public Commandes() {
		
	}

	public int getIdCommandes() {
		return idCommandes;
	}

	public void setIdCommandes(int idCommandes) {
		this.idCommandes = idCommandes;
	}

	public int getIdClients() {
		return idClients;
	}

	public void setIdClients(int idClients) {
		this.idClients = idClients;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public int getPrixTotal() {
		return prixTotal;
	}

	public void setPrixTotal(int prixTotal) {
		this.prixTotal = prixTotal;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

}
