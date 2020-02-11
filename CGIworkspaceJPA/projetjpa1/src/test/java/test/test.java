package test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;



public class test {

	public static void main(String[] args) {
		test() ;
	}
	
	static void test() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("pdb1");
		EntityManager em = emf.createEntityManager();
		
		System.out.println("coucou...");
		em.close();
		emf.close();
	}
	
	
	
}
