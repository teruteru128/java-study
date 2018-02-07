package com.twitter.teruteru128.holders;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

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
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		} finally {
			INSTANCE = instance;
		}
	}

	public static Void getInstance() {
		return INSTANCE;
	}
}
