package com.twitter.teruteru128.study;

import java.io.IOException;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.KeyPairGenerator;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import java.util.LinkedList;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyAgreement;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

import com.twitter.teruteru128.study.bitmessage.Const;

import jakarta.xml.bind.DatatypeConverter;

/**
 * GitHub ActionsでBitMessage用のsecp256k1鍵を大量生産しようとしたときの実装
*/
public class GenerateKeyPair implements Runnable {

  private static final String KEX_DEFAULT_ALGORITHM = "X25519";
  private static final String ENC_DEFAULT_ALGORITHM = "ChaCha20";
  private static final String STATIC_PUBLIC_KEY = "302C300706032B656E05000321002CD3C20389E56A1D94238940D1B1F3FD19C72A23105F5167773225B35BC36244";
  private byte[] privateKeys;
  private byte[] publicKeys;
  private int offset;
  private int length;

  public GenerateKeyPair(byte[] privateKeys, byte[] publicKeys, int offset, int length) {
    this.privateKeys = privateKeys;
    this.publicKeys = publicKeys;
    this.offset = offset;
    this.length = length;
  }

  @Override
  public void run() {
    byte[] privateKeys = this.privateKeys;
    byte[] publicKeys = this.publicKeys;
    byte[] potentialPublicEncryptionKey = null;
    for (int from = offset, to = offset + length; from < to; from++) {
      potentialPublicEncryptionKey = Const.G
          .multiply(new BigInteger(1, privateKeys, from * Const.PRIVATE_KEY_LENGTH, Const.PRIVATE_KEY_LENGTH))
          .normalize().getEncoded(false);
      System.arraycopy(potentialPublicEncryptionKey, 0, publicKeys, from * Const.PUBLIC_KEY_LENGTH,
          Const.PUBLIC_KEY_LENGTH);
    }
  }

  private static final int KEY_NUM = 1 << 24;

  private static void initPrivateKeys(byte[] privateKeys) {
    SecureRandom random = null;
    try {
      random = SecureRandom.getInstanceStrong();
    } catch (NoSuchAlgorithmException e) {
      // none
    }
    if (random == null) {
      try {
        random = SecureRandom.getInstance("NativePRNGBlocking");
      } catch (NoSuchAlgorithmException e1) {
        // none
      }
    }
    if (random == null) {
      try {
        random = SecureRandom.getInstance("Windows-PRNG");
      } catch (NoSuchAlgorithmException e2) {
        // none
      }
    }
    if (random == null) {
      try {
        random = SecureRandom.getInstance("SHA1PRNG");
      } catch (NoSuchAlgorithmException e3) {
        // none
      }
    }
    if (random == null) {
      random = new SecureRandom();
    }
    System.out.printf("乱数ソースのアルゴリズムは%sんご！%n", random.getAlgorithm());
    random.nextBytes(privateKeys);
  }

  public static void gen(boolean doEncrypt) throws NoSuchAlgorithmException, InvalidKeyException,
      InvalidKeySpecException, NoSuchPaddingException, InvalidAlgorithmParameterException, IllegalBlockSizeException,
      BadPaddingException, IOException, InterruptedException {
    var privateKeyPath = Paths.get("privateKeys.bin");
    var publicKeyPath = Paths.get("publicKeys.bin");

    final var privateKeys = new byte[KEY_NUM * Const.PRIVATE_KEY_LENGTH];
    System.out.println("秘密鍵を集めるんご！");
    initPrivateKeys(privateKeys);
    System.out.println("秘密鍵を集め終わったんご！");
    if (doEncrypt) {
      System.out.println("暗号化するんご！");
      var encodedKeySpec = new X509EncodedKeySpec(DatatypeConverter.parseHexBinary(STATIC_PUBLIC_KEY));
      var factory = KeyFactory.getInstance(KEX_DEFAULT_ALGORITHM);
      var publicKey = factory.generatePublic(encodedKeySpec);

      var generator = KeyPairGenerator.getInstance(KEX_DEFAULT_ALGORITHM);
      var keyPair = generator.generateKeyPair();

      var agreement = KeyAgreement.getInstance(KEX_DEFAULT_ALGORITHM);
      agreement.init(keyPair.getPrivate());
      agreement.doPhase(publicKey, true);
      var sha3512 = MessageDigest.getInstance("sha3-512");
      sha3512.update(agreement.generateSecret());
      var hashedSecret = sha3512.digest();
      var secretKey = new SecretKeySpec(hashedSecret, 0, 32, ENC_DEFAULT_ALGORITHM);
      var parameterSpec = new IvParameterSpec(hashedSecret, 32, 12);
      var cipher = Cipher.getInstance("ChaCha20-Poly1305/NONE/NoPadding");
      cipher.init(Cipher.ENCRYPT_MODE, secretKey, parameterSpec);
      Files.write(privateKeyPath, cipher.doFinal(privateKeys));
      System.out.printf("public key : %s%n", DatatypeConverter.printHexBinary(keyPair.getPublic().getEncoded()));
    } else {
      System.out.println("暗号化しないんご！");
      Files.write(privateKeyPath, privateKeys);
    }

    System.out.println("秘密鍵をファイルに書き込んだんご！");

    //
    final var publicKeys = new byte[KEY_NUM * Const.PUBLIC_KEY_LENGTH];

    // Use three quarters of all processors
    int core = Runtime.getRuntime().availableProcessors() * 3 / 4;
    var threads = new LinkedList<Thread>();

    System.out.printf("公開鍵を生成するんご！%dスレッドでぶん回すんごー！", core);

    // https://relearn-java.com/multithread/
    for (var i = 0; i < core; i++) {
      var thread = new Thread(new GenerateKeyPair(privateKeys, publicKeys, (KEY_NUM * i) / core, KEY_NUM / core));
      thread.start();
      threads.add(thread);
    }

    for (Thread thread : threads) {
      thread.join();
    }

    System.out.println("公開鍵の生成が終わったんご！これからファイルに書き込むんご！");

    try (var ch2 = FileChannel.open(publicKeyPath, StandardOpenOption.WRITE, StandardOpenOption.CREATE)) {
      ch2.write(ByteBuffer.wrap(publicKeys));
    }
    System.out.println("公開鍵をファイルに書き込んだんご！");
    //
    System.out.println("おわりんご");
    System.out.println("こいつはりんごろう (んごー) https://www.nicovideo.jp/watch/sm36210300");
  }
}
