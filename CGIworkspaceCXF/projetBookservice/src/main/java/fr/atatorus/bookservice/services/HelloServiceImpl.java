package fr.atatorus.bookservice.services;

import javax.jws.WebParam;

public class HelloServiceImpl implements HelloService{

	@Override
	public String hello(@WebParam(name = "nom") String nom) {
		
		return "hello from service : "+nom;
	}

}
