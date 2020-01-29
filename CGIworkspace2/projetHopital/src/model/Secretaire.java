package model;

import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.Scanner;

import dao.PatientDaoJDBC;
import dao.VisiteDaoJDBC;

public class Secretaire extends FileAttente {
	private int id;
	private String nom;
	private String prenom;

	public Secretaire(int id, String nom, String prenom) throws FileNotFoundException, UnsupportedEncodingException {
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		createFileAttente();
	}

	public FileAttente choixSecretaire(int choix, FileAttente file)
			throws ClassNotFoundException, SQLException, IOException {
		try {
			switch (choix) {
			case 1:
				ajouterPatient(file);
				break;
			case 2:
				sauvegarderListe(file);
				break;
			case 3:
				file.clear();
				file = chargerListe();
				break;
			case 4:
				nouvelleJournee(file);
				break;
			case 5:
				afficherFile(file);
				break;
			case 6:
				afficherVisitesPatient();
				break;
			case 7:
				affichierVisites();
				break;
			case 8:
				afficherVisitesMedecin();
				break;
			default:
				System.out.println("Input Invalide");
				break;
			}
		} catch (InputMismatchException err) {
			System.out.println("\nInput invalide!");
		}
		return file;
	}

	private void ajouterPatient(FileAttente file) throws ClassNotFoundException, SQLException, IOException {
		PatientDaoJDBC patient = new PatientDaoJDBC();
		Patient p = new Patient();
		Scanner sc = new Scanner(System.in);
		System.out.print("Veuillez entrer l'id du patient: ");
		int id = sc.nextInt();

		if (patient.findById(id) != null) {
			p = patient.findById(id);
			System.out.println("\n" + p);
			file.add(p);
		} else {
			Scanner input = new Scanner(System.in);
			System.out.print("\nPatient non trouvé, veuillez entrer un nom: ");
			String nomNewPatient = input.nextLine();
			System.out.print("Patient non trouvé, veuillez entrer un prénom: ");
			String prenomNewPatient = input.nextLine();
			System.out.print("Patient non trouvé, veuillez entrer l'adresse (optionnel): ");
			String compNewPatient = input.nextLine();
			p = patient.create(id, nomNewPatient, prenomNewPatient, compNewPatient);
			System.out.println("\n" + p);
			file.add(p);

			String textToAppend = "Patient " + id + ", nom: " + nomNewPatient + ", prénom: " + prenomNewPatient
					+ " , arrivé à " + LocalDateTime.now() + "\n";
			Path path = Paths.get("c:\\tmp\\patients.txt");
			Files.write(path, textToAppend.getBytes(), StandardOpenOption.APPEND);
		}
	}

	private void sauvegarderListe(FileAttente file) throws IOException {
		try {
			File f = new File("c:\\tmp\\listeFile.xml");
			FileOutputStream fos = new FileOutputStream(f);

			XMLEncoder oos = new XMLEncoder(fos);
			oos.writeObject(file.getFile());
			oos.close();
			fos.close();
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("File d'attente serialisé: \n");
		file.print();
	}

	private FileAttente chargerListe() throws IOException, ClassNotFoundException {

		LinkedList<Patient> x = new LinkedList<Patient>();
		try {
			File f = new File("c://tmp/listeFile.xml");
			FileInputStream fis = new FileInputStream(f);
			XMLDecoder ois = new XMLDecoder(fis);
			x = (LinkedList<Patient>) ois.readObject();
			ois.close();
			fis.close();
			
		} catch (ClassCastException ioe) {
			ioe.getMessage();
		}
		FileAttente a = new FileAttente(x);
		return a;
	}

	private void nouvelleJournee(FileAttente file) throws IOException {
		try {
			File f = new File("c://tmp/listeFile.xml");
			FileOutputStream fos = new FileOutputStream(f);
			XMLEncoder oos = new XMLEncoder(fos);
			file.clear();
			oos.writeObject(file);
			oos.close();
			fos.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	private void afficherFile(FileAttente file) {
		if (!file.isEmpty())
			file.print();
		else
			System.out.println("Aucun patient dans la file.");
	}

	private void afficherVisitesPatient() throws ClassNotFoundException, SQLException {
		Scanner sc = new Scanner(System.in);
		System.out.print("Veuillez entrer l'id du patient: ");
		int id = sc.nextInt();
		VisiteDaoJDBC v = new VisiteDaoJDBC();
		ArrayList<Visite> visites = v.selectAllpatient(id);
		if (visites.isEmpty())
			System.out.println("Pas de visites avec le patient correspondant");
		else
			visites.forEach((n) -> System.out.println(n));
	}

	private void affichierVisites() throws ClassNotFoundException, SQLException {
		VisiteDaoJDBC v = new VisiteDaoJDBC();
		ArrayList<Visite> visites = v.selectAll();
		if (visites.isEmpty())
			System.out.println("Pas de visites dans l'historique");
		else
			visites.forEach((n) -> System.out.println(n));
	}

	private void afficherVisitesMedecin() throws ClassNotFoundException, SQLException {
		Scanner sc = new Scanner(System.in);
		System.out.print("Veuillez entrer l'id du médecin: ");
		int id = sc.nextInt();
		VisiteDaoJDBC v = new VisiteDaoJDBC();
		ArrayList<Visite> visites = v.selectAllMedecin(id);
		if (visites.isEmpty())
			System.out.println("Pas de visites avec le médecin correspondant");
		else
			visites.forEach((n) -> System.out.println(n));
	}

	private void createFileAttente() throws FileNotFoundException, UnsupportedEncodingException {
		PrintWriter writer = new PrintWriter("c:\\tmp\\patients.txt", "UTF-8");
		writer.close();
	}
}
