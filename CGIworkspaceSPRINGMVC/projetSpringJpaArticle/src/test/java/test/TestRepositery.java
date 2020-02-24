package test;

import java.util.List;
import java.util.Optional;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import model.Article;
import repository.ArticleRepository;

public class TestRepositery {

	public static void main(String[] args) {
//		findAll();
//		findById();
//		findByIdv2();
//		findByMarque();
//		findByMarqueOrderDesc();
//		findAllByOrderByMarque ();
//		create();
//		delete();
//		update();

	}

	static void findAll() {

		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		ArticleRepository articlerepository = ctx.getBean(ArticleRepository.class);
//		System.out.println(personnerepository.findAll());
		List<Article> list = articlerepository.findAll();
		for (Article p : list)
			System.out.println(p);

		ctx.close();

	}

	static void findById() {

		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		ArticleRepository articlerepository = ctx.getBean(ArticleRepository.class);
		System.out.println(articlerepository.findById(2));
		ctx.close();

	}

	static void findByIdv2() {

		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		ArticleRepository articlerepository = ctx.getBean(ArticleRepository.class);
		Optional<Article> p = articlerepository.findById(2);
		if (p.isPresent())
			;
		System.out.println(p);
		ctx.close();

	}

	static void findByMarque() {

		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		ArticleRepository articlerepository = ctx.getBean(ArticleRepository.class);
		List<Article> list = articlerepository.findByMarque("Audi");
		for (Article p : list)
			System.out.println(p);
		ctx.close();

	}
	static void findByMarqueOrderDesc() {

		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		ArticleRepository articlerepository = ctx.getBean(ArticleRepository.class);
		List<Article> list = articlerepository.findAllByOrderByMarqueDesc();
		for (Article p : list)
			System.out.println(p);
		ctx.close();

	}
	
	static void findAllByOrderByMarque () {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		ArticleRepository articlerepository = ctx.getBean(ArticleRepository.class);
		List<Article> list = articlerepository.findAllByOrderByMarque();
		for (Article p : list)
			System.out.println(p);
		ctx.close();
	}

	static void create() {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		ArticleRepository articlerepository = ctx.getBean(ArticleRepository.class);
		Article p = new Article();
		p.setId(15);
		p.setMarque("MacBookPro");
		p.setDescription("Ordinateur");
		p.setPrix(3000);
		articlerepository.save(p);
		findAll();
		ctx.close();

	}

	static void update() {

		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		ArticleRepository articlerepository = ctx.getBean(ArticleRepository.class);
		Optional<Article> opt = articlerepository.findById(2);
		Article p = opt.get();
		p.setMarque("Jaguar");
		articlerepository.save(p);
		ctx.close();
		findAll();

	}

	static void delete() {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		ArticleRepository articlerepository = ctx.getBean(ArticleRepository.class);
		articlerepository.deleteById(2);
		findAll();
		ctx.close();

	}
	
	static void findBytest() {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		ArticleRepository articlerepository = ctx.getBean(ArticleRepository.class);
		articlerepository.deleteById(2);
		findAll();
		ctx.close();

	}

}
