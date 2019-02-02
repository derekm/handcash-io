package org.hackunix.handcash_io.api;

import javax.ws.rs.Path;

public interface HandCashResource {

	@Path("receivingAddress")
	public ReceivingAddressResource receivingAddress();

	@Path("photo")
	public PhotoResource photo();

}
