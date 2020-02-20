package test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestRepositery {

	public static void main(String[] args) {
		findAll(); 

	}
	
	static void findAll() {
		
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml"); 
		
		
	}

}
