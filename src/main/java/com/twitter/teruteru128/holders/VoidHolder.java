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
			Constructor<Void> constructor = clazz
					.getDeclaredConstructor(new Class<?>[0]);
			constructor.setAccessible(true);
			instance = constructor.newInstance(new Object[0]);
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
