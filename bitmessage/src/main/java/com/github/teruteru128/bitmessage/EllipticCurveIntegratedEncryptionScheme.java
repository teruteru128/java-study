package com.github.teruteru128.bitmessage;

import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.SecureRandom;
import java.security.spec.ECGenParameterSpec;
import java.security.spec.InvalidKeySpecException;
import java.util.Arrays;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyAgreement;
import javax.crypto.Mac;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.ShortBufferException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.bouncycastle.jce.ECNamedCurveTable;
import org.bouncycastle.jce.interfaces.ECPrivateKey;
import org.bouncycastle.jce.interfaces.ECPublicKey;
import org.bouncycastle.jce.spec.ECParameterSpec;
import org.bouncycastle.jce.spec.ECPublicKeySpec;
import org.bouncycastle.math.ec.ECCurve;

/**
 * 楕円曲線暗号統合暗号化スキーム
 * MAC付きじゃねえかお前んちぃ！
 *
 * @see <a href="https://w.wiki/6yVA">Integrated Encryption Scheme</a>
 */
public class EllipticCurveIntegratedEncryptionScheme {

  public static final SecureRandom SECURE_RANDOM = new SecureRandom();
  private static final KeyPairGenerator KEY_PAIR_GENERATOR;
  private static final ECParameterSpec SECP_256_K_1 = ECNamedCurveTable.getParameterSpec(
      "secp256k1");
  private static final ECCurve SECP_256_K_1_CURVE = SECP_256_K_1.getCurve();
  private static final KeyFactory KEY_FACTORY;

  static {
    try {
      KEY_PAIR_GENERATOR = KeyPairGenerator.getInstance("EC", "BC");
      KEY_PAIR_GENERATOR.initialize(new ECGenParameterSpec("secp256k1"));
      KEY_FACTORY = KeyFactory.getInstance("EC", "BC");
    } catch (NoSuchAlgorithmException | NoSuchProviderException |
             InvalidAlgorithmParameterException e) {
      throw new InternalError(e);
    }
  }

  private EllipticCurveIntegratedEncryptionScheme() {
  }

  public static byte[] encrypt(byte[] message, ECPublicKey publicKey) {
    try {
      // generate ephemeral ec key
      var ephemeralKeyPair = generateEcKeyPair();

      var secret = generateSharedSecret(publicKey, (ECPrivateKey) ephemeralKeyPair.getPrivate());

      // init encrypt context
      var aes = Cipher.getInstance("AES/CBC/PKCS7Padding");
      var ivSize = aes.getBlockSize();
      var iv = new byte[ivSize];
      SECURE_RANDOM.nextBytes(iv);
      aes.init(Cipher.ENCRYPT_MODE, new SecretKeySpec(secret.key_e(), "AES"),
          new IvParameterSpec(iv));

      var mac = Mac.getInstance("HmacSHA256");
      // encode iv and public key
      var pubKey = getPublicKey((ECPublicKey) ephemeralKeyPair.getPublic());
      var publicKeyLength = pubKey.length;
      var messageLength = message.length;
      var outputSize = aes.getOutputSize(messageLength);
      int prefixLength = ivSize + publicKeyLength;
      var encryptedLength = prefixLength + outputSize;
      var ciphertext = new byte[encryptedLength + mac.getMacLength()];
      System.arraycopy(iv, 0, ciphertext, 0, ivSize);
      System.arraycopy(pubKey, 0, ciphertext, ivSize, publicKeyLength);

      // encrypt
      aes.doFinal(message, 0, messageLength, ciphertext, prefixLength);

      // generate mac code
      mac.init(new SecretKeySpec(secret.key_m(), "MAC"));
      mac.update(ciphertext, 0, encryptedLength);
      mac.doFinal(ciphertext, encryptedLength);
      return ciphertext;
    } catch (NoSuchAlgorithmException | NoSuchPaddingException | NoSuchProviderException |
             InvalidKeyException | InvalidAlgorithmParameterException | IllegalBlockSizeException |
             BadPaddingException | ShortBufferException e) {
      throw new RuntimeException(e);
    }
  }

  private static SharedKeys generateSharedSecret(ECPublicKey publicKey, ECPrivateKey privateKey)
      throws NoSuchAlgorithmException, NoSuchProviderException, InvalidKeyException {
    var key = generateKey(publicKey, privateKey);
    var key_e = Arrays.copyOfRange(key, 0, 32);
    var key_m = Arrays.copyOfRange(key, 32, 64);
    return new SharedKeys(key_e, key_m);
  }

