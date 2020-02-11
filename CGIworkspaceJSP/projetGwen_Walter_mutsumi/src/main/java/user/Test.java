package user;

import java.sql.SQLException;

import dao.DaoClientJdbc;
import model.Client;

public class Test {
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		// testClientCreate();
		testClientFindById();
	}

	static void testClientCreate() throws SQLException, ClassNotFoundException {
		Client c = new Client(1, "123", "Rspl", "Gwen", "Vincennes");
		new DaoClientJdbc().create(c);
	}

	static void testClientFindById() throws SQLException, ClassNotFoundException {
		Client c = new DaoClientJdbc().findById(1);
		System.out.println(c);
	}
}
