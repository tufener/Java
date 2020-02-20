package formationSpring.beans;

import java.util.Date;

public class Aspect {
	private void PrintBefore(){
		System.out.println("succès avant : " + new Date());
	}
	
	private void PrintAfter(){
		System.out.println("succès aprés : " + new Date());
	}
}
