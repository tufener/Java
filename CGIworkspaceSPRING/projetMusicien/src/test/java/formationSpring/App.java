package formationSpring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import formationSpring.beans.Guitariste;
import formationSpring.beans.Musicien;

public class App {

	public static void main(String[] args) {
		testHello();

	}
	
	
	static void testHello() {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("./applicationContext.xml");
		// traitements
		Guitariste x = (Guitariste) ctx.getBean("malik", Guitariste.class); 
		Guitariste y = (Guitariste) ctx.getBean("chris", Guitariste.class); 
		
		
		System.out.println(x.performer());
		//x.performer();
//		System.out.println("-------------------");
//		y.performer();
		
		ctx.close();
	}

}
