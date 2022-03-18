package com.twitter.teruteru128.study.crypto;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.security.AlgorithmParameters;
import java.security.KeyFactory;
import java.security.Security;
import java.security.Signature;
import java.security.SignedObject;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECGenParameterSpec;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPrivateKeySpec;
import java.security.spec.ECPublicKeySpec;
import java.util.Base64;
import java.util.concurrent.Callable;

import javax.crypto.Cipher;
import javax.crypto.SealedObject;

import org.bouncycastle.jce.provider.BouncyCastleProvider;

/**
 * ECIES/ECDSAでSealedObject/SignedObjectテスト
 * 
 */
public class ECIESSample3 implements Callable<Void> {

  static {
    var provider = Security.getProvider("bc");
    if (provider == null) {
      Security.addProvider(new BouncyCastleProvider());
    }
  }

  /** base64 decoder */
  private Base64.Decoder decoder = Base64.getDecoder();

  public ECPublicKeySpec getA(byte[] publicSigningEncodedKey1, ECParameterSpec parameterSpec) {
    var x = new BigInteger(1, publicSigningEncodedKey1, 1, 32);
    var y = new BigInteger(1, publicSigningEncodedKey1, 33, 32);
    var w = new java.security.spec.ECPoint(x, y);
    return new ECPublicKeySpec(w, parameterSpec);
  }

  public Void call() throws Exception {
    // 秘密鍵をリソースから読み込み
    String signPrivateKeyData1 = null;
    String stringEncryptingPrivateKey2 = null;
    try (var stream = new BufferedReader(
        new InputStreamReader(this.getClass().getResourceAsStream("privatekey.txt")))) {
      signPrivateKeyData1 = stream.readLine();
      stringEncryptingPrivateKey2 = stream.readLine();
    }

    var privateKeyData1 = decoder.decode(signPrivateKeyData1);
    var privateKeyData2 = decoder.decode(stringEncryptingPrivateKey2);

    var publicSigningEncodedKey1 = decoder.decode(ECIESSample.PUBLIC_STATIC_SIGNING_KEY);
    var publicEncryptingEncodedKey1 = decoder.decode(ECIESSample.PUBLIC_STATIC_ENCRYPTING_KEY);

    var parameters = AlgorithmParameters.getInstance("EC");
    parameters.init(new ECGenParameterSpec(ECIESSample.CURVE_NAME));
    var parameterSpec = parameters.getParameterSpec(ECParameterSpec.class);

    // 秘密鍵を鍵スペックに変換
    var signPrivateKeySpec = new ECPrivateKeySpec(new BigInteger(1, privateKeyData1), parameterSpec);
    var encryptPrivateKeySpec = new ECPrivateKeySpec(new BigInteger(1, privateKeyData2), parameterSpec);

    // 非圧縮鍵表現鍵から公開鍵データを鍵スペックに変換
    var publicSignKeySpec = getA(publicSigningEncodedKey1, parameterSpec);
    var publicEncryptKeySpec = getA(publicEncryptingEncodedKey1, parameterSpec);

    // 鍵ファクトリ
    var factory1 = KeyFactory.getInstance("EC");

    // オブジェクト生成
    // 鍵スペックから鍵に変換する
    var encryptPublicKey = (ECPublicKey) factory1.generatePublic(publicEncryptKeySpec);
    // 暗号インスタンス作成
    var cipher = Cipher.getInstance("ECIESwithSHA512");
    // 暗号化モードで初期化
    cipher.init(Cipher.ENCRYPT_MODE, encryptPublicKey);
    // 秘密鍵生成
    var signPrivateKey = (ECPrivateKey) factory1.generatePrivate(signPrivateKeySpec);
    Signature sign = Signature.getInstance("SHA3-512WithECDSA", "BC");
    SignedObject signedObject = new SignedObject(new SealedObject(new SerializableImplementation(), cipher),
        signPrivateKey, sign);

    var signPublicKey = (ECPublicKey) factory1.generatePublic(publicSignKeySpec);
    var encryptPrivateKey = (ECPrivateKey) factory1.generatePrivate(encryptPrivateKeySpec);
    // 復号モードで初期化
    cipher.init(Cipher.DECRYPT_MODE, encryptPrivateKey);
    if (signedObject.verify(signPublicKey, sign)) {
      var obj1 = (SealedObject)signedObject.getObject();
      var obj2 = obj1.getObject(cipher);
      System.out.println(obj2);
    }
    return null;
  }
}
