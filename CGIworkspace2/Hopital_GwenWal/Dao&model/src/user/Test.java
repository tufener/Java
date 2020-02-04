package user;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;

import model.Authentification;
import model.Medicament;
import model.Patient;
import dao.AuthentificationDaoJdbcMysql;
import dao.MedicamentDaoJdbcMysql;
import dao.PatientDaoJdbcMysql;
import dao.VisiteDaoJdbcMysql;
import model.Visite;

public class Test {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		test();
		// TODO Auto-generated method stub

	}

	static void test() throws ClassNotFoundException, SQLException {

		PatientDaoJdbcMysql test = new PatientDaoJdbcMysql();
	System.out.println(test.findAll());
		

	}
}
