package formationSpringMvc.model;

public class Article {
	private int id;
	private String marque;
	private String description;
	private int prix;

	public Article(int id, String marque, String description, int prix) {

		this.id = id;
		this.marque = marque;
		this.description = description;
		this.prix = prix;
	}

	public Article() {

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMarque() {
		return marque;
	}

	public void setMarque(String marque) {
		this.marque = marque;
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

	@Override
	public String toString() {
		return "Article [id=" + id + ", marque=" + marque + ", description=" + description + ", prix=" + prix + "]";
	}

}
