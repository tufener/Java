package dao;

import java.util.List;

public interface Dao <T,PK> {

	public void create(T obj);
	public T findById(PK id);
	public List<T> findAll();
	public void update(T obj);
	public void delete(T obj);
	

}
