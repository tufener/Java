package model;

import dao.AuthentificationDaoJDBC;

public class Authentification {
	private int id;
	private String login;
	private String password;
	private int metier;

	public Authentification(int id, String login, String password, int metier) {
		this.id = id;
		this.login = login;
		this.password = password;
		this.metier = metier;
	}

	public Authentification() {
	}

	public Authentification loginHopital(String login, String password, String metier) throws Exception {
		AuthentificationDaoJDBC auth = new AuthentificationDaoJDBC();
		Authentification a = auth.findByLoginAndPassword(login, password, metier);
		if (a == null)
			System.out.println("\nLogin/Password incorrecte\n");
		return a;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getMetier() {
		return metier;
	}

	public void setMetier(int metier) {
		this.metier = metier;
	}

	@Override
	public String toString() {
		return "Connecté en tant que [login=" + login + ", password=" + password +"]";
	}

}
