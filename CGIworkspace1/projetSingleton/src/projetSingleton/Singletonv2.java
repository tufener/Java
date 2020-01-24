package projetSingleton;

public class Singletonv2 {

	private static Singletonv2 instance;

	// Constructor is 'protected'

	private Singletonv2() {
	}

	public static Singletonv2 getInstance() {
		// Uses lazy initialization.

		// Note: this is not thread safe.

		if (instance == null) {
			instance = new Singletonv2();
		}

		return instance;
	}

}
