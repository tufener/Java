package prjRESTClient;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

public class start {

	public static void main(String[] args) {
		testAddGET();
	}
	private static void testHello(){
		Client cl=ClientBuilder.newClient();
		WebTarget target=cl.target("http://localhost:8080/projetRESTSERVERHello/Hello/hello");
		String m=target.request(MediaType.APPLICATION_JSON).get(String.class);
		System.out.println("response "+m);
	}
	private static void testCalc(){
		Client cl=ClientBuilder.newClient();
		WebTarget target=cl.target("http://localhost:8080/projetRESTSERVERCalcul/Calc/test");
		double m=target.request(MediaType.APPLICATION_JSON).get(Double.class);
		System.out.println("Test : "+m);
	}
	private static void testInfo(){
		Client cl=ClientBuilder.newClient();
		WebTarget target=cl.target("http://localhost:8080/projetRESTSERVERCalcul/Calc/Info");
		CalcInfo m=target.request(MediaType.APPLICATION_JSON).get(CalcInfo.class);
		System.out.println("Test : a="+m.getA()+ " b="+m.getB());		
	}
	private static void testAdd(){
		Client cl=ClientBuilder.newClient();
		WebTarget target=cl.target("http://localhost:8080/projetRESTSERVERCalcul/Calc/Add");
		CalcInfo post=new CalcInfo();
		post.setA(10);
		post.setB(21);
		Response res=target.request(MediaType.APPLICATION_JSON).post(Entity.entity(post, MediaType.APPLICATION_JSON));
		System.out.println(res.readEntity(Integer.class));
		/*
		 * ou en direct, si pas besoin d'infos suppl (res.getStatus...)
		 * 		int res=target.request(MediaType.APPLICATION_JSON).post(Entity.entity(post, MediaType.APPLICATION_JSON),Integer.class);
		 * 		System.out.println(res);
		 */
	}
	private static void testHello2(){
		Client cl=ClientBuilder.newClient();
		WebTarget target=cl.target("http://localhost:8080/projetRESTSERVERHello/Hello/hello2").path("Toua");
		String m=target.request(MediaType.APPLICATION_JSON).get(String.class);
		System.out.println(m);		
	}
	private static void testAddGET(){
		Client cl=ClientBuilder.newClient();
		WebTarget target=cl.target("http://localhost:8080/projetRESTSERVERCalcul/Calc/AddGET").path("11").path("16");
		int res=target.request(MediaType.APPLICATION_JSON).get(Integer.class);
		System.out.println(res);
	}
}

