package jpaSpring.dao;

import java.sql.SQLException;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import jpaSpring.entity.Personne;

public class DaoPersonneHib implements DaoPersonne{
	public List<Personne> find() throws ClassNotFoundException, SQLException {
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		EntityManagerFactory emf = (EntityManagerFactory) ctx.getBean("entityManagerFactory");
		EntityManager em = emf.createEntityManager();
		String QUERY="select p from personnes p";
		Query query = em.createQuery( QUERY ) ;
		@SuppressWarnings("unchecked")
		List<Personne> list=query.getResultList();
		em.close();
		emf.close();
		ctx.close();
		return list;
	}
	public Personne findById(Integer id) throws ClassNotFoundException, SQLException {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("pdb1");
		EntityManager em = emf.createEntityManager();
		Personne p=null;
		p=em.find(Personne.class, id);
		em.close();
		emf.close();
		return p;
	}
	public void create(Personne instance) throws ClassNotFoundException, SQLException {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("pdb1");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx=em.getTransaction();
		tx.begin();
		em.persist(instance);
		tx.commit();
		em.close();
		emf.close();	
	}
	public void update(Personne instance) throws ClassNotFoundException, SQLException {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("pdb1");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx=em.getTransaction();
		tx.begin();
		em.merge(instance);
		tx.commit();
		em.close();
		emf.close();
	}
	public void delete(Personne instance) throws ClassNotFoundException, SQLException {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("pdb1");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx=em.getTransaction();
		tx.begin();
		Personne p=em.find(Personne.class, instance.getId());
		em.remove(p);
		tx.commit();
		em.close();
		emf.close();
	}
	@Override
	public List<Personne> findByName(String name) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("pdb1");
		EntityManager em = emf.createEntityManager();
		String QUERY="select p from Personne p where p.nom=:name";
		Query query = em.createQuery( QUERY ) ;
		query.setParameter("name",name);
		@SuppressWarnings("unchecked")
		List<Personne> list=query.getResultList();
		em.close();
		emf.close();
		return list;
	}
}
