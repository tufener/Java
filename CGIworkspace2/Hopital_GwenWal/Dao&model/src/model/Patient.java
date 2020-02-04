package model;

public class Patient {
    private int id;
    private String nom;
    private String prenom;
    private String complement;

    public Patient(int id, String nom, String prenom, String complement) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.complement = complement;
    }

    public Patient() {
    }

    @Override
    public String toString() {
        return "\nPatient N° "+id+"\n\t prenom: "+prenom+" nom: "+nom+"\n\t Complement: "+complement;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getComplement() {
        return complement;
    }

    public void setComplement(String complement) {
        this.complement = complement;
    }

}