package model;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;
import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import dao.DAOPatient;
import dao.DAOVisite;

public class Hopital {
	
	private static Hopital h = null;
	private static FileA f;
	
	
	private Hopital() {
		
	}
	
	public static Hopital getInstance() {
		if (h == null )
			h = new Hopital();
		return h;
	}

	public String m() {
		return "m";
		}

	
	public void chercherPatient() throws ClassNotFoundException, SQLException, InterruptedException {
		System.out.println("Veuillez entrer le numéro de sécurité sociale");
		Scanner sc = new Scanner(System.in);
		int numero = sc.nextInt();
		
		Patient p = new DAOPatient().findById(numero);
		if (p != null) {
			FileA.ajouterPatient(p);
		}
		else {
			System.out.println("Le patient n'est pas encore enregistré dans la base, Redirection vers inscription");
			Thread.sleep(2500);
			creerPatient();
		}
	}
	
	public void creerPatient() throws ClassNotFoundException, SQLException {
		Scanner sc = new Scanner(System.in);
		Scanner scI = new Scanner(System.in);
		System.out.println("Veuillez entrer le numero de secu");
		int numero = scI.nextInt();
		System.out.println("Veuillez saisir le nom");
		String nom = sc.nextLine();
		System.out.println("Veuillez rentrer le prénom");
		String prenom = sc.nextLine();
		System.out.println();
		System.out.println("Voulez-vous ajouter des informations complémentaires ? \n o: oui ? ou n: non ?");
		String choix = sc.nextLine();
		f = new FileA();
		DAOPatient d = new DAOPatient();
		switch (choix) {
		case "O":
		case "o": 
			System.out.println("Veuillez saisir les informations complémentaires");
			String complements = sc.nextLine();
			Patient p = new Patient(numero, nom, prenom, complements);
			f.ajouterPatient(p);
			d.create(p);
			break;
		case "N":
		case "n": 
			Patient p1 = new Patient(numero, nom, prenom);
			f.ajouterPatient(p1);
			d.create(p1);
		}
	}
	
	public static void  afficherFile(FileA f) {
		System.out.println(f);
		
	}
	
	public void sauvegarderListe(LinkedList<Patient> file) throws IOException {
		LinkedList<Patient> liste = file;
		System.out.println(liste.size());
		File f = new File("listePatient.xml");
		FileOutputStream fos = new FileOutputStream(f);
		XMLEncoder oos = new XMLEncoder(fos);
		
		oos.writeObject(liste);
		oos.close();
		fos.close();
	}
	
	public void sauvegarderVisiteEnBase (ArrayList<Visite> file, Salle s) throws IOException, ClassNotFoundException, SQLException {
		ArrayList<Visite> liste = file;
		DAOVisite d = new DAOVisite();
		//d.enregistrerVisiteEnBase(liste, s);
		
	}
	
	public ArrayList<Patient> chargerListe() throws IOException {
		 
		File f = new File("listePatient.xml");
		FileInputStream fis = new FileInputStream(f);
		XMLDecoder ois = new XMLDecoder(fis);
		ArrayList<Patient> liste = (ArrayList<Patient>) ois.readObject();
		//while ()
		ois.close();
		fis.close();
		return liste;
		
	}
	
	//public Patient EnvoyerPatient() {
		
	//}

}
