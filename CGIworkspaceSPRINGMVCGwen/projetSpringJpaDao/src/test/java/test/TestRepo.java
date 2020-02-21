package test;

import java.util.List;
import java.util.Optional;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import model.Personne;
import repository.PersonneRepository;

public class TestRepo {

	public static void main(String[] args) {
		// testFindAll();
		// testFindById();
		// testCreate();
		// testUpdate();
		// testDelete();
		// testFindByNom();
		// testFindByNomContaining();
		// testFindByAgeGreater();
		testFindByNomMyQuery();

	}

	static void testFindByNomMyQuery() {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("./applicationContext.xml");
		PersonneRepository repository = ctx.getBean(PersonneRepository.class);
		List<Personne> list = repository.findMyQueryNom("Castafiore");
		System.out.println(list);
		ctx.close();
	}

	static void testFindByAgeGreater() {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("./applicationContext.xml");
		PersonneRepository repository = ctx.getBean(PersonneRepository.class);
		List<Personne> list = repository.findByAgeGreaterThan(50);
		System.out.println(list);
		ctx.close();
	}

	static void testFindByNomContaining() {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("./applicationContext.xml");
		PersonneRepository repository = ctx.getBean(PersonneRepository.class);
		List<Personne> list = repository.findByNomContaining("a");
		System.out.println(list);
		ctx.close();
	}

	static void testFindByNom() {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("./applicationContext.xml");
		PersonneRepository repository = ctx.getBean(PersonneRepository.class);
		List<Personne> list = repository.findByNom("Haddock");
		System.out.println(list);
		ctx.close();
	}

	static void testFindById() {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("./applicationContext.xml");
		PersonneRepository repository = ctx.getBean(PersonneRepository.class);
		Optional<Personne> optional = repository.findById(160);
		if (optional.isPresent())
			System.out.println(optional.get());
		else
			System.out.println("Pas de personne correspondant à l'id");
		ctx.close();
	}

	static void testFindAll() {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("./applicationContext.xml");
		PersonneRepository repository = ctx.getBean(PersonneRepository.class);
		System.out.println(repository.findAll());
		ctx.close();
	}

	static void testCreate() {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("./applicationContext.xml");
		PersonneRepository repository = ctx.getBean(PersonneRepository.class);
		Personne p = new Personne();
		p.setId(666);
		p.setAge(666);
		p.setNom("Satan");
		p.setPrenom("Lucifer");
		System.out.println(repository.save(p));
		ctx.close();
	}

	static void testUpdate() {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("./applicationContext.xml");
		PersonneRepository repository = ctx.getBean(PersonneRepository.class);

		Optional<Personne> optional = repository.findById(666); // il faut récupérer la personne pour avoir le bon
																// numéro de version
		Personne p = optional.get();
		p.setNom("Demon");
		System.out.println(repository.save(p));
		ctx.close();
	}

	static void testDelete() {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("./applicationContext.xml");
		PersonneRepository repository = ctx.getBean(PersonneRepository.class);
		Optional<Personne> optional = repository.findById(666);
		repository.delete(optional.get());
		ctx.close();
	}

}
