package dao;

import java.sql.SQLException;
import java.util.List;

import model.Visite;

public interface VisiteDao extends Dao <Visite, Integer > {

	public List<Visite> findByMedecin(String nom) throws ClassNotFoundException, SQLException;
}
