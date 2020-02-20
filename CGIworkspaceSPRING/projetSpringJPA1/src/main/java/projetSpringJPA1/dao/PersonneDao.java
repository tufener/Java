package projetSpringJPA1.dao;

import java.util.List;

import projetSpringJPA1.entity.Personne;

public interface PersonneDao extends Dao<Personne, Integer> {

	public List<Personne> findByName(String name);
	public List<Personne> findAllv2();

}
