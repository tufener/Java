package model;

import java.util.*;

public class Hopital {
	// attributs
	private String nom;
	private LinkedList<Patient> fileAttente;
	private static Hopital instance;
	private ArrayList<Salle> als = new ArrayList<Salle>();

	// constructeurs
	protected Hopital() {
	}

	public static Hopital getInstance() {
		if (instance == null) {
			instance = new Hopital();
		}
		return instance;
	}

	public static Hopital getInstance(String nom, LinkedList<Patient> fileAttente) {
		if (instance == null) {
			instance = new Hopital();
		}
		instance.nom = nom;
		instance.fileAttente = fileAttente;
		return instance;
	}

	// getters
	public LinkedList<Patient> getFileAttente() {
		return fileAttente;
	}

	public String getNom() {
		return nom;
	}

	public ArrayList<Salle> getAls() {
		return als;
	}

	// setters
	public void setAls(ArrayList<Salle> als) {
		this.als = als;
	}

	public void setFileAttente(LinkedList<Patient> fileAttente) {
		this.fileAttente = fileAttente;
	}

	// methodes
	public void ajouter(Salle s) {
		als.add(s);
	}

	// retourne la taille de la liste de visite
	public int medecinDispo(Employe e) {
		return getSalle(e.getMetier()).ajouteVisite(e);
	}

	public Salle getSalle(int numero) {
		return als.get(numero - 1);
	}

}
