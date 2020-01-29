package model;

public class Imp {
	private String nom;

	public Imp(String nom) {
		this.nom = nom;

	}

	public void print(String message) {
		System.out.println(message + nom);
	}

}
