package metier;

import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import dao.PatientDaoJdbcMysql;
import dao.VisiteDaoJdbcMysql;
import model.Patient;
import model.Visite;

public class Hopital {
	private static Hopital instance;
	private String nomSecretaire;
	private LinkedList<Patient> patientQueue = new LinkedList<>();
	private ArrayList<Salle> salles;

	private Hopital() {
		try {
			this.loadPatientQueue();
		} catch (IOException e) {
			System.out.println("Pas de fichier ");
		}
	}

	public static Hopital getInstance() {
		if (instance == null) {
			instance = new Hopital();
		}
		return instance;
	}

	public void addPatientToQueue(Patient patient) {
		this.patientQueue.add(patient);

	}

	public LinkedList<Patient> getPatientQueue() {
		return this.patientQueue;
	}

	public List<Visite> displayPatientVisits(int id) throws ClassNotFoundException, SQLException {
		return new VisiteDaoJdbcMysql().historiquePatient(id);
	}

	public List<Visite> displayAllVisits() throws ClassNotFoundException, SQLException {
		return new VisiteDaoJdbcMysql().findAll();
	}

	public void addPatientToDb(Patient patient) throws ClassNotFoundException, SQLException {
		new PatientDaoJdbcMysql().create(patient);
	}

	public void savePatientQueue() throws IOException {
		File f = new File("queue.xml");
		FileOutputStream fos = new FileOutputStream(f);
		XMLEncoder oos = new XMLEncoder(fos);
		oos.writeObject(this.patientQueue);
		oos.close();
		fos.close();

	}

	public void loadPatientQueue() throws IOException {
		File f = new File("queue.xml");
		FileInputStream fis = new FileInputStream(f);
		XMLDecoder ois = new XMLDecoder(fis);
		this.patientQueue = (LinkedList<Patient>) ois.readObject();
		ois.close();
		fis.close();

	}

	public Patient sendNextPatient() {
		return this.patientQueue.poll();
	}

	public void setNomSecretaire(String nomSecretaire) {
		this.nomSecretaire = nomSecretaire;
	}

	public void setPatientComplement(int id, String complement) throws ClassNotFoundException, SQLException {
		new PatientDaoJdbcMysql().updateComplement(id, complement);

	}

}
