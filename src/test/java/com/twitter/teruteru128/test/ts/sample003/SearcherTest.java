package com.twitter.teruteru128.test.ts.sample003;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import javax.mail.search.AndTerm;

import junit.framework.TestCase;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @author Teruteru
 *
 */
public class SearcherTest extends TestCase {

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	@Override
	public void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	@Override
	public void tearDown() throws Exception {
	}

	/**
	 * @throws SecurityException
	 * @throws NoSuchMethodException
	 * @throws InvocationTargetException
	 * @throws IllegalArgumentException
	 * @throws IllegalAccessException
	 * @throws NumberFormatException
	 * 
	 */
	@Test
	public void testToUnsignedDecByteArray() throws NoSuchMethodException,
			SecurityException, NumberFormatException, IllegalAccessException,
			IllegalArgumentException, InvocationTargetException {
		Searcher searcher = new Searcher("", 1L, 0);
		Method method = Searcher.class.getDeclaredMethod(
				"toUnsignedDecByteArray", long.class, byte[].class);
		method.setAccessible(true);
		byte[] buf = new byte[25];
		String t = "17947096141301335920";
		long l = Long.parseUnsignedLong(t, 10);
		int length = (int) method.invoke(searcher, l, buf);
		assertThat(length, is(20));
		assertThat(new String(buf, 0, length), is(t));
	}
}
