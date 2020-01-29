package dao;

import java.sql.SQLException;
import java.util.List;

public interface Dao<T, PK> {
	public T findById(PK id);
	public List<T> findAll();
	public void create(T obj);
	public void update(T obj);
	public void delete(T obj) throws ClassNotFoundException,SQLException, SQLException;
}
