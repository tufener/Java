package user;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import dao.AuthentificationDaoJdbcMysql;
import dao.MedicamentDaoJdbcMysql;
import dao.PatientDaoJdbcMysql;
import metier.Hopital;
import metier.Salle;
import model.Authentification;
import model.Medicament;
import model.Patient;

public class Main {

	public static void main(String[] args) throws IOException, ClassNotFoundException, SQLException {
		launchHospitalInterface(Hopital.getInstance());

	}

	private static void launchHospitalInterface(Hopital hopital) {
		boolean active = true;
		while (active) {
			Scanner scanner = new Scanner(System.in);

			System.out.println("Bienvenue !\nVeuillez renseigner votre login et votre mot de passe.");
			System.out.println();
			System.out.print("Login: ");
			String login = scanner.nextLine();
			System.out.print("Mot de passe: ");
			String mdp = scanner.nextLine();

			Authentification authentification;
			try {
				authentification = new AuthentificationDaoJdbcMysql().findByLogin(login, mdp);
			} catch (ClassNotFoundException | SQLException e) {
				System.out.println("Problème avec la base de données --> " + e.getMessage());
				System.out.println("L'application va maintenant s'arrêter");
				break;
			}
			if (authentification == null) {
				System.out.println();
				System.out.print("Erreur de login/mot de passe.\nVoulez-vous (R) Réessayer ou (Q) Quitter ? ");
				String input = scanner.nextLine();
				if (input.equalsIgnoreCase("Q")) {
					System.out.println();
					System.out.println("Extinction de la console ...");
					active = false;
				}
			} else if (authentification.getMetier() == 0) {
				hopital.setNomSecretaire(authentification.getNom());
				System.out.println("\n\n");
				try {
					interfaceSecretaire(hopital);
				} catch (ClassNotFoundException | SQLException e) {
					System.out.println("Problème avec la base de données --> " + e.getMessage());
					System.out.println("L'application va maintenant s'arrêter");
					break;
				}
			} else {
				System.out.println("\n\n");
				Salle salle = new Salle(authentification.getMetier(), authentification.getNom(), hopital);

				try {
					interfaceMedecin(salle);
				} catch (ClassNotFoundException | SQLException e) {
					System.out.println("Problème avec la base de données --> " + e.getMessage());
					System.out.println("L'application va maintenant s'arrêter");
					break;
				}
			}
		}
	}

	private static void interfaceSecretaire(Hopital hopital) throws ClassNotFoundException, SQLException {
		boolean active = true;
		while (active) {
			System.out.println("Bienvenue dans l'interface Secrétaire");
			System.out.println("______________________________________");
			System.out.println("1 - Rajouter un patient");
			System.out.println("2 - Sauvegarder la liste d'attente");
			System.out.println("3 - Charger la liste d'attente");
			System.out.println("4 - Afficher la liste d'attente");
			System.out.println("5 - Afficher les visites d'un patient");
			System.out.println("6 - Afficher toutes les visites");
			System.out.println("7 - Mettre à jour le complément du patient");
			System.out.println("8 - Quitter");
			System.out.println();
			System.out.print("Entrez votre choix: ");

			Scanner scanner = new Scanner(System.in);
			int input = scanner.nextInt();
			System.out.println();

			switch (input) {
			case 1:
				secretaireAjouterPatient(hopital);
				break;
			case 2:
				try {
					hopital.savePatientQueue();
					System.out.println("File de patients sauvegardée.");
				} catch (IOException e) {
					System.out.println("Problème avec la sauvegarde, merci de réessayer plus tard.");
				}
				System.out.println("\n\n");
				break;
			case 3:
				try {
					hopital.loadPatientQueue();
					System.out.println("File de patients chargée.");
				} catch (IOException e1) {
					System.out.println(
							"Problème avec le chargement, merci de vérifier que le fichier existe bien avant de réessayer.");
				}
				System.out.println("\n\n");
				break;
			case 4:
				System.out.println(display(hopital.getPatientQueue()));
				System.out.println("\n\n");
				break;
			case 5:
				secretaireAfficherVisitesPatient(hopital);
				break;
			case 6:
				System.out.println(display(hopital.displayAllVisits()));
				System.out.println("\n\n");
				break;
			case 7:
				secretaireMajComplement(hopital);
				break;
			case 8:
				System.out.println("\n\n");
				try {
					hopital.savePatientQueue();
				} catch (IOException e) {
				}
				active = false;
				return;

			default:
				System.out.println("Erreur");
			}
		}
	}

	private static void interfaceMedecin(Salle salle) throws ClassNotFoundException, SQLException {
		boolean active = true;
		while (active) {
			System.out.println("Bienvenue dans l'interface Médecin");
			System.out.println("______________________________________");
			System.out.println("1 - Afficher la liste d'attente");
			System.out.println("2 - Sauvegarder la liste des visites");
			System.out.println("3 - Rendre la salle disponible");
			System.out.println("4 - Afficher l'historique des visites du médecin en base");
			System.out.println("5 - Ajouter ordonnance");
			System.out.println("6 - Quitter");
			System.out.println();
			System.out.print("Entrez votre choix: ");

			Scanner scanner = new Scanner(System.in);
			int input = scanner.nextInt();

			switch (input) {
			case 1:
				for (Patient p : salle	.getHopitalObserver()
										.getPatientQueue()) {
					System.out.println(p);
				}
				System.out.println("\n\n");
				break;
			case 2:
				salle.saveVisits();
				System.out.println("Liste des visites sauvegardée.");
				System.out.println("\n\n");
				break;
			case 3:
				medecinRendreSalleDispo(salle);
				break;
			case 4:
				System.out.println(display(salle.getVisitsByMedecin()));
				System.out.println("\n\n");
				break;
			case 5:
				medecinAjouterOrdonnance(salle);
				System.out.println("\n\n");
				break;
			case 6:
				System.out.println("\n\n");
				active = false;
				return;

			default:
				System.out.println("Erreur");
				System.out.println("\n\n");
			}
		}
	}

