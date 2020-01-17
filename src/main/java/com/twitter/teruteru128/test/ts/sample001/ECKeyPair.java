package com.twitter.teruteru128.test.ts.sample001;

import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;

class ECKeyPair extends KeyPair<ECPrivateKey, ECPublicKey> {

	/**
	 * @param privateKey
	 * @param publicKey
	 */
	public ECKeyPair(ECPrivateKey privateKey, ECPublicKey publicKey) {
		super(privateKey, publicKey);
	}

}