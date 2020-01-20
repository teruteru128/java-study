package com.twitter.teruteru128.study.ec.sample001;

import java.util.Enumeration;
import java.util.regex.Pattern;

import org.bouncycastle.jce.ECNamedCurveTable;

/**
 * @author Teruteru
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Pattern pattern = Pattern.compile("256|5[27]1");
		Enumeration<?> names = ECNamedCurveTable.getNames();
		while (names.hasMoreElements()) {
			Object object = (Object) names.nextElement();
			if (object instanceof String) {
				String name = (String) object;
				if (pattern.matcher(name).find()) {
					System.out.println(name);
				}
			}
		}
	}

}
