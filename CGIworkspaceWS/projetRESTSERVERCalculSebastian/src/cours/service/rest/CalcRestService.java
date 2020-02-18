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
	public CalcRestService(){}

	@GET
	@Path("/test")
	@Produces(MediaType.APPLICATION_JSON)
	public double test() {
		return 10;
	}
	
	@GET
	@Path("/Info")
	@Produces(MediaType.APPLICATION_JSON)
	public CalcInfo getInfo() {
		CalcInfo ci=new CalcInfo();
		ci.setA(10);
		ci.setB(20);
		return ci;
	}
	
	@POST
	@Path("/Add")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public int add(CalcInfo ci) {
		return ci.getA()+ci.getB();
	}	
	@POST
	@Path("/Sub")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public int sub(CalcInfo ci) {
		return ci.getA()-ci.getB();
	}	
	@POST
	@Path("/Mult")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public int mult(CalcInfo ci) {
		return ci.getA()*ci.getB();
	}	
	@POST
	@Path("/Div")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public int div(CalcInfo ci) {
		return ci.getA()/ci.getB();
	}
	@GET
	@Path("/AddGET/{nb1}/{nb2}")
	@Produces(MediaType.APPLICATION_JSON)
	public int addGET(@PathParam(value="nb1")int a,@PathParam(value="nb2")int b){
		return a+b;
	}
}
