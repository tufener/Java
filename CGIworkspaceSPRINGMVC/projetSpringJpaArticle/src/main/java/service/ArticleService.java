package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import repository.ArticleRepository;

@Service
public class ArticleService {
	
	@Autowired
	private ArticleRepository articleRepository;

	public ArticleRepository getarticleRepository() {
		return articleRepository;
	}

	public void setarticleRepository(ArticleRepository articleRepository) {
		this.articleRepository = articleRepository;
	} 
	
	

}
