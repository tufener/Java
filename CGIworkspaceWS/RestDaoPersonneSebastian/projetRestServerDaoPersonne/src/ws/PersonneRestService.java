package ws;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.PUT;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import dao.DAOPersonne;

import java.util.*;
import model.*;

@Path("/Personne")
public class PersonneRestService {
	public PersonneRestService(){}

	@GET
	@Path("/crud")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Personne> selectAll() {
		List<Personne> l=new ArrayList<Personne>();
		try{l= new DAOPersonne().find();}
		catch(Exception e){e.printStackTrace();}
		return l;
	}
	
	@GET
	@Path("/crud/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Personne selectById(@PathParam(value="id")int id) {
		Personne p=null;
		try{
			p=new DAOPersonne().findById(id);
		}
		catch(Exception e){e.printStackTrace();}
		return p;
	}
	
	@POST
	@Path("/crud")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public void create(Personne p) {
		try{new DAOPersonne().create(p);}
		catch(Exception e){e.printStackTrace();}
	}
	@DELETE
	@Path("/crud/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public void delete(@PathParam(value="id")int id){
		Personne p=new Personne();
		p.setId(id);
		try{new DAOPersonne().delete(p);}
		catch(Exception e){e.printStackTrace();}
	}
	@PUT
	@Path("/crud")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public void update(Personne p){
		try{new DAOPersonne().update(p);}
		catch(Exception e){e.printStackTrace();}
	}
}