  private static SharedKeys2 generateSharedSecret2(ECPublicKey publicKey, ECPrivateKey privateKey)
      throws NoSuchAlgorithmException, NoSuchProviderException, InvalidKeyException {
    var key = generateKey(publicKey, privateKey);
    return new SharedKeys2(key, 0, 32, 32, 32);
  }

  private static byte[] generateKey(ECPublicKey publicKey, ECPrivateKey privateKey)
      throws NoSuchAlgorithmException, NoSuchProviderException, InvalidKeyException {
    var agreement = KeyAgreement.getInstance("ECDH", "BC");
    agreement.init(privateKey);
    agreement.doPhase(publicKey, true);
    var secret = agreement.generateSecret();
    return MessageDigest.getInstance("SHA-512").digest(secret);
  }

  private static byte[] getPublicKey(ECPublicKey key) {
    // key.getEncoded()では長さと鍵の組み合わせに変換するのが面倒だから
    var q = key.getQ();
    var x = q.getXCoord().getEncoded();
    var y = q.getYCoord().getEncoded();
    return ByteBuffer.allocate(6 + x.length + y.length).putShort((short) 0x02CA)
        .putShort((short) x.length).put(x).putShort((short) y.length).put(y).array();
  }

  public static KeyPair generateEcKeyPair() {
    return KEY_PAIR_GENERATOR.generateKeyPair();
  }

  public static ECPublicKey generateEcPublicKey() {
    return (ECPublicKey) generateEcKeyPair().getPublic();
  }

  /**
   * @param message encrypted text
   * @param privateKey private key
   * @return clear text
   */
  public static byte[] decrypt(byte[] message, ECPrivateKey privateKey) {
    try {
      var aes = Cipher.getInstance("AES/CBC/PKCS7Padding");
      var ivSize = aes.getBlockSize();
      var keysLength = getKeysLength(message, ivSize);
      var headerLength = 6 + ivSize + keysLength.xLength() + keysLength.yLength();

      var x = new BigInteger(1, message, ivSize + 4, keysLength.xLength());
      var y = new BigInteger(1, message, ivSize + 6 + keysLength.xLength(),
          keysLength.yLength());
      var keySpec = new ECPublicKeySpec(SECP_256_K_1_CURVE.createPoint(x, y), SECP_256_K_1);

      var pubKey = (ECPublicKey) KEY_FACTORY.generatePublic(keySpec);

      var secret = generateSharedSecret2(pubKey, privateKey);
      var hmacSHA256 = Mac.getInstance("HmacSHA256");
      hmacSHA256.init(new SecretKeySpec(secret.key(), secret.m_offset(), secret.m_length(), "MAC"));
      var macLength = hmacSHA256.getMacLength();
      var macOffset = message.length - macLength;
      hmacSHA256.update(message, 0, macOffset);
      var mac = Arrays.copyOfRange(message, macOffset, message.length);
      if (!MessageDigest.isEqual(mac, hmacSHA256.doFinal())) {
        throw new RuntimeException("Fail to verify data");
      }
      aes.init(Cipher.DECRYPT_MODE, new SecretKeySpec(secret.key(), secret.e_offset(), secret.e_length(), "AES"),
          new IvParameterSpec(message, 0, ivSize));
      var ciphertextLength = message.length - (macLength + headerLength);
      return aes.doFinal(message, headerLength, ciphertextLength);
    } catch (NoSuchAlgorithmException | NoSuchPaddingException | NoSuchProviderException |
             InvalidKeySpecException | InvalidKeyException | InvalidAlgorithmParameterException |
             IllegalBlockSizeException | BadPaddingException e) {
      throw new RuntimeException(e);
    }
  }

  private static KeysLength getKeysLength(byte[] message, int blockSize) {
    var buf = ByteBuffer.wrap(message, blockSize, message.length - blockSize);
    // curve type
    buf.getShort();
    short xLength = buf.getShort();
    byte[] x1 = new byte[xLength];
    buf.get(x1);
    short yLength = buf.getShort();
    return new KeysLength(xLength, yLength);
  }

  private record KeysLength(short xLength, short yLength) {

  }

  private record SharedKeys(byte[] key_e, byte[] key_m) {

  }

  private record SharedKeys2(byte[] key, int e_offset, int e_length, int m_offset, int m_length) {

  }
}
