package formationSpringMvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import service.PersonneService;

@Controller
@RequestMapping("/personne")
public class PersonneController {

	@Autowired
	private PersonneService service;

	@RequestMapping("/getList")
	public String list(Model model) {
		model.addAttribute("liste", service	.getPersonneRepository()
											.findAll());
		return "personne/list";
	}

	@RequestMapping("/getList2")
	public ModelAndView list() {
		ModelAndView modelAndView = new ModelAndView("/personne/list", "liste", service	.getPersonneRepository()
																						.findAll());
		return modelAndView;
	}

}
