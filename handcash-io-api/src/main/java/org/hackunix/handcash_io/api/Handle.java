package org.hackunix.handcash_io.api;

import java.net.URI;

public class Handle {

	public String receivingAddress;
	public URI cashAddr;
	public String publicKey;

	public String getReceivingAddress() {
		return receivingAddress;
	}

	public void setReceivingAddress(String receivingAddress) {
		this.receivingAddress = receivingAddress;
	}

	public URI getCashAddr() {
		return cashAddr;
	}

	public void setCashAddr(URI cashAddr) {
		this.cashAddr = cashAddr;
	}

	public String getPublicKey() {
		return publicKey;
	}

	public void setPublicKey(String publicKey) {
		this.publicKey = publicKey;
	}

	@Override
	public String toString() {
		return receivingAddress + " " + cashAddr + " " + publicKey;
	}

}
