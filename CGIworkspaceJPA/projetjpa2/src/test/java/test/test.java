package test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import model.Adresse;
import model.Personne;

public class test {

	public static void main(String[] args) {
//		 testConnextion() ;
//		testCreate();
		testFind();
		
	}

	static void testConnextion() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("pdb2");
		EntityManager em = emf.createEntityManager();

		System.out.println("coucou...");
		em.close();
		emf.close();
	}

	static void testCreate() {

		Personne p = new Personne();
		p.setId(1);
		p.setAge(21);
		p.setNom("Maria");
		p.setPrenom("Liza");
		
		Adresse a = new Adresse("Rue Versaille", 83 , 75000); 
		p.setAdresse(a);


		EntityManagerFactory emf = Persistence.createEntityManagerFactory("pdb2");
		EntityManager em = emf.createEntityManager();

		EntityTransaction tx = em.getTransaction();
		tx.begin();

		em.persist(p);

		tx.commit();

		System.out.println("coucou...");
		em.close();
		emf.close();
	}

	

	static void testFind() {
	
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("pdb2");
		Personne p = null;
		EntityManager em = emf.createEntityManager();

		p = em.find(Personne.class, 1);
		System.out.println(p);
		
		if (em.contains(p))
			System.out.println("Existe");
		else
			System.out.println("N'existe pas");



		System.out.println(p.getNom());
		System.out.println(p.getAdresse());
		
		em.close();
		emf.close();
	}


}
