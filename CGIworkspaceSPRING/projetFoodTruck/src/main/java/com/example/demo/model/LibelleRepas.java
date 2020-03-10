package com.example.demo.model;

public enum LibelleRepas {
	Dejeuner(1), PetitDej(2), Gouter(3), Diner(4);

	private int numRepas;

	public int getNumRepas() {
		return numRepas;
	}

	public void setNumRepas(int numRepas) {
		this.numRepas = numRepas;
	}

	private LibelleRepas(int numRepas) {
		this.numRepas = numRepas;
	}

	private LibelleRepas() {
	}

}
