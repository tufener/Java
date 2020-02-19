package formationSpring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import formationSpring.beans.HelloWorld;
import formationSpring.beans.IHelloWorld;

public class App {

	public static void main(String[] args) {
//		testHello();
		testHello2graceAlaClassImplements();

	}

	static void testHello2graceAlaClassImplements() {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("./applicationContext.xml");
		// traitements
		IHelloWorld x = (IHelloWorld) ctx.getBean("hendrix2"); //Inversion de controle !! (Design patterns de SPRING)
//		HelloWorld x = new HelloWorld(); //instance classique mais avec SPRING on utilisera celui du dessus

		System.out.println(x.getHello());
		System.out.println(x.getBonjour());
		ctx.close();
	}
	
	
	static void testHello() {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("./applicationContext.xml");
		// traitements
		HelloWorld x = (HelloWorld) ctx.getBean("hendrix2"); //Inversion de controle !! (Design patterns de SPRING)
//		HelloWorld x = new HelloWorld(); //instance classique mais avec SPRING on utilisera celui du dessus

		System.out.println(x.getHello());
		System.out.println(x.getBonjour());
		ctx.close();
	}

}
