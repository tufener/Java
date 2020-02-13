package dao;

import java.util.List;

import model.Personne;

public interface DaoPersonne extends Dao<Personne,Integer> {

	public List<Personne> findByName(String name);
}
