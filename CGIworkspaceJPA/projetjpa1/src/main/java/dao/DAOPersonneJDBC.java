package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import model.Personne;

public class DAOPersonneJDBC implements DaoPersonne {

	public void testFindAll() throws ClassNotFoundException {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("pdb1");
		EntityManager em = emf.createEntityManager();
		Query query = em.createQuery("select p from Personne p");
		List<Personne> list = query.getResultList();

		em.close();
		emf.close();
		for (Personne p : list)
			System.out.println(p);

	}

	public void testFindById() throws ClassNotFoundException {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("pdb1");
		Personne p = null;
		EntityManager em = emf.createEntityManager();

		p = em.find(Personne.class, 2);
		System.out.println(p);
		if (em.contains(p))
			System.out.println("Existe");
		else
			System.out.println("N'existe pas");

		System.out.println("coucou...");
		em.close();
		emf.close();
	}

	public void testFindByName() throws ClassNotFoundException {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("pdb1");
		Personne p = null;
		EntityManager em = emf.createEntityManager();

		p = em.find(Personne.class, "Maria");
		System.out.println(p);
		if (em.contains(p))
			System.out.println("Existe");
		else
			System.out.println("N'existe pas");

		System.out.println("coucou...");
		em.close();
		emf.close();
	}

}
