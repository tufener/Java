package test;

import javax.persistence.*;

import java.util.*;
import model.*;



public class test {

	public static void main(String[] args) {
		testNamedQuery() ;
	}
	
	static void testNamedQuery() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("pdb1");
		EntityManager em = emf.createEntityManager();
		
		Query query = em.createNamedQuery("Personne.findAll2");
		
		List<Personne> retour = query.getResultList();
		System.out.println(retour);
		em.close();
		emf.close();
	}
	
	static void testCreatev2(){
	
		Personne p1 = new Personne (3,"dupond", "titi", 10);
		p1.setAge(12);
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("pdb1");
		EntityManager em = emf.createEntityManager();
		
		p1.setAge(13);
		
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		
		p1.setAge(14);
		p1.setNom("titi");
		
		em.persist(p1);
		tx.commit();
		
		p1.setAge(15);
		
		
		
		em.close();
		emf.close();
	}
	
	static void testMergev2(){//modif
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("pdb1");
		Personne p = null;
		EntityManager em = emf.createEntityManager();
		
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		
		p=em.find(Personne.class, 1 );
		p.setAge(27);
		

		//tx.commit();
		em.close();
		
		EntityManager em2 = emf.createEntityManager();
		EntityTransaction tx2 = em2.getTransaction();
		tx2.begin();
		p=em2.merge(p);
		tx2.commit();
		em2.close();
		emf.close();
	}
	
	static void testMergev1(){//creation
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("pdb1");
		Personne p = new Personne(1,"aa","bb",10);
		EntityManager em = emf.createEntityManager();
		
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		
		em.merge(p);
		

		
		tx.commit();
		em.close();
		emf.close();
	}
	
	static void testFindAll(){
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("pdb1");
		EntityManager em = emf.createEntityManager();
		Query query = em.createQuery("SELECT p from Personne p");
		List<Personne> list = query.getResultList();
		em.close();
		emf.close();
		for(Personne p : list)
			System.out.println(p);
		
		
	}
	
	static void testRemove(){
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("pdb1");
		Personne p = null;
		EntityManager em = emf.createEntityManager();
		
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		
		p=em.find(Personne.class, 1);
		em.remove(p);

		
		tx.commit();
		em.close();
		emf.close();
	}
	
	static void testModif(){
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("pdb1");
		Personne p = null;
		EntityManager em = emf.createEntityManager();
		
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		
		p=em.find(Personne.class, 1);
		p.setAge(26);
	

		
		tx.commit();
		em.close();
		emf.close();
	}
	
	static void testFind(){
		Personne p2 = new Personne(40,"aa","bb",10);
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("pdb1");
		Personne p1 = null;
		EntityManager em = emf.createEntityManager();
		
		p1=em.find(Personne.class, 10);
		if(em.contains(p1))
			System.out.println("OK");
		else
			System.out.println("KO");
		
		if(em.contains(p2))
			System.out.println("OK");
		else
			System.out.println("KO");
		
		System.out.println(em.contains(p1));
		System.out.println(em.contains(p2));
		
		
		em.close();
		emf.close();
	}
	
	static void testCreate(){
		Personne p = new Personne (1,"aa", "bb",10);
		Personne p1 = new Personne (10,"dupond", "titi", 10);
		Personne p2 = new Personne (15,"dupond", "tutu", 15);
		Personne p3 = new Personne (20,"dupond", "abcd", 20);
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("pdb1");
		EntityManager em = emf.createEntityManager();
		
		EntityTransaction tx = em.getTransaction();//transaction pour les ecritures en base
		tx.begin();
		
		em.persist(p);
		em.persist(p1);//envoie personne dans le contexte de persistance(boite)
		em.persist(p2);
		em.persist(p3);
		
		tx.commit();// envoie ce qui se trouve dans la boite en base de donnée
		
		
		em.close();
		emf.close();
	}
	
	static void testConnexion() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("pdb1");
		EntityManager em = emf.createEntityManager();
		
		System.out.println("coucou");
		em.close();
		emf.close();
	}
	
	
	
}
