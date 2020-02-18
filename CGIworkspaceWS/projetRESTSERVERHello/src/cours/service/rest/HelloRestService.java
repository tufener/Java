package cours.service.rest;


import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/Hello")
public class HelloRestService {

	public HelloRestService() {

	}

	@GET
	@Path("/hello")
	@Produces(MediaType.APPLICATION_JSON)
	public String getHello() {

		return "hello...";
	}

	@GET
	@Path("/hello2/{nom}")
	@Produces(MediaType.APPLICATION_JSON)
	public String getHelloParam(@PathParam(value="nom")String x) {

		return "hello " + x;
	}
	
	@GET
	@Path("/list")
	@Produces(MediaType.APPLICATION_JSON)
	public List<String> getLsit() {
		ArrayList<String> list = new ArrayList<String>(); 
		list.add("Julia");
		list.add("Hasret");
		list.add("Marianna");
		return list;
	}
	
	

}
