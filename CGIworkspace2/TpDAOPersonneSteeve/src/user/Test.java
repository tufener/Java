package user;

import java.sql.SQLException;
import java.util.ArrayList;

import model.*;

public class Test {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// testCreate();
		testDelete();
	}

	public static void testSelectAll() throws ClassNotFoundException, SQLException {
		ArrayList<Personne> personnes = new DAOPersonne().selectAll();
		System.out.println("ID\tNom\tPrénom");
		for (Personne p : personnes)
			System.out.println(p);
	}

	public static void testFindById() throws ClassNotFoundException, SQLException {
		Personne p = new DAOPersonne().findById(4);
		System.out.println("ID\tNom\tPrénom");
		System.out.println(p);

	}

	public static void testCreate() throws ClassNotFoundException, SQLException {
		Personne p = new Personne(10, "Dupond", "Jacques-Michel");
		new DAOPersonne().create(p);
		testSelectAll();
	}

	public static void testUpdate() throws ClassNotFoundException, SQLException {
		Personne p = new Personne(10, "DOE", "John");
		new DAOPersonne().update(p);
		testSelectAll();
	}

	public static void testDelete() throws ClassNotFoundException, SQLException {
		new DAOPersonne().delete(10);
		testSelectAll();
	}

	public static void testFindByRange() throws ClassNotFoundException, SQLException {
		ArrayList<Personne> personnes = new DAOPersonne().findByRange(2, 3);
		System.out.println("ID\tNom\tPrénom");
		for (Personne p : personnes)
			System.out.println(p);
	}
}
