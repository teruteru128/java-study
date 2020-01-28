package com.twitter.teruteru128.study.net;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

final class VoidHolder {

	private VoidHolder() {
	}

	private static final Void INSTANCE;
	static {
		Void instance = null;
		try {
			Constructor<Void> constructor = Void.class.getDeclaredConstructor(new Class<?>[] {});
			constructor.setAccessible(true);
			constructor.newInstance(new Object[0]);
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
			if (instance == null) {
				throw new InternalError("The Void instance could not be created.");
			} else {
				INSTANCE = instance;
			}
		}
	}

	public static Void getInstance() {
		return INSTANCE;
	}
}