package metier;

import java.sql.SQLException;

import model.Patient;
import model.Visite;

public class InterfaceMenu {
	private Hopital hopital;

	public InterfaceMenu(Hopital hopital) {
		this.hopital = hopital;
	}

	// public String authenticate(String login, String mdp) {
	// StringBuilder stringBuilder = new StringBuilder();
	// Authentification authentification = new
	// AuthentificationDaoJdbcMysql().findByLogin(login, mdp);
	// if (authentification == null) {
	// stringBuilder.append("Erreur de login/mot de passe. Veuillez réessayer. ");
	// } else if (authentification.getMetier() == 0) {
	// hopital.setNomSecretaire(authentification.getNom());
	//
	//
	// } else {
	// System.out.println("\n\n");
	// Salle salle = new Salle(authentification.getMetier(),
	// authentification.getNom(), hopital);
	//
	// interfaceMedecin(salle);
	// }
	// return stringBuilder.toString();
	//
	// }

	public String menuSecretaire() {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("Bienvenue dans l'interface Secrétaire\n");
		stringBuilder.append("______________________________________\n");
		stringBuilder.append("1 - Rajouter un patient\n");
		stringBuilder.append("2 - Sauvegarder la liste d'attente\n");
		stringBuilder.append("3 - Charger la liste d'attente\n");
		stringBuilder.append("4 - Afficher la liste d'attente\n");
		stringBuilder.append("5 - Afficher les visites d'un patient\n");
		stringBuilder.append("6 - Afficher toutes les visites\n");
		stringBuilder.append("7 - Quitter\n");
		stringBuilder.append("\n");
		stringBuilder.append("Entrez votre choix: \n");
		return stringBuilder.toString();
	}

	public String menuMedecin() {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("Bienvenue dans l'interface Médecin\n");
		stringBuilder.append("______________________________________\n");
		stringBuilder.append("1 - Afficher la liste d'attente\n");
		stringBuilder.append("2 - Sauvegarder la liste des visites\n");
		stringBuilder.append("3 - Rendre la salle disponible\n");
		stringBuilder.append("4 - Afficher l'historique des visites\n");
		stringBuilder.append("5 - Quitter\n");
		stringBuilder.append("\n");
		stringBuilder.append("Entrez votre choix: \n");
		return stringBuilder.toString();
	}

	public String reponseMenuMedecin(int input, Salle salle) throws ClassNotFoundException, SQLException {
		StringBuilder stringBuilder = new StringBuilder();
		switch (input) {
		case 1:
			for (Patient p : salle	.getHopitalObserver()
									.getPatientQueue()) {
				stringBuilder.append(p);
				stringBuilder.append("\n");
			}
			stringBuilder.append("\n\n");
			break;
		case 2:
			salle.saveVisits();
			stringBuilder.append("Liste des visites sauvegardée.");
			stringBuilder.append("\n\n");
			break;
		case 3:
			Patient p = salle.rendreSalleDisponible();
			if (p == null) {
				stringBuilder.append("Il n'y a pas de patient dans la liste.");
			} else {
				stringBuilder.append("Le patient suivant (" + p.getNom() + ") arrive et sa visite est enregistrée.");
			}

			stringBuilder.append("\n\n");
			break;
		case 4:
			for (Visite v : salle.getVisitsByMedecin()) {
				stringBuilder.append(v);
				stringBuilder.append("\n");
			}
			stringBuilder.append("\n\n");
			break;
		case 5:
			stringBuilder.append("exit\n");
			break;

		default:
			System.out.println("Erreur");
		}
		return stringBuilder.toString();
	}

}
