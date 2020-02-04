package model;

public class Employe {
	private String login;
	private String mdp;
	private String nom;
	private int metier;

	public Employe() {
		super();
	}

	public Employe(String login, String mdp, String nom, int metier) {

		this.login = login;
		this.mdp = mdp;
		this.nom = nom;
		this.metier = metier;

	}

	public int getMetier() {
		return metier;
	}

	public void setMetier(int metier) {
		this.metier = metier;
	}

	@Override
	public String toString() {
		return  login + "\t" + mdp + "\t" + nom + "\t" + metier;
	}

	public String getLogin() {
		return login;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((login == null) ? 0 : login.hashCode());
		result = prime * result + ((mdp == null) ? 0 : mdp.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employe other = (Employe) obj;
		if (login == null) {
			if (other.login != null)
				return false;
		} else if (!login.equals(other.login))
			return false;
		if (mdp == null) {
			if (other.mdp != null)
				return false;
		} else if (!mdp.equals(other.mdp))
			return false;
		return true;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getMdp() {
		return mdp;
	}

	public void setMdp(String mdp) {
		this.mdp = mdp;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

}
