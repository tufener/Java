package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Produit;
import com.example.demo.repository.ProductRepository;

@RestController
@RequestMapping("/catalogue")
public class ProduitController {
	@Autowired
	private ProductRepository productRepo;

	@GetMapping("/listeCatalogue")
	public List<Produit> listeCatalogue() {
		List<Produit> maliste = new ArrayList<Produit>();
		Produit a = new Produit();
		a.setId_produit(1);
		a.setImageUrl("https://img2.freepng.fr/20180620/jxa/kisspng-vittel-mineral-water-drinking-water-perrier-acqua-panna-5b2a5e56f3ed17.0223030615295033189991.jpg");
		a.setLibelle_produit_commerciale("Vittel eau de source");
		a.setLibelle_produit_technique("Eau de source de Montagne venu du fin fond de l'Himalaya");
		a.setPrix(32.2);
		a.setStock(25);
		a.setQuantite(2);
		a.setNbrVente(25);
		a.setDescription("Eau de source pur comme de l'eau");
		a.setComposition("Un atome d’oxygène relié à deux atomes d’hydrogène");
		
		
		maliste.add(a);
	

		return maliste;
	}

	@PostMapping("/create")
	public void create(@RequestBody Produit a) {
		productRepo.save(a);
	}

}
