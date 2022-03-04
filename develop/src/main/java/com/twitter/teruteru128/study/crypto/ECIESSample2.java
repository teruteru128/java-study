package com.twitter.teruteru128.study.crypto;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.security.AlgorithmParameters;
import java.security.KeyFactory;
import java.security.Security;
import java.security.spec.ECGenParameterSpec;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPrivateKeySpec;
import java.security.spec.ECPublicKeySpec;
import java.time.Duration;
import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.Callable;

import javax.crypto.Cipher;

import org.bouncycastle.jce.provider.BouncyCastleProvider;

/**
 * ECIESで1GBぐらい暗号化してみるテスト。
 * 
 * PT13.582122362S, 1073741953bytes, 129bytes
 * 35 秒ぐらい、 SHA1(-MAC) の 20 byte + secp256k1 公開鍵の 65byte の計 85byte 増加する
 * 13 秒ぐらい、 SHA512(-MAC) の 64 byte + secp256k1 公開鍵の 65byte の計 129byte 増加する
 * Java くんどうして SHA-512 のほうが早いの……？
 * 
 * 空間の歪み＝質量＝エネルギー
 * 質量エネルギー等価性e=mc^2
 * アインシュタイン方程式Gμν+Λgμν=κTμν
 * 暗黒物質は質量を持ち重力として存在するが、光学的に直接観測できない
 */
public class ECIESSample2 implements Callable<Void> {

  static {
    var provider = Security.getProvider("bc");
    if (provider == null) {
      Security.addProvider(new BouncyCastleProvider());
    }
  }

  public Void call() throws Exception {
    /** base64 decoder */
    Base64.Decoder decoder = Base64.getDecoder();
    // 秘密鍵をリソースから読み込み
    String stringPrivateKeyData1 = null;
    try (var stream = new BufferedReader(
        new InputStreamReader(this.getClass().getResourceAsStream("privatekey.txt")))) {
      stringPrivateKeyData1 = stream.readLine();
    }
    var privateKeyData1 = decoder.decode(stringPrivateKeyData1);
    var publicKeyData1 = decoder.decode(ECIESSample.STATIC_PUBLIC_KEY1);
    var parameters = AlgorithmParameters.getInstance("EC");
    parameters.init(new ECGenParameterSpec(ECIESSample.CURVE_NAME));
    var parameterSpec = parameters.getParameterSpec(ECParameterSpec.class);

    // 秘密鍵を鍵スペックに変換
    var privateKeySpec = new ECPrivateKeySpec(new BigInteger(1, privateKeyData1), parameterSpec);

    // 非圧縮鍵表現鍵から公開鍵を鍵スペックに変換
    var x = new BigInteger(1, Arrays.copyOfRange(publicKeyData1, 1, 33));
    var y = new BigInteger(1, Arrays.copyOfRange(publicKeyData1, 33, 65));
    var w = new java.security.spec.ECPoint(x, y);
    var publicKeySpec = new ECPublicKeySpec(w, parameterSpec);

    //
    var factory1 = KeyFactory.getInstance("EC");

    // 鍵スペックから鍵に変換する
    var publicKey = factory1.generatePublic(publicKeySpec);
    var cipher = Cipher.getInstance("ECIESwithSHA512");
    cipher.init(Cipher.ENCRYPT_MODE, publicKey);
    byte[] ciphertext = null;
    long start = 0;
    long finish = 0;
    var messagetext = new byte[1024 * 1024 * 1024];
    start = System.nanoTime();
    ciphertext = cipher.doFinal(messagetext);
    finish = System.nanoTime();
    var diff = Duration.ofNanos(finish - start);
    System.out.printf("%s, %dbytes, %dbytes%n", diff, ciphertext.length, ciphertext.length - messagetext.length);
    return null;
  }
}