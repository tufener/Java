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
		return em.find(Personne.class, id);
	}

	@Override
	public List<Personne> findAll() {
		Query query = em.createQuery("SELECT p from Personne p");
		List<Personne> list = query.getResultList();
		return list;
	}

	@Override
	@Transactional
	public void create(Personne p) {
		em.persist(p);
	}

	@Override
	@Transactional
	public void update(Personne p) {
		em.merge(p);
	}

	@Override
	@Transactional
	public void delete(Personne p) {
		em.remove(em.find(Personne.class, p.getId()));
	}

	@Override
	public List<Personne> findByName(String nom) {
		Query query = em.createQuery("SELECT p from Personne p where p.nom=:nom");
		query.setParameter("nom", nom);
		List<Personne> list = query.getResultList();
		return list;
	}

}
