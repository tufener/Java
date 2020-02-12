package test;

import java.util.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import model.Personne;

public class test {

	public static void main(String[] args) {
		// testConnextion() ;
		// testCreate();
//		 testCreatev2();
		// testFind();
		// testModif();
		// testDelete();
		// testFindAll();
		// testMergev1() ;
		testNamedQuery();
	}

	static void testMergev2() {// ==>Mergev2 modif mise à jour

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("pdb1");
		Personne p = null;
		EntityManager em = emf.createEntityManager();

		EntityTransaction tx = em.getTransaction();
		tx.begin();
		p = em.find(Personne.class, 2);
		p.setAge(31);

		System.out.println("coucou...");

		em.close();

		EntityManager em2 = emf.createEntityManager();
		EntityTransaction tx2 = em2.getTransaction();
		tx2.begin();
		p = em2.merge(p);
		tx2.commit();
		em2.close();

		emf.close();
	}

	static void testMergev1() { // Mergev1 ==> crée la personne

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("pdb1");
		Personne p = new Personne(2, "Luisa", "Lisa", 30);
		EntityManager em = emf.createEntityManager();

		EntityTransaction tx = em.getTransaction();
		tx.begin();
		p = em.merge(p);

		tx.commit();

		System.out.println("coucou...");
		em.close();
		emf.close();
	}

	static void testFindAll() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("pdb1");
		EntityManager em = emf.createEntityManager();
		Query query = em.createQuery("select p from Personne p");
		List<Personne> list = query.getResultList();

		em.close();
		emf.close();
		for (Personne p : list)
			System.out.println(p);
	}

	static void testDelete() {

		Personne p2 = new Personne(12, "Mariana", "Elizabeth", 30);
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("pdb1");
		Personne p = null;
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();

		p = em.find(Personne.class, 2);
		System.out.println(p);
		if (em.contains(p)) {
			System.out.println("Existe");
			em.remove(p);
			tx.commit();

		} else
			System.out.println("N'existe pas");

		System.out.println("---------------------------");
		System.out.println(p2);

		if (em.contains(p2)) {
			System.out.println("Existe");
			em.remove(p);
			tx.commit();
		} else
			System.out.println("N'existe pas dans la base ni boite de Persistence");

		System.out.println("coucou...");
		em.close();
		emf.close();
	}

	static void testModif() {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("pdb1");
		Personne p = null;
		EntityManager em = emf.createEntityManager();

		EntityTransaction tx = em.getTransaction();

		tx.begin();
		p = em.find(Personne.class, 2);
		p.setAge(24);
		tx.commit();

		System.out.println("coucou...");
		em.close();
		emf.close();
	}

	static void testConnextion() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("pdb1");
		EntityManager em = emf.createEntityManager();

		System.out.println("coucou...");
		em.close();
		emf.close();
	}

	static void testCreate() {

		Personne p = new Personne(3, "Marie", "Maria", 32);
		Personne p2 = new Personne(4, "Lisa", "Louise", 28);
//		p.setId();
//		p.setNom();
//		p.setPrenom();
//		p.setAge();

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("pdb1");
		EntityManager em = emf.createEntityManager();

		EntityTransaction tx = em.getTransaction();
		tx.begin();

		em.persist(p);
		em.persist(p2);

		tx.commit();

		System.out.println("coucou...");
		em.close();
		emf.close();
	}

	static void testCreatev2() {

		Personne p = new Personne(10, "Marie", "Maria", 32);
		p.setAge(25);
//		p.setId();
//		p.setNom();
//		p.setPrenom();
//		p.setAge();

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("pdb1");
		EntityManager em = emf.createEntityManager();
		p.setAge(22);
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		p.setAge(20); // c'est cette âge que l'on prendra en compte car la derinière information ...
						// et il est avant le commit.
		em.persist(p);

		tx.commit();
		
		p.setAge(19); // cette âge est en mémoire mais ne sera pas modifié car il est après le
						// commit...
		System.out.println("coucou...");
		em.close();
		emf.close();
	}

	static void testFind() {
		Personne p2 = new Personne(12, "Mariana", "Elizabeth", 30);
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("pdb1");
		Personne p = null;
		EntityManager em = emf.createEntityManager();

		p = em.find(Personne.class, 2);
		System.out.println(p);
		if (em.contains(p))
			System.out.println("Existe");
		else
			System.out.println("N'existe pas");

		System.out.println("---------------------------");
		System.out.println(p2);
		if (em.contains(p2))
			System.out.println("Existe");
		else
			System.out.println("N'existe pas dans la base ni boite de Persistence");

		System.out.println("coucou...");
		em.close();
		emf.close();
	}

	static void testNamedQuery() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("pdb1");
		EntityManager em = emf.createEntityManager();

		Query query = em.createNamedQuery("Personne.findAll");

		List<Personne> retour = query.getResultList();
		System.out.println(retour);
		em.close();
		emf.close();
	}

}
