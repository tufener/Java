package formationSpring;

import java.util.List;
import java.util.Map;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import formationSpring.beans.Personne;
import formationSpring.beans.javaCollection;

public class App {

	public static void main(String[] args) {
		testPersonne();
		testCollection();
		testListInteger();

	}
	
	static void testListInteger() {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("./applicationContext.xml");
		// traitements
		javaCollection x = (javaCollection) ctx.getBean("Collection"); // Inversion de controle !! (Design patterns de SPRING)


		List l1 = x.getAdresseList(); 
		System.out.println("-------------------------");
		System.out.println(l1);
		System.out.println("-------------------------");
	
	}

	static void testCollection() {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("./applicationContext.xml");
		// traitements
		javaCollection x = (javaCollection) ctx.getBean("Collection"); // Inversion de controle !! (Design patterns de SPRING)

		List l1 = x.getAdresseList(); 
		Map m1 = x.getAdresseMap();
		
		System.out.println("-------------------------");
		System.out.println(x);
		System.out.println("-------------------------");
		System.out.println(m1.keySet());
		System.out.println(m1.values());
	}

	static void testPersonne() {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("./applicationContext.xml");
		// traitements
		Personne x = (Personne) ctx.getBean("pers1"); // Inversion de controle !! (Design patterns de SPRING)
		Personne y = (Personne) ctx.getBean("pers2");
//		HelloWorld x = new HelloWorld(); //instance classique mais avec SPRING on utilisera celui du dessus

		System.out.println(x);
		System.out.println("-------------------------");
		System.out.println(y);
		ctx.close();
	}

}
