package dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Visite;

public interface DaoVisite extends Dao<Visite, Long> {
	ArrayList<Visite> historiquePatient(int idPatient) throws ClassNotFoundException, SQLException;

	Visite findById(Long id) throws ClassNotFoundException, SQLException;

	List<Visite> findAll() throws ClassNotFoundException, SQLException;

	void create(Visite obj) throws ClassNotFoundException, SQLException;

	void update(Visite obj) throws ClassNotFoundException, SQLException;

	void delete(Visite obj) throws ClassNotFoundException, SQLException;

}
