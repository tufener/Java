package model;

public class Article {
	private int id;
	private String name;
	private String desc;
	private int price;
	private int quantity = 1;

	public Article(int id, String name, String desc, int price) {
		this.id = id;
		this.name = name;
		this.desc = desc;
		this.price = price;
	}

	public Article() {
	}

	public int getTotalPrice() {
		return (quantity == 1) ? this.price : this.price * this.quantity;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "Article [id=" + id + ", name=" + name + ", desc=" + desc + ", price=" + price + "]";
	}

}
