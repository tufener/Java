package test;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import dao.DAOPersonne;
import model.Personne;

public class Test {

	public static void main(String[] args) {
		//findAll();
		//findById();
		//testCreate();
		//testUpdate();
		//testDelete();
		testFindByName();
	}

	static void findAll() {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		DAOPersonne d = (DAOPersonne)context.getBean(DAOPersonne.class);
		List<Personne> l = d.findAll();
		for (Personne p : l)
			System.out.println(p);
		context.close();

	}

	static void findById() {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		DAOPersonne d = (DAOPersonne)context.getBean(DAOPersonne.class);
		Personne p = d.findById(1);
		if (p != null)
			System.out.println(p);
		else
			System.out.println("personne inexistante");
		context.close();
	}

	static void testCreate() {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		DAOPersonne d = (DAOPersonne)context.getBean(DAOPersonne.class);
		
		Personne p = new Personne(5, "cc", "dd", 58);
		d.create(p);
		context.close();
	}

	static void testUpdate() {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		DAOPersonne d = (DAOPersonne)context.getBean(DAOPersonne.class);
		Personne p = null;
		p = d.findById(1);
		p.setAge(20);
		d.update(p);
		context.close();
	}

	static void testDelete() {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		DAOPersonne d = (DAOPersonne)context.getBean(DAOPersonne.class);
		Personne p=new Personne();
		p.setId(5);
		
		d.delete(p);
		context.close();
	}

	static void testFindByName() {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		DAOPersonne d = (DAOPersonne)context.getBean(DAOPersonne.class);
		List<Personne> l = d.findByName("Luisa");
		for (Personne p : l)
			System.out.println(p);
		context.close();
	}
}
