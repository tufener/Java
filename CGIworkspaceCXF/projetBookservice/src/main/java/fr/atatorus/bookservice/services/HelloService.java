package fr.atatorus.bookservice.services;

import javax.jws.WebParam;
import javax.jws.WebService;



@WebService(name = "Hello", serviceName = "HelloService")
public interface HelloService {

	String hello(@WebParam(name = "nom") String nom);

}
