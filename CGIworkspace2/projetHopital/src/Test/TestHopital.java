package Test;

import java.util.*;

import model.*;

public class TestHopital {
	public static void main(String[] args) throws Exception {
		LinkedList<Patient> p = new LinkedList<Patient>();
		FileAttente file = new FileAttente(p);
		System.out.println("Bienvenue à l'hopital.\n");
		saisieLogs(file);
	}

	static void saisieLogs(FileAttente file) throws Exception {
		Authentification a = new Authentification();
		Scanner sc = new Scanner(System.in);
		System.out.print("Login: ");
		String login = sc.nextLine();
		System.out.print("Password: ");
		String password = sc.nextLine();
		System.out.print("Metier: ");
		String metier = sc.nextLine();
		a = a.loginHopital(login, password, metier);
		if (a != null) {
			if (Integer.parseInt(metier) > 0 && Integer.parseInt(metier) < 3)
				saisieMedecin(a, file);
			else
				saisieSecretaire(a, file);
		} else {
			saisieLogs(file);
		}
	}

	static void saisieMedecin(Authentification a, FileAttente file) throws Exception {
		Medecin med = new Medecin(a.getId(), a.getLogin(), a.getPassword(), a.getMetier());
		LinkedList<Patient> p = new LinkedList<Patient>();
		VisitesList visitesList = new VisitesList(p);
		Scanner sc = new Scanner(System.in);
		System.out.println("\n\nBienvenue à l'interface Médecin.\n______________________________________");
		System.out.println("1 - Affichier l'état de la file d'attente");
		System.out.println("2 - Ajouter une ordonnance au patient actuel");
		System.out.println("3 - Sauvegarde de la BDD de la list des visites");
		System.out.println("4 - Rendre la salle disponible");
		System.out.println("5 - Quitter\n");
		System.out.print("Veuillez entrer votre choix: ");
		int choix = sc.nextInt();
		if (choix == 5)
			quitter("Medecin", file);
		else {
			med.choixMedecin(choix, file, visitesList);
			nouvelleSaisieMedecin(med, file, visitesList);
		}
	}

	static void saisieSecretaire(Authentification a, FileAttente file) throws Exception {
		Secretaire sec = new Secretaire(a.getId(), a.getLogin(), a.getPassword());
		Scanner sc = new Scanner(System.in);
		System.out.println("\n\nBienvenue à l'interface Secretaire.\n______________________________________");
		System.out.println("1 - Rajouter un patient");
		System.out.println("2 - Sauvegarder la liste d'attente");
		System.out.println("3 - Charger la liste d'attente");
		System.out.println("4 - Nouvelle journée");
		System.out.println("5 - Afficher l'état de la file d'attente");
		System.out.println("6 - Afficher les visites d'un patient");
		System.out.println("7 - Afficher toutes les visites");
		System.out.println("8 - Afficher toutes les visites d'un médecin");
		System.out.println("9 - Quitter\n");
		System.out.print("Veuillez entrer votre choix: ");
		int choix = sc.nextInt();
		if (choix == 9)
			quitter("Secrétaire", file);
		else {
			file = sec.choixSecretaire(choix, file);
			nouvelleSaisieSecretaire(sec, file);
		}
	}

	static void nouvelleSaisieSecretaire(Secretaire sec, FileAttente file) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("\n1 - Rajouter un patient");
		System.out.println("2 - Sauvegarder la liste d'attente");
		System.out.println("3 - Charger la liste d'attente");
		System.out.println("4 - Nouvelle journée");
		System.out.println("5 - Afficher l'état de la file d'attente");
		System.out.println("6 - Afficher les visites d'un patient");
		System.out.println("7 - Afficher toutes les visites");
		System.out.println("8 - Afficher toutes les visites d'un médecin");
		System.out.println("9 - Quitter\n");
		System.out.print("Veuillez entrer votre nouveau choix: ");
		int choix = sc.nextInt();
		if (choix == 9)
			quitter("Secrétaire", file);
		else {
			file = sec.choixSecretaire(choix, file);
			nouvelleSaisieSecretaire(sec, file);
		}
	}

	static void nouvelleSaisieMedecin(Medecin med, FileAttente file, VisitesList visitesList) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("\n1 - Affichier l'état de la file d'attente");
		System.out.println("2 - Ajouter une ordonnance au patient actuel");
		System.out.println("3 - Sauvegarde de la BDD de la list des visites");
		System.out.println("4 - Rendre la salle disponible");
		System.out.println("5 - Quitter\n");
		System.out.print("Veuillez entrer votre nouveau choix: ");
		int choix = sc.nextInt();
		if (choix == 9)
			quitter("Secrétaire", file);
		else {
			med.choixMedecin(choix, file, visitesList);
			nouvelleSaisieMedecin(med, file, visitesList);
		}
	}

	static void quitter(String status, FileAttente file) throws Exception {
		System.out.println("\nVous avez quitter l'interface " + status + ".\n");
		saisieLogs(file);
	}

}
