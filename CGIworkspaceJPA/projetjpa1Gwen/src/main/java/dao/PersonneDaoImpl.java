package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import model.Personne;

public class PersonneDaoImpl implements PersonneDao {

	@Override
	public Personne findById(Integer pk) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("pdb1");
		EntityManager em = emf.createEntityManager();

		Personne p = em.find(Personne.class, pk);

		em.close();
		emf.close();
		return p;
	}

	@Override
	public List<Personne> findAll() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("pdb1");
		EntityManager em = emf.createEntityManager();

		Query query = em.createQuery("SELECT p from Personne p");
		List<Personne> list = query.getResultList();

		em.close();
		emf.close();
		return list;
	}

	@Override
	public void create(Personne obj) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("pdb1");
		EntityManager em = emf.createEntityManager();

		EntityTransaction entityTransaction = em.getTransaction();
		entityTransaction.begin();

		em.persist(obj);

		entityTransaction.commit();

		em.close();
		emf.close();
	}
	
	

	@Override
	public void update(Personne obj) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("pdb1");
		EntityManager em = emf.createEntityManager();

		EntityTransaction entityTransaction = em.getTransaction();
		entityTransaction.begin();

		em.merge(obj);

		entityTransaction.commit();

		em.close();
		emf.close();

	}

	@Override
	public void delete(Personne obj) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("pdb1");
		EntityManager em = emf.createEntityManager();

		EntityTransaction entityTransaction = em.getTransaction();
		entityTransaction.begin();

		Personne p = em.find(Personne.class, obj.getId());
		em.remove(p);

		entityTransaction.commit();

		em.close();
		emf.close();
	}

	@Override
	public List<Personne> findByName(String name) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("pdb1");
		EntityManager em = emf.createEntityManager();

		Query query = em.createQuery("SELECT p from Personne p where p.nom=:nom");
		query.setParameter("nom", name);
		List<Personne> list = query.getResultList();

		em.close();
		emf.close();
		return list;
	}

}
