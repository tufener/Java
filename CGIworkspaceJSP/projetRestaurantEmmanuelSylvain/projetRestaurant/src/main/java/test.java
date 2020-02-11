import model.*;

import java.sql.SQLException;

import dao.*;

public class test {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		test();

	}

	static void test() throws ClassNotFoundException, SQLException {
		DaoClient d = new DaoClient();
		Client c = new Client("ee","ee","ee","ee","ee");
		d.create(c);
	}

}
