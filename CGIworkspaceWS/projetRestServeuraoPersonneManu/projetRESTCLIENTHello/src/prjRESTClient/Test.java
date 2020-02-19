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



public class Test {

	public static void main(String[] args) {
		//testHello();
		//testHello2();
//		testCalc();
//		testInfo();
//		testAdd();
//		testAdd2();
//		testMult();
//		testAdd3();
	//	testList();
	//	testListP();
	//	testCreate();
	//testFindById();
	//testSelectAll();
		testDelete();
	//	testUpdate();
	}
	
	static void testUpdate(){
		Client client = ClientBuilder.newClient();
		WebTarget target = client.target("http://localhost:8080/projetRestServerDaoPersonne/Dao/personne").path("105");
		Personne p = new Personne();
		p.setNom("cc");
		p.setPrenom("dd");
		target.request(MediaType.APPLICATION_JSON).put(Entity.entity(p, MediaType.APPLICATION_JSON));
	}
	
	static void testDelete(){
		Client client = ClientBuilder.newClient();
		WebTarget target = client.target("http://localhost:8080/projetRestServerDaoPersonne/Dao/personne").path("105");
		Invocation.Builder invocationBuilder =  target.request();
		Response response = invocationBuilder.delete();
		 
		System.out.println(response.getStatus());
		System.out.println(response.readEntity(String.class));
		
	}
		
	static void testCreate(){
		Client client = ClientBuilder.newClient();
		WebTarget target = client.target("http://localhost:8080/projetRestServerDaoPersonne/Dao/personne");
		Personne p = new Personne();
		p.setNom("aa");
		p.setPrenom("bb");
		p.setId(105);
		target.request(MediaType.APPLICATION_JSON).post(Entity.entity(p, MediaType.APPLICATION_JSON));
	}
	
	static void testFindById(){
		Client client = ClientBuilder.newClient();
		WebTarget target = client.target("http://localhost:8080/projetRestServerDaoPersonne/Dao/personne").path("1");
		Personne p = target.request(MediaType.APPLICATION_JSON).get(new GenericType<Personne>(){});
		System.out.println(p);
	}
	
	static void testSelectAll(){
		Client client = ClientBuilder.newClient();
		WebTarget target = client.target("http://localhost:8080/projetRestServerDaoPersonne/Dao/personne");
		List<Personne> res=target.request(MediaType.APPLICATION_JSON).get(new GenericType<List<Personne>>(){});
		for(Personne p : res)
			System.out.println(p);
		
	}

	
	
//	static void testListP(){
//		Client client = ClientBuilder.newClient();
//		WebTarget target = client.target("http://localhost:8080/projetRESTSERVERHello/Hello/listP");
//		List<Personne> m = target.request(MediaType.APPLICATION_JSON).get(List.class);
//		for(Personne p : m)
//			System.out.println(p.getNom());
//	}
//	
//	static void testList(){
//		Client client = ClientBuilder.newClient();
//		WebTarget target = client.target("http://localhost:8080/projetRESTSERVERHello/Hello/list");
//		List<String> m = target.request(MediaType.APPLICATION_JSON).get(List.class);
//		for(String s : m)
//			System.out.println(s);
//		
//	}
//	
//	static void testHello(){
//		Client client = ClientBuilder.newClient();
//		WebTarget target = client.target("http://localhost:8080/projetRESTSERVERHello/Hello/hello");
//		String m = target.request(MediaType.APPLICATION_JSON).get(String.class);
//		System.out.println("response : " + m);
//	}
//	
//	static void testHello2(){
//		Client client = ClientBuilder.newClient();
//		WebTarget target = client.target("http://localhost:8080/projetRESTSERVERHello/Hello/hello2").path("toto");
//		String m = target.request(MediaType.APPLICATION_JSON).get(String.class);
//		System.out.println("response : " + m);
//	}
//	
//	static void testCalc(){
//		Client client = ClientBuilder.newClient();
//		WebTarget target = client.target("http://localhost:8080/projetRESTSERVERCalcul/calcul/test");
//		String m = target.request(MediaType.APPLICATION_JSON).get(String.class);
//		System.out.println("response : " + m);
//	}
//	
//	static void testInfo(){
//		Client client = ClientBuilder.newClient();
//		WebTarget target = client.target("http://localhost:8080/projetRESTSERVERCalcul/calcul/Info");
//		Info m = target.request(MediaType.APPLICATION_JSON).get(Info.class);
//		System.out.println("response : " + m/*.getA() + " " + m.getB()*/);
//	}
//	
//	static void testAdd(){
//		Client client = ClientBuilder.newClient();
//		WebTarget target = client.target("http://localhost:8080/projetRESTSERVERCalcul/calcul/add");
//		Info i = new Info();
//		i.setA(10);
//		i.setB(5);
//		int m = target.request(MediaType.APPLICATION_JSON).post(Entity.entity(i, MediaType.APPLICATION_JSON), Integer.class);
//		System.out.println("response : " + m);
//	}
//	
//	static void testAdd2() {
//		Client client = ClientBuilder.newClient();
//		Info x = new Info(10, 20);
//
//		WebTarget target = client.target("http://localhost:8080/projetRESTSERVERCalcul/calcul/add");
//		Response m = target.request(MediaType.APPLICATION_JSON).post(Entity.entity(x, MediaType.APPLICATION_JSON));
//		System.out.println("response : " + m);
//
//		System.out.println(m.getStatus());
//		System.out.println(m.readEntity(Integer.class));
//
//	}
//	
//	static void testMult(){
//		Client client = ClientBuilder.newClient();
//		WebTarget target = client.target("http://localhost:8080/projetRESTSERVERCalcul/calcul/mult");
//		Info i = new Info();
//		i.setA(10);
//		i.setB(5);
//		int m = target.request(MediaType.APPLICATION_JSON).post(Entity.entity(i, MediaType.APPLICATION_JSON), Integer.class);
//		System.out.println("response : " + m);
//	}
//	
//	static void testAdd3(){
//		Client client = ClientBuilder.newClient();
//		WebTarget target = client.target("http://localhost:8080/projetRESTSERVERCalcul/calcul/add").path("10").path("20");
//		int m = target.request(MediaType.APPLICATION_JSON).get(Integer.class);
//		System.out.println("response : " + m);
//	}


}
