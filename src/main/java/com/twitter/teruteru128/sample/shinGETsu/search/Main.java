package com.twitter.teruteru128.sample.shinGETsu.search;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Random;
import java.util.regex.Pattern;

import com.twitter.teruteru128.sample2.x25519chacha20poly1305.DataPrinter;

public class Main {

	private static final Pattern pattern1 = Pattern.compile("&");
	private static final Pattern pattern2 = Pattern.compile("&amp;(#\\d+|#[Xx][0-9A-Fa-f]+|[A-Za-z0-9]+);");
	private static final Pattern pattern3 = Pattern.compile("<");
	private static final Pattern pattern4 = Pattern.compile(">");
	private static final Pattern pattern5 = Pattern.compile("\r");
	private static final Pattern pattern6 = Pattern.compile("\n");

	private static String escape(String a) {
		String msg = pattern1.matcher(a).replaceAll("&amp;");
		msg = pattern2.matcher(msg).replaceAll("&$1;");
		msg = pattern3.matcher(msg).replaceAll("&lt;");
		msg = pattern4.matcher(msg).replaceAll("&gt;");
		msg = pattern5.matcher(msg).replaceAll("");
		msg = pattern6.matcher(msg).replaceAll("<br>");
		return msg;
	}

	public static void main(String[] args) throws Exception {
		System.out.println(LocalDateTime.now());
		MessageDigest md5 = MessageDigest.getInstance("md5");
		byte[] prefix = "body:IGA".getBytes();
		StringBuilder builder = new StringBuilder(0x807);
		Random random = new Random(System.nanoTime());
		String bodystr = null;
		String escapedStr = null;
		byte[] id = null;
		byte[] target = BigInteger.valueOf(0x19190721).toByteArray();
		for (long i = 0; i < 0x7ffL; i++) {
			md5.update(prefix);
			for (int j = 0; j < i; j++) {
				builder.append('A');
			}
			bodystr = builder.toString();
			escapedStr = escape(bodystr);
			md5.update(escapedStr.getBytes());
			id = md5.digest();
			System.out.println(DataPrinter.printHexBinary(id));

			if (Arrays.equals(id, 0, 4, target, 0, 4)) {
				System.out.println(bodystr);
				System.out.println(escapedStr);
				System.out.println(DataPrinter.printHexBinary(id));
				break;
			}
			builder.setLength(0);
		}
		System.out.println(LocalDateTime.now());
	}

}
