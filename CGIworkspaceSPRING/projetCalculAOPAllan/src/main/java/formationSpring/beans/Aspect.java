package formationSpring.beans;

import java.util.Date;

public class Aspect {
	private void PrintBefore(){
		System.out.println("succ�s avant : " + new Date());
	}
	
	private void PrintAfter(){
		System.out.println("succ�s apr�s : " + new Date());
	}
}
