package user;

import java.sql.SQLException;
import java.util.ArrayList;

import dao.PatientDaoJdbc;
import model.*;

public class TestPatient {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// testFindAll();
		 testFindById();
		//testCreate();
		// testUpdate();
		// testDelete();
		// testUpdateComplement();
	}

	static void testFindAll() throws ClassNotFoundException, SQLException {

		ArrayList<Patient> alp = new PatientDaoJdbc().findAll();

		for (Patient p : alp)
			System.out.println(p);
	}

	public static void testFindById() {
		Patient p = new PatientDaoJdbc().findById(1);
		if (p != null)
			System.out.println(p);
		else
			System.out.println("personne inexistante");
	}

	public static void testCreate() {
		Patient p = new Patient(10, "De la Martinière", "Jean Hubert", "");
		new PatientDaoJdbc().create(p);
	}

	public static void testUpdate() throws ClassNotFoundException, SQLException {
		Patient p = new Patient(10, "De la Martinière", "Jean Hubert", "Chateau de Versailles");
		new PatientDaoJdbc().update(p);
		//testFindAll();
	}

	public static void testUpdateComplement() {
		PatientDaoJdbc d = new PatientDaoJdbc();
		d.updateComplement(3, "065810368");
		// testFindAll();
	}

	public static void testDelete() throws ClassNotFoundException, SQLException {
		Patient p = new Patient(10, "", "", "");
		new PatientDaoJdbc().delete(p);
		testFindAll();
	}
}
