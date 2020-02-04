package dao;
import java.sql.SQLException;
import java.util.List;

public interface Dao<T, PK>  {
	T findById(PK id)throws ClassNotFoundException, SQLException;
	List<T> findAll()throws ClassNotFoundException, SQLException;
	void create(T obj)throws ClassNotFoundException, SQLException;
	void update(T obj)throws ClassNotFoundException, SQLException;
	void delete(T obj)throws ClassNotFoundException, SQLException;
	}


