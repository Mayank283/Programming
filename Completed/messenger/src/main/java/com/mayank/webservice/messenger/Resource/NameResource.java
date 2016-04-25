package com.mayank.webservice.messenger.Resource;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.mayank.webservice.messenger.exception.DataNotFoundException;
import com.mayank.webservice.messenger.model.Names;
import com.mayank.webservice.messenger.service.NamesService;

@Path("myresource")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class NameResource {

	/** Adding names*/
	@Path("post")
	@POST
	public Names addName(Names names) {
		return NamesService.addNames(names);
	}

	/** Getting all names*/
	@Path("get")
	@GET
	public List<Names> getName() {
		return NamesService.getallNames();
	}

	/** Getting names by id*/
	@Path("get/{nameid}")
	@GET
	public Names getNameById(@PathParam("nameid") int id) throws DataNotFoundException {
		return NamesService.getNameByid(id);
	}

	@Path("post/{nameid}")
	public AddressResource getAddressResource() {
		return new AddressResource();
	}	
}