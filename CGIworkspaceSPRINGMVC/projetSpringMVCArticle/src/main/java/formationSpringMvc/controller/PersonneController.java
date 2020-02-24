package formationSpringMvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import dao.DAOArticle;
import repository.ArticleRepository;

@Controller
@RequestMapping("/personne")
public class PersonneController {
	@Autowired
	private DAOArticle dao; 
	
	@Autowired
	private ArticleRepository repo;
	
	
	
	@RequestMapping("/getList")
	public String getList(Model model) {
		model.addAttribute("liste", dao.findAll());
		return "personne/list";
	}
	
	@RequestMapping("/getListv2") //c'est une autre écriture que celui du dessus...(/getList)
	public ModelAndView list() {
		ModelAndView mav = new ModelAndView("personne/list", "liste", dao.findAll());
		return mav;
	}
	
	@RequestMapping("/getList2")
	public String getList2(@RequestParam(name="id")int id, @RequestParam(name="nom")String nom,@RequestParam(name="prenom")String prenom, @RequestParam(name="age")int age,Model model) {
		model.addAttribute("liste", dao.findAll());
		return "personne/list2";
	}

}
