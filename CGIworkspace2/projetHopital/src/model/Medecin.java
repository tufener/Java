package model;

import java.sql.SQLException;
import java.util.*;

import dao.*;

public class Medecin extends VisitesList {
	private int id;
	private String nom;
	private String prenom;
	private int salle;

	public Medecin(int id, String nom, String prenom, int salle) {
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.salle = salle;
	}

	public void choixMedecin(int choix, FileAttente file, VisitesList visitesList)
			throws ClassNotFoundException, SQLException {
		try {
			switch (choix) {
			case 1:
				etatFileDattente(file);
				break;
			case 2:
				ajouterOrdonnance();
				break;
			case 3:
				sauvegarderVisites(visitesList);
				break;
			case 4:
				salleDisponible(file, visitesList);
				break;
			default:
				System.out.println("Input Invalide");
				break;
			}
		} catch (InputMismatchException err) {
			System.out.println("\nINVALID INPUT!");
		}
	}

	private void etatFileDattente(FileAttente file) {
		if (!file.isEmpty())
			file.print();
		else
			System.out.println("Il n'y a aucun patient dans la file d'attente.");
	}

	private void ajouterOrdonnance() throws ClassNotFoundException, SQLException {
		MedicamentsDaoJDBC medDao = new MedicamentsDaoJDBC();
		VisiteDaoJDBC visiteDao = new VisiteDaoJDBC();
		ArrayList<Medicaments> allMed = medDao.selectAll();
		ArrayList<Visite> allVisite = visiteDao.selectAll();
		Scanner sc = new Scanner(System.in);
		for (Visite v1 : allVisite)
			System.out.println(v1);
		System.out.print("Veuillez entrer l'id de la visite: ");
		int idVisite = sc.nextInt();
		Scanner input = new Scanner(System.in);
		for (Medicaments m1 : allMed)
			System.out.println(m1);
		System.out.print("Veuillez saisir le médicament: ");
		int idMedicament = input.nextInt();
		Medicaments m = new Medicaments();
		m = medDao.getMedbyId(idMedicament);
		System.out.print("Veuillez entrer la quantité nécessaire: ");
		int quantite = sc.nextInt();
		if (quantite > m.getQuantiteStock())
			System.out.println(
					"Il n'y a pas assez de stock, medicaments disponible : " + m.getQuantiteStock() + " unité(s).");
		else {
			medDao.updateQuantite(idMedicament, m.getQuantiteStock(), quantite);
			VisiteDaoJDBC v = new VisiteDaoJDBC();
			Visite ordo = v.getVisiteById(idVisite);
			if (ordo != null) {
				int prixUpdated = m.getPrix() * quantite;
				v.OrdonnanceByVisite(prixUpdated, m.getNomMed(), idVisite);
			}
			System.out.println(medDao.getMedbyId(idMedicament));
			System.out.println(v.getVisiteById(idVisite));
		}
	}

	private void sauvegarderVisites(VisitesList visitesList) throws ClassNotFoundException, SQLException {
		if (!visitesList.isEmpty()) {
			System.out.println("Visites enregistrées : \n");
			ArrayList<Visite> visites = new ArrayList<Visite>();
			visites = visitesList.saveBDD(this.salle, this.id);
			visites.forEach((n) -> System.out.println(n));
			visitesList.clear();
		} else
			System.out.println("Aucune visite à enregistrer.");
	}

	private void salleDisponible(FileAttente file, VisitesList visitesList) {
		if (!file.isEmpty()) {
			System.out.println("Patient pris en compte dans la file de visites: \n" + file.peek());
			visitesList.add(file.poll());
		} else
			System.out.println("Aucun patient n'est en file d'attente");
	}

}
