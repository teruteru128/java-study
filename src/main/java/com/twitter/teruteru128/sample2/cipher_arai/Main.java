package com.twitter.teruteru128.sample2.cipher_arai;

import java.math.BigInteger;
import java.util.Base64;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import javax.xml.bind.DatatypeConverter;

public class Main {

	public static void main(String[] args) throws Exception {
		String keyStr = "3512b51c37086e360289b55ae217565c56816d16a228a162c7a49fe7637f1f8f";
		String base64Text = "bq/oiLRzKv1p4sM+11LT2Kg+MXjvgZAhyuCt2d5wjWfHcf/SQrUWKQkRkLbsaoU6m3iJed8R92A=";

		byte[] k = DatatypeConverter.parseHexBinary(keyStr);
		System.out.write(Base64.getEncoder().encode(k));
		System.out.println();

		SecretKeySpec spec = new SecretKeySpec(k, "blowfish");

		KeyGenerator generator = KeyGenerator.getInstance("blowfish");
		SecretKey key1 = generator.generateKey();
		System.out.println(key1.getEncoded().length);

		Cipher cipher = Cipher.getInstance("blowfish/ECB/NoPadding");
		cipher.init(Cipher.DECRYPT_MODE, spec);

		System.out.write((cipher.doFinal(Base64.getDecoder().decode(base64Text))));

		System.out.println();
		for(byte b :Base64.getDecoder().decode("cookNoatdoufedteolibes==")) {
			int c = b & 0xff;
			System.out.printf("%02x", c);
		}
		System.out.println();
		byte[] text=new BigInteger("0100100000100000010001010010000001001100001000000100110000100000010011110010000001010111001000000100111100100000010100100010000001001100001000000100010000001010000010100100010000100000010011110010000001011001001000000100111100100000010101010010000001001100001000000100100100100000010010110010000001000101001000000100001000100000010010010010000001001110001000000100000100100000010100100010000001011001001000000100001100100000010011110010000001000100001000000100010100001010000010100100111000100000010000010010000001001110001000000100111100100000010001000010000001000001001000001111111100011111001000001111111100011111001000001111111100011111", 2).toByteArray();
		System.out.println(new String(text, "UTF-16BE"));
	}

}
