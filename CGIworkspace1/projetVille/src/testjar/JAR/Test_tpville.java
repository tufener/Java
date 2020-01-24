package testjar.JAR;
import villejar.JAR.Model_ville;

public class Test_tpville {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		test();
		
	}
	
	public static void test(){
		Model_ville v1 = new Model_ville("paris","Paris","France", 88);
		Model_ville v2 = new Model_ville("Lyon", "Paris", "France", 2.8);
		Model_ville v3 = new Model_ville("Le Pontet", "Paris", "France", 0.03);
		Model_ville v4 = new Model_ville("New York", "Washington", "USA", 13);
		Model_ville[] vTab = {v1,v2,v3,v4};
		//for (Ville v:{v1,v2,v3,v4})
		for (Model_ville v : vTab)
			System.out.println(v);
	}
	
	
	
}
