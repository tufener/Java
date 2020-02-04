package user;

import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

import dao.*;
import model.*;

public class Traitement {
	
	public static void serialisation() throws IOException {
		Hopital h = Hopital.getInstance();
		LinkedList<Patient> fileAttente = h.getFileAttente();
		File f = new File("c:\\tmp\\fileAttente.xml");
		FileOutputStream fos = new FileOutputStream(f);
		XMLEncoder oos = new XMLEncoder(fos);

		oos.writeObject(fileAttente);
		oos.close();
		fos.close();
	}

	public static void deserialisation() throws IOException {
		Hopital h = Hopital.getInstance();
		LinkedList<Patient> fileAttente = new LinkedList<Patient>();
		File f = new File("c:\\tmp\\fileAttente.xml");
		FileInputStream fis = new FileInputStream(f);
		XMLDecoder ois = new XMLDecoder(fis);
		fileAttente = (LinkedList<Patient>) ois.readObject();
		h.setFileAttente(fileAttente);
		ois.close();
		fis.close();
	}

	public static Employe authentification(String login, String mdp) {
		AuthentificationDaoJdbc d = new AuthentificationDaoJdbc();
		Employe e = d.findByLogin(login, mdp);
		return e;
	}

	public static void nouvelleJournee() {
		Hopital h = Hopital.getInstance();
		h.getFileAttente().clear();
	}

	public static boolean EstEnFile(Patient p) {
		Hopital h = Hopital.getInstance();
		boolean rep = false;
		for (Patient patient : h.getFileAttente())
			if (p.equals(patient)) {
				rep = true;
				break;
			}
		return rep;
	}

	public static void sauvegardeBdd(Employe e) {
		Hopital h = Hopital.getInstance();
		h.getSalle(e.getMetier()).sauvegarde();
	}
	
	public static Visite visiteEnCours(Employe e) {
		Hopital h = Hopital.getInstance();
		ArrayList<Visite> alv = h.getSalle(e.getMetier()).getListeVisite();
		Visite v = alv.get(alv.size() - 1);
		return v;
	}

}
