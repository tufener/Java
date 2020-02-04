package dao;

import java.sql.SQLException;
import java.util.List;

import model.Authentification;

public interface DaoAuthentification extends Dao<Authentification, Long> {
	Authentification findByLogin(String nom, String mdp);

	Authentification findByNom(String nom);

	Authentification findById(String login) throws ClassNotFoundException, SQLException;

	List<Authentification> findAll() throws ClassNotFoundException, SQLException;

	void create(Authentification obj) throws ClassNotFoundException, SQLException;

	void update(Authentification obj) throws ClassNotFoundException, SQLException;

	void delete(Authentification obj) throws ClassNotFoundException, SQLException;
}
