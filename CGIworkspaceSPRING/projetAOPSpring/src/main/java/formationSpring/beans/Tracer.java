package formationSpring.beans;

import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Tracer {
	public void printAvant() {
			
		System.out.println("Methode ex�cut�e avant " + new Date());
		try {
			TimeUnit.SECONDS.sleep(5);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void printApres() {
		System.out.println("Methode ex�cut�e apres 5 secondes " + new Date()); 
	}

}
