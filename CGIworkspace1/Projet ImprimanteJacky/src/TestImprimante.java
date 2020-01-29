
public class TestImprimante {

	public static void main(String[] args) {
		testimprimante();

	}

	public static void testimprimante() {

		Poste P1 = new Poste("Poste1");
		Poste P2 = new Poste("Poste2");
		Poste P3 = new Poste("Poste3");

		P1.print("  hello  ");
		P2.print("  hello n°2  ");
		P3.print("  hello n°3  ");

	}

}
