package dao;

import java.sql.SQLException;

import model.Employe;

public interface AuthentificationDao extends Dao<Employe, String> {
public Employe findByLogin (String login, String mdp) throws ClassNotFoundException, SQLException;
}
 