package user;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.*;
import java.text.DateFormat;
import java.util.*;
import java.util.Date;

import dao.*;
import model.*;

public class Menu {

	public static void main(String[] args) {
		LinkedList<Patient> fileAttente = new LinkedList<Patient>();
		Hopital h = Hopital.getInstance("Pontchaillou", fileAttente);
		ArrayList<Visite> listeVisite1 = new ArrayList<Visite>();
		Salle s1 = new Salle(1, listeVisite1);
		ArrayList<Visite> listeVisite2 = new ArrayList<Visite>();
		Salle s2 = new Salle(2, listeVisite2);
		s1.setHopital(h);
		s2.setHopital(h);
		h.ajouter(s1);
		h.ajouter(s2);
		authentification();
	}

	public static void authentification() {
		Hopital h = Hopital.getInstance();
		Scanner sc = new Scanner(System.in);
		System.out.println("Bienvenue à l'hopital " + h.getNom());
		System.out.println("-----------------------------------------------------------\n");
		boolean authReussie = false;
		do {
			System.out.println("Veuillez saisir votre login");
			String login = sc.nextLine();
			System.out.println("Veuillez saisir votre mot de passe");
			String mdp = sc.nextLine();
			Employe e = Traitement.authentification(login, mdp);
			if (e == null)
				System.out.println("Probleme de login ou de mot de passe");
			else if (e.getMetier() == 0) {
				authReussie = true;
				menuSecretaire(e);
			} else if (e.getMetier() == 1 || e.getMetier() == 2) {
				authReussie = true;
				menuMedecin(e);
			}
		} while (!authReussie);
	}

	static void menuSecretaire(Employe e) {
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Bienvenue " + e.getNom() + " dans le menu Secrétaire ");
		boolean sortie = false;
		do {
			System.out.println("-----------------------------------------------------------\n");
			System.out.println("1 Ajouter un patient à la file d'attente \n2 Afficher l'état de la file d'attente"
					+ "\n3 Afficher la liste des visites par patient \n4 Afficher la liste des visites par medecin"
					+ "\n5 sauvegarde de la file d'attente \n6 Charger la file d'attente \n7 Nouvelle Journée "
					+ "\n8 Ajouter un Complément \n9 Sortir");
			try {
				int x = sc1.nextInt();
				switch (x) {
				case 1:
					ajouterPatient();
					break;
				case 2:
					afficherFileAttente();
					break;
				case 3:
					afficheVisitePatient();
					break;
				case 4:
					afficheVisiteMedecin();
					break;
				case 5:
					Traitement.serialisation();
					System.out.println("file d'attente sauvegardée");
					break;
				case 6:
					Traitement.deserialisation();
					System.out.println("file d'attente chargée");
					break;
				case 7:
					Traitement.nouvelleJournee();
					System.out.println("\nNouvelle Journée la file d'attente a été réinitialisée");
					break;
				case 8:
					ajouterComplement();
					break;
				case 9:
					sortie = true;
					break;
				default:
					System.out.println("erreur de saisie");
					break;
				}
			} catch (Exception exc) {
				System.out.println("erreur de saisie vous avez été déconnecté");
				authentification();
			}
		} while (!sortie);
		authentification();
	}

	static void menuMedecin(Employe e) {
		System.out.println("Bienvenue " + e.getNom() + " dans le menu Médecin");
		boolean sortie = false;
		do {
			System.out.println("-----------------------------------------------------------\n");
			System.out
					.println("1 Afficher l'état de la file d'attente \n2 Sauvegarde de la BDD de la liste des visites "
							+ "\n3 rendre la salle disponible \n4 ajouter une ordonnance au patient actuel \n5 sortir");
			Scanner clavier = new Scanner(System.in);
			try {
				int x = clavier.nextInt();
				switch (x) {
				case 1:
					afficherFileAttente();
					break;
				case 2:
					Traitement.sauvegardeBdd(e);
					System.out.println("Visite(s) sauvegardée(s)");
					break;
				case 3:
					rendreDispo(e);
					break;
				case 4:
					ajouterOrdonnance(e);
					System.out.println("Ordonnance ajoutée");
					break;
				case 5:
					Traitement.sauvegardeBdd(e);
					System.out.println("Visite(s) sauvegardée(s)");
					sortie = true;
					break;
				default:
					System.out.println("erreur de saisie");
					break;
				}
			} catch (Exception exc) {
				System.out.println("erreur de saisie vous avez été déconnecté");
				authentification();
			}
		} while (!sortie);
		authentification();
	}

