package dao;

import java.util.List;

import model.Personne;

public interface PersonneDao extends Dao<Personne, Long>  {
//??????+++
	public List<Personne> findByRange(int a, int b);
}
