package model;

public class Adresse {
	private int numero ;
	private String rue ;
	private String cp ;
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public Adresse(int numero, String rue, String cp) {
		this.numero = numero;
		this.rue = rue;
		this.cp = cp;
	}
	@Override
	public String toString() {
		return "Adresse [numero=" + numero + ", rue=" + rue + ", cp=" + cp + "]";
	}
	
	

}
