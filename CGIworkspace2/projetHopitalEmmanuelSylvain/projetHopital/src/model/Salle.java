package model;

import java.sql.SQLException;
import java.util.*;
import dao.*;
import user.*;

public class Salle {
	// atributs
	private int numero;
	private Employe medecin;
	private Hopital hopital;
	private ArrayList<Visite> listeVisite;

	// constructeur
	public Salle(int numero, ArrayList<Visite> listeVisite) {
		this.numero = numero;
		this.listeVisite = listeVisite;
	}

	// getters
	public ArrayList<Visite> getListeVisite() {
		return listeVisite;
	}

	// setters
	public void setHopital(Hopital hopital) {
		this.hopital = hopital;
	}

	public void setMedecin(Employe medecin) {
		this.medecin = medecin;
	}

	// methodes
	// sauvegarde de listeVisite dans la base de donnée
	public void sauvegarde() {
		VisiteDaoJdbc d = new VisiteDaoJdbc();
		for (Visite v : listeVisite) {
			d.create(v);
		}
		listeVisite.clear();
	}

	public int ajouteVisite(Employe e) {
		Patient p = hopital.getFileAttente().poll();
		Visite v = new Visite(p.getId(), e.getMetier(), e.getNom());
		listeVisite.add(v);
		return listeVisite.size();
	}
}
