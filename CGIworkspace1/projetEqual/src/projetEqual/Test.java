package projetEqual;

public class Test {

	public static void main(String[] args) {
		test1();

	}
	
	static void test2(){
		
		Personne p1 = new Personne("Jean", "Marc", 25);
		Personne p2 = new Personne("Claude", "Claudia", 28);
		Personne p3 = p1; // cast implicite
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());
		System.out.println(p3.hashCode());
	
	}
	
	static void test1(){
		// dans ce test (en enlevant la méthode equals dans la class personne) on va tester les références (p1,p2,p3) et non le contenue. 
		//mais ce n'est psa ce que l'on souhaite donc on redéfinie la méthode equals dans la class personne avec la générateur automatique
		// dans source "Generate hashcode and equals" ... 
		// dans le test 2 on test bien le contenue en générant la méthode equals
		Personne p1 = new Personne("Jean", "Marc", 25);
		Personne p2 = p1; // caste implicite mais on perd en lisibilite plus acces à p3
		Personne p3 = new Personne("Jean", "Marc", 25);
		
		if(p1.equals(p2))
			System.out.println("ok");
		else
			System.out.println("ko");
		
		if(p1.equals(p3)) // caste implicite
			System.out.println("ok");
		else
			System.out.println("ko");
	}

}
