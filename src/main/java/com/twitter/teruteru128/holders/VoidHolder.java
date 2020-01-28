package com.twitter.teruteru128.holders;

import java.lang.reflect.Constructor;

/**
 * @author Teruteru
 *
 */
public final class VoidHolder {
	/**
	 * 
	 */
	private VoidHolder() {
	}

	private static Void INSTANCE;
	static {
		Void instance = null;
		try {
			Class<Void> clazz = Void.class;
			Constructor<Void> constructor = clazz.getDeclaredConstructor();
			constructor.setAccessible(true);
			instance = constructor.newInstance();
		} catch (Throwable e) {
			throw new InternalError(e);
		} finally {
			INSTANCE = instance;
		}
	}

	public static Void getInstance() {
		return INSTANCE;
	}
}
