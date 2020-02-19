package fr.atatorus.bookservice.services;

import javax.jws.WebParam;
import javax.jws.WebService;

@WebService(name = "Calcul", serviceName = "CalculService")
public interface CalculService {

	String add(@WebParam(name = "nb1") int nb1, @WebParam(name = "nb2") int nb2);

	String sous(@WebParam(name = "nb1") int nb1, @WebParam(name = "nb2") int nb2);

	String div(@WebParam(name = "nb1") int nb1, @WebParam(name = "nb2") int nb2);

	String mult(@WebParam(name = "nb1") int nb1, @WebParam(name = "nb2") int nb2);
}
