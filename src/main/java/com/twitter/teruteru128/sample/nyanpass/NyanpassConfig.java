package com.twitter.teruteru128.sample.nyanpass;

import java.net.URI;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.BlockingQueue;

public interface NyanpassConfig {
	public URI getEndpointURI();

	public DateTimeFormatter getFormatter();

	public BlockingQueue<NyanpassBean> getQueue();
}