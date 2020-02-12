package test;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import model.Personne;

public class test {

	public static void main(String[] args) {
		testMergev2();
		// testModif();
	}

	static void test() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("pdb1");
		EntityManager em = emf.createEntityManager();

		em.close();
		emf.close();
	}

	static void testMergev2() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("pdb1");
		EntityManager em = emf.createEntityManager();

		Personne p = null;

		EntityTransaction entityTransaction = em.getTransaction();
		entityTransaction.begin();
		p = em.find(Personne.class, 1);
		System.out.println(p.getVersion());
		p.setAge(41);
		em.close();

		EntityManager em2 = emf.createEntityManager();
		EntityTransaction entityTransaction2 = em2.getTransaction();
		entityTransaction2.begin();
		p = em2.merge(p);

		entityTransaction2.commit();
		em2.close();
		emf.close();
	}

	static void testMergev1() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("pdb1");
		EntityManager em = emf.createEntityManager();

		Personne p = new Personne(4, "Castafiore", "La", 55);

		EntityTransaction entityTransaction = em.getTransaction();
		entityTransaction.begin();

		em.merge(p);

		entityTransaction.commit();

		em.close();
		emf.close();
	}

	static void testFindAll() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("pdb1");
		EntityManager em = emf.createEntityManager();

		Query query = em.createQuery("SELECT p from Personne p");
		Query query2 = em.createQuery("SELECT p.nom from Personne p");
		List<Personne> list = query.getResultList();
		List<String> list2 = query2.getResultList();

		System.out.println(list);
		System.out.println(list2);

		em.close();
		emf.close();
	}

	static void testRemove() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("pdb1");
		EntityManager em = emf.createEntityManager();

		EntityTransaction entityTransaction = em.getTransaction();
		entityTransaction.begin();

		Personne p = em.find(Personne.class, 4);
		em.remove(p);

		entityTransaction.commit();

		em.close();
		emf.close();
	}

	static void testModif() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("pdb1");
		EntityManager em = emf.createEntityManager();

		EntityTransaction entityTransaction = em.getTransaction();
		entityTransaction.begin();

		Personne p = em.find(Personne.class, 1);
		p.setAge(46);
		p.setAge(48);
		p.setAge(45);

		entityTransaction.commit();

		em.close();
		emf.close();
	}

	static void testFind() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("pdb1");
		EntityManager em = emf.createEntityManager();

		Personne p = em.find(Personne.class, 2);
		System.out.println(p);
		System.out.println(em.contains(p));

		em.close();
		emf.close();
	}

	static void testCreate() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("pdb1");
		EntityManager em = emf.createEntityManager();

		Personne p = new Personne(4, "Rastapopoulos", "Monsieur", 41);
		Personne p1 = new Personne(5, "Castafiore", "La", 55);

		EntityTransaction entityTransaction = em.getTransaction();
		entityTransaction.begin();

		em.persist(p);
		em.persist(p1);

		entityTransaction.commit();

		em.close();
		emf.close();
	}

}
