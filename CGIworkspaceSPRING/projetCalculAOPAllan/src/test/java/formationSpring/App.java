package formationSpring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import formationSpring.beans.*;

public class App {

	public static void main(String[] args) {
		testAop();

	}

	static void testAop() {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("./applicationContext.xml");
		// traitements
		
		Calcul c1 = (Calcul) ctx.getBean("Calc");
		c1.Add(20, 30);
	}
	}


