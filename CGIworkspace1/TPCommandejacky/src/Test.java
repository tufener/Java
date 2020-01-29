
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

		Scanner clavier = new Scanner(System.in);
		System.out.print("Bonjour, Quel est votre nom:");
		String nom = clavier.nextLine();

		System.out.println("Veuillez saisir votre commande: \nQuelle boisson voulez vous?");
		EBoisson[] tab=EBoisson.values();
		for (EBoisson b : tab)
			System.out.println(b.toString());
		String boisson = clavier.nextLine();

		System.out.println("\nQuel plat(repas) voulez vous?");
		for (EPlat b : EPlat.values())
			System.out.println(b.toString());
		String plat = clavier.nextLine();

		System.out.println("\nQuel dessert voulez vous?");
		for (EDessert b : EDessert.values())
			System.out.println(b.toString());
		String dessert = clavier.nextLine();
		EBoisson e=EBoisson.valueOf(boisson);
		Commande C1 = new Commande(nom,e , EPlat.valueOf(plat), EDessert.valueOf(dessert));

		String result = "";
		do {
			System.out.println("\n Que voulez vous: A ou B?\nA: Prix total\nB: Détail facture");
			result = clavier.nextLine();
			if (result.equals("A")) {
				System.out.println("\nLe prix total est " + C1.getPrixTotale() + " €");
			} else if (result.equals("B")) {
				System.out.println("\n" + C1.toString() );
			} else
				System.out.println("\nje n'ai pas compris (Saisir A ou B)");

		} while (!result.equals("A") && !result.equals("B"));
		
		
		clavier.close();
	}
}
