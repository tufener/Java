package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import model.Coordonnee;
import model.Hopital;
import model.Medecin;
import model.Patient;
import model.Salle;

public class test {

	public static void main(String[] args) {
		// testConnexion();
		// testCreate();
		// testFindPatientById();
		testFindAllPatients();
	}

	static void testConnexion() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("pdb1");
		EntityManager em = emf.createEntityManager();

		em.close();
		emf.close();
	}

	static void testCreate() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("pdb1");
		EntityManager em = emf.createEntityManager();

		Hopital h = new Hopital(1, "Robert Debré");

		Patient p = new Patient(1, "Capitaine Haddock");
		Coordonnee c = new Coordonnee("15 rue Paris", "0666666666");
		p.setCoordonnee(c);

		Patient p2 = new Patient(2, "Professeur Tournesol");
		Coordonnee c2 = new Coordonnee("78 rue de Nantes", "0666669999");
		p2.setCoordonnee(c2);

		h.setPatients(new ArrayList<Patient>(Arrays.asList(p, p2)));

		Medecin m = new Medecin(1, "Maboule");
		Salle s = new Salle(1, "Dragon Rouge");
		s.setHopital(h);
		m.setSalle(s);

		Medecin m2 = new Medecin(2, "Dolittle");
		Salle s2 = new Salle(2, "Orange Mécanique");
		s2.setHopital(h);
		m2.setSalle(s2);

		EntityTransaction entityTransaction = em.getTransaction();
		entityTransaction.begin();

		em.persist(p);
		em.persist(p2);

		em.persist(h);

		em.persist(s);
		em.persist(s2);

		em.persist(m);
		em.persist(m2);

		entityTransaction.commit();

		em.close();
		emf.close();
	}

	static void testFindPatientById() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("pdb1");
		EntityManager em = emf.createEntityManager();

		Patient p = em.find(Patient.class, 1);
		System.out.println(p);

		em.close();
		emf.close();
	}

	static void testFindAllPatients() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("pdb1");
		EntityManager em = emf.createEntityManager();

		Query query = em.createQuery("SELECT p from Patient p");
		List<Patient> list = query.getResultList();
		for (Patient patient : list) {
			System.out.println(patient);
		}

		em.close();
		emf.close();
	}

}
