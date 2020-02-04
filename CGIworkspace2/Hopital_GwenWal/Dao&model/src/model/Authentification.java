package model;

public class Authentification {

    private String login;
    private String mdp;
    private String nom;
    private int metier;

    public Authentification(String login, String mdp, String nom, int metier) {
        this.login = login;
        this.mdp = mdp;
        this.nom = nom;
        this.metier = metier;
    }

    public Authentification() {
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login=login;
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

    public int getMetier() {
        return metier;
    }

    public void setMetier(int metier) {
        this.metier = metier;
    }

    @Override
    public String toString() {
        return "Authentification [login=" + login + ", mdp=" + mdp + ", metier=" + metier + ", nom=" + nom + "]";
    }

}