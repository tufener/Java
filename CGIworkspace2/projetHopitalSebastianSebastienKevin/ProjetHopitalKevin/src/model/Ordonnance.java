package model;

import java.util.ArrayList;

public class Ordonnance {
	
	private ArrayList<Medicament> liste = new ArrayList<Medicament>();
	private int facture;
	
	public Ordonnance() {
		// TODO Auto-generated constructor stub
	}

	public Ordonnance(ArrayList<Medicament> liste, int facture) {
		super();
		this.liste = liste;
		this.facture = facture;
	}

	public ArrayList<Medicament> getListe() {
		return liste;
	}

	public void setListe(ArrayList<Medicament> liste) {
		this.liste = liste;
	}

	public int getFacture() {
		return facture;
	}

	public void setFacture(int facture) {
		this.facture = facture;
	}
	
	@Override
	public String toString() {
		return liste + "\t" + facture;
	}
}

