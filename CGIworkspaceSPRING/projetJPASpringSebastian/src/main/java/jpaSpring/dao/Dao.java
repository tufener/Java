package jpaSpring.dao;

import java.sql.SQLException;
import java.util.List;

public interface Dao <T,PK>{
	public List<T> find() throws ClassNotFoundException, SQLException;
	public T findById(PK id)throws ClassNotFoundException, SQLException;
	public void create(T instance)throws ClassNotFoundException, SQLException;
	public void update(T instance) throws ClassNotFoundException, SQLException;
	public void delete(T instance)throws ClassNotFoundException, SQLException;
}