package model;

import java.util.ArrayList;

public class Ordonnance {
	
	private int id;
	private ArrayList<Medicament> liste = new ArrayList<Medicament>();
	private int facture;
	
	public Ordonnance() {
		// TODO Auto-generated constructor stub
	}

	public Ordonnance(int id, ArrayList<Medicament> liste, int facture) {
		super();
		this.id = id;
		this.liste = liste;
		this.facture = facture;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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
		return id + "\t" + liste + "\t" + facture;
	}
}

