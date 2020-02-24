package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import model.Article;

@Repository
public class DAOArticleImpl implements DAOArticle {

	@PersistenceContext
	private EntityManager em;

	@Override
	public Article findById(Integer id) {
		return em.find(Article.class, id);
	}

	@Override
	public List<Article> findAll() {
		Query query = em.createQuery("SELECT a from Article a");
		List<Article> list = query.getResultList();
		return list;
	}

	@Override
	@Transactional
	public void create(Article a) {
		em.persist(a);
	}

	@Override
	@Transactional
	public void update(Article a) {
		em.merge(a);
	}

	@Override
	@Transactional
	public void delete(Article a) {
		em.remove(em.find(Article.class, a.getId()));
	}

}
