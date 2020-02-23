package formationSpringMvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import model.Personne;
import service.PersonneService;

@RestController
@RequestMapping("/apiPersonne")
public class PersonneRestController {

	@Autowired
	private PersonneService service;

	@GetMapping("/list")
	public ResponseEntity<List<Personne>> list() {
		return new ResponseEntity<>(this.service.getPersonnerepository().findAll(), HttpStatus.OK);
	}

	@PostMapping("list")
	public void create(@RequestBody Personne personne) {
		this.service.getPersonnerepository().save(personne);
	}

	@GetMapping("/list/{id}")
	public ResponseEntity<Personne> findById(@PathVariable(name = "id") Integer id) {
		return new ResponseEntity<>(this.service.getPersonnerepository().findById(id).get(), HttpStatus.OK);
	}

}
