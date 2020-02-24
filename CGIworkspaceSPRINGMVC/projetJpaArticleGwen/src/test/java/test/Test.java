package test;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import dao.DAOArticle;
import model.Article;

public class Test {

	public static void main(String[] args) {
		// testCreate();
		// findById();
		// testUpdate();
		// findAll();
		// testDelete();
	}

	static void findAll() {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		DAOArticle d = (DAOArticle) context.getBean(DAOArticle.class);
		List<Article> l = d.findAll();
		for (Article a : l)
			System.out.println(a);
		context.close();

	}

	static void findById() {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		DAOArticle d = (DAOArticle) context.getBean(DAOArticle.class);
		Article a = d.findById(5);
		if (a != null)
			System.out.println(a);
		else
			System.out.println("personne inexistante");
		context.close();
	}

	static void testCreate() {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		DAOArticle d = (DAOArticle) context.getBean(DAOArticle.class);
		Article a = new Article(5, "Gap", 21.00);
		d.create(a);
		context.close();
	}

	static void testUpdate() {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		DAOArticle d = (DAOArticle) context.getBean(DAOArticle.class);
		Article a = null;
		a = d.findById(5);
		a.setPrix(20.50);
		d.update(a);
		context.close();
	}

	static void testDelete() {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		DAOArticle d = (DAOArticle) context.getBean(DAOArticle.class);
		Article a = null;
		a = d.findById(5);
		d.delete(a);
		context.close();
	}

}
