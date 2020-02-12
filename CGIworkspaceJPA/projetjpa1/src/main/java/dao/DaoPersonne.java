package dao;

import model.Personne;

public interface DaoPersonne extends Dao<Personne, Integer>{
	void testFindAll() throws ClassNotFoundException;
	void testFindById() throws ClassNotFoundException;
	void testFindByName()throws ClassNotFoundException;

}
