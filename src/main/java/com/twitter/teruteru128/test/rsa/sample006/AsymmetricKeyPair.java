package com.twitter.teruteru128.test.rsa.sample006;

public class AsymmetricKeyPair {
	private AsymmetricKeyParameter publicParameter;
	private AsymmetricKeyParameter privateParameter;

	/**
	 * 
	 */
	public AsymmetricKeyPair(AsymmetricKeyParameter pub,
			AsymmetricKeyParameter pri) {
		this.publicParameter = pub;
		this.privateParameter = pri;
	}

	/**
	 * @return publicParameter
	 */
	public AsymmetricKeyParameter getPublic() {
		return publicParameter;
	}

	/**
	 * @return privateParameter
	 */
	public AsymmetricKeyParameter getPrivate() {
		return privateParameter;
	}
}