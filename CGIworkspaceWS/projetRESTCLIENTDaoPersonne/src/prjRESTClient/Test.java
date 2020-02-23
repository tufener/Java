package prjRESTClient;

import java.util.List;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.glassfish.jersey.client.ClientConfig;
import org.glassfish.jersey.filter.LoggingFilter;

public class Test {

	public static void main(String[] args) {
		selectAll();
//		findById();
//		create();
//		update();
//		delete();

	}

	static void selectAll() {
		Client client = ClientBuilder.newClient();
		WebTarget target = client.target("http://localhost:8080/projetRestServerDaoPersonne/Dao/personnes");
		List<Personne> res = target.request(MediaType.APPLICATION_JSON).get(new GenericType<List<Personne>>() {
		});
		for (Personne p : res)
			System.out.println(p);
	}

	static void findById() {
		Client client = ClientBuilder.newClient();

		WebTarget target = client.target("http://localhost:8080/projetRestServerDaoPersonne/Dao/personnes").path("1");
		String m = target.request(MediaType.APPLICATION_JSON).get(String.class);
		System.out.println("reponse : " + m);
	}

	static void create() {
		Client client = ClientBuilder.newClient();
		Personne p = new Personne();
		p.setId(9);
		p.setNom("Solid");
		p.setPrenom("Snake");

		WebTarget target = client.target("http://localhost:8080/projetRestServerDaoPersonne/Dao/personnes");
		target.request(MediaType.APPLICATION_JSON).post(Entity.entity(p, MediaType.APPLICATION_JSON), Personne.class);
		selectAll();
	}

	static void update() {
		Client client = ClientBuilder.newClient(new ClientConfig().register(LoggingFilter.class));
		WebTarget target = client.target("http://localhost:8080/projetRestServerDaoPersonne/Dao/personnes").path("30");
		Personne p = new Personne();
		p.setId(3);
		p.setNom("Nelson");
		p.setPrenom("Mandela");

		Invocation.Builder invocationBuilder = target.request(MediaType.APPLICATION_JSON);
		Response response = invocationBuilder.put(Entity.entity(p, MediaType.APPLICATION_JSON));

		Personne personne = response.readEntity(Personne.class);

		System.out.println(response.getStatus());
		System.out.println(p);
		selectAll();
	}

	static void delete() {
		Client client = ClientBuilder.newClient();
		WebTarget target = client.target("http://localhost:8080/projetRestServerDaoPersonne/Dao/personnes").path("4");

		Invocation.Builder invocationBuilder = target.request();
		Response response = invocationBuilder.delete();
		selectAll();
		System.out.println(response.getStatus());
		System.out.println(response.readEntity(String.class));

	}

}
