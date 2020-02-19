package org.hackunix.handcash_io.client;

import javax.enterprise.context.ApplicationScoped;

import org.hackunix.handcash_io.api.HandCashResource;
import org.hackunix.jersey.client.JerseyClient;

@ApplicationScoped
public class HandCashClient extends JerseyClient<HandCashResource> {

	@Override
	protected Class<HandCashResource> getRootClass() {
		return HandCashResource.class;
	}

	@Override
	protected String getConfigPrefix() {
		return HandCashClient.class.getSimpleName();
	}

	/**
	 * Instantiate by loading configuration using MP Config.
	 */
	public HandCashClient() {
		super();
	}

	/**
	 * Instantiate with provided baseUrl.
	 * @param baseUrl Base URL for reaching service instance
	 * @param loggingEnabled enable HTTP request/response logging
	 */
	public HandCashClient(String baseUrl, boolean loggingEnabled) {
		super(baseUrl, null, null, loggingEnabled);
	}

	@Override
	protected void initializeClient() {}

}
