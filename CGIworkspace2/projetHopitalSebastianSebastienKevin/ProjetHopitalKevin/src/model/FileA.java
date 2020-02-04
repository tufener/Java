package model;

import java.util.LinkedList;

public class FileA {
	static LinkedList<Patient> liste; 
	
	public FileA() {
		liste = new LinkedList<Patient>();
	}
	
	public Patient auSuivant() {
		Patient p = liste.get(0);
		if (liste.size() > 0) {
			liste.poll();
			return p;
		}
		else {
			System.out.println("Il n'y a plus de patient dans la file d'attente");
			return null;
		}
	}
	
	public static void ajouterPatient(Patient p) {
		liste.add(p);
	}
	
	public LinkedList<Patient> sauvegarderFile() {
		System.out.println("taille avant return " + liste.size());
		return this.liste;
	}

	@Override
	public String toString() {
		String res = "";
		res =  "File d'attente \n ";
		res += "ID\tNOM\tPRENOM\tCOMPLEMENTS \n";
		if (liste.size() > 0)
			for (Patient p : liste)
				res += p.getId() + "\t" + p.getNom() + "\t" + p.getPrenom() + "\t" + p.getComplement() + "\n";
		else 
			res = "Il n'y a aucun patient dans la salle d'attente";
		
		return res;
	}
	
	

}
