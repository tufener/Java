package model;

public class Article {
	private int id;
	private String nom;
	private String description;
	private String image;
	private double prix;

	public Article(int id, String nom, String description, String image, double prix) {
		this.id = id;
		this.nom = nom;
		this.description = description;
		this.image = image;
		this.prix = prix;
	}

	public Article() {
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}

	public int getId() {
		return id;
	}

	public String getNom() {
		return nom;
	}

	public String getDescription() {
		return description;
	}

	public String getImage() {
		return image;
	}

	public double getPrix() {
		return prix;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Article other = (Article) obj;
		if (id != other.id)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Article{" + "id=" + id + ", nom='" + nom + '\'' + ", description='" + description + '\'' + ", image='"
				+ image + '\'' + ", prix=" + prix + '}';
	}
}