	private static void medecinAjouterOrdonnance(Salle salle) throws ClassNotFoundException, SQLException {
		if (salle	.getVisites()
					.isEmpty()) {
			System.out.println("Aucun patient en salle actuellement.");
			return;
		}
		Scanner scanner = new Scanner(System.in);
		Scanner scannerString = new Scanner(System.in);
		boolean finished = false;
		ArrayList<String> medicaments = new ArrayList<>();
		while (!finished) {
			System.out.print("Voulez-vous accéder à la liste complète? (O/N)");
			if (scannerString	.nextLine()
								.equalsIgnoreCase("N")) {

				System.out.print("Afficher la liste des médicaments commencant par: ");
				String like = scannerString.nextLine();
				for (Medicament medoc : new MedicamentDaoJdbcMysql().findByChar(like)) {
					System.out.println(medoc);
				}
			} else {
				for (Medicament medoc : new MedicamentDaoJdbcMysql().findAll()) {
					System.out.println(medoc);
				}

			}
			System.out.print("Veuillez saisir l'identifiant du médicament désiré: ");
			int identifiant = scanner.nextInt();
			Medicament medicament = new MedicamentDaoJdbcMysql().findById(identifiant);

			System.out.print("Veuillez saisir la quantité souhaitée (inférieur à " + medicament.getQuantite() + "): ");
			int quantite = 0;
			while (true) {
				quantite = scanner.nextInt();
				if (quantite > medicament.getQuantite()) {
					System.out.println("Pas assez de médicaments, veuillez saisir une autre quant;ité");
				} else {
					break;
				}
			}
			String line = medicament.getNomMedicament() + "/" + quantite + "/" + (medicament.getPrix() * quantite)
					+ ";";
			medicaments.add(line);
			medicament.setQuantite(medicament.getQuantite() - quantite);
			new MedicamentDaoJdbcMysql().update(medicament);

			System.out.print("Avez-vous fini l'ordonnance? (O/N) ");
			if (scannerString	.nextLine()
								.equalsIgnoreCase("o")) {
				salle.addOrdonnance(medicaments);
				finished = true;
			}
		}
	}

	private static void medecinRendreSalleDispo(Salle salle) throws ClassNotFoundException, SQLException {
		Patient p = salle.rendreSalleDisponible();
		if (p == null) {
			System.out.println("Il n'y a pas de patient dans la liste.");
		} else {
			System.out.println("Le patient suivant (" + p.getNom() + ") arrive et sa visite est enregistrée.");
		}

		System.out.println("\n\n");
	}

	private static void secretaireAjouterPatient(Hopital hopital) throws ClassNotFoundException, SQLException {
		Scanner scanner = new Scanner(System.in);
		Scanner scannerString = new Scanner(System.in);
		System.out.print("Saisissez l'id du patient à rajouter: ");
		int id = scanner.nextInt();
		Patient patient = new PatientDaoJdbcMysql().findById(id);
		if (patient == null) {
			System.out.println("Patient inconnu, veuillez saisir ses informations: ");
			System.out.print("Nom: ");
			String nom = scannerString.nextLine();
			System.out.print("Prenom: ");
			String prenom = scannerString.nextLine();
			patient = new Patient(id, nom, prenom, null);
			hopital.addPatientToDb(patient);
		}
		System.out.println();
		hopital.addPatientToQueue(patient);
		System.out.println("Patient " + patient.getNom() + " ajouté à la file d'attente.");
		System.out.println("\n\n");
	}

	private static void secretaireAfficherVisitesPatient(Hopital hopital) throws ClassNotFoundException, SQLException {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Saisissez l'id du patient dont vous voulez afficher les visites: ");
		int idPatient = scanner.nextInt();
		System.out.println(display(hopital.displayPatientVisits(idPatient)));
		System.out.println("\n\n");
	}

	private static void secretaireMajComplement(Hopital hopital) throws ClassNotFoundException, SQLException {
		Scanner scanner = new Scanner(System.in);
		Scanner scannerString = new Scanner(System.in);
		System.out.print("Saisissez l'id du patient dont vous voulez mettre à jour le complément : ");
		int idPatientCompl = scanner.nextInt();
		Patient patientCompl = new PatientDaoJdbcMysql().findById(idPatientCompl);
		if (patientCompl != null) {
			System.out.print("Saisissez le complément pour le patient " + patientCompl.getNom() + " : ");
			String complement = scannerString.nextLine();
			hopital.setPatientComplement(patientCompl.getId(), complement);
			System.out.println("Patient mis à jour.");
		} else {
			System.out.println("Ce patient n'existe pas");
		}
		System.out.println("\n\n");
	}

	private static <E> String display(List<E> list) {
		if (list.isEmpty()) {
			return "La liste est vide";
		} else {
			StringBuilder stringBuilder = new StringBuilder();
			for (E e : list) {
				stringBuilder.append(e);
				stringBuilder.append("\n");
			}
			return stringBuilder.toString();
		}

	}

}
