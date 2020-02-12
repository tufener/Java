package dao;

import java.util.List;

import model.Personne;

public interface PersonneDao extends Dao<Personne, Integer> {

	public List<Personne> findByName(String name);

}
