package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import model.Personne;


@Repository
public class DAOPersonneHib implements DAOPersonne {

	@PersistenceContext
	private EntityManager em;
	
	@Override
	public Personne findById(Integer id) {
//		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//		EntityManagerFactory emf = (EntityManagerFactory) context.getBean("entityManagerFactory");
//		EntityManager em = emf.createEntityManager();
		Personne p = null;

		p = em.find(Personne.class, id);

//		em.close();
//		emf.close();
//		context.close();
		return p;
	}

	@Override
	public List<Personne> findAll() {
//		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//		EntityManagerFactory emf = (EntityManagerFactory) context.getBean("entityManagerFactory");
//		EntityManager em = emf.createEntityManager();

		Query query = em.createQuery("SELECT p from Personne p");
		List<Personne> list = query.getResultList();

//		em.close();
//		emf.close();
//		context.close();
		return list;
	}

	@Override
	@Transactional	
	public void create(Personne p) {
//		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//		EntityManagerFactory emf = (EntityManagerFactory) context.getBean("entityManagerFactory");
//		EntityManager em = emf.createEntityManager();
//
//		EntityTransaction tx = em.getTransaction();
//		tx.begin();

		// envoi l'objet dans la boite de persistance
		em.persist(p);

		// envoi en base
//		tx.commit();
//
//		em.close();
//		emf.close();
//		context.close();
	}

	@Override
	@Transactional	
	public void update(Personne p) {
//		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//		EntityManagerFactory emf = (EntityManagerFactory) context.getBean("entityManagerFactory");
//		EntityManager em = emf.createEntityManager();
//
//		EntityTransaction tx = em.getTransaction();
//		tx.begin();
		 em.merge(p);

//		tx.commit();
//
//		em.close();
//
//		emf.close();
//		context.close();
	}

	@Override
	@Transactional	
	public void delete(Personne p) {
//		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//		EntityManagerFactory emf = (EntityManagerFactory) context.getBean("entityManagerFactory");
//		EntityManager em = emf.createEntityManager();
//
//		EntityTransaction tx = em.getTransaction();
//		tx.begin();
		
		em.remove(em.find(Personne.class, p.getId()));

//		tx.commit();
//
//		em.close();
//		emf.close();
//		context.close();
	}

	@Override
	public List<Personne> findByName(String nom) {
//		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//		EntityManagerFactory emf = (EntityManagerFactory) context.getBean("entityManagerFactory");
//		EntityManager em = emf.createEntityManager();

		Query query = em.createQuery("SELECT p from Personne p where p.nom=:nom");
		query.setParameter("nom", nom);
		List<Personne> list = query.getResultList();

//		em.close();
//		emf.close();
//		context.close();
		return list;
	}

}
