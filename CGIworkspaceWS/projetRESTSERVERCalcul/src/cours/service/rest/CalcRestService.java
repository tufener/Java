package cours.service.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/Calc")
public class CalcRestService {

	public CalcRestService() {

	}



	@GET
	@Path("/test")
	@Produces(MediaType.APPLICATION_JSON)
	public String Test(){

		return "C'est ok tout fonctionne" ;
	}
	
	@GET
	@Path("/Info")
	@Produces(MediaType.APPLICATION_JSON)
	public CalcInfo getInfo() {
		CalcInfo c = new CalcInfo(); 
		c.setA(10);
		c.setB(10);
		return c; 
	}
	
	@POST
	@Path("/add")
	@Produces({MediaType.APPLICATION_XML , MediaType.APPLICATION_JSON})
	@Consumes(MediaType.APPLICATION_JSON)
	public double Add(CalcInfo info) {
		return info.getA() + info.getB();
	}
	
	@POST
	@Path("/sous")
	@Produces({MediaType.APPLICATION_XML , MediaType.APPLICATION_JSON})
	@Consumes(MediaType.APPLICATION_JSON)
	public double Sous(CalcInfo info) {
		return info.getA() - info.getB();
	}
	
	@POST
	@Path("/mult")
	@Produces({MediaType.APPLICATION_XML , MediaType.APPLICATION_JSON})
	@Consumes(MediaType.APPLICATION_JSON)
	public double Mult(CalcInfo info) {
		return info.getA() * info.getB();
	}

	
	@POST
	@Path("/div")
	@Produces({MediaType.APPLICATION_XML , MediaType.APPLICATION_JSON})
	@Consumes(MediaType.APPLICATION_JSON)
	public double Div(CalcInfo info) {
		return info.getA() / info.getB();
	}

	
	

}
