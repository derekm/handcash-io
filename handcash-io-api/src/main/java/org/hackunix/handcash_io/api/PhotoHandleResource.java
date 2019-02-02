package org.hackunix.handcash_io.api;

import javax.ws.rs.GET;
import javax.ws.rs.core.Response;

public interface PhotoHandleResource {

	@GET
	public Response get();

}
