package com.twitter.teruteru128.test.rsa.sample006;

public interface KeyPairGenerator {

	void init(KeyGenerationParameters parameters);

	AsymmetricKeyPair generateKeyPair();
}