package com.mayank.jax.messenger.Resource;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.apache.log4j.Logger;

import com.mayank.jax.messenger.service.Names;
import com.mayank.jax.messenger.service.NamesService;

@Path("/names")
public class MyResource {

	static Logger log = Logger.getLogger(MyResource.class);
	
	@Path("/get")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Names> getLt() {
		return NamesService.getList();
	}

	@Path("/post")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Names postIt(Names names) {
		
		log.debug("+++++++++++++++++++++++++++debug++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		return NamesService.postMethod(names);
	}
}