package dao;

import java.sql.SQLException;
import java.util.List;

import model.Patient;

public interface DaoPatient extends Dao<Patient, Long> {
    Patient findById(int id) throws ClassNotFoundException, SQLException;

    List<Patient> findAll() throws ClassNotFoundException, SQLException;

    void create(Patient obj) throws ClassNotFoundException, SQLException;

    void update(Patient obj) throws ClassNotFoundException, SQLException;

    void delete(Patient obj) throws ClassNotFoundException, SQLException;
    
    void updateComplement(int id,String complement)throws ClassNotFoundException, SQLException;
    
}
