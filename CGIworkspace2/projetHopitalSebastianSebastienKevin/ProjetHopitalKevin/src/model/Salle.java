package model;

import java.util.ArrayList;

public class Salle {
	private int salle;
	private Employe emp;
	private Visite visite;
	private ArrayList<Visite> liste =  new ArrayList<Visite>();
	
	public Salle(int salle, String nom, int metier) { //Visite visite) {
		super();
		this.salle = salle;
		this.emp = new Employe(nom, metier);
		//this.visite = visite;
	}


	public int getSalle() {
		return salle;
	}



	public void setSalle(int salle) {
		this.salle = salle;
	}



	public Employe getEmp() {
		return emp;
	}



	public void setEmp(Employe emp) {
		this.emp = emp;
	}
	
	public void rendreLaSalleDisponible(Patient p, Visite v) {
		 ajouterVisite(v);
	}
	
	public void ajouterVisite(Visite v) {
		liste.add(v);
		System.out.println("Taille de la liste " + liste.size());
		System.out.println("L'information a été remonté à la Secrétaire");
		if (liste.size() == 10) {
			sauvegarderVisiteEnBase();
		}
	}
	
	public ArrayList<Visite> sauvegarderVisiteEnBase() {
		return this.liste;
	}
	
	@Override
	public String toString() {
		return "Salle [salle=" + salle + ", emp=" + emp + "]";
	}

}
