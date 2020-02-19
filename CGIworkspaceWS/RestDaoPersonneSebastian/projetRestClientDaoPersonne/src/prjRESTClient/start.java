package prjRESTClient;

import java.util.List;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.MediaType;

public class start {

	public static void main(String[] args) {
//		testGetListPers();
//		testCreate();
		testSelectById();
//		testUpdate();
		//		testDelete();
	}
	private static void testGetListPers(){
		Client cl=ClientBuilder.newClient();
		WebTarget target=cl.target("http://localhost:8080/projetRestServerDaoPersonne/Personne/crud");
		List<Personne> res=target.request(MediaType.APPLICATION_JSON).get(new GenericType<List<Personne>>(){});
		for(Personne p : res)
			System.out.println(p.getNom());
	}
	private static void testCreate(){
		Personne p =new Personne(12345, "n12345", "p12345");
		Client cl=ClientBuilder.newClient();
		WebTarget target=cl.target("http://localhost:8080/projetRestServerDaoPersonne/Personne/crud");
		target.request(MediaType.APPLICATION_JSON).post(Entity.entity(p, MediaType.APPLICATION_JSON));
	}
	private static void testSelectById(){
		Client cl=ClientBuilder.newClient();
		WebTarget target=cl.target("http://localhost:8080/projetRestServerDaoPersonne/Personne/crud").path("1");
		Personne p=target.request(MediaType.APPLICATION_JSON).get(Personne.class);
		System.out.println(p.getNom()+" "+p.getPrenom());
	}
	private static void testDelete(){
		Client cl=ClientBuilder.newClient();
		WebTarget target=cl.target("http://localhost:8080/projetRestServerDaoPersonne/Personne/crud").path("12345");
		target.request(MediaType.APPLICATION_JSON).delete();
	}
	private static void testUpdate(){
		Personne p=new Personne(12345, "n12345new", "p12345new");
		Client cl=ClientBuilder.newClient();
		WebTarget target=cl.target("http://localhost:8080/projetRestServerDaoPersonne/Personne/crud");
		target.request(MediaType.APPLICATION_JSON).put(Entity.entity(p, MediaType.APPLICATION_JSON));
	}
}