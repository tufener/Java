package model;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		test();
		

	}
	
	public static void test(){
		Poste p1 = new Poste ("Poste 1");
		Poste p2 = new Poste ("Poste 2");
		Poste p3 = new Poste ("Poste 3");
		
		p1.print("Hello");
		p2.print("Hello n°2");
		p3.print("Hello n°3");
		
		
	}
	

}
