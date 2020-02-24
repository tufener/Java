package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import model.Article;
import repository.ArticleRepository;

@RestController
@RequestMapping("/api")
public class ArticleRestController {

	@Autowired
	private ArticleRepository repository;

	@GetMapping("/article")
	public ResponseEntity<List<Article>> list() {
		return new ResponseEntity<>(this.repository.findAll(), HttpStatus.OK);
	}

	@PostMapping("/article")
	public ResponseEntity<String> create(@RequestBody Article article) {
		if (!this.repository.existsById(article.getId())) {
			this.repository.save(article);
			return new ResponseEntity<>("Article créé", HttpStatus.CREATED);
		} else {
			return new ResponseEntity<>("Erreur, l'article existe déjà", HttpStatus.CONFLICT);
		}
	}

	@GetMapping("/article/{id}")
	public ResponseEntity<Article> findById(@PathVariable(name = "id") Integer id) {
		if (this.repository.existsById(id)) {
			return new ResponseEntity<>(this.repository	.findById(id)
														.get(),
					HttpStatus.OK);
		} else {
			return new ResponseEntity<>(new Article(), HttpStatus.NOT_FOUND);
		}

	}

	@PutMapping("/article")
	public ResponseEntity<String> update(@RequestBody Article article) {
		if (this.repository.existsById(article.getId())) {
			this.repository.save(article);
			return new ResponseEntity<>("Article mis à jour", HttpStatus.OK);
		} else {
			return new ResponseEntity<>("Erreur, l'article n'existe pas", HttpStatus.NOT_MODIFIED);
		}
	}

	@DeleteMapping("/article/{id}")
	public ResponseEntity<String> delete(@PathVariable(name = "id") Integer id) {
		if (this.repository.existsById(id)) {
			Article a = this.repository	.findById(id)
										.get();
			this.repository.delete(a);
			return new ResponseEntity<>("Article supprimé", HttpStatus.OK);
		} else {
			return new ResponseEntity<>("Erreur, l'article n'existe pas", HttpStatus.NOT_FOUND);
		}
	}

}
