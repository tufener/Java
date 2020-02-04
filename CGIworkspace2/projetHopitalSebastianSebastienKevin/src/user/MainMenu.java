package user;
import model.*;
import dao.*;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

public class MainMenu {

	public static void main(String[] args) throws IOException, ClassNotFoundException, SQLException {
		SgHopital.getInstance();
		while(true)authMenu();
	}
	private static void authMenu() throws IOException, ClassNotFoundException, SQLException{
		int metier=-1;
		Employe user=null;
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		
		//boucle sur l'auth tant que l'utilisateur n'est pas trouvé (metier toujours à -1)
		while(metier==-1){
			System.out.println("Merci de vous identifier.\nIdentifiant :");
			String id=sc.nextLine();
			if(id.equals("0"))System.exit(0);
			System.out.println("Mot de passe :");
			String mdp=sc.nextLine();
			user=auth(id,mdp);
			if(user!=null){
				metier=user.getMetier();
				System.out.println("Bonjour "+((user.getMetier()!=0)?"docteur ":"")+user.getNom()+".");
			}
			else System.out.println("Identifiants incorrects.");

		}
		Menu menu;
		switch(metier){
			case 0:menu=new SecMenu(user);break;
			case 1:
			case 2:menu=new MedMenu(user);break;
			default:menu=null;
		}
		menu.affMenu();
	}
	private static Employe auth(String id,String mdp) throws ClassNotFoundException, SQLException{
		DAOAuth da=new DAOAuth();
		Employe emp=da.findById(id);
		if(emp==null)return null;
		if(emp.getMdp().equals(mdp))return emp;
		return null;
	}
}
