package com.twitter.teruteru128.test.ecc.sample001;

import java.math.BigInteger;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECField;
import java.security.spec.ECFieldF2m;
import java.security.spec.ECFieldFp;
import java.security.spec.ECGenParameterSpec;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.EllipticCurve;
import java.util.Arrays;

import javax.xml.bind.DatatypeConverter;

import com.twitter.teruteru128.test.holders.SecureRandomHolder;

/**
 * @author Teruteru
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws NoSuchAlgorithmException,
			InvalidAlgorithmParameterException {
		SecureRandom random = SecureRandomHolder.getInstanceStrong();
		KeyPairGenerator generator = KeyPairGenerator.getInstance("EC");

		generator.initialize(new ECGenParameterSpec("secp521r1"), random);

		KeyPair pair1 = generator.generateKeyPair();
		KeyPair pair2 = generator.generateKeyPair();

		ECPrivateKey privateKey1 = (ECPrivateKey) pair1.getPrivate();
		ECPublicKey publicKey1 = (ECPublicKey) pair1.getPublic();

		ECPrivateKey privateKey2 = (ECPrivateKey) pair2.getPrivate();
		ECPublicKey publicKey2 = (ECPublicKey) pair2.getPublic();

		ECParameterSpec spec = privateKey1.getParams();

		EllipticCurve curve = spec.getCurve();
		BigInteger a = curve.getA();
		BigInteger b = curve.getB();
		System.out.printf("係数A : \t0x%0132X%n", a);
		System.out.printf("係数B : \t0x%0132X%n", b);
		ECField field = curve.getField();
		int fieldSize = field.getFieldSize();
		System.out.printf("体のサイズ : %dbit%n", fieldSize);
		if (field instanceof ECFieldF2m) {
			ECFieldF2m f2m = (ECFieldF2m) field;
			int m = f2m.getM();
			int[] array = f2m.getMidTermsOfReductionPolynomial();
			BigInteger f = f2m.getReductionPolynomial();
			System.out.println("標数2の有限体");
			System.out.printf("m : %d%n", m);
			if (array == null) {
				System.out.println("標準基底");
			} else {
				System.out.println("多項式基底");
				System.out.printf("次数 : %s%n", Arrays.toString(array));
				System.out.printf("次数ビット : %s%n", f.toString(2));
			}
		} else if (field instanceof ECFieldFp) {
			ECFieldFp fp = (ECFieldFp) field;
			BigInteger p = fp.getP();
			System.out.println("素数位数の有限体");
			System.out.printf("素数P : \t0x%0132X%n", p);
		} else {
			System.out.printf("その他の有限体 : %s%n", field.getClass());
		}
		byte[] seed = curve.getSeed();
		if (seed == null) {
			System.out.println("seed is null");
		} else {
			System.out.printf("シード値 : %s%n",
					DatatypeConverter.printHexBinary(seed));
		}
		ECPoint basePoint = spec.getGenerator();
		BigInteger affineX = basePoint.getAffineX();
		BigInteger affineY = basePoint.getAffineY();
		System.out.printf("基底点座標X : 0x%0132X%n", affineX);
		System.out.printf("基底点座標Y : 0x%0132X%n", affineY);
		BigInteger order = spec.getOrder();
		System.out.printf("位数 : \t\t0x%0132X%n", order);
		int cofactor = spec.getCofactor();
		System.out.printf("余因子 : %d%n", cofactor);

		BigInteger s1 = privateKey1.getS();
		ECPoint w1 = publicKey1.getW();

		BigInteger s2 = privateKey2.getS();
		ECPoint w2 = publicKey2.getW();
		
		System.out.println();
		System.out.println("--");
		System.out.println();
		System.out.printf("秘密鍵S : \t0x%0132X%n", s1);
		System.out.printf("公開鍵座標X : \t0x%0132X%n", w1.getAffineX());
		System.out.printf("公開鍵座標Y : \t0x%0132X%n", w1.getAffineY());
		System.out.println();
		System.out.println("--");
		System.out.println();
		System.out.printf("秘密鍵S : \t0x%0132X%n", s2);
		System.out.printf("公開鍵座標X : \t0x%0132X%n", w2.getAffineX());
		System.out.printf("公開鍵座標Y : \t0x%0132X%n", w2.getAffineY());
	}

}
