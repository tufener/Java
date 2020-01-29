package user;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import model.Client;
import model.Commercial;
import model.EPole;

public class TestCommercial {

	public static void main(String[] args) {
		test();
	}
	
	private static void test(){
		HashMap<Commercial,ArrayList<Client>> sComm = generate();
		System.out.println("Choisir l'id d'un commercial :\n"+sComm.keySet());
		System.out.println(sComm.get(dupKey(scan())));
	}
	
	private static HashMap<Commercial,ArrayList<Client>> generate(){
		/*
		 * Crée et remplit la HashMap 
		 */
		HashMap<Commercial,ArrayList<Client>> sComm=new HashMap<Commercial,ArrayList<Client>>();
		Client c1=new Client("cl1", 175, EPole.Assurance);
		Client c2=new Client("cl2", 157, EPole.Auto);
		Client c3=new Client("cl3", 517, EPole.Banque);
		Client c4=new Client("cl4", 571, EPole.Auto);
		Client c5=new Client("cl5", 715, EPole.Banque);
		Client c6=new Client("cl6", 751, EPole.Assurance);
		Commercial cm1=new Commercial("nom1", "prenom1", 1);
		Commercial cm2=new Commercial("nom2", "prenom2", 2);
		sComm.put(cm1, new ArrayList<Client>());
		sComm.put(cm2, new ArrayList<Client>());
		sComm.get(cm1).add(c1);
		sComm.get(cm1).add(c3);
		sComm.get(cm1).add(c5);
		sComm.get(cm1).add(c2);
		sComm.get(cm2).add(c4);
		sComm.get(cm2).add(c6);
		return sComm;
	}
	private static int scan(){
		/*
		 * Choix du comercial au clavier
		 */
		Scanner sc=new Scanner(System.in);
		int choix=sc.nextInt();
		sc.close();
		return choix;
	}
	private static Commercial dupKey(int key){
		/*
		 * Crée une instance de recherche de commercial avec même id
		 */
		return new Commercial(key);
	}
}
