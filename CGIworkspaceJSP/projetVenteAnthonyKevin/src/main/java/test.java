import java.sql.SQLException;
import java.util.ArrayList;

import dao.*;
import model.Article;
import model.Client;

public class test {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		inscription();
	}
	
	public static void SelectAll() throws ClassNotFoundException, SQLException {
		ArrayList<Article> liste = new DAOArticle().selectAll();
		System.out.println(liste.size());
		for (Article a : liste) 
			System.out.println(a.getNom());
	}
	
	public static void inscription() throws ClassNotFoundException, SQLException {
		Client c = new Client(13, "123", "dupond", "toto", "etyuuiiuiuitrtyyu");
		DAOClient d = new DAOClient();
		boolean inscription = d.createClient(c); 
		if (inscription == true )
			System.out.println("Bon");
		else 
			System.out.println("Pas bon");
	}
	
	public static void login() throws ClassNotFoundException, SQLException {
		int login = 11; 
		String pass = "123";
		DAOClient d = new DAOClient();
		Client c = d.login(login);
		if (c.getId() != 0) {
			if (c.getPassword().equals(pass)) {
				System.out.println("Connexion reussi");
			}
			else {
				System.out.println("Le mot de passe est incorect");
			}
		}
		else 
			System.out.println("Le login ne correspond à aucun client");
	}

}
