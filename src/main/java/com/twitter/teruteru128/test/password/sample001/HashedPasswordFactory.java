package com.twitter.teruteru128.test.password.sample001;

/**
 * 
 */
public abstract class HashedPasswordFactory {

	protected int version;

	/**
	 * 
	 */
	protected HashedPasswordFactory(int version) {
		this.version = version;
	}

	/**
	 * 
	 */
	abstract public String hashPassword(char[] password);

	/**
	 * @return version
	 */
	public int getVersion() {
		return version;
	}

}