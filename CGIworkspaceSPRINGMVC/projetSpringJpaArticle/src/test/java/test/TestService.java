package test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import service.ArticleService;

public class TestService {

	public static void main(String[] args) {
		findAllService();

	}
	
	static void findAllService() {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml"); 
		ArticleService articleservice = ctx.getBean(ArticleService.class); 
		System.out.println(articleservice.getarticleRepository().findAll());
		ctx.close();
	}

}
