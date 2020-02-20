package formationSpring.beans;

import org.springframework.stereotype.Component;

@Component("hendrix2")
public class HelloWorld implements IHelloWorld {
	
	public String getHello() {
		return "hello u";
	}
	
	public String getBonjour() {
		return "Bonjour Monsieur u";
	}
}

