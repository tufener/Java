package test;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import model.Hopital;
import model.Medecin;
import model.Patient;
import model.Salle;

public class test {

	public static void main(String[] args) {
//		testConnextion();
		testCreate();
//		testFindAll();
//		testFindPersonne();
//		testFindPersonnev2();
//		testFindDepartment();
//		testFindDepartmentv2();

	}

	static void testConnextion() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("pdbHopital");
		EntityManager em = emf.createEntityManager();

		System.out.println("Hello...");
		em.close();
		emf.close();
	}

	static void testCreate() {
		Medecin m1 = new Medecin(); 
		m1.setIdMedecin(1);
		m1.setNomMedecin("Dr.Pastouche");
		
		Medecin m2 = new Medecin(); 
		m2.setIdMedecin(2);
		m2.setNomMedecin("Dr.Touchepas");
		
		Salle s1 = new Salle(); 
		s1.setIdSalle(101);
		s1.setNomSalle("Urgence");
		Salle s2 = new Salle(); 
		s2.setIdSalle(500);
		s2.setNomSalle("Bloc opératoire");
		Salle s3 = new Salle(); 
		s3.setIdSalle(200);
		s3.setNomSalle("Chirurgie esthétique");
		
		Hopital h1 = new Hopital(); 
		h1.setIdHopital(1);
		h1.setNomHopital("Hopital Robert Schumann");
	
		
		
		Patient p1 = new Patient(); 
		p1.setId(1);
		p1.setNom("Jean");
		p1.setPrenom("Paul 2");
		p1.setAge(100);
		
		Patient p2 = new Patient(); 
		p2.setId(2);
		p2.setNom("Marco");
		p2.setPrenom("Polo");
		p2.setAge(350);
		
		Patient p3 = new Patient(); 
		p3.setId(3);
		p3.setNom("Djibril");
		p3.setPrenom("Cissé");
		p3.setAge(30);
		
		
		Collection<Hopital> colhopital1 = new ArrayList<Hopital>();
		colhopital1.add(h1);
		
		
		Collection<Salle> colsalle1 = new ArrayList<Salle>();
		colsalle1.add(s1);
		colsalle1.add(s2);
		
		Collection<Salle> colsalle2 = new ArrayList<Salle>();
		colsalle2.add(s3);

		Collection<Patient> colpatient1 = new ArrayList<Patient>();
		colpatient1.add(p1);
		colpatient1.add(p2);
		
		Collection<Patient> colpatient2 = new ArrayList<Patient>();
		colpatient1.add(p3);
		
		
		
		p1.setHopital(colhopital1);
		p2.setHopital(colhopital1);
		p3.setHopital(colhopital1);
		
		h1.setSalles(colsalle1);
		h2.setSalles(colsalle2);
		h3.setSalles(colsalle2);
		
		m1.setSalles(s1);
		m2.setSalles(s2);
		m1.setSalles(s3);
		
		

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("pdbHopital");
		EntityManager em = emf.createEntityManager();

		EntityTransaction tx = em.getTransaction();
		tx.begin();

		em.persist(m1);
		em.persist(m2);
		em.persist(s1);
		em.persist(s2);
		em.persist(s3);
		em.persist(h1);
		em.persist(h2);
		em.persist(h3);
		em.persist(p1);
		em.persist(p2);
		em.persist(p3);
		

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
