package com.example.demo.model;

public enum LibelleFamilleRepas {

	Boisson(1), Entree(2), Plat(3), Viennoiserie(4), BoissonChaude(5);

	private int numFamilleRepas;

	private LibelleFamilleRepas() {
	}

	private LibelleFamilleRepas(int num) {
		this.numFamilleRepas = num;
	}

	public int getNum() {
		return numFamilleRepas;
	}

	public void setNum(int num) {
		this.numFamilleRepas = num;
	}

}
