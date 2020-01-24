package projetCommande;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		testFormationv5();

	}

	static void testFormationv5() {

		Scanner dc = new Scanner(System.in);
		System.out.println("Bonjour, quelle est votre nom ?");
		String nomsaisie = dc.nextLine();

		// Boisson
		System.out.println("-----------------------------------");
		Boisson[] tab = Boisson.values();
		System.out.println("Veuillez choisir votre commande, commençons pas la boisson:");
		for (Boisson boisson : tab)
			System.out.print(boisson.name() + ":" + boisson.getPrix() + "€" + "\t ");
		String choix = dc.nextLine();
		Boisson boisson = Boisson.valueOf(choix);

		// Plat
		System.out.println("-----------------------------------");
		Plat[] tab2 = Plat.values();
		System.out.println("Le plat ?");
		for (Plat plat : tab2)
			System.out.print(plat.name() + ":" + plat.getPrix() + "€" + "\t ");
		String choix2 = dc.nextLine();
		Plat plat = Plat.valueOf(choix2);

		// Dessert
		System.out.println("-----------------------------------");
		Dessert[] tab3 = Dessert.values();
		System.out.println("Le dessert ?");
		for (Dessert dessert : tab3)
			System.out.print(dessert.name() + ":" + dessert.getPrix() + "€" + "\t ");
		String choix3 = dc.nextLine();
		Dessert dessert = Dessert.valueOf(choix3);

		// Detail de la commande
		
		Commande commande = new Commande(nomsaisie, boisson, plat, dessert);
		System.out.println("-----------------------------------");
		System.out.println("Veuillez saisir votre choix:");
		System.out.print("A:");
		System.out.println(" Détail de la commande");
		System.out.print("B:");
		System.out.println(" Prix total");
		String saisieCommande = dc.nextLine();
	
		switch (saisieCommande) {
		case "A":
			System.out.println("-----------------------------");
			System.out.println("Detail de commande: " + "\n" + commande.toString()  + "\n" + "Le prix total est de: " + commande.getPrixTotal() + "€");
			break;
		case "B":
			System.out.println("-----------------------------");
			System.out.println("Le prix total est de: " + commande.getPrixTotal() + " €");
			break;
		default:
			System.out.println("-----------------------------");
			System.out.println("Mauvaise saisie...");
			break;
		}
		dc.close();

	}
}
