package cours.service.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.*;

@Path("/Calc")
public class CalcRestService {

	public CalcRestService() {

	}



	@GET
	@Path("/Addv0")
	@Produces(MediaType.APPLICATION_JSON)
	public double getAdd() {

		return 10;
	}
	
	@GET
	@Path("/Info")
	@Produces(MediaType.APPLICATION_JSON)
	public CalcInfo getInfo() {

		CalcInfo c=new CalcInfo();
		c.setA(10);
		c.setB(20);
		
		return c;
	}


	
	@POST
	@Path("/Add")
	@Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	@Consumes(MediaType.APPLICATION_JSON)
	public int Add(CalcInfo info) {

		return info.getA() + info.getB();
	}

}
