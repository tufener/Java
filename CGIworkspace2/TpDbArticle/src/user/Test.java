package user;

import java.sql.SQLException;

import model.Db;


public class Test {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//insertv2();
		//select();
		//selectById();
		//selectByNom();
		//update();
		//delete();
		

	}
	
	static void select() throws ClassNotFoundException, SQLException{
		System.out.println(Db.selectAll());
	}
	
	static void selectById() throws ClassNotFoundException, SQLException{
	System.out.println(Db.selectById(5));
	
	}

	static void insertv2() throws ClassNotFoundException, SQLException {
		Db.insert( "Audi", "Vehicule");
		Db.insert("Hp", "Pc");
		Db.insert("Porsche", "Vehicule");
		Db.insert("Tesla", "Entreprise");
		

	}

	static void update() throws ClassNotFoundException, SQLException {
		// Traitement
		int x = 4;
		String y = "Dell";
		String z = "PC";
		Db.update(x,y,z);

	}

	static void delete() throws ClassNotFoundException, SQLException {
		// Traitement
		int x = 4;
		Db.delete(x);

	}

}
