package com.twitter.teruteru128.test.serialize.sample001;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import javax.xml.bind.DatatypeConverter;

/**
 * @author Teruteru
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ByteArrayOutputStream stream = new ByteArrayOutputStream();
		try (ObjectOutputStream oos = new ObjectOutputStream(stream)) {
			oos.writeObject(new Serializable() {
				/**
				 * 
				 */
				private static final long serialVersionUID = 1L;
			});
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(DatatypeConverter.printHexBinary(stream.toByteArray()));
	}

}
