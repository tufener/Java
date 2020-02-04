package user;

import java.sql.SQLException;
import java.util.ArrayList;

import dao.AuthentificationDaoJdbc;

import model.Employe;

public class TestEmploye {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// testFindAll();
		// testFindById();
		// testCreate();
		// testUpdate();
		// testDelete();
		testFindByLogin();
	}

	static void testFindAll() throws ClassNotFoundException, SQLException {

		ArrayList<Employe> ale = new AuthentificationDaoJdbc().findAll();

		for (Employe e : ale)
			System.out.println(e);
	}

	public static void testFindById() throws ClassNotFoundException, SQLException {
		Employe e = new AuthentificationDaoJdbc().findById("secr1");
		if (e != null)
			System.out.println(e);
		else
			System.out.println("personne inexistante");
	}

	public static void testCreate() throws ClassNotFoundException, SQLException {
		Employe e = new Employe("secr3", "mdp", "Jean Hubert", 0);
		new AuthentificationDaoJdbc().create(e);
		testFindAll();
	}
	
	public static void testUpdate() throws ClassNotFoundException, SQLException {
		Employe e =new Employe ("secr3", "mdp", "John Henry", 0);
		new AuthentificationDaoJdbc().update(e);
		testFindAll();
	}
	
	public static void testDelete() throws ClassNotFoundException, SQLException {
		Employe e =new Employe ("secr3", "", "", 0);
		new AuthentificationDaoJdbc().delete(e);
		testFindAll();
	}
	
	public static void testFindByLogin()  {
		Employe em= null;
		em = new AuthentificationDaoJdbc().findByLogin("med1", "mdp");
		if (em != null)
			System.out.println(em);
		else
			System.out.println("personne inexistante");
	}
}