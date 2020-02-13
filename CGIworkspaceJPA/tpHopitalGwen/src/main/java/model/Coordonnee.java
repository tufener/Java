package model;

import javax.persistence.Embeddable;

@Embeddable
public class Coordonnee {

	private String adress;

	private String phone;

	public Coordonnee() {
	}

	public Coordonnee(String adress, String phone) {
		this.adress = adress;
		this.phone = phone;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "Coordonnee [adress=" + adress + ", phone=" + phone + "]";
	}

}
