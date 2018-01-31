package com.twitter.teruteru128.test.holders;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import java.security.SecureRandom;

import org.junit.Test;

/**
 * @author Teruteru
 *
 */
public class SecureRandomHolderTest {

	/**
	 * {@link com.twitter.teruteru128.test.holders.SecureRandomHolder#getInstance()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetInstance() {
		assertThat(SecureRandomHolder.getInstance(), is(instanceOf(SecureRandom.class)));
	}

	/**
	 * {@link com.twitter.teruteru128.test.holders.SecureRandomHolder#getInstanceStrong()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetInstanceStrong() {
		assertThat(SecureRandomHolder.getInstanceStrong(), is(instanceOf(SecureRandom.class)));
	}

}
