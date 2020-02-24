package test;

import java.util.List;
import java.util.Optional;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import model.Personne;
import repository.PersonneRepository;

public class TestRepositery {

	public static void main(String[] args) {
		findAll();
//		findById();
//		findByIdv2();
//		findByNom();
//		findByNomOrderDesc();
//		findAllByOrderByNom ();
//		create();
//		delete();
//		update();

	}

	static void findAll() {

		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		PersonneRepository personnerepository = ctx.getBean(PersonneRepository.class);
//		System.out.println(personnerepository.findAll());
		List<Personne> list = personnerepository.findAll();
		for (Personne p : list)
			System.out.println(p);

		ctx.close();

	}

	static void findById() {

		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		PersonneRepository personnerepository = ctx.getBean(PersonneRepository.class);
		System.out.println(personnerepository.findById(2));
		ctx.close();

	}

	static void findByIdv2() {

		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		PersonneRepository personnerepository = ctx.getBean(PersonneRepository.class);
		Optional<Personne> p = personnerepository.findById(2);
		if (p.isPresent())
			;
		System.out.println(p);
		ctx.close();

	}

	static void findByNom() {

		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		PersonneRepository personnerepository = ctx.getBean(PersonneRepository.class);
		List<Personne> list = personnerepository.findByNom("Carla");
		for (Personne p : list)
			System.out.println(p);
		ctx.close();

	}
	static void findByNomOrderDesc() {

		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		PersonneRepository personnerepository = ctx.getBean(PersonneRepository.class);
		List<Personne> list = personnerepository.findAllByOrderByNomDesc();
		for (Personne p : list)
			System.out.println(p);
		ctx.close();

	}
	
	static void findAllByOrderByNom () {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		PersonneRepository personnerepository = ctx.getBean(PersonneRepository.class);
		List<Personne> list = personnerepository.findAllByOrderByNom();
		for (Personne p : list)
			System.out.println(p);
		ctx.close();
	}

	static void create() {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		PersonneRepository personnerepository = ctx.getBean(PersonneRepository.class);
		Personne p = new Personne();
		p.setId(11);
		p.setNom("Zinedine");
		p.setPrenom("Zidane");
		p.setAge(45);
		personnerepository.save(p);
		findAll();
		ctx.close();

	}

	static void update() {

		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		PersonneRepository personnerepository = ctx.getBean(PersonneRepository.class);
		Optional<Personne> opt = personnerepository.findById(2);
		Personne p = opt.get();
		p.setNom("Carla");
		personnerepository.save(p);
		ctx.close();
		findAll();

	}

	static void delete() {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		PersonneRepository personnerepository = ctx.getBean(PersonneRepository.class);
		personnerepository.deleteById(2);
		findAll();
		ctx.close();

	}
	
	static void findBytest() {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		PersonneRepository personnerepository = ctx.getBean(PersonneRepository.class);
		personnerepository.deleteById(2);
		findAll();
		ctx.close();

	}

}
