package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Actualite;
import com.example.demo.repository.ActualiteRepository;

@RestController
@RequestMapping("/actualite")
public class ActualiteController {
	@Autowired
	private ActualiteRepository actualiteRepo;

	@GetMapping("/all")
	public List<Actualite> all() {
		List<Actualite> maliste = new ArrayList<Actualite>();
		Actualite a = new Actualite();
		a.setId(2);
		a.setTitle("Pc Portable");
		a.setImageUrl("www.asuspcportabel.com");
		a.setDescription("Asus Pc Portable Gamer");
		a.setDateCreation("01/10/2020");
		a.setDateFinDeValidite("01/01/2025");
		maliste.add(a);
	

		return maliste;
	}

	@PostMapping("/create")
	public void create(@RequestBody Actualite a) {
		actualiteRepo.save(a);
	}

}
