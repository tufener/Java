package user;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

import dao.DAOMedicament;
import model.*;

public class MedMenu extends Menu{
	private Salle salle;
	public MedMenu(Employe user){
		super(user);
		run=true;
		this.salle=new Salle(user);
	}
	public void affMenu() throws ClassNotFoundException, SQLException{
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		while(run){
			System.out.println("Salle "+user.getMetier()
					+"\nSaisissez une fonctionnalit� :"
					+"\n1\tAccueillir un patient"
					+"\n2\tAfficher la file d'attente"
					+"\n3\tSAuvegarder la liste des visites"
					+"\n\nSaisir 0 pour se d�connecter."				
					);
			int choix=sc.nextInt();
			run=choix(choix);
		}
	}
	public boolean choix(int choix) throws ClassNotFoundException, SQLException{
		switch(choix){
			case 1: //Accueil patient >> cr�ation d'une visite
				clearConsole();
				if(SgHopital.getInstance().getFile().size()!=0){
					System.out.println("Patient admis en consultation, retir� de la file d'attente.");
					ArrayList<Medicament> ordo=choixOrdo();
					System.out.println("Visite termin�e, ajout�e dans la liste des visites.");
					if(salle.getVisites().size()==9)
						System.out.println("La liste des visites va �tre automatiquement sauvegard�e en base.");
					salle.addVisite(new Visite(
							SgHopital.getInstance().getNextPatient().getId(),
							salle.getMedecin().getMetier(),
							salle.getMedecin().getNom(),
							ordo
							));
				}
				else System.out.println("Aucun patient en attente, coffee time!");
				break;
			case 2: //aff file d'attente
				clearConsole();
				LinkedList<Patient> file=SgHopital.getInstance().getFile();
				System.out.println(file.size()+" patient"+((file.size()>1)?"s":"")+" en file d'attente :");
				for (Patient p:file)
					System.out.println(p);
				break;
			case 3: //save liste visites >> bdd
				clearConsole();
				salle.saveVisites();
				System.out.println("Liste des visites sauvegard�e en base.");
				break;
			case 0: //d�co
				clearConsole();
				return false;
			default:
				clearConsole();
				System.out.println("Choix non valide");
				break;
		}
		return true;
	}
	
	//d�finit si la visite en cours n�cessite une ordonnance
	private ArrayList<Medicament> choixOrdo() throws ClassNotFoundException, SQLException{
		ArrayList<Medicament> ordo=new ArrayList<Medicament>();
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		while(true){
			System.out.println("Souhaitez-vous �tablir une ordonnance pour cette visite? (O/N)");
			switch(sc.nextLine()){
			case "O":
				return setOrdo(ordo);
			case "N":
				return ordo;
			default :
				System.out.println("Saisie invalide. (O/N)");
				break;
			}
		}
	}
	//Saisie d'ordonnance
	private ArrayList<Medicament> setOrdo(ArrayList<Medicament> ordo) throws ClassNotFoundException, SQLException{
		@SuppressWarnings("resource")
		Scanner scI=new Scanner(System.in);
		boolean run=true;
		while(run){
			clearConsole();
			System.out.println(ordo);
			System.out.println("Saisissez une option :"
				+"\n1\tAfficher l'ensemble des m�dicaments disponibles"
				+"\n2\tChercher un m�dicament"
				+"\n3\tAjouter un m�dicament � l'ordonnance"
				+"\n4\tValider l'ordonnance"
				+"\n\nSaisir 0 pour annuler l'ordonnance"				
				);
			int choix=scI.nextInt();
			run=choixOrdo(choix,ordo);
		}
		return ordo;
	}
	private boolean choixOrdo(int choix, ArrayList<Medicament> ordo) throws ClassNotFoundException, SQLException{
		switch(choix){
		case 1:
			affMedic(ordo);
			return true;
		case 2:
			searchMedic(ordo);
			return true;
		case 3:
			searchMedicById(ordo);
			return true;
		case 4:
			return false;
		case 0:
			for(Medicament medic:ordo)rollbackStock(medic);
			ordo.clear();
			return false;
		default :
			return true;
		}
	}
	private void affMedic(ArrayList<Medicament> ordo) throws ClassNotFoundException, SQLException{
		DAOMedicament dm=new DAOMedicament();
		@SuppressWarnings("resource")
		Scanner scI=new Scanner(System.in);
		ArrayList<Medicament> list=dm.findAll();
		for(Medicament m:list)System.out.println(m);
		System.out.println("Saisir un id de m�dicament pour l'ajouter, 0 pour revenir � l'ordonnance");
		int choixMedic=scI.nextInt();
		if(choixMedic!=0){
			Medicament medic=dm.findById(choixMedic);
			System.out.println("Saisir la quantit� :");
			boolean qteOk=false;
			while(!qteOk){
				int qte=scI.nextInt();
				if(qte<=medic.getStock()){
					qteOk=true;
					medic.setStock(medic.getStock()-qte);
					dm.update(medic);
					medic.setStock(qte);
					ordo.add(medic);
				}
				else System.out.println("Stock insuffisant, saisir une nouvelle quantit�");
			}
		}
	}
	private void searchMedic(ArrayList<Medicament> ordo) throws ClassNotFoundException, SQLException{
		DAOMedicament dm=new DAOMedicament();
		@SuppressWarnings("resource")
		Scanner scI=new Scanner(System.in);
		@SuppressWarnings("resource")
		Scanner scS=new Scanner(System.in);
		System.out.println("Saisir les premi�res lettres du m�dicament :");
		ArrayList<Medicament> list=dm.findLike(scS.nextLine());
		for(Medicament m:list)System.out.println(m);
		System.out.println("Saisir un id de m�dicament pour l'ajouter, 0 pour revenir � l'ordonnance");
		int choixMedic=scI.nextInt();
		Medicament medic=dm.findById(choixMedic);
		System.out.println("Saisir la quantit� :");
		boolean qteOk=false;
		while(!qteOk){
			int qte=scI.nextInt();
			if(qte<=medic.getStock()){
				qteOk=true;
				medic.setStock(medic.getStock()-qte);
				dm.update(medic);
				medic.setStock(qte);
				ordo.add(medic);
			}
			else System.out.println("Stock insuffisant, saisir une nouvelle quantit�");
		}
	}
	private void searchMedicById(ArrayList<Medicament> ordo) throws ClassNotFoundException, SQLException{
		DAOMedicament dm=new DAOMedicament();
		@SuppressWarnings("resource")
		Scanner scI=new Scanner(System.in);
		System.out.println("Saisir le code du m�dicament :");
		Medicament medic=dm.findById(scI.nextInt());
		System.out.println(medic);
		System.out.println("Saisir la quantit� :");
		boolean qteOk=false;
		while(!qteOk){
			int qte=scI.nextInt();
			if(qte<=medic.getStock()){
				qteOk=true;
				medic.setStock(medic.getStock()-qte);
				dm.update(medic);
				medic.setStock(qte);
				ordo.add(medic);
			}
			else System.out.println("Stock insuffisant, saisir une nouvelle quantit�");
		}
	}
	private void rollbackStock(Medicament medic) throws ClassNotFoundException, SQLException{
		DAOMedicament dm=new DAOMedicament();
		Medicament medicStock=dm.findById(medic.getId());
		medicStock.setStock(medicStock.getStock()+medic.getStock());
		dm.update(medicStock);
	}
}