	static void ajouterPatient() {
		Hopital h = Hopital.getInstance();
		Scanner sc1 = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		System.out.println("Veuillez saisir l'identifiant du patient");
		try {
			int id = sc1.nextInt();
			PatientDaoJdbc d = new PatientDaoJdbc();
			Patient p = d.findById(id);
			if (p == null) {
				p = new Patient();
				System.out.println("Veuillez saisir le nom du patient");
				String nom = sc2.nextLine();
				System.out.println("Veuillez saisir le prenom du patient");
				String prenom = sc2.nextLine();
				System.out.println("Voulez vous saisir un complément(O/N)");
				String rep = sc2.nextLine();
				if (rep.equalsIgnoreCase("O")) {
					System.out.println("Veuillez saisir le complement");
					String complement = sc2.nextLine();
					p.setComplement(complement);
				}
				p.setId(id);
				p.setNom(nom);
				p.setPrenom(prenom);
				d.create(p);
			}
			if (!Traitement.EstEnFile(p)) {
				h.getFileAttente().add(p);
				System.out.println("Patient ajouté à la file");
				// ajout fichier text
				Date aujourdhui = new Date();
				DateFormat shortDateFormat = DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.SHORT);
				fileWriter("Patient : " + p.getId() + "\t" + shortDateFormat.format(aujourdhui));
			}
		} catch (Exception e) {
			System.out.println(e);
			Menu.authentification();
		}
	}

	static void afficherFileAttente() {
		Hopital h = Hopital.getInstance();
		System.out.println("\nnombre de patient dans la file d'attente :" + h.getFileAttente().size());
		System.out.println("Patient\tNom\tPrenom\t\tComplément");
		for (Patient p : h.getFileAttente())
			System.out.println(p);
	}

	static void afficheVisitePatient() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Veuillez saisir l'identifiant du patient");
		try {
			int id = sc.nextInt();
			VisiteDaoJdbc d = new VisiteDaoJdbc();
			ArrayList<Visite> alv = d.findByPatient(id);
			if (alv.isEmpty())
				System.out.println("Le patient n'est jamais venu");
			else {
				System.out.println("\nVisite du Patient à l'identifiant : " + id);
				System.out.println("n°\tPatient\tdate\t\t\tSalle\tMedecin\t\tTarif\tOrdonnance");
				for (Visite v : alv)
					System.out.println(v);
			}
		} catch (Exception e) {
			System.out.println(e);
			Menu.authentification();
		}
	}

	static void afficheVisiteMedecin() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Veuillez saisir le nom du medecin");
		String nom = sc.nextLine();
		VisiteDaoJdbc d = new VisiteDaoJdbc();
		ArrayList<Visite> alv = d.findByMedecin(nom);
		if (alv.isEmpty())
			System.out.println("Le medecin n'a effectué aucune visite");
		else {
			System.out.println("\nListe des Visites par Medecin:");
			System.out.println("n°\tPatient\tdate\t\t\tSalle\tMedecin\t\tTarif\tOrdonnance");
			for (Visite v : alv)
				System.out.println(v);
		}
	}

	static void ajouterComplement() {
		Scanner sc1 = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		Hopital h = Hopital.getInstance();
		PatientDaoJdbc d = new PatientDaoJdbc();
		try {
			System.out.println("Veuillez saisir l'id du patient auquel ajouter un complément");
			int id = sc1.nextInt();
			if (d.findById(id) == null)
				System.out.println("Patient inconnu");
			else {
				System.out.println("Veuillez saisir le complément à ajouter");
				String complement = sc2.nextLine();
				d.updateComplement(id, complement);
				for (Patient p : h.getFileAttente())
					if (p.getId() == id) {
						p.setComplement(complement);
						System.out.println("Complément ajouté");
						break;
					}
			}
		} catch (Exception e) {
			System.out.println("erreur dans la saisie");
		}
	}

	static void rendreDispo(Employe e) {
		Hopital h = Hopital.getInstance();
		if (!h.getFileAttente().isEmpty()) {
			System.out.println("Envoie du patient " + h.getFileAttente().peek().getNom() + " "
					+ h.getFileAttente().peek().getPrenom());
			if (h.medecinDispo(e) == 10) {
				Traitement.sauvegardeBdd(e);
				System.out.println("Visite(s) sauvegardée(s)");
			}
		} else
			System.out.println("Pas de patient en file d'attente");
	}

	static void ajouterOrdonnance(Employe e) {
		Scanner sc = new Scanner(System.in);
		boolean fin = false;
		ArrayList<Medicament> alm = new ArrayList<Medicament>();
		do {
			Medicament m = medicamentSuivant();
			alm.add(m);
			System.out.println("Avez vous fini?(O/N)");
			String rep = sc.nextLine();
			if (rep.equalsIgnoreCase("O"))
				fin = true;
		} while (!fin);
		updateVisiteStock(e, alm);
	}

	static void updateVisiteStock(Employe e, ArrayList<Medicament> alm) {
		Visite v = Traitement.visiteEnCours(e);
		MedicamentDaoJdbc d = new MedicamentDaoJdbc();
		int prixTotal = v.getTarif();
		String ordonnance = "";
		for (Medicament m : alm) {
			ordonnance += m.getNom() + "(" + m.getQuantite() + "," + (m.getQuantite() * m.getPrix()) + ");";
			prixTotal += (m.getQuantite() * m.getPrix());
			Medicament temp = d.findById(m.getIdMed());
			d.updateQte(temp.getIdMed(), temp.getQuantite() - m.getQuantite());
		}
		v.setOrdonnance(ordonnance);
		v.setTarif(prixTotal);
	}

	static Medicament medicamentSuivant() {
		Scanner sc = new Scanner(System.in);
		listezMedicament();
		System.out.println("Veuillez saisir l'identifiant du Médicament");
		int id = sc.nextInt();
		System.out.println("Veuillez saisir la quantité souhaitée?");
		int quantite = sc.nextInt();
		MedicamentDaoJdbc d = new MedicamentDaoJdbc();
		Medicament temp = d.findById(id);
		Medicament m = new Medicament(id, temp.getNom(), temp.getPrix(), quantite);
		return m;
	}

	static void listezMedicament() {
		Scanner sc1 = new Scanner(System.in);
		MedicamentDaoJdbc d = new MedicamentDaoJdbc();
		System.out.println("Afficher la liste entière des médicaments?(O/N)");
		String rep = sc1.nextLine();
		if (rep.equalsIgnoreCase("O")) {
			System.out.println("idMed\tNom\t\t\t\tPrix\tQuantité");
			System.out.println("------------------------------------------------------");
			for (Medicament m : d.findAll())
				System.out.println(m);
		} else {
			System.out.println("Afficher la liste des Médicaments commençant par?");
			String debut = sc1.nextLine();
			ArrayList<Medicament> alm = d.commencePar(debut);
			if (alm.isEmpty())
				System.out.println("par de medicaments commençant par " + debut);
			else {
				System.out.println("idMed\tNom\t\t\tPrix\tQuantité");
				System.out.println("----------------------------------------------------");
				for (Medicament m : alm)
					System.out.println(m);
			}
		}
	}

	static void fileWriter(String str) throws IOException {
		File file = new File("c:\\tmp\\fileAttente.txt");
		file.createNewFile();

		FileWriter writer = new FileWriter(file, true);
		writer.write(str + "\n");
		writer.flush();
		writer.close();
	}

}
