package com.twitter.teruteru128.study.bitmessage.genaddress;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

class Queues {
	/**
	 * オリジナルはタプルで実装されています。
	 */
	private static final BlockingQueue<AddressGeneratorRequest> ADDRESS_GENERATOR_QUEUE = new LinkedBlockingQueue<>();

	private Queues() {
	}

	public static BlockingQueue<AddressGeneratorRequest> getAddressGeneratorQueue() {
		return ADDRESS_GENERATOR_QUEUE;
	}
}