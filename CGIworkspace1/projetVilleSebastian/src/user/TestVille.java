package user;
import model.Ville;

public class TestVille {

	public static void main(String[] args) {
		test();

	}

	public static void test(){
		Ville v1 = new Ville("Paris","Paris","France",8);
		Ville v2 = new Ville("Lyon", "Paris", "France", 2.8);
		Ville v3 = new Ville("Le Pontet", "Paris", "France", 0.03);
		Ville v4 = new Ville("New York", "Washington", "USA", 13);
		Ville[] vTab = {v1,v2,v3,v4};
		//for (Ville v:{v1,v2,v3,v4})
		for (Ville v:vTab)
			System.out.println(v);
	}
}
