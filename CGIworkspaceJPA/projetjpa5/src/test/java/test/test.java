package test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.mysql.fabric.xmlrpc.base.Array;

import model.Project;
import model.Personne;

public class test {

	public static void main(String[] args) {
		testConnextion();
		testCreate();
//		testFindAll();
//		testFindPersonne();
//		testFindPersonnev2();
//		testFindDepartment();
//		testFindDepartmentv2();

	}

	static void testConnextion() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("pdb5");
		EntityManager em = emf.createEntityManager();

		System.out.println("Hello...");
		em.close();
		emf.close();
	}

	static void testCreate() {
		Project projet1 = new Project();
		projet1.setName("Gare de Lyon");
		
		projet1.setProject(1);
		Project projet2 = new Project();
		projet2.setName("Métro Rennes");
		
		projet2.setProject(2);
		Project projet3 = new Project();
		projet3.setName("Gare de Nancy");
		
		projet3.setProject(3);
		Project projet4 = new Project();
		projet4.setName("Aéroport Charles de Gaulle");
		
		projet4.setProject(4);

		Personne pers1 = new Personne();
		pers1.setAge(25);
		pers1.setId(1);
		pers1.setNom("Julie");
		pers1.setPrenom("Julia");
		Personne pers2 = new Personne();
		pers2.setAge(30);
		pers2.setId(2);
		pers2.setNom("Marie");
		pers2.setPrenom("Marion");
		Personne pers3 = new Personne();
		pers3.setAge(28);
		pers3.setId(3);
		pers3.setNom("Elyse");
		pers3.setPrenom("Elizabeth");

		Collection<Project> col1 = new ArrayList<Project>();
		col1.add(projet1);
		col1.add(projet2);

		Collection<Project> col2 = new ArrayList<Project>();
		col2.add(projet2);
		col2.add(projet4);

		pers1.setProjects(col1);
		pers2.setProjects(col2);
		pers3.setProjects(col2);

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("pdb5");
		EntityManager em = emf.createEntityManager();

		EntityTransaction tx = em.getTransaction();
		tx.begin();

		em.persist(projet1);
		em.persist(projet2);
		em.persist(projet3);
		em.persist(projet4);
		em.persist(pers1);
		em.persist(pers2);
		em.persist(pers3);

		tx.commit();

		System.out.println("coucou...");
		em.close();
		emf.close();
	}

//	static void testFindAll() {
//		EntityManagerFactory emf = Persistence.createEntityManagerFactory("pdb5");
//		EntityManager em = emf.createEntityManager();
//
//		Query query = em.createQuery("SELECT p from Personne p");
//		Query query2 = em.createQuery("SELECT p.nom from Personne p");
//		List<Personne> list = query.getResultList();
//		List<String> list2 = query2.getResultList();
//
//		System.out.println(list);
//		System.out.println(list2);
//
//		em.close();
//		emf.close();
//	}
//
////
//	static void testFindPersonne() {
//
//		EntityManagerFactory emf = Persistence.createEntityManagerFactory("pdb5");
//
//		EntityManager em = emf.createEntityManager();
//
//		Personne p = em.find(Personne.class, 2);
//
//		System.out.println(p.toString());
//		System.out.println(p.getId());
////		System.out.println(p.getPc().getModel()); //si on enleve les commentaires cette requete on pourra avoir les elements apres les close (em et emf) si non on aura pas acces 
//
//		if (em.contains(p))
//			System.out.println("Cette Personne Existe");
//		else
//			System.out.println("cette personne N'existe pas");
//
//		em.close();
//		emf.close();
//
////		System.out.println(p.getNom());
////		System.out.println(p.getId());
////		System.out.println(p.getPc().getSerialNumber());
////		System.out.println(p.getPc().getModel());
//	}
//
//	static void testFindPersonnev2() {
//
//		EntityManagerFactory emf = Persistence.createEntityManagerFactory("pdb5");
//
//		EntityManager em = emf.createEntityManager();
//
//		Personne p = em.find(Personne.class, 2);
//
//		System.out.println(p);
//
//		if (em.contains(p))
//			System.out.println("Cette Personne Existe");
//		else
//			System.out.println("cette personne N'existe pas");
//
//		em.close();
//		System.out.println(p.getDp());
//		emf.close();
//
//	}
//
//	static void testFindDepartment() {
//		EntityManagerFactory emf = Persistence.createEntityManagerFactory("pdb5");
//
//		EntityManager em = emf.createEntityManager();
//
//		Project c = em.find(Project.class, 75);
//		System.out.println(c.toString());
//
//		if (em.contains(c))
//			System.out.println("Ce departement Existe");
//		else
//			System.out.println("ce departement N'existe pas");
//
//		Collection<Personne> personne = c.getPersonne();
//		System.out.println(personne);
//
//		em.close();
//		emf.close();
//	}
//
//	static void testFindDepartmentv2() {
//		EntityManagerFactory emf = Persistence.createEntityManagerFactory("pdb5");
//
//		EntityManager em = emf.createEntityManager();
//
//		Project c = em.find(Project.class, 75);
//		System.out.println(c);
////		Collection<Personne> personne = c.getPersonne();
////		System.out.println(personne);
//
//		if (em.contains(c))
//			System.out.println("Ce departement Existe");
//		else
//			System.out.println("ce departement N'existe pas");
//
//		em.close();
//		emf.close();
//
////		Collection<Personne> personne = c.getPersonne();
//		System.out.println(c.getPersonne());
////		System.out.println(personne);
//	}

}
