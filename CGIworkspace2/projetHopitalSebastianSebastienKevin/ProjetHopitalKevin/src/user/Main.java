package user;

import java.io.IOException;
import java.sql.Date;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;
import dao.DAOAuth;
import model.*;

public class Main {
	
	static Hopital h;
	static FileA f = new FileA();
	private static String nom;
	private static int num_salle;
	private static int metier;
	private static Salle s;
	private static Visite visite;

	public static void main(String[] args) throws ClassNotFoundException, SQLException, InterruptedException, IOException {
		// TODO Auto-generated method stub
		
		h = Hopital.getInstance();
		connexion();
		
	}
	
	public static void connexion() throws ClassNotFoundException, SQLException, InterruptedException, IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Bienvenue dans l'hopital \nEntrez votre login");
		String login = sc.nextLine();
		System.out.println("Entrez votre mdp");
		String mdp = sc.nextLine();
		Employe emp = new DAOAuth().findById(login);
		if (emp != null) {
			nom =  emp.getNom();
			metier = emp.getMetier();
			if (metier == 1) {
				num_salle = 1;
			}
			if (metier == 2) {
				num_salle = 2;
			}
			if (emp.getMetier() == 0) {
				menuSecretaire();
			}
			else { 
				s = new Salle(num_salle, nom, metier);
				menuMedecin();
			}
		}
		else {
			System.out.println("Erreur d'authentification");
			Thread.sleep(2000);
			connexion();
		}
		
	
	}
	
	public static void menuSecretaire() throws InterruptedException, ClassNotFoundException, SQLException, IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Bienvenue " + nom + "\n1. Rajouter un patient à la file \n2. Afficher l'état de la file d'attente  \n3. Afficher la liste des visites par patient \n4. Afficher la liste des visites par medecin \n5. Sauvegarde de la file d'attente \n6. Charger la file d'attente si elle existe \n7. Sortir");
		int choix = sc.nextInt();
		switch (choix) {
		case 1: 
			h.chercherPatient();
			menuSecretaire();
			break;
		case 2:
			h.afficherFile(f);
			menuSecretaire();
			break;
		case 3:
			Visite v = new Visite();
			System.out.println("Entrez le numéro de sécu du patient");
			int numero = sc.nextInt();
			System.out.println(v.afficherVisiteParId(numero));
			menuSecretaire();
			break;
		case 4:
			Scanner scS = new Scanner(System.in);
			Visite v2 = new Visite();
			System.out.println("Entrez le nom du médecin");
			String medecin = scS.nextLine();
			System.out.println(v2.afficherVisiteParMedecin(medecin));
			menuSecretaire();
			break;
		case 5:
			h.sauvegarderListe(f.sauvegarderFile());
			menuSecretaire();
			break;
		case 6:
	
			break;
		case 7: 
			System.out.println("Au revoir " + nom);
			Thread.sleep(1500);
			connexion();
			break;
		default:
			System.out.println("Choix incorrect");
			menuSecretaire();
		}
	}
	
	public static void menuMedecin() throws IOException, ClassNotFoundException, SQLException, InterruptedException {
		visite = new Visite();
		Scanner sc = new Scanner(System.in);
		System.out.println("Bienvenue " + nom + "\n1. Afficher l'état de la file d'attente \n2. Sauvegarder la liste des visites en base \n3. Rendre la salle disponible \n4. Afficher l'historique de ses visites en base \n5. Sortir");
		int choix = sc.nextInt();
		switch (choix) {
		case 1: 
			h.afficherFile(f);
			menuMedecin();
			break;
		case 2:
			//h.sauvegarderListeEnBase(v.sauvegarderVisiteEnBase(), s);
			ArrayList<Visite> v = s.sauvegarderVisiteEnBase();
			System.out.println("Taille des visites " + v.size());
			h.sauvegarderVisiteEnBase(v, s);
			menuMedecin();
			break;
		case 3:
			//Visite v = new Visite();
			//System.out.println("Entrez le numéro de sécu du patient");
			//int numero = sc.nextInt();
			//System.out.println(v.afficherVisiteParId(numero));
			//menuSecretaire();
			//visite = new Visite();
			Patient p = f.auSuivant();	
			int id_patient = p.getId();
			int num_salle = s.getSalle();
			String medecin = nom;
			int tarif = 20;
			Visite vis = new Visite(id_patient, medecin, num_salle, tarif);
			s.ajouterVisite(vis);
			menuMedecin();
			break;
		case 4:
			System.out.println(visite.afficherVisiteParMedecin(nom));
			menuMedecin();
			break;
		case 5:
			System.out.println("Au revoir " + nom);
			Thread.sleep(1500);
			connexion();
		default: 
			System.out.println("Choix incorrect");
			menuMedecin();
		}
	}
	
	
	
	

}
