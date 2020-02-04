package user;

import java.sql.SQLException;
import java.util.ArrayList;

import dao.PatientDaoJdbc;
import dao.VisiteDaoJdbc;

import model.Visite;

public class TestVisite {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//testCreate();
		// testFindAll();
		//testFindById();
		// testFindByMedecin();
		// testFindByPatient();
		testUpdateOrdonnance();
	}
	static void testFindAll() throws ClassNotFoundException, SQLException {

		ArrayList<Visite> alv = new VisiteDaoJdbc().findAll();

		for (Visite v : alv)
			System.out.println(v);
	}

	public static void testFindById() throws ClassNotFoundException, SQLException {
		Visite v = new VisiteDaoJdbc().findById(0);
		if (v != null)
			System.out.println(v);
		else
			System.out.println("personne inexistante");
	}

	public static void testCreate(){
		Visite v = new Visite (10,1, "Dr claude");
		new VisiteDaoJdbc().create(v);
		//testFindAll();
	}
	
	public static void testUpdateOrdonnance() {
		VisiteDaoJdbc v = new VisiteDaoJdbc();
	v.updateOrdonnance(7,"novorapid 30",10);
		
	}
	
//	public static void testDelete() throws ClassNotFoundException, SQLException {
//		Visite v =new Visite (1, 1, "Dr Claude");
//		new VisiteDaoJdbc().delete(v);
//		testFindAll();
//	}
	
	public static void testFindByMedecin(){
		ArrayList <Visite> alv = new VisiteDaoJdbc().findByMedecin("Dr Claude");
		for (Visite v : alv)
			System.out.println(v);
	}
	public static void testFindByPatient(){
		ArrayList <Visite> alv = new VisiteDaoJdbc().findByPatient(1);
		for (Visite v : alv)
			System.out.println(v);
	}
}
