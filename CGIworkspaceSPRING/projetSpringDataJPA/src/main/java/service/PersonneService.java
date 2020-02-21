package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import repository.PersonneRepository;

@Service
public class PersonneService {
	
	@Autowired
	private PersonneRepository personnerepository;

	public PersonneRepository getPersonnerepository() {
		return personnerepository;
	}

	public void setPersonnerepository(PersonneRepository personnerepository) {
		this.personnerepository = personnerepository;
	} 
	
	

}
