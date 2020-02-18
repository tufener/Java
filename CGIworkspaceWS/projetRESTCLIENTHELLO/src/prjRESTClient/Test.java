package prjRESTClient;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;




public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		testHello(); 
//		testDoubleCalc();
//		testCalcInfoJSON();
//		testCalcAddPOST();
//		testHello2();
		testArrayList();

	}
	
	static void testArrayList() {
		Client client = ClientBuilder.newClient();
		
		WebTarget target = client.target("http://localhost:8080/projetRESTSERVERHello/Hello/list");
//		List m = target.request(MediaType.APPLICATION_JSON).get(List.class);
		List<String> m = target.request(MediaType.APPLICATION_JSON).get(ArrayList.class);// ca marche aussi
		for(String s : m)
			System.out.println(s);
//		System.out.println("reponse : " + m);
	}
	
	static void testHello2() {
		Client client = ClientBuilder.newClient();
		
		WebTarget target = client.target("http://localhost:8080/projetRESTSERVERHello/Hello/hello2").path("Marianna");
		String m = target.request(MediaType.APPLICATION_JSON).get(String.class);
		System.out.println("reponse : " + m);
	}
	
	
	static void testCalcAddPOST() {
		Client client = ClientBuilder.newClient();
		CalcInfo c = new CalcInfo(10 ,20);
		
		
		WebTarget target = client.target("http://localhost:8080/projetRESTSERVERCalc/Calc/Add");
		Response m = target.request(MediaType.APPLICATION_JSON).post(Entity.entity(c, MediaType.APPLICATION_JSON));
		System.out.println("reponse : " + m);
		
		System.out.println(m.getStatus());
		System.out.println(m.readEntity(Integer.class));
		
	}
	
	
	static void testCalcInfoJSON() {
		Client client = ClientBuilder.newClient();
		
		WebTarget target = client.target("http://localhost:8080/projetRESTSERVERCalc/Calc/Info");
		CalcInfo m = target.request(MediaType.APPLICATION_JSON).get(CalcInfo.class);
		System.out.println("reponse : " + m);
	}
	

	
	static void testDoubleCalc() {
		Client client = ClientBuilder.newClient();
		
		WebTarget target = client.target("http://localhost:8080/projetRESTSERVERCalc/Calc/Addv0");
		double m = target.request(MediaType.APPLICATION_JSON).get(Double.class);
		System.out.println("reponse : " + m);
	}
	
	static void testHello() {
		Client client = ClientBuilder.newClient();
		
		WebTarget target = client.target("http://localhost:8080/projetRESTSERVERHelloV2/Hello/hello");
		String m = target.request(MediaType.APPLICATION_JSON).get(String.class);
		System.out.println("reponse : " + m);
	}
}
