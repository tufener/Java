package model;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.LinkedList;

import dao.VisiteDaoJDBC;

public class VisitesList {
	private LinkedList<Patient> list;

	public VisitesList() {
	}

	public VisitesList(LinkedList<Patient> list) {
		this.list = list;
	}

	public void add(Patient p) {
		if (!this.list.contains(p))
			this.list.add(p);
		else
			System.out.println("Le patient est déjà dans la liste de visites.");
	}

	public void clear() {
		this.list.clear();
	}

	public void print() {
		this.list.forEach((n) -> System.out.println(n));
	}
	
	public boolean isEmpty() {
		return this.list.isEmpty();
	}

	public ArrayList<Visite> saveBDD(int numSalle, int medecin) throws ClassNotFoundException, SQLException {
		VisiteDaoJDBC v = new VisiteDaoJDBC();
		ArrayList<Visite> visites = new ArrayList<Visite>();
		for (Patient p: this.list) {
			v.create(p.getId(), numSalle, medecin);
			visites.add(v.getVisiteByPatientAndMed(p.getId(), medecin));
		}
		return visites;
	}

}
