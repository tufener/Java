package Test;

import model.*;
import dao.*;

import java.text.SimpleDateFormat;
import java.util.List;

public class MainFormationDaoJpa {

	public static void main(String[] args) throws Exception {

		PersonneDao dao1 = new PersonneDaoJdbcMysql();
		PersonneDao dao2 = new PersonneDaoJdbcOracle();
		testFindByRange(dao1, 10, 20);
		testFindByRange(dao2, 10, 20);

	}

	static void testFindByRange(PersonneDao dao, int a, int b) {
		List<Personne> personnes = dao.findByRange(a, b);
	}

}
