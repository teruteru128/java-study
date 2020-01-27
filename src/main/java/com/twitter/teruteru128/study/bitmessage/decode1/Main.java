package com.twitter.teruteru128.study.bitmessage.decode1;

import java.util.Base64;

public class Main {

	public static void main(String[] args) {
		var privsigningkey = "5JVK5vzpfU7Noa2dfaBGTZ3zzQG8WntT2kMeZk4MroZyEiJBuNM";
		var privencryptionkey = "5JiaY6eLJKb6LDt9oQEDXssA3H4y6wbFEZHdkHjikTJFygbT4gu";
		var decoder = Base64.getDecoder();
		var binkey = decoder.decode(privsigningkey);
		int i = 0;
		for (i = 0; i < binkey.length; i++) {
			System.out.printf("%02x", binkey[i] & 0xff);
		}
		System.out.println();
		var binkey2 = decoder.decode(privencryptionkey);
		for (i = 0; i < binkey2.length; i++) {
			System.out.printf("%02x", binkey2[i] & 0xff);
		}
		System.out.println();
		for (i = 0; i < binkey2.length; i++) {
			System.out.printf("%02x", (binkey[i] ^ binkey2[i]) & 0xff);
		}
		System.out.println();
	}

}
