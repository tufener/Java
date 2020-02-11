package model;

import java.util.ArrayList;

public class Panier {
	private int number = 0;
	private int priceTotal = 0;
	private ArrayList<Article> articles;

	public Panier(ArrayList<Article> articles) {
		this.articles = articles;
		getTotalPrice();
	}

	public int getTotalPrice() {
		for (Article article : this.articles) {
			this.priceTotal += article.getTotalPrice();
		}
		return this.priceTotal;
	}

	public int getPriceTotal() {
		return priceTotal;
	}

	public void setPriceTotal(int priceTotal) {
		this.priceTotal = priceTotal;
	}

	public ArrayList<Article> getArticles() {
		return articles;
	}

	public void setArticles(ArrayList<Article> articles) {
		this.articles = articles;
	}
	
	public int getNumberArticle() {
		if (articles != null) {
			for (Article article : this.articles) {
				this.number += 1;
			}
			return this.number;
		} else {
			return 0;
		}
	}

	@Override
	public String toString() {
		return "Panier [priceTotal=" + priceTotal + ", articles=" + articles + "]";
	}
	
	

}
