package formationSpringMvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import formationSpringMvc.model.Article;
import service.ArticleService;

@Controller
@RequestMapping("/article")
public class ArticleController {

	@Autowired
	private ArticleService service;

	@RequestMapping("/user1")
	public String user1() {

		return "user/user1";
	}

	@RequestMapping("/user2")
	public String hello2(Model model) {
		model.addAttribute("u", new Article(12, "Apple", "Iphone 15", 2500));
		return "user/user2";
	}

//http://localhost:8080/formationSpringMvcv0/user3?nom=toto&prenom=titi
	@RequestMapping("/user3")
	public String user3(@RequestParam(value = "id") Integer id, @RequestParam(value = "marque") String marque,
			@RequestParam(value = "description") String description, @RequestParam(value = "prix") Integer prix,
			Model model) {
		model.addAttribute("user", new Article(id, marque, description, prix));
		return "user/user3";
	}

	@RequestMapping("/getList")
	public String list(Model model) {
		model.addAttribute("liste", service.getarticleRepository().findAll());
		return "personne/list";
	}

	@RequestMapping("/update")
	public String update(Model model) {
		model.addAttribute("liste", service.getarticleRepository().updateById("MacBook", "Ordinateur", 2500, 7));
		return "personne/list";
	}

	@RequestMapping("/create")
	public ModelAndView create(@RequestParam(value = "id") Integer id, 
			@RequestParam(value = "marque") String marque,
			@RequestParam(value = "description") String description, 
			@RequestParam(value = "prix") Integer prix) {
		ModelAndView modelandview = new ModelAndView("/personne/list2", "insert",
				service.getarticleRepository().create(id, marque, description, prix));
		return modelandview;

	}

//	@RequestMapping("/getList2")
//	public ModelAndView list() {
//		ModelAndView modelAndView = new ModelAndView("/personne/list", "liste",
//				service.getarticleRepository().findAll());
//		return modelAndView;
//	}

}
