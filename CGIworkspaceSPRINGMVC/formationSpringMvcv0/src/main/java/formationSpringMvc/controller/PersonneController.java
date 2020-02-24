package formationSpringMvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import formationSpringMvc.model.User;
import service.PersonneService;

@Controller
@RequestMapping("/personne")
public class PersonneController {

	@Autowired
	private PersonneService service;

	@RequestMapping("/getList")
	public String list(Model model) {
		model.addAttribute("liste", service.getPersonnerepository().findAll());
		return "personne/list";
	}

	@RequestMapping("/getList2")
	public ModelAndView list() {
		ModelAndView modelAndView = new ModelAndView("/personne/list", "liste",
				service.getPersonnerepository().findAll());
		return modelAndView;
	}
	
	@GetMapping("/listDepart")
	public String m1(Model model) {
		model.addAttribute("u", new User()); 
		return "personne/listDepart" ;
	}
	
	@PostMapping("/listDepart")
	public ModelAndView m2(@ModelAttribute(name="u") User usr) {
		ModelAndView modelandview = new ModelAndView("personne/listeArrive", "xx", usr); 
		return modelandview ;
	}

}
