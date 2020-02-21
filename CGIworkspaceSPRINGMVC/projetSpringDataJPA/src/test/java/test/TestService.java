package test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import service.PersonneService;

public class TestService {

	public static void main(String[] args) {
		findAllService();

	}
	
	static void findAllService() {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml"); 
		PersonneService personneservice = ctx.getBean(PersonneService.class); 
		System.out.println(personneservice.getPersonnerepository().findAll());
		ctx.close();
	}

}
