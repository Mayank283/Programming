package com.mayank.webservice.messenger.Resource;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.mayank.webservice.messenger.model.Address;
import com.mayank.webservice.messenger.service.AddressService;


@Path("/")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class AddressResource {

	@POST
	@Path("Address/{type}")
	public Address addAddress(@PathParam("nameid") int id,@PathParam("type") String type,Address address)
	{
		return AddressService.addAddress(id,type,address);
	}

	@GET
	@Path("Address")
	public List<Address> getAddress(@PathParam("nameid") int id){
		return AddressService.getAddress(id);
	}
}