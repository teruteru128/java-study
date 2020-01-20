package com.twitter.teruteru128.sample.utf8;

import javax.xml.bind.DatatypeConverter;

public class Main {

	public static void main(String[] args) {
		String code ="e381ab e38198 e38288 e38281 e381a1 e38283 e38293";
		System.out.println(new String(DatatypeConverter.parseHexBinary(code.replaceAll(" ", ""))));
	}
}
