package model;

public class Articles {
	private int idArticles;
	private String articles;
	private String description;
	private int prix;

	public Articles(int idArticles, String articles, String description, int prix) {
		super();
		this.idArticles = idArticles;
		this.articles = articles;
		this.description = description;
		this.prix = prix;
	}

	public Articles() {
		
	}

	@Override
	public String toString() {
		return "idArticles= " + idArticles + ", Articles= " + articles + ", Description= " + description
				+ ", Prix= " + prix ;
	}

	public int getIdArticles() {
		return idArticles;
	}

	public void setIdArticles(int idArticles) {
		this.idArticles = idArticles;
	}

	public String getArticles() {
		return articles;
	}

	public void setArticles(String articles) {
		this.articles = articles;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getPrix() {
		return prix;
	}

	public void setPrix(int prix) {
		this.prix = prix;
	}

}
