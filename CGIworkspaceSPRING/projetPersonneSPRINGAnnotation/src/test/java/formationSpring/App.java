package formationSpring;

import java.util.List;
import java.util.Map;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import formationSpring.beans.Personne;
import formationSpring.beans.javaCollection;

public class App {

	public static void main(String[] args) {
		testPersonne();

	}

	static void testPersonne() {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("./applicationContext.xml");
		// traitements
		Personne x = (Personne) ctx.getBean("Personnage"); // Inversion de controle !! (Design patterns de SPRING)

		System.out.println(x);

		ctx.close();
	}

}
