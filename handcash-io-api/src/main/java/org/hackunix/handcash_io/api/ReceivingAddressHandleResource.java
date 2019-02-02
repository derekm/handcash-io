package org.hackunix.handcash_io.api;

import javax.ws.rs.GET;

public interface ReceivingAddressHandleResource {

	@GET
	public Handle get();

}
