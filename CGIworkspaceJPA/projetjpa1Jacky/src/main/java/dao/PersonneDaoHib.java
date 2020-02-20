package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import model.Personne;

public class PersonneDaoHib implements PersonneDao {
	
	public List<Personne> findByName(String name){
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("pdb1");
		EntityManager em = emf.createEntityManager();
		//Query query = em.createQuery("SELECT p from Personne p WHERE p.nom ='" + name + "'");
		Query query = em.createQuery("SELECT p from Personne p where p.nom=:nom");
		query.setParameter("nom", name);
		List<Personne> list = query.getResultList();
		em.close();
		emf.close();
		return list;
	}

	public Personne findById(Integer id) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("pdb1");
		Personne p1 = null;
		EntityManager em = emf.createEntityManager();
		p1=em.find(Personne.class, id);
		em.close();
		emf.close();
		return p1;
	}
	
	public List<Personne> findAll(){
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("pdb1");
		EntityManager em = emf.createEntityManager();
		Query query = em.createQuery("SELECT p from Personne p");
		List<Personne> list = query.getResultList();
		em.close();
		emf.close();
		return list;
	}
	
	public void create(Personne p){
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("pdb1");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		em.persist(p);
		tx.commit();
		em.close();
		emf.close();
	}
	
	public void update(Personne p){
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("pdb1");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		em.merge(p);
		tx.commit();
		em.close();
		emf.close();
	}
	
	public void delete(Personne p){
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("pdb1");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		em.remove(em.find(Personne.class, p.getId()));
		tx.commit();
		em.close();
		emf.close();
	}
}