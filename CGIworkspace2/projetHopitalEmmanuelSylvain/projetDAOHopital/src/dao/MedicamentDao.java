package dao;


import java.util.ArrayList;

import model.Medicament;

public interface MedicamentDao extends Dao  <Medicament,Integer> {

	public ArrayList <Medicament> commencePar(String nom);
}
