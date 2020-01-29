package projetSingleton;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test2();

	}
	
	static void test2(){
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		System.out.println(s1.getPrix());
		
	}
	static void test1(){
//		p1 = new Personne();
//		p2 = new Personne();
//		System.out.println(p1);
//		System.out.println(p2);
	
	}

}
