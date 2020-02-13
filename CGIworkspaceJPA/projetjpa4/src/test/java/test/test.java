package test;

import java.util.Collection;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import model.Department;
import model.Personne;

public class test {

	public static void main(String[] args) {
//		testConnextion() ;
//		testCreate();
//		testFindAll();
//		testFindPersonne();
		testFindPersonnev2();
//		testFindDepartment();
//		testFindDepartmentv2();

	}

	static void testConnextion() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("pdb4");
		EntityManager em = emf.createEntityManager();

		System.out.println("Hello...");
		em.close();
		emf.close();
	}

	static void testCreate() {

		Department d1 = new Department();
		d1.setCP(75);
		d1.setNameCp("Paris");
		Department d2 = new Department();
		d2.setCP(94);
		d2.setNameCp("ivry / Seine");

		Personne p1 = new Personne();
		p1.setAge(25);
		p1.setId(1);
		p1.setNom("Julie");
		p1.setPrenom("Julia");
		Personne p2 = new Personne();
		p2.setAge(30);
		p2.setId(2);
		p2.setNom("Marie");
		p2.setPrenom("Marion");
		Personne p3 = new Personne();
		p3.setAge(28);
		p3.setId(3);
		p3.setNom("Elyse");
		p3.setPrenom("Elizabeth");

		p1.setDp(d1);
		p2.setDp(d2);
		p3.setDp(d1);

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("pdb4");
		EntityManager em = emf.createEntityManager();

		EntityTransaction tx = em.getTransaction();
		tx.begin();

		em.persist(d1);
		em.persist(d2);
		em.persist(p1);
		em.persist(p2);
		em.persist(p3);

		tx.commit();

		System.out.println("coucou...");
		em.close();
		emf.close();
	}

	static void testFindAll() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("pdb4");
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

//
	static void testFindPersonne() {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("pdb4");

		EntityManager em = emf.createEntityManager();

		Personne p = em.find(Personne.class, 2);

		System.out.println(p.toString());
		System.out.println(p.getId());
//		System.out.println(p.getPc().getModel()); //si on enleve les commentaires cette requete on pourra avoir les elements apres les close (em et emf) si non on aura pas acces 

		if (em.contains(p))
			System.out.println("Cette Personne Existe");
		else
			System.out.println("cette personne N'existe pas");

		em.close();
		emf.close();

//		System.out.println(p.getNom());
//		System.out.println(p.getId());
//		System.out.println(p.getPc().getSerialNumber());
//		System.out.println(p.getPc().getModel());
	}

	static void testFindPersonnev2() {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("pdb4");

		EntityManager em = emf.createEntityManager();

		Personne p = em.find(Personne.class, 2);

		System.out.println(p);

		if (em.contains(p))
			System.out.println("Cette Personne Existe");
		else
			System.out.println("cette personne N'existe pas");

		em.close();
		System.out.println(p.getDp());
		emf.close();

	}

	static void testFindDepartment() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("pdb4");

		EntityManager em = emf.createEntityManager();

		Department c = em.find(Department.class, 75);
		System.out.println(c.toString());

		if (em.contains(c))
			System.out.println("Ce departement Existe");
		else
			System.out.println("ce departement N'existe pas");

		Collection<Personne> personne = c.getPersonne();
		System.out.println(personne);

		em.close();
		emf.close();
	}

	static void testFindDepartmentv2() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("pdb4");

		EntityManager em = emf.createEntityManager();

		Department c = em.find(Department.class, 75);
		System.out.println(c);
//		Collection<Personne> personne = c.getPersonne();
//		System.out.println(personne);

		if (em.contains(c))
			System.out.println("Ce departement Existe");
		else
			System.out.println("ce departement N'existe pas");

		em.close();
		emf.close();

//		Collection<Personne> personne = c.getPersonne();
		System.out.println(c.getPersonne());
//		System.out.println(personne);
	}

}
