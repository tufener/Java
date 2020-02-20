package projetSpringJPA1.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Repository;

import projetSpringJPA1.entity.Personne;

@Repository
public class PersonneDaoImpl implements PersonneDao {
	@PersistenceContext
	private EntityManager em;

	@Override
	public List<Personne> findAll() {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		EntityManagerFactory emf = (EntityManagerFactory) context.getBean("entityManagerFactory");
		EntityManager em = emf.createEntityManager();

		Query query = em.createQuery("SELECT p from Personne p");
		List<Personne> list = query.getResultList();

		em.close();
		emf.close();
		context.close();
		return list;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Personne> findAllv2() {
		return em.createQuery("Select p from Personne p").getResultList();
	}

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
