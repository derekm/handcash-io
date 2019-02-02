package org.hackunix.handcash_io.api;

import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

public interface PhotoResource {

	@Path("{handle}")
	public PhotoHandleResource handle(@PathParam("handle") String handle);

}
