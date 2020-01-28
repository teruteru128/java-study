package com.twitter.teruteru128.study.nyanpass;

import java.net.URI;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.BlockingQueue;

class NyanpassConfigBuilder {
	NyanpassConfigBase base = new NyanpassConfigBase();

	public NyanpassConfigBuilder() {
	}

	public NyanpassConfigBuilder setEndpointURI(URI uri) {
		base.setEndpointURI(uri);
		return this;
	}

	public NyanpassConfigBuilder setFormatter(DateTimeFormatter formatter) {
		base.setFormatter(formatter);
		return this;
	}

	public NyanpassConfigBuilder setQueue(BlockingQueue<NyanpassBean> queue) {
		base.setQueue(queue);
		return this;
	}

	public NyanpassConfig build() {
		return base.clone();
	}
}