package com.twitter.teruteru128.study.rsa.test3;

import java.io.IOException;
import java.io.OutputStream;
import java.math.BigInteger;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.security.NoSuchAlgorithmException;
import java.time.LocalDateTime;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1OutputStream;
import org.bouncycastle.asn1.DERSequence;

public class Mian {

	public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchAlgorithmException {
		var one = BigInteger.valueOf(1);
		var out1 = Paths.get("C:\\Users\\terut\\Downloads\\out6.der");

		System.out.printf("start.%s%n", LocalDateTime.now());
		var in1 = Paths.get("C:\\Users\\terut\\Downloads\\out3.txt");
		var list1 = Files.readAllLines(in1);
		System.out.printf("loaded.%s%n", LocalDateTime.now());
		var p = new BigInteger(list1.get(0), 16);
		System.out.printf("p.%s%n", LocalDateTime.now());
		var q = new BigInteger(list1.get(1), 16);
		System.out.printf("q.%s%n", LocalDateTime.now());

		// var random = SecureRandom.getInstanceStrong();
		// var p = new BigInteger(1024, random);
		// var q = new BigInteger(1024, random);
		// p = p.setBit(1023);
		// q = q.setBit(1023);
		System.out.println(p.bitLength());
		System.out.println(q.bitLength());
		// p = p.nextProbablePrime();
		// q = q.nextProbablePrime();
		System.out.printf("both of prime.%s%n", LocalDateTime.now());
		var n = p.multiply(q);
		System.out.printf("multiply(%dbit).%s%n", n.bitLength(), LocalDateTime.now());
		var e = BigInteger.valueOf(65537);
		if (p.compareTo(q) <= 0) {
			var tmp = p;
			p = q;
			q = tmp;
		}
		var psub1 = p.subtract(one);
		var qsub1 = q.subtract(one);
		var d = e.modInverse(psub1.multiply(qsub1));
		var exponent1 = d.mod(psub1);
		var exponent2 = d.mod(qsub1);
		// required p > q
		assert p.compareTo(q) >= 0;
		var coefficient = q.modInverse(p);

		var version = new ASN1Integer(0);
		var nn = new ASN1Integer(n);
		var ee = new ASN1Integer(e);
		var dd = new ASN1Integer(d);
		var pp = new ASN1Integer(p);
		var qq = new ASN1Integer(q);
		var exp1 = new ASN1Integer(exponent1);
		var exp2 = new ASN1Integer(exponent2);
		var cof = new ASN1Integer(coefficient);
		var sequence = new DERSequence(new ASN1Encodable[] { version, nn, ee, dd, pp, qq, exp1, exp2, cof });
		try (OutputStream os = Files.newOutputStream(out1)) {
			ASN1OutputStream aos = ASN1OutputStream.create(os);
			aos.writeObject(sequence);
			aos.close();
		}
	}

}
