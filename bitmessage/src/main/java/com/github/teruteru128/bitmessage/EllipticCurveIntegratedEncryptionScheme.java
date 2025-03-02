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
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.bouncycastle.jce.spec.ECParameterSpec;
import org.bouncycastle.jce.spec.ECPublicKeySpec;
import org.bouncycastle.math.ec.ECCurve;

/**
 * 楕円曲線暗号統合暗号化スキーム
 * MAC付きじゃねえかお前んちぃ！
 * 暗号化はともかく復号は宛先特定も含むからセットにすると面倒だな……
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
      KEY_PAIR_GENERATOR = KeyPairGenerator.getInstance("EC", BouncyCastleProvider.PROVIDER_NAME);
      KEY_PAIR_GENERATOR.initialize(new ECGenParameterSpec("secp256k1"));
      KEY_FACTORY = KeyFactory.getInstance("EC", BouncyCastleProvider.PROVIDER_NAME);
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

      var key = generateKey(publicKey, (ECPrivateKey) ephemeralKeyPair.getPrivate());

      // init encrypt context
      var aes = Cipher.getInstance("AES/CBC/PKCS7Padding");
      var ivSize = aes.getBlockSize();
      var iv = new byte[ivSize];
      SECURE_RANDOM.nextBytes(iv);
      aes.init(Cipher.ENCRYPT_MODE, new SecretKeySpec(key, 0 , 32, "AES"),
          new IvParameterSpec(iv));

      var mac = Mac.getInstance("HmacSHA256");
      // encode iv and public key
      // key.getEncoded()では長さと鍵の組み合わせに変換するのが面倒だから
      var q = ((ECPublicKey) ephemeralKeyPair.getPublic()).getQ();
      var x = q.getXCoord().getEncoded();
      var y = q.getYCoord().getEncoded();
      var ciphertextLength = aes.getOutputSize(message.length);
      var prefixLength = ivSize + 6 + x.length + y.length;
      var length = prefixLength + ciphertextLength;
      var ciphertextWithMAC = new byte[length + mac.getMacLength()];
      // write header
      putHeader(ciphertextWithMAC, length, iv, x, y);

      // encrypt
      aes.doFinal(message, 0, message.length, ciphertextWithMAC, prefixLength);

      // generate mac code
      mac.init(new SecretKeySpec(key, 32, 32, "MAC"));
      mac.update(ciphertextWithMAC, 0, length);
      mac.doFinal(ciphertextWithMAC, length);
      return ciphertextWithMAC;
    } catch (NoSuchAlgorithmException | NoSuchPaddingException | NoSuchProviderException |
             InvalidKeyException | InvalidAlgorithmParameterException | IllegalBlockSizeException |
             BadPaddingException | ShortBufferException e) {
      throw new RuntimeException(e);
    }
  }

  private static void putHeader(byte[] ciphertextWithMAC, int length, byte[] iv, byte[] x,
      byte[] y) {
    ByteBuffer.wrap(ciphertextWithMAC, 0, length).put(iv).putShort((short) 0x02CA)
        .putShort((short) x.length).put(x).putShort((short) y.length).put(y);
  }

  private static SharedKeys2 generateSharedSecret2(ECPublicKey publicKey, ECPrivateKey privateKey)
      throws NoSuchAlgorithmException, NoSuchProviderException, InvalidKeyException {
    var key = generateKey(publicKey, privateKey);
    return new SharedKeys2(key, 0, 32, 32, 32);
  }

  private static byte[] generateKey(ECPublicKey publicKey, ECPrivateKey privateKey)
      throws NoSuchAlgorithmException, NoSuchProviderException, InvalidKeyException {
    return MessageDigest.getInstance("SHA-512").digest(generateSecret(publicKey, privateKey));
  }

  private static byte[] generateSecret(ECPublicKey publicKey, ECPrivateKey privateKey)
      throws NoSuchAlgorithmException, NoSuchProviderException, InvalidKeyException {
    var agreement = KeyAgreement.getInstance("ECDH", BouncyCastleProvider.PROVIDER_NAME);
    agreement.init(privateKey);
    agreement.doPhase(publicKey, true);
    return agreement.generateSecret();
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
