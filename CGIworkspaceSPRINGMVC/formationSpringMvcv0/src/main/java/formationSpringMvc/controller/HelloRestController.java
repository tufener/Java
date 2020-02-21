package formationSpringMvc.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloRestController {
	
	@RequestMapping(value="/hello", method= RequestMethod.GET)
	public String sayHello() {
		return "Hello World"; 
	}
	
	@RequestMapping(value="/hello2", method= RequestMethod.GET)
	public ResponseEntity<String> sayHello2() { //autre écriture que la méthode ci-dessus, on peut l'écrire ainsi aussi. 
		return new ResponseEntity<>("Hello World 2", HttpStatus.OK); 
	}
	
	


}
