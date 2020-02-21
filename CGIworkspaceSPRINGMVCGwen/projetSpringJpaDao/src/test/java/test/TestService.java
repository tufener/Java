package test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import service.PersonneService;

public class TestService {

	public static void main(String[] args) {
		testFindAll();

	}

	static void testFindAll() {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		PersonneService service = context.getBean(PersonneService.class);
		System.out.println(service	.getPersonneRepository()
									.findAll());

	}

}
