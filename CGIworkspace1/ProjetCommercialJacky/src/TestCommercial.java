import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class TestCommercial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Commercial com1 = new Commercial(1, "a", "b");
		Commercial com2 = new Commercial(2, "c", "d");

		HashMap<Commercial, ArrayList<Client>> hm = new HashMap<Commercial, ArrayList<Client>>();
		Client c1 = new Client("SG", Pole.Banque);
		Client c2 = new Client("CA", Pole.Banque);
		Client c3 = new Client("Peugeot", Pole.auto);
		Client c4 = new Client("Renault", Pole.auto);

		ArrayList<Client> list1 = new ArrayList<Client>();
		list1.add(c1);
		list1.add(c2);
		ArrayList<Client> list2 = new ArrayList<Client>();
		list2.add(c3);
		list2.add(c4);
		hm.put(com1, list1);
		hm.put(com2, list2);
		System.out.println("Liste des commerciaux: ");
		System.out.println(hm.keySet());
		Scanner sc = new Scanner(System.in);
		int id = sc.nextInt();
		Commercial tmp = new Commercial(id, "","");
		System.out.println(hm.get(tmp));
	}

}
