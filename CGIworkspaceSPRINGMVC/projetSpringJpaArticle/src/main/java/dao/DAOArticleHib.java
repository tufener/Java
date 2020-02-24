package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import model.Article;


@Repository
public class DAOArticleHib implements DAOArticle {

	@PersistenceContext
	private EntityManager em;
	
	@Override
	public Article findById(Integer id) {
//		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//		EntityManagerFactory emf = (EntityManagerFactory) context.getBean("entityManagerFactory");
//		EntityManager em = emf.createEntityManager();
		Article p = null;

		p = em.find(Article.class, id);

//		em.close();
//		emf.close();
//		context.close();
		return p;
	}

	@Override
	public List<Article> findAll() {
//		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//		EntityManagerFactory emf = (EntityManagerFactory) context.getBean("entityManagerFactory");
//		EntityManager em = emf.createEntityManager();

		Query query = em.createQuery("SELECT p from Article p");
		List<Article> list = query.getResultList();

//		em.close();
//		emf.close();
//		context.close();
		return list;
	}

	@Override
	@Transactional	
	public void create(Article p) {
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
	public void update(Article p) {
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
	public void delete(Article p) {
//		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//		EntityManagerFactory emf = (EntityManagerFactory) context.getBean("entityManagerFactory");
//		EntityManager em = emf.createEntityManager();
//
//		EntityTransaction tx = em.getTransaction();
//		tx.begin();
		
		em.remove(em.find(Article.class, p.getId()));

//		tx.commit();
//
//		em.close();
//		emf.close();
//		context.close();
	}

	@Override
	public List<Article> findByName(String nom) {
//		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//		EntityManagerFactory emf = (EntityManagerFactory) context.getBean("entityManagerFactory");
//		EntityManager em = emf.createEntityManager();

		Query query = em.createQuery("SELECT p from Article p where p.nom=:nom");
		query.setParameter("nom", nom);
		List<Article> list = query.getResultList();

//		em.close();
//		emf.close();
//		context.close();
		return list;
	}

}
