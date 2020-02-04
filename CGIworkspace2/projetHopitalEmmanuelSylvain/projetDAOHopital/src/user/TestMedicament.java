package user;

import java.sql.SQLException;
import java.util.ArrayList;

import dao.AuthentificationDaoJdbc;
import dao.MedicamentDaoJdbc;
import dao.PatientDaoJdbc;
import model.Employe;
import model.Medicament;

public class TestMedicament {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//testFindAll();
		//testFindById();
		// testUpdateQte();
		 testCommencePar();
	}

	static void testFindAll()  {

		ArrayList<Medicament> alm = new MedicamentDaoJdbc().findAll();

		for (Medicament m : alm)
			System.out.println(m);
	}

	public static void testFindById()  {
		Medicament m = new MedicamentDaoJdbc().findById(1);
		if (m != null)
			System.out.println(m);
		else
			System.out.println("medicament inexistant");
	}

	
	
	public static void testUpdateQte() {
		MedicamentDaoJdbc m = new MedicamentDaoJdbc();
		m.updateQte(3, 90);
		
	}

	public static void testCommencePar()  {
		ArrayList <Medicament> alm = new MedicamentDaoJdbc().commencePar("doli");
		for (Medicament m : alm)
			System.out.println(m);
			
	}
}