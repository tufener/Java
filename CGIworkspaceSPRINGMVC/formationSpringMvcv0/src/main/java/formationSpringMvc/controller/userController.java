package formationSpringMvc.controller;



import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import formationSpringMvc.model.User; 

@Controller
public class userController {
	@RequestMapping("/user1")
	public String user1(Model model) {
		model.addAttribute("u", new User("Jean" , "Patrick"));
		return "personne/personne1";
	}
	
	@RequestMapping("/user2")
	public String user2() {
		return "personne/personne2";
	}
	
	
	@RequestMapping("/user3")
	public String user3(@RequestParam(name="nom")String xx, @RequestParam(name="prenom")String yy,  Model model) {
		model.addAttribute("aze",  new User(xx, yy));
		return "personne/personne3";
	}

}
