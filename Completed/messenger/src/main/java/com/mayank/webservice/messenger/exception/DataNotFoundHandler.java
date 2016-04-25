package com.mayank.webservice.messenger.exception;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import com.mayank.webservice.messenger.model.ErrorCode;

@Provider
public class DataNotFoundHandler implements ExceptionMapper<DataNotFoundException> {

	@Override
	public Response toResponse(DataNotFoundException e) {
		
		ErrorCode errorcode=new ErrorCode("CP002",e.getMessage());
		return Response.status(Status.NOT_FOUND).entity(errorcode).build();
	}
}