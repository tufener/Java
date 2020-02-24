package test;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import dao.DAOArticle;
import model.Article;

public class Test {

	public static void main(String[] args) {
		findAll();
		//findById();
		//testCreate();
		//testUpdate();
		//testDelete();
//		testFindByName();
	}

	static void findAll() {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		DAOArticle d = (DAOArticle)context.getBean(DAOArticle.class);
		List<Article> l = d.findAll();
		for (Article p : l)
			System.out.println(p);
		context.close();

	}

	static void findById() {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		DAOArticle d = (DAOArticle)context.getBean(DAOArticle.class);
		Article p = d.findById(1);
		if (p != null)
			System.out.println(p);
		else
			System.out.println("personne inexistante");
		context.close();
	}

	static void testCreate() {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		DAOArticle d = (DAOArticle)context.getBean(DAOArticle.class);
		
		Article p = new Article(6, "Asus", "Ordinateur", 1000);
		d.create(p);
		context.close();
	}

	static void testUpdate() {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		DAOArticle d = (DAOArticle)context.getBean(DAOArticle.class);
		Article p = null;
		p = d.findById(8);
		p.setPrix(20000);
		d.update(p);
		context.close();
	}

	static void testDelete() {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		DAOArticle d = (DAOArticle)context.getBean(DAOArticle.class);
		Article p=new Article();
		p.setId(5);
		
		d.delete(p);
		context.close();
	}

	static void testFindByName() {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		DAOArticle d = (DAOArticle)context.getBean(DAOArticle.class);
		List<Article> l = d.findByName("Asus");
		for (Article p : l)
			System.out.println(p);
		context.close();
	}
}
