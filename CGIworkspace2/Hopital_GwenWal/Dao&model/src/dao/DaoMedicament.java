package dao;

import java.sql.SQLException;
import java.util.List;

import model.Medicament;


public interface DaoMedicament extends Dao<Medicament,Integer> {
	    List<Medicament> findByChar(String Char) throws ClassNotFoundException, SQLException;
	    
	    Medicament findById(Integer i) throws ClassNotFoundException, SQLException;

	    List<Medicament> findAll() throws ClassNotFoundException, SQLException;

	    void create(Medicament obj) throws ClassNotFoundException, SQLException;

	    void update(Medicament obj) throws ClassNotFoundException, SQLException;

	    void delete(Medicament obj) throws ClassNotFoundException, SQLException;

}
