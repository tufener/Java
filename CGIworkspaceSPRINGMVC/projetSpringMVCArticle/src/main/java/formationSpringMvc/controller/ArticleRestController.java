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

import model.Article;
import service.ArticleService;

@RestController
@RequestMapping("/apiArticle")
public class ArticleRestController {

	@Autowired
	private ArticleService service;

	@GetMapping("/list")
	public ResponseEntity<List<Article>> list() {
		return new ResponseEntity<>(this.service.getarticleRepository().findAll(), HttpStatus.OK);
	}

	@PostMapping("list")
	public void create(@RequestBody Article personne) {
		this.service.getarticleRepository().save(personne);
	}

	@GetMapping("/list/{id}")
	public ResponseEntity<Article> findById(@PathVariable(name = "id") Integer id) {
		return new ResponseEntity<>(this.service.getarticleRepository().findById(id).get(), HttpStatus.OK);
	}

}
