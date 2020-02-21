package formationSpringMvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {

	@RequestMapping("/hello")
	public String hello() {

		return "hello/hello";
	}

	@RequestMapping("/hello2")
	public String hello2(Model model) {
		model.addAttribute("nom", "toto");
		return "hello/hello2";
	}
	// , required = false, defaultValue = "world"

	//http://localhost:8080/formationSpringMvcv0/hello3?prenom=toto
	//http://localhost:8080/formationSpringMvcv0/hello3
	@RequestMapping("/hello3")
	public String hello3(@RequestParam(value = "prenom", required = false, defaultValue = "world") String xx, Model model) {
		model.addAttribute("yy", xx);

		return "hello/hello3";
	}

}
