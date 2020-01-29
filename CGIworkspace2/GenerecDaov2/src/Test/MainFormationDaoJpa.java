package Test;

import model.*;
import dao.*;

import java.text.SimpleDateFormat;

public class MainFormationDaoJpa {

	public static void main(String[] args) throws Exception {

		PersonneDao personneDao = new PersonneDaoJdbc();
		Personne p = new Personne(10, "a", "b");
		VoitureDao voitureDao = new VoitureDaoJdbc();
		Voiture v = new Voiture("aaaa", "renault");
		
		create(personneDao,p);
		create(voitureDao,v);

	}

	static void create(Dao dao, Object o) {
		dao.create(o);
	}

}
