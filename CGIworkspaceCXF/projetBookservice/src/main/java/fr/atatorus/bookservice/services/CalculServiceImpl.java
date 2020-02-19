package fr.atatorus.bookservice.services;

import javax.jws.WebParam;
import javax.jws.WebService;

public class CalculServiceImpl implements CalculService {

	public String add(@WebParam(name = "nb1") int nb1, @WebParam(name = "nb2") int nb2) {
		int x = nb1 + nb2;
		return "Le resultat de l'addition est: " + x;

	}

	public String sous(@WebParam(name = "nb1") int nb1, @WebParam(name = "nb2") int nb2) {
		int x = nb1 - nb2;
		return "Le resultat de la soustraction est: " + x;

	}

	public String div(@WebParam(name = "nb1") int nb1, @WebParam(name = "nb2") int nb2) {
		int x = nb1 / nb2;
		return "Le resultat de la division est: " + x;
	}

	public String mult(@WebParam(name = "nb1") int nb1, @WebParam(name = "nb2") int nb2) {
		int x = nb1 * nb2;
		return "Le resultat de la multiplication  est: " + x;
	}

}
