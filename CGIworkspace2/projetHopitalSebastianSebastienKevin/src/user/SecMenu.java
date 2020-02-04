package user;
import model.*;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;
import dao.DAOPatient;
import dao.DAOVisite;

public class SecMenu extends Menu{
	public SecMenu(Employe user){
		super(user);
		run=true;
	}
	public void affMenu() throws IOException, ClassNotFoundException, SQLException{
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		while(run){
			System.out.println("Saisir une fonctionnalit� :"
					+"\n1\tAjouter un patient"
					+"\n2\tAfficher la file d'attente"
					+"\n3\tSauvegarder la file d'attente"
					+"\n4\tCharger la file d'attente"
					+"\n5\tAjouter une note � un patient existant"
					+"\n6\tHistorique des visites d'un patient"
					+"\n\nSaisir 0 pour se d�connecter."
					);
			int choix=sc.nextInt();
			run=choix(choix);
		}
	}
	public boolean choix(int choix) throws IOException, ClassNotFoundException, SQLException{
		switch(choix){
			case 1: //ajout patient � la file d'attente
				clearConsole();
				addPatient();
				break;
			case 2: //aff file d'attente
				clearConsole();
				LinkedList<Patient> file=SgHopital.getInstance().getFile();
				System.out.println(file.size()+" patient"+((file.size()>1)?"s":"")+" en file d'attente");
				for(Patient p:file)System.out.println(p);;
				break;
			case 3: //save file d'attente
				clearConsole();
				SerialFile.serial(SgHopital.getInstance().getFile());;
				System.out.println("File d'attente sauvegard�e.");
				break;
			case 4:  //load file d'attente
				clearConsole();
				SgHopital.getInstance().setFile(SerialFile.deserial());
				System.out.println("File d'attente charg�e.");
				break;
			case 5: //Ajout/modif du champs compl�ment d'un patient
				clearConsole();
				complementPatient();
				break;
			case 6: //Historique des visites en bdd par patient
				clearConsole();
				affHisto();
				break;
			case 0: //d�co
				return false;
			default:
				clearConsole();
				System.out.println("Choix non valide");
				break;
		}
		return true;
	}
	public void addPatient() throws ClassNotFoundException, SQLException{
		@SuppressWarnings("resource")
		Scanner scS=new Scanner(System.in);
		@SuppressWarnings("resource")
		Scanner scI=new Scanner(System.in);
		System.out.println("Identifiant SS :");
		int ss=scI.nextInt();
		DAOPatient dp=new DAOPatient();
		Patient p = dp.findById(ss);
		if(p==null){
			System.out.println("Patient inconnu, saisir le nom :");
			String nom=scS.nextLine();
			System.out.println("Saisir le pr�nom :");
			String prenom=scS.nextLine();
			p=new Patient(ss,nom,prenom);
			dp.create(p);
		}
		SgHopital.getInstance().addPatient(p);
		System.out.println("Patient "+p.getNom()+" admis en salle d'attente.");
	}
	public void complementPatient() throws ClassNotFoundException, SQLException{
		@SuppressWarnings("resource")
		Scanner scI=new Scanner(System.in);
		@SuppressWarnings("resource")
		Scanner scS=new Scanner(System.in);
		DAOPatient dp=new DAOPatient();
		System.out.println("Saisir SS du patient � renseigner :");
		int ss=scI.nextInt();
		System.out.println("Saisir un compl�ment d'information :");
		String cpl=scS.nextLine();
		Patient p=dp.findById(ss);
		if(p!=null){
			p.setComplement(cpl);
			dp.update(p);
			System.out.println("Patient "+ss+" mis � jour.");
		}
		else System.out.println("Patient "+ss+" inconnu dans la base. Champs non mis � jour.");
	}
	
	//Affichage de l'historique des visites du patient par SS
	public void affHisto() throws ClassNotFoundException, SQLException{
		@SuppressWarnings("resource")
		Scanner scI=new Scanner(System.in);
		System.out.println("Saisir SS du patient � afficher :");
		ArrayList<Visite> histo=getHisto(scI.nextInt());
		if(histo.isEmpty())System.out.println("Aucune visite enregistr�e pour ce patient.");
		else{
			for(Visite v:histo)	System.out.println(v);
		}
	}
	public ArrayList<Visite> getHisto(int ss) throws ClassNotFoundException, SQLException{
		DAOVisite dv=new DAOVisite();		
		return dv.findVisitebyNumero(ss);
	}

}
