package dao;

import java.util.List;

import model.*;

public interface DAOArticle extends DAO<Article, Integer> {
	public List<Article> findByName(String nom);
}
