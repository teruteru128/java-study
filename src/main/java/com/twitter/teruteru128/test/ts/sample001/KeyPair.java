package com.twitter.teruteru128.test.ts.sample001;

import java.security.PrivateKey;
import java.security.PublicKey;

abstract class KeyPair<Pri extends PrivateKey, Pub extends PublicKey> {
	private Pri privateKey;
	private Pub publicKey;

	/**
	 * 
	 */
	public KeyPair(Pri privateKey, Pub publicKey) {
		this.privateKey = privateKey;
		this.publicKey = publicKey;
	}

	/**
	 * @return publicKey
	 */
	public Pub getPublicKey() {
		return publicKey;
	}

	/**
	 * @return privateKey
	 */
	public Pri getPrivateKey() {
		return privateKey;
	}
}