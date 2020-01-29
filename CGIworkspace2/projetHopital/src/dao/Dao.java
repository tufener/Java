package dao;

import java.sql.SQLException;
import java.util.List;

import model.Patient;

public interface Dao<T, PK> {
	T findById(PK id);
	T findByLogin(PK log);
	T findByName(PK name);
	List<T> findAll();
	void create(T obj);
	void update(T obj);
	void delete(T obj);
	boolean findByLoginAndPassword(String log, String pass) throws ClassNotFoundException;
	Patient findById(int id) throws SQLException, ClassNotFoundException;
	void create(String nom, String prenom, String complements) throws SQLException, ClassNotFoundException;
	Patient selectByInfo(String nom, String prenom, String complements) throws SQLException, ClassNotFoundException;
	Patient create(int id, String nom, String prenom, String complements) throws SQLException, ClassNotFoundException;

}
