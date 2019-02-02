package org.hackunix.handcash_io.client;

import org.hackunix.handcash_io.api.Handle;
import org.junit.Test;

public class HandCashClientTest {

	@Test
	public void getKnownHandle() {
		HandCashClient client = new HandCashClient("http://api.handcash.io/api/", true);
		Handle handle = client.root().receivingAddress().handle("derekm").get();
		System.out.println(handle.receivingAddress);
		System.out.println(handle.cashAddr.toString());
		System.out.println(handle.publicKey);
	}

}
