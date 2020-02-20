package test;

import java.util.List;

import dao.*;
import model.*;
public class Test2 {

	public static void main(String[] args) {
		//testCreate();
		//testFindById();
		//testUpdate();
		//testFindAll();
		//testDelete();
		//testFindAll();
		testFindByName();

	}

	private static void testCreate() {
		Personne personne = new Personne(10, "César", "Jules", 48);
		new PersonneDaoHib().create(personne);
	}

	private static void testFindAll() {
		List<Personne> list = new PersonneDaoHib().findAll();
		System.out.println(list);
	}

	private static void testFindById() {
		Personne p = new PersonneDaoHib().findById(10);
		System.out.println(p);
	}

	private static void testUpdate() {
		Personne personne = null;
		PersonneDaoHib dao = new PersonneDaoHib();
		personne = dao.findById(1);
		personne.setAge(30);
		dao.update(personne);
	}

	private static void testDelete() {
		new PersonneDaoHib().delete(new Personne(10, "", "", 0));
	}

	private static void testFindByName() {
		List<Personne> list = new PersonneDaoHib().findByName("dupond");
		System.out.println(list);
	}

}
