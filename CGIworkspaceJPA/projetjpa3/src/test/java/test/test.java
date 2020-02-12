package test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import model.Computer;
import model.Personne;

public class test {

	public static void main(String[] args) {
//		testConnextion() ;
//		testCreate();
//		testFindPersonne();
		testFindComputer(); 

	}

	static void testConnextion() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("pdb3");
		EntityManager em = emf.createEntityManager();

		System.out.println("Hello...");
		em.close();
		emf.close();
	}

	static void testCreate() {

		Computer c = new Computer();
		c.setSerialNumber("ADSD");
		c.setModel("Dell");

		Personne p = new Personne();
		p.setId(3);
		p.setAge(32);
		p.setNom("Marie");
		p.setPrenom("Marine");

		p.setPc(c);

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("pdb3");
		EntityManager em = emf.createEntityManager();

		EntityTransaction tx = em.getTransaction();
		tx.begin();

		em.persist(c);
		em.persist(p);

		tx.commit();

		System.out.println("coucou...");
		em.close();
		emf.close();
	}

	static void testFindPersonne() {
	
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("pdb3");

		EntityManager em = emf.createEntityManager();

		Personne p = em.find(Personne.class, 2); 
		
		System.out.println(p.getNom());
		System.out.println(p.getId());
//		System.out.println(p.getPc().getModel()); //si on enleve les commentaires cette requete on pourra avoir les elements apres les close (em et emf) si non on aura pas acces 
		
		if (em.contains(p))
			System.out.println("Cette Personne Existe");
		else
			System.out.println("cette personne N'existe pas");



		em.close();
		emf.close();
		
		System.out.println(p.getNom());
		System.out.println(p.getId());
		System.out.println(p.getPc().getSerialNumber());
		System.out.println(p.getPc().getModel());
	}
	
	static void testFindComputer() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("pdb3");

		EntityManager em = emf.createEntityManager();

		Computer c = em.find(Computer.class, "AZERTY123"); 
//		System.out.println(c.getSerialNumber());
//		System.out.println(c.getModel());
//		System.out.println(c.getPersonne().getNom());
//		System.out.println(c.getPersonne().getId());
		
		if (em.contains(c))
			System.out.println("Ce pc Existe");
		else
			System.out.println("ce pc N'existe pas");


		em.close();
		emf.close();
		System.out.println(c.getSerialNumber());
		System.out.println(c.getModel());
		System.out.println(c.getPersonne().getNom());
		System.out.println(c.getPersonne().getId());
	}

}
