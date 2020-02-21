package dao;

import java.util.List;

import model.Personne;

public interface DAOPersonne extends DAO<Personne, Integer> {
	public List<Personne> findByName(String nom);
}
