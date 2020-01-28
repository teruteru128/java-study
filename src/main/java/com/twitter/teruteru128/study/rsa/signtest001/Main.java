package com.twitter.teruteru128.study.rsa.signtest001;

import java.lang.reflect.Constructor;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.security.KeyFactory;
import java.security.PrivateKey;
import java.security.Provider;
import java.security.PublicKey;
import java.security.Security;
import java.security.Signature;
import java.security.spec.MGF1ParameterSpec;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.Optional;

import javax.crypto.Cipher;
import javax.crypto.spec.OAEPParameterSpec;
import javax.crypto.spec.PSource;

public class Main {

	public static void main(String[] args) throws Exception {
		Provider provider = Security.getProvider("BC");
		if (provider == null) {
			// Security.addProvider(provider = new BouncyCastleProvider());
			Optional<Module> optional = ModuleLayer.boot().findModule("org.bouncycastle.provider");
			if (optional.isPresent()) {
				Class<?> class1 = Class.forName(optional.get(), "org.bouncycastle.jce.provider.BouncyCastleProvider");
				Constructor<?> constructor = class1.getConstructor();
				var obj = constructor.newInstance();
				if (obj instanceof Provider) {
					Security.addProvider(provider = (Provider) obj);
				}
			}
		}
		// 1024bit-a2c15196-5e17-4abb-a26e-da81e398f6f3
		// 4096bit-455883ea-20a7-4883-8f99-579e665ce91f
		// 12288bit-b110369c-92b3-432f-acf2-46f760c18837
		// 262144bit-c3af9e7b-ce78-46a8-bfd7-b8ac939c0720
		Path path = Paths.get("D:\\", "Users", "teruteru128", "Documents", "RSA",
				"12288bit-b110369c-92b3-432f-acf2-46f760c18837-pubkey.der");
		Path path2 = Paths.get("D:\\Users", "teruteru128", "Documents", "RSA",
				"12288bit-b110369c-92b3-432f-acf2-46f760c18837-prikey.der");
		// BCプロバイダ、複数素数RSA鍵に対応していない
		KeyFactory factory = KeyFactory.getInstance("RSA");
		PublicKey publicKey = factory.generatePublic(new X509EncodedKeySpec(Files.readAllBytes(path)));
		PrivateKey privateKey = factory.generatePrivate(new PKCS8EncodedKeySpec(Files.readAllBytes(path2)));
		System.out.println(privateKey.getClass());
		/**********************************************/
		Cipher cipher = Cipher.getInstance("RSA/ECB/OAEPWithSHA3-512AndMGF1Padding");
		Signature signature = Signature.getInstance("RSA");
		/**********************************************/
		final byte[] data = new byte[32];
		for (int i = 0; i < data.length; i++) {
			data[i] = (byte) (i & 0xFF);
		}
		/**********************************************/
		OAEPParameterSpec spec = new OAEPParameterSpec("SHA3-512", "MGF1", new MGF1ParameterSpec("SHA3-512"),
				PSource.PSpecified.DEFAULT);
		/**********************************************/
		long start = 0;
		long end = 0;
		cipher.init(Cipher.ENCRYPT_MODE, publicKey, spec);
		start = System.nanoTime();
		byte[] ciphertext = cipher.doFinal(data);
		end = System.nanoTime();
		System.out.printf("%f秒\n", (end - start) / 1000000000.);
		for (int i = 0; i < ciphertext.length; i++) {
			System.out.printf("%02x", ciphertext[i]);
		}
		System.out.println();
		/**********************************************/
		try {
			cipher.init(Cipher.DECRYPT_MODE, privateKey, spec);
			start = System.nanoTime();
			byte[] plaintext = {};
			plaintext = cipher.doFinal(ciphertext);
			end = System.nanoTime();
			System.out.printf("%f秒\n", (end - start) / 1000000000.);

			for (int i = 0; i < plaintext.length; i++) {
				System.out.printf("%02x", plaintext[i]);
			}
			System.out.println();
		} catch (Exception e) {
			e.printStackTrace();
		}
		/**********************************************/

		signature.initSign(privateKey);
		signature.update(data);
		start = System.nanoTime();
		byte[] sign = signature.sign();
		end = System.nanoTime();
		System.out.printf("%f秒\n", (end - start) / 1000000000.);

		for (int i = 0; i < sign.length; i++) {
			System.out.printf("%02x", sign[i]);
		}
		System.out.println();
		/**********************************************/
		signature.initVerify(publicKey);
		signature.update(data);
		start = System.nanoTime();
		System.out.println(signature.verify(sign) ? "verified" : "not verified");
		end = System.nanoTime();
		System.out.printf("%f秒\n", (end - start) / 1000000000.);

	}

}
