package metier;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;

import dao.VisiteDaoJdbcMysql;
import model.Patient;
import model.Visite;

public class Salle {
	private int numero;
	private String nomMedecin;
	private ArrayList<Visite> visites = new ArrayList<>();
	private Hopital hopitalObserver;

	public Salle(int numero, String nomMedecin, Hopital hopitalObserver) {
		this.numero = numero;
		this.nomMedecin = nomMedecin;
		this.hopitalObserver = hopitalObserver;
	}

	public ArrayList<Visite> getVisites() {
		return visites;
	}

	public Patient rendreSalleDisponible() throws ClassNotFoundException, SQLException {
		if (visites.size() == 10) {
			this.saveVisits();
		}
		Patient patient = this.hopitalObserver.sendNextPatient();
		if (patient != null)
			this.logPatientVisit(patient);
		return patient;
	}

	public Hopital getHopitalObserver() {
		return hopitalObserver;
	}

	public void setHopitalObserver(Hopital hopitalObserver) {
		this.hopitalObserver = hopitalObserver;
	}

	public void logPatientVisit(Patient patient) throws ClassNotFoundException, SQLException {
		Visite visite = new Visite(patient.getId(), new Date(), this.numero, this.nomMedecin);
		this.visites.add(visite);
	}

	public void saveVisits() throws ClassNotFoundException, SQLException {
		VisiteDaoJdbcMysql daoVisite = new VisiteDaoJdbcMysql();
		for (Visite visite : visites) {
			daoVisite.create(visite);
		}
		visites.clear();
	}

	public ArrayList<Visite> getVisitsByMedecin() throws ClassNotFoundException, SQLException {
		return new VisiteDaoJdbcMysql().historiqueMedecin(this.nomMedecin);
	}

	public void addOrdonnance(ArrayList<String> medicaments) {
		Visite v = this.visites.get(this.visites.size() - 1);
		double ssTotal = 0;
		for (String string : medicaments) {
			String[] array = string.split("/");
			String string2 = array[2].substring(0, array[2].length() - 1);
			ssTotal += Double.parseDouble(string2);
		}

		StringBuilder stringBuilder = new StringBuilder();
		for (String string : medicaments) {
			stringBuilder.append(string);
		}
		v.setOrdonnance(stringBuilder.toString());
		v.setTarif(v.getTarif() + ssTotal);
	}

}
