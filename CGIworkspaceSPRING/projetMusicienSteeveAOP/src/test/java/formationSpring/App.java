package formationSpring;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import formationSpring.beans.Musicien;

public class App {

	public static void main(String[] args) {
		testGuitariste();

	}

	static void testGuitariste() {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("./applicationContext.xml");
		// traitements
		Musicien h = ctx.getBean("hendrix", Musicien.class);

		h.performer();
		ctx.close();
	}
}
