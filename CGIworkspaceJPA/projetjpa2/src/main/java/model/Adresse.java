package model;

import javax.persistence.Embeddable;

@Embeddable
public class Adresse {
	String rue; 
	int numRue, Cp;
	
	public Adresse(String rue, int numRue, int cp) {
		
		this.rue = rue;
		this.numRue = numRue;
		Cp = cp;
	}
	public Adresse() {
		
	}
	public String getRue() {
		return rue;
	}
	public void setRue(String rue) {
		this.rue = rue;
	}
	public int getNumRue() {
		return numRue;
	}
	public void setNumRue(int numRue) {
		this.numRue = numRue;
	}
	public int getCp() {
		return Cp;
	}
	public void setCp(int cp) {
		Cp = cp;
	}
	@Override
	public String toString() {
		return "Adresse [rue=" + rue + ", numRue=" + numRue + ", Cp=" + Cp + "]";
	} 
	
	
	
	

}
