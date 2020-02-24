package test;

import java.util.Optional;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import model.Article;
import repository.ArticleRepository;

public class TestRepo {

	public static void main(String[] args) {
//		testCreate();
//		testFindById();
//		testUpdate();
		testFindAll();
//		testDelete();

	}

	static void testFindById() {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("./applicationContext.xml");
		ArticleRepository repository = ctx.getBean(ArticleRepository.class);
		Optional<Article> optional = repository.findById(5);
		if (optional.isPresent())
			System.out.println(optional.get());
		else
			System.out.println("Pas de personne correspondant à l'id");
		ctx.close();
	}

	static void testFindAll() {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("./applicationContext.xml");
		ArticleRepository repository = ctx.getBean(ArticleRepository.class);
		for(Article s : repository.findAll())
			System.out.println(s);
//		System.out.println(repository.findAll());
		ctx.close();
	}

	static void testCreate() {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("./applicationContext.xml");
		ArticleRepository repository = ctx.getBean(ArticleRepository.class);
		Article a = new Article(5, "Gap", 21.00);
		System.out.println(repository.save(a));
		ctx.close();
	}

	static void testUpdate() {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("./applicationContext.xml");
		ArticleRepository repository = ctx.getBean(ArticleRepository.class);
		Optional<Article> optional = repository.findById(5);
		Article a = optional.get();
		a.setMarque("Tati");
		System.out.println(repository.save(a));
		ctx.close();
	}

	static void testDelete() {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("./applicationContext.xml");
		ArticleRepository repository = ctx.getBean(ArticleRepository.class);
		Optional<Article> optional = repository.findById(5);
		repository.delete(optional.get());
		ctx.close();
	}

}
