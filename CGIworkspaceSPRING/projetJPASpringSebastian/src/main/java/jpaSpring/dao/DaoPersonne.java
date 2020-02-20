package jpaSpring.dao;
import java.util.List;

import jpaSpring.entity.Personne;

public interface DaoPersonne extends Dao<Personne,Integer>{
	public List<Personne> findByName(String name);
}
