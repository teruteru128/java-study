package com.twitter.teruteru128.study.ts.sample001;

import java.io.IOException;
import java.math.BigInteger;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.security.AlgorithmParameters;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECGenParameterSpec;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPrivateKeySpec;
import java.security.spec.ECPublicKeySpec;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.InvalidParameterSpecException;
import java.util.Base64;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1InputStream;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERBitString;
import org.bouncycastle.asn1.DERSequence;

/**
 * @author Teruteru
 * @see <a
 *      href="https://github.com/landave/TSIdentityTool">landave/TSIdentityTool
 *      - Github</a>
 * @see <a href="https://hackforums.net/showthread.php?tid=5610594">What is the
 *      target hash for a certain security level in TeamSpeak 3?</a>
 */
public class Main {

	/**
	 * @param argv
	 */
	public static void main(String[] argv) {
		int argc = argv.length;

		if (argc < 1) {
			printHelp();
			return;
		}

		if (argv[0].equals("read")) {
			if (argc < 2) {
				printf("Missing argument: input ini identity file.\n");
			} else {
				readIdentity(argv[1]);
			}
		}
	}

	/**
	 * @param filename
	 */
	private static void readIdentity(String filename) {
		Path path = Paths.get(filename);
		if (!Files.exists(path)) {
			printf("Error: The ini file does not exist.%n");
		}
		if (!Files.isReadable(path)) {
			printf("Error: The ini file is not readable.%n");
		}
		String[] obfuscatedIdentity_base64 = { null };
		long[] counter = { 0 };
		if (parseIni(path, obfuscatedIdentity_base64, counter)) {
			printf("An error occurred while parsing the ini file.%n");
			return;
		}
		ECKeyPair[] ecckey = { null };
		if (deObfuscateKey(obfuscatedIdentity_base64[0], ecckey)) {

		}
		System.out.println(ecckey[0].getPrivateKey());

		String[] ecc_public_base64 = { null };
		if (extractPublicKeyBase64(ecckey[0], ecc_public_base64)) {
		}
		String[] idfingerprint = { null };
		if (getIDFingerprint(ecc_public_base64, idfingerprint)) {
		}

		printf("Public key: %s\n", ecc_public_base64[0]);
		printf("Public key length (Base64): %d\n",
				ecc_public_base64[0].length());
		printf("Fingerprint: %s\n", idfingerprint[0]);
		printf("Curve size (octets): %d\n", ecckey[0].getPublicKey()
				.getParams().getCurve().getField().getFieldSize());
		printf("Current security level: %d (with counter=%s)\n",
				getSecurityLevel(ecc_public_base64[0], counter[0]),
				Long.toUnsignedString(counter[0], 10));

	}

