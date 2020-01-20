package com.twitter.teruteru128.study.rsa.sample006;

public interface KeyPairGenerator {

	void init(KeyGenerationParameters parameters);

	AsymmetricKeyPair generateKeyPair();
}