package com.twitter.teruteru128.test.holders;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author Teruteru
 *
 */
public class VoidHolderTest {

	/**
	 * {@link com.twitter.teruteru128.test.holders.VoidHolder#getInstance()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetInstance() {
		assertThat(VoidHolder.getInstance(), is(instanceOf(Void.class)));
	}

}
