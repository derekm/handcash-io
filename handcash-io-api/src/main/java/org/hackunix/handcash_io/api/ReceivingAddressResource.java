package org.hackunix.handcash_io.api;

import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

public interface ReceivingAddressResource {

	@Path("{handle}")
	public ReceivingAddressHandleResource handle(@PathParam("handle") String handle);

}
