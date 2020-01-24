package projetCommercial;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class Test {

	public static void main(String[] args) {
		test1();

	}

	static void test1() {
		
		Commercial co1 = new Commercial(1, "Lisa", "Marianna");
		Commercial co2 = new Commercial(2, "Hugo", "Cadir");
		Commercial co3 = new Commercial(3, "Marco", "Polo");
		Commercial co4 = new Commercial(4, "Antoine", "Exup�ry");
		Commercial co5 = new Commercial(5, "Cardinal", "Chef");

		HashMap<Commercial, ArrayList<Client>> hm = new HashMap<Commercial, ArrayList<Client>>();
		Client c1 = new Client("Mercedes-Benz", 250000, EPole.Auto);
		Client c2 = new Client("Audi", 150000, EPole.Auto);
		Client c3 = new Client("Cr�dit Agricole", 2500, EPole.Banque);
		Client c4 = new Client("AXA", 100, EPole.Assurance);
		Client c5 = new Client("Volkswagen", 245000, EPole.Auto);

		ArrayList<Client> list1 = new ArrayList<Client>();
		list1.add(c1);
		list1.add(c2);
		ArrayList<Client> list2 = new ArrayList<Client>();
		list2.add(c3);
		list2.add(c4);
		list2.add(c5);
		hm.put(co1, list1);
		hm.put(co2, list1);
		hm.put(co3, list2);
		hm.put(co4, list2);
		hm.put(co5, list1);
		
		System.out.println("Liste des commerciaux: ");
		System.out.println(hm.keySet());
		Scanner sc = new Scanner(System.in);
		int id = sc.nextInt();
		Commercial tmp = new Commercial(id, "","");
		System.out.println(hm.get(tmp));
		
//		System.out.println("Liste des commerciaux:");
//		Set<Commercial> cles = hm.keySet();
//		for (Commercial c : cles)
//			System.out.println(c);
//		Scanner sc = new Scanner(System.in);
//		int id = sc.nextInt();
//		Commercial tmp = new Commercial(id, "", "");
//		ArrayList<Client> res = hm.get(tmp);
//		for (Client cli : res)
//			System.out.println(cli);
		
		

	}

}
