package formationSpringMvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import formationSpringMvc.model.User;

@Controller
public class UserController {

	@RequestMapping("/user1")
	public String user1() {
		return "user/user1";
	}

	@RequestMapping("/user2")
	public String user2(Model model) {
		model.addAttribute("user", new User("Haddock", "Capitaine"));
		return "user/user2";
	}

	@RequestMapping("/user3")
	public String user3(@RequestParam(value = "nom") String nom,
			@RequestParam(value = "prenom", required = false, defaultValue = "Dupond") String prenom, Model model) {
		model.addAttribute("user", new User(nom, prenom));
		return "user/user2";
	}

}
