package model;

import java.util.Date;;

public class Commande {
	private int idcommand;
	private int idclient;
	private Date date;
	private double total;
	private String info;

	public Commande(int idclient, Date date, double total, String info) {
		this.idclient = idclient;
		this.date = date;
		this.total = total;
		this.info = info;
	}

	public int getIdcommand() {
		return idcommand;
	}

	public void setIdcommand(int idcommand) {
		this.idcommand = idcommand;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	public int getIdclient() {
		return idclient;
	}

	public void setIdclient(int idclient) {
		this.idclient = idclient;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	@Override
	public String toString() {
		return "Commande [idcommand=" + idcommand + ", idclient=" + idclient + ", date=" + date + ", total=" + total
				+ ", info=" + info + "]";
	}

	public Commande() {
	}

}