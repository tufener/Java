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
		model.addAttribute("message", "Easy men");
		return "hello/hello2";
	}
	
	@RequestMapping("/hello3")
	public String hello2(@RequestParam(name="prenom")String x, Model model) {
		model.addAttribute("y", x);
		return "hello/hello3";
	}

	
	
	
}
