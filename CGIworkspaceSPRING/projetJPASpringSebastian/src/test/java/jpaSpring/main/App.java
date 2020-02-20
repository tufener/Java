package jpaSpring.main;

import java.sql.SQLException;
import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import jpaSpring.dao.DaoPersonne;
import jpaSpring.dao.DaoPersonneHib;
import jpaSpring.entity.Personne;

public class App {

	public static void main(String[] args) {
		test();
	}
	static void test() {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("./applicationContext.xml");
		DaoPersonne dp=new DaoPersonneHib();
		List<Personne> list=null;
		try {
			list=dp.find();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ctx.close();
		for(Personne p:list)System.out.println(p.toString());
	}
}
