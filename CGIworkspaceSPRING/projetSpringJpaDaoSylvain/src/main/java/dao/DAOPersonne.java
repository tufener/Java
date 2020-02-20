package dao;

import java.util.List;

import model.*;

public interface DAOPersonne extends DAO<Personne, Integer> {
	public List<Personne> findByName(String nom);
}
