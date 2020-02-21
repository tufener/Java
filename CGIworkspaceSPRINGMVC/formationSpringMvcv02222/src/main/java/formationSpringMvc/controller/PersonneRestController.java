package formationSpringMvc.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import dao.DAOPersonne;
import model.Personne;

@RestController
@RequestMapping("/apip")
public class PersonneRestController {
	@Autowired
	private DAOPersonne dao; 
	
//	@Autowired
//	private PersonneRepository repo;
	
	
	
	@GetMapping("/list")
	public List<Personne> list() {
		
		return dao.findAll();
	}
	
	@PostMapping("/list") //il a le meme @GetMapping que celui de find all juste au-dessus mais c'est pas grave car c'est le post qui va différer
	public void create(@RequestBody Personne p) {
	dao.create(p);
	}
	
	
	@GetMapping("/list/{id}")
	public Personne findById(@PathVariable(name="id")Integer id) {
		
		return dao.findById(id);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	@RequestMapping("/getListv2") //c'est une autre écriture que celui du dessus...(/getList)
//	public ModelAndView list() {
//		ModelAndView mav = new ModelAndView("personne/list", "liste", dao.findAll());
//		return mav;
//	}
	
	@RequestMapping("/getList2")
	public String getList2(@RequestParam(name="id")int id, @RequestParam(name="nom")String nom,@RequestParam(name="prenom")String prenom, @RequestParam(name="age")int age,Model model) {
		model.addAttribute("liste", dao.findAll());
		return "personne/list2";
	}

}
