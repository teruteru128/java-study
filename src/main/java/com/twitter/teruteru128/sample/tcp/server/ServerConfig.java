package com.twitter.teruteru128.sample.tcp.server;

import java.time.Clock;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;

import com.twitter.teruteru128.sample.tcp.Config;

public class ServerConfig extends Config {
	private String hostname;
	private int port;
	private ExecutorService service;
	private CountDownLatch latch;
	private Clock clock = Clock.systemDefaultZone();

	public ServerConfig(String hostname, int port, ExecutorService service, CountDownLatch latch) {
		this.hostname = hostname;
		this.port = port;
		this.service = service;
		this.latch = latch;
	}

	public String getHostname() {
		return hostname;
	}

	public int getPort() {
		return port;
	}

	public ExecutorService getService() {
		return service;
	}

	public CountDownLatch getLatch() {
		return latch;
	}

	public Clock getClock() {
		return clock;
	}

	public void setClock(Clock clock) {
		this.clock = clock;
	}
}