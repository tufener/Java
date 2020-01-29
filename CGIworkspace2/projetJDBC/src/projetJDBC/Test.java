package projetJDBC;

import java.sql.*;

public class Test {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//insert();
		//insertv2();
		//update();
		//delete();
		//select();
		//selectByNom();

	}
	
	static void selectByNom() throws ClassNotFoundException, SQLException{
		System.out.println(Db.selectByNom("p"));
	}
	
	static void select() throws ClassNotFoundException, SQLException{
		System.out.println(Db.select());
	}

	static void insert() throws ClassNotFoundException, SQLException {
		// Traitement
		int x = 25;
		String y = "Sachore";
		String z = "Emmanuel";
		Db.testInsert(x, y, z);

	}

	static void insertv2() throws ClassNotFoundException, SQLException {
		Db.testInsertv2(46, "Mala", "Piere");

	}

	static void update() throws ClassNotFoundException, SQLException {
		// Traitement
		int x = 0;
		String y = "dupond";
		String z = "jean";
		Db.testUpdate(x, y, z);

	}

	static void delete() throws ClassNotFoundException, SQLException {
		// Traitement
		int x = 45;
		Db.testDelete(x);

	}

}
