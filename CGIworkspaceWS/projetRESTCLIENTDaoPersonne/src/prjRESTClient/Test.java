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
		update();

	}
	
	static void selectAll() {
		Client client = ClientBuilder.newClient();
		WebTarget target = client.target("http://localhost:8080/projetRestServerDaoPersonne/Dao/selectAll");
		List<Personne> res=target.request(MediaType.APPLICATION_JSON).get(new GenericType<List<Personne>>(){});
		for(Personne p : res)
			System.out.println(p);
	}
	
//	static void findById() {
//		Client client = ClientBuilder.newClient();
//		
//		WebTarget target = client.target("http://localhost:8080/projetRestServerDaoPersonne/Dao/findById").path("1");
//		String m = target.request(MediaType.APPLICATION_JSON).get(String.class);
//		System.out.println("reponse : " + m);
//	}
//	
//	
	static void create() {
		Client client = ClientBuilder.newClient();
		Personne p = new Personne();
		p.setId(30);
		p.setNom("Sun");
		p.setPrenom("Tzu");
		
		
		
		WebTarget target = client.target("http://localhost:8080/projetRestServerDaoPersonne/Dao/create");
		target.request(MediaType.APPLICATION_JSON).post(Entity.entity(p, MediaType.APPLICATION_JSON), Personne.class);
		
	}
	
	static void update() {
		Client client = ClientBuilder.newClient( new ClientConfig().register( LoggingFilter.class ) );
		WebTarget target = client.target("http://localhost:8080/projetRestServerDaoPersonne/Dao/update").path("update").path("30");
		Personne p = new Personne();
		p.setId(30);
		p.setNom("Martin");
		p.setPrenom("Luther King");
		
		
		
		Invocation.Builder invocationBuilder =  webTarget.request(MediaType.APPLICATION_JSON);
		Response response = invocationBuilder.put(Entity.entity(p, MediaType.APPLICATION_JSON));
		 
		Personne p = response.readEntity(Personne.class);
		     
		System.out.println(response.getStatus());
		System.out.println(p);
		selectAll();
	}
//	
//	
//	static void testCalcInfoJSON() {
//		Client client = ClientBuilder.newClient();
//		
//		WebTarget target = client.target("http://localhost:8080/projetRESTSERVERCalc/Calc/Info");
//		CalcInfo m = target.request(MediaType.APPLICATION_JSON).get(CalcInfo.class);
//		System.out.println("reponse : " + m);
//	}
//	
//
//	
//	static void testDoubleCalc() {
//		Client client = ClientBuilder.newClient();
//		
//		WebTarget target = client.target("http://localhost:8080/projetRESTSERVERCalc/Calc/Addv0");
//		double m = target.request(MediaType.APPLICATION_JSON).get(Double.class);
//		System.out.println("reponse : " + m);
//	}
//	
//	static void testHello() {
//		Client client = ClientBuilder.newClient();
//		
//		WebTarget target = client.target("http://localhost:8080/projetRESTSERVERHelloV2/Hello/hello");
//		String m = target.request(MediaType.APPLICATION_JSON).get(String.class);
//		System.out.println("reponse : " + m);
//	}
}
