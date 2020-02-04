package model;

import java.sql.SQLException;
import java.util.ArrayList;


public class Salle {
	
	private Employe emp;
	private ArrayList<Visite> liste = new ArrayList<Visite>();

	public Salle(Employe emp) {
		this.emp = emp;
	}
	public void addVisite(Visite visite) throws ClassNotFoundException, SQLException {
		this.liste.add(visite);
		if(liste.size()>=10){
			saveVisites();
		}
	}
	public Employe getMedecin() {
		return emp;
	}
	public ArrayList<Visite> getVisites() {
		return liste;
	}
	
	public void saveVisites() throws ClassNotFoundException, SQLException{
		for(Visite v : liste){
			v.saveVisite();	
		}	
	}
	@Override
	public String toString() {
		return "Salle [emp=" + emp + ", liste=" + liste + "]";
	}
	
	
}