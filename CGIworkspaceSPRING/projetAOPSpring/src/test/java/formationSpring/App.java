package formationSpring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import formationSpring.beans.Calcul;

public class App {

	public static void main(String[] args) {
		testHello();

	}

	static void testHello() {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("./applicationContext.xml");
		// traitements
		Calcul x = (Calcul) ctx.getBean("calc");
		x.Add(10, 10); 
		System.out.println("---------------------");
		x.mult(10, 10);
		ctx.close();
	}

}
