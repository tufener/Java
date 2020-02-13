package test;

import java.util.Collection;
import java.util.List;

import javax.persistence.*;
import model.*;

public class Test {

	public static void main(String[] args) {
//		testCreate();
		testFindDepartementv2();
	}

	public static void testConnexion() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("pdb4");
		EntityManager em = emf.createEntityManager();

		em.close();
		emf.close();
	}

	public static void testCreate() {
		Departement d91 = new Departement();
		d91.setId(91);
		d91.setNom("Essonne");

		Departement d56 = new Departement();
		d56.setId(56);
		d56.setNom("Morbihan");

		Personne p1 = new Personne();
		p1.setId(1);
		p1.setAge(11);
		p1.setNom("Dupond");
		p1.setPrenom("Toto");
		p1.setDepartement(d91);

		Personne p2 = new Personne();
		p2.setId(2);
		p2.setAge(12);
		p2.setNom("Dupond");
		p2.setPrenom("Tutu");
		p2.setDepartement(d91);

		Personne p3 = new Personne();
		p3.setId(3);
		p3.setAge(13);
		p3.setNom("Dupond");
		p3.setPrenom("Tata");
		p3.setDepartement(d56);

		Personne p4 = new Personne();
		p4.setId(4);
		p4.setAge(14);
		p4.setNom("Dupond");
		p4.setPrenom("Titi");
		p4.setDepartement(d56);

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("pdb4");
		EntityManager em = emf.createEntityManager();

		EntityTransaction tx = em.getTransaction();
		tx.begin();

		em.persist(d91);
		em.persist(d56);
		em.persist(p1);
		em.persist(p2);
		em.persist(p3);
		em.persist(p4);

		tx.commit();

		em.close();
		emf.close();
	}

	public static void testFindPersonne() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("pdb4");
		EntityManager em = emf.createEntityManager();

		Personne p1 = em.find(Personne.class, 4);

		System.out.println(p1);

		em.close();
		emf.close();
	}

	public static void testFindDepartement() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("pdb4");
		EntityManager em = emf.createEntityManager();

		Departement d56 = em.find(Departement.class, 56);

		System.out.println(d56);

		em.close();
		emf.close();

		Collection<Personne> collection = d56.getPersonnes();

	}
	
	public static void testFindDepartementv2() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("pdb4");
		EntityManager em = emf.createEntityManager();

		Departement d56 = em.find(Departement.class, 56);

		System.out.println(d56);

		em.close();
		emf.close();

		Collection<Personne> collection = d56.getPersonnes();
		System.out.println(collection);

	}

	@SuppressWarnings("unchecked")
	public static void testFindAll() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("pdb4");
		EntityManager em = emf.createEntityManager();

		Query query = em.createQuery("SELECT p from Personne p");
		List<Personne> liste = query.getResultList();

			System.out.println(affiche(liste));

		em.close();
		emf.close();
	}

	private static String affiche(Collection<Personne> collection) {
		String res = "";
		for (Personne p : collection)
			res += p + "\n";
		return res;
	}
	
	private static String affiche(List<Personne> liste) {
		String res = "";
		for (Personne p : liste)
			res += p + "\n";
		return res;
	}
}
