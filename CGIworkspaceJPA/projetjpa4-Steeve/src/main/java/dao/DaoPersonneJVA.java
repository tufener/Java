package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import model.Personne;

public class DaoPersonneJVA implements DaoPersonne {

	@Override
	public void create(Personne p) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("pdb1");
		EntityManager em = emf.createEntityManager();

		EntityTransaction tx = em.getTransaction();
		tx.begin();

		em.persist(p);

		tx.commit();

		em.close();
		emf.close();

	}

	@Override
	public Personne findById(Integer id) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("pdb1");
		EntityManager em = emf.createEntityManager();
		Personne p = null;
		p = em.find(Personne.class, id);
		System.out.println(p);

		System.out.println(em.contains(p));

		em.close();
		emf.close();
		return p;
	}

	@Override
	public List<Personne> findAll() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("pdb1");
		EntityManager em = emf.createEntityManager();
		Query query = em.createQuery("SELECT p from Personne p");
		@SuppressWarnings("unchecked")
		List<Personne> list = query.getResultList();
		em.close();
		emf.close();

		return list;
	}

	@Override
	public void update(Personne p) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("pdb1");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();

		tx.begin();
		p = em.merge(p);
		tx.commit();

		em.close();
		emf.close();
	}

	@Override
	public void delete(Personne p) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("pdb1");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();

		tx.begin();
		p = em.find(Personne.class, p.getId());
		em.remove(p);

		tx.commit();
		em.close();
		emf.close();

	}

	@Override
	public List<Personne> findByName(String nom) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("pdb1");
		EntityManager em = emf.createEntityManager();
		Query query = em.createQuery("SELECT p from Personne p WHERE nom= :nom");
		query.setParameter("nom", nom);
		@SuppressWarnings("unchecked")
		List<Personne> list = query.getResultList();
		em.close();
		emf.close();
		return list;
	}

}
