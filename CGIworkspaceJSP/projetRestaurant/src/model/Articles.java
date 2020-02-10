package model;

public class Articles {
	private int IdArticles;
	private String name;
	private String description;
	private int price;
	private int quantity;
	private int totalPrice;

	public Articles(int idArticles, String name, String description, int price, int quantity) {
		super();
		this.IdArticles = idArticles;
		this.name = name;
		this.description = description;
		this.price = price;
		this.quantity = quantity;
		totalPrice();

	}

	public void totalPrice() {
		int total = this.price * this.quantity;
		this.totalPrice = total;
	}

	public Articles(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}

	public Articles() {

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public int getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}

	@Override
	public String toString() {
		return "Articles [name=" + name + ", price=" + price + ", quantity=" + quantity + ", totalPrice=" + totalPrice
				+ "]";
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getIdArticles() {
		return IdArticles;
	}

	public void setIdArticles(int idArticles) {
		IdArticles = idArticles;
	}

}
