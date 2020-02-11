package model;

public class Commande {
	private int id;
	private String login;
	private String date;
	private int total;
	private String info;
	
	public Commande() {
	}

	public Commande(String login, int total, String info) {
		this.login = login;
		this.total = total;
		this.info = info;
	}

	public String toString() {
		return "Commande [id=" + id + ", login=" + login + ", date=" + date + ", total=" + total + ", info=" + info
				+ "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLogin() {
		return login;
	}

	public void setClient(String login) {
		this.login = login;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}
	
}
