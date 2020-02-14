package model;

import java.util.ArrayList;

public class Commande {
	private int idCommande;
	private int idClient;
	private String date;
	private int total;
	private String info;
	private ArrayList<Ligne> com = new ArrayList<Ligne>();
	
	public Commande() {
		
	}
	
	public Commande(int idClient, String date, int total) {
		super();
		this.idClient = idClient;
		this.date = date;
		this.total = total;
	}

	public int getIdCommande() {
		return idCommande;
	}

	public void setIdCommande(int idCommande) {
		this.idCommande = idCommande;
	}

	public int getIdClient() {
		return idClient;
	}

	public void setIdClient(int idClient) {
		this.idClient = idClient;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}
	
public void addLigne(ArrayList<Ligne> l) {
		for (Ligne li : l)
			com.add(li);
	}

	public ArrayList<Ligne> getCom() {
		return com;
	}
	

	@Override
	public String toString() {
		return "Commande [idCommande=" + idCommande + ", idClient=" + idClient + ", date=" + date + ", total=" + total
				+ ", info=" + info + "]";
	}
	
	
	
}
