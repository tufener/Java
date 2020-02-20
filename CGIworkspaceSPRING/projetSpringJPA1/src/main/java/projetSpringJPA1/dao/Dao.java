package projetSpringJPA1.dao;

import java.util.List;

import projetSpringJPA1.entity.Personne;

public interface Dao<T, PK> {
	T findById(PK pk);

	List<T> findAll();

	void create(T obj);

	void update(T obj);

	void delete(T obj);

	

}
