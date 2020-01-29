package dao;

import model.*;

public interface AuthentificationDao extends Dao<Authentification, String>{

	Authentification findByLoginAndPassword(String log, String pass, int metier) throws ClassNotFoundException;

}