	/**
	 * @param string
	 * @param l
	 * @return
	 */
	private static int getSecurityLevel(String string, long l) {
		int zerobytes = 0;
		int zerobits = 0;
		try {
			MessageDigest sha1 = MessageDigest.getInstance("SHA-1");
			byte[] hash = sha1.digest(String.format("%s%s", string,
					Long.toUnsignedString(l, 10)).getBytes());
			while (zerobytes < 20 && hash[zerobytes] == 0) {
				zerobytes++;
			}
			if (zerobytes < 20) {
				byte lastbyte = hash[zerobytes];
				while ((lastbyte & 1) != 1) {
					zerobits++;
					lastbyte >>= 1;
				}
			}
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
		System.out.printf("bytes : %d%n", zerobytes);
		System.out.printf("bits : %d%n", zerobits);
		return 8 * zerobytes + zerobits;
	}

	/**
	 * @param ecc_public_base64
	 * @param idfingerprint
	 * @return
	 */
	private static boolean getIDFingerprint(String[] ecc_public_base64,
			String[] idfingerprint) {
		return false;
	}

	/**
	 * @param ecckey
	 * @param ecc_public_base64
	 * @return
	 */
	private static boolean extractPublicKeyBase64(ECKeyPair ecckey,
			String[] ecc_public_base64) {
		try {
			ECPoint w = ecckey.getPublicKey().getW();
			ASN1Encodable[] v = { new DERBitString(new byte[] { 00 }, 7),
					new ASN1Integer(32L), new ASN1Integer(w.getAffineX()),
					new ASN1Integer(w.getAffineY()) };
			ecc_public_base64[0] = Base64.getEncoder().encodeToString(
					new DERSequence(v).getEncoded("der"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		return false;
	}

	/**
	 * @param obfuscatedIdentity_base64
	 * @param pair
	 * @return
	 */
	private static boolean deObfuscateKey(String obfuscatedIdentity_base64,
			ECKeyPair[] pair) {
		byte[] actualIdentity;
		byte[] eccKeyString;
		Base64.Decoder decoder = Base64.getDecoder();
		actualIdentity = decoder.decode(obfuscatedIdentity_base64);
		if (deObfuscateInplace(actualIdentity)) {
			return true;
		}
		System.out.printf("%s%n", new String(actualIdentity));
		eccKeyString = decoder.decode(actualIdentity);
		try (ASN1InputStream in = new ASN1InputStream(eccKeyString)) {

			ASN1Sequence sequence = (ASN1Sequence) in.readObject();
			BigInteger publicKeyX = ((ASN1Integer) sequence.getObjectAt(2))
					.getPositiveValue();
			BigInteger publicKeyY = ((ASN1Integer) sequence.getObjectAt(3))
					.getPositiveValue();
			BigInteger privateKey = ((ASN1Integer) sequence.getObjectAt(4))
					.getPositiveValue();
			AlgorithmParameters parameters = AlgorithmParameters
					.getInstance("EC");
			parameters.init(new ECGenParameterSpec("secp256r1"));
			ECParameterSpec para = parameters
					.getParameterSpec(ECParameterSpec.class);
			ECPrivateKeySpec privateKeySpec = new ECPrivateKeySpec(privateKey,
					para);
			ECPublicKeySpec publicKeySpec = new ECPublicKeySpec(new ECPoint(
					publicKeyX, publicKeyY), para);
			KeyFactory factory = KeyFactory.getInstance("EC");
			pair[0] = new ECKeyPair(
					(ECPrivateKey) factory.generatePrivate(privateKeySpec),
					(ECPublicKey) factory.generatePublic(publicKeySpec));
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		} catch (InvalidKeySpecException e) {
			e.printStackTrace();
		} catch (InvalidParameterSpecException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return false;
	}

	static private final byte[] TSKEY = "b9dfaa7bee6ac57ac7b65f1094a1c155e747327bc2fe5d51c512023fe54a280201004e90ad1daaae1075d53b7d571c30e063b5a62a4a017bb394833aa0983e6e"
			.getBytes();

	/**
	 * @param data
	 * @return
	 */
	private static boolean deObfuscateInplace(byte[] data) {
		try {
			MessageDigest sha1 = MessageDigest.getInstance("SHA-1");
			int zerobytes = 0;
			while ((zerobytes + 20) < data.length && data[20 + zerobytes] != 0) {
				zerobytes++;
			}
			sha1.update(data, 20, zerobytes);
			byte[] hash = sha1.digest();
			for (int i = 0; i < 20; i++) {
				data[i] ^= hash[i];
			}
			int dataSize = Math.min(100, data.length);
			for (int i = 0; i < dataSize; i++) {
				data[i] ^= TSKEY[i];
			}
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
		return false;
	}

	/**
	 * @param file
	 * @param out_identity
	 * @param counter
	 * @return {@code true} is error.
	 */
	private static boolean parseIni(Path path, String[] out_identity,
			long[] counter) {
		boolean ret = false;
		try {
			String filecontent = new String(Files.readAllBytes(path));
			final String IDENT_STR = "identity";
			int currentpos = filecontent.indexOf(IDENT_STR);
			if (currentpos == -1) {
				return true;
			}
			String currentpos_str = filecontent.substring(currentpos);
			currentpos = currentpos_str.indexOf('"');
			if (currentpos == -1) {
				return true;
			}
			int counteridentity_startpos = currentpos + 1;
			int counteridentity_endpos = currentpos_str.indexOf('"',
					counteridentity_startpos);
			if (counteridentity_endpos == -1) {
				return true;
			}
			int counterptr = counteridentity_startpos;
			int delimiter_pos = currentpos_str.indexOf('V',
					counteridentity_startpos);
			if (delimiter_pos == -1 || delimiter_pos >= counteridentity_endpos) {
				return true;
			}
			int identityptr = delimiter_pos + 1;
			int counter_len = delimiter_pos - counterptr;
			int identity_len = counteridentity_endpos - delimiter_pos - 1;
			String counter_str = currentpos_str.substring(counterptr,
					counterptr + counter_len);
			if (!counter_str.matches("\\d+")) {
				return true;
			}
			String identity = currentpos_str.substring(identityptr, identityptr
					+ identity_len);
			if (!identity.matches("\\p{Graph}+")) {
				return true;
			}
			out_identity[0] = identity;
			counter[0] = Long.parseUnsignedLong(counter_str, 10);
		} catch (IOException e) {
			return true;
		}

		return ret;
	}

	/**
	 * 
	 */
	private static void printHelp() {
		printf("Usage: TSIdentityTool COMMAND [OPTIONS]%n%n");
		printf("Available commands:%n");
		printf("read inidentity.ini%n");
	}

	/**
	 * 
	 */
	private static void printf(String x, Object... objects) {
		System.out.printf(x, (Object[]) objects);
	}

}