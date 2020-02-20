package formationSpring;

import java.util.Map;

import org.springframework.context.support.ClassPathXmlApplicationContext;


import formationSpring.beans.Guitariste;
import formationSpring.beans.Saxophoniste;

public class App {

	public static void main(String[] args) {
		//testPersonne();
		//testCollection();
		//testMap();
		testConnect();

	}
	static void testConnect() {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("./applicationContext.xml");
		// traitements
		// Personne p2 = ctx.getBean("yy", Personne.class);

		Guitariste g1 = (Guitariste) ctx.getBean("guitariste");
		Saxophoniste s1 = (Saxophoniste) ctx.getBean("saxo");
		g1.Perform();
		s1.Perform();
		ctx.close();
	}


}
