package com.github.teruteru128.bitmessage.app;

import com.github.teruteru128.bitmessage.Const;
import com.github.teruteru128.bitmessage.Structs;
import com.github.teruteru128.bitmessage.genaddress.BMAddressGenerator;
import com.github.teruteru128.bitmessage.spec.AddressFactory;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.security.DigestException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;

public class DeterministicAddressGenerator implements Function<String, DeterministicAddress> {

  @Override
  public DeterministicAddress apply(String passphrase) {
    int numberOfNullBytesDemandedOnFrontOfRipeHash = 8;
    long signingKeyNonce = 0;
    long encryptionKeyNonce = 1;
    final byte[] potentialPrivateSigningKey = new byte[64];
    byte[] potentialPubSigningKey = null;
    final byte[] potentialPrivateEncryptionKey = new byte[64];
    byte[] potentialPubEncryptionKey = null;

    var hashBuffer = ByteBuffer.allocate(20);
    var hashLongBuffer = hashBuffer.asLongBuffer();
    final byte[] ripe = hashBuffer.array();
    final byte[] passphraseBytes = passphrase.getBytes(StandardCharsets.UTF_8);
    ByteBuffer nonceBuffer = ByteBuffer.allocate(9);

    try {
      MessageDigest sha512 = MessageDigest.getInstance("SHA-512");
      MessageDigest sha512work = null;
      MessageDigest ripemd160 = MessageDigest.getInstance("RIPEMD160");
      sha512.update(passphraseBytes);
      while (true) {
        sha512work = (MessageDigest) sha512.clone();
        nonceBuffer.put(Structs.encodeVarint(signingKeyNonce));
        nonceBuffer.flip();
        sha512work.update(nonceBuffer);
        sha512work.digest(potentialPrivateSigningKey, 0, 64);
        sha512work = (MessageDigest) sha512.clone();
        nonceBuffer.clear();
        nonceBuffer.put(Structs.encodeVarint(encryptionKeyNonce));
        nonceBuffer.flip();
        sha512work.update(nonceBuffer);
        sha512work.digest(potentialPrivateEncryptionKey, 0, 64);
        potentialPubSigningKey = deriviedPublicKey(potentialPrivateSigningKey);
        potentialPubEncryptionKey = deriviedPublicKey(potentialPrivateEncryptionKey);
        deriviedRipeHash(ripe, potentialPubSigningKey, potentialPubEncryptionKey, sha512work, ripemd160);
        if (Long.numberOfLeadingZeros(hashLongBuffer.get(0)) >= numberOfNullBytesDemandedOnFrontOfRipeHash) {
          return new DeterministicAddress(passphrase, List.of(AddressFactory.encodeAddress(3, 1, ripe), AddressFactory.encodeAddress(4, 1, ripe)),
              BMAddressGenerator.encodeWIF(Arrays.copyOf(potentialPrivateSigningKey, 32)),
              BMAddressGenerator.encodeWIF(Arrays.copyOf(potentialPrivateEncryptionKey, 32)));
        }
        signingKeyNonce += 2;
        encryptionKeyNonce += 2;
        nonceBuffer.clear();
      }
    } catch (CloneNotSupportedException | DigestException | NoSuchAlgorithmException e) {
      throw new InternalError(e);
    }
  }

  /**
   *
   * @param privateKey
   * @return
   */
  public static byte[] deriviedPublicKey(byte[] privateKey) {
    Objects.requireNonNull(privateKey);
    if (privateKey.length < Const.PRIVATE_KEY_LENGTH) {
      throw new IllegalArgumentException("public key is too short");
    }
    return Const.SEC_P256_K1_G.multiply(new BigInteger(1, privateKey, 0, Const.PRIVATE_KEY_LENGTH)).normalize()
        .getEncoded(false);
  }

  public static void deriviedRipeHash(byte[] ripe, byte[] signPubKey, byte[] encPubKey) {
    try {
      MessageDigest sha512 = MessageDigest.getInstance("SHA-512");
      MessageDigest ripemd160 = MessageDigest.getInstance("RIPEMD160");
      deriviedRipeHash(ripe, signPubKey, encPubKey, sha512, ripemd160);
    } catch (NoSuchAlgorithmException e) {
      throw new RuntimeException(e);
    }
  }

  public static void deriviedRipeHash(byte[] ripe, byte[] signPubKey, byte[] encPubKey, MessageDigest sha512,
      MessageDigest ripemd160) {
    Objects.requireNonNull(ripe);
    if (ripe.length < 20) {
      throw new IllegalArgumentException("ripe is too short");
    }
    Objects.requireNonNull(signPubKey);
    Objects.requireNonNull(encPubKey);
    try {
      sha512.update(signPubKey);
      sha512.update(encPubKey);

      byte[] cache64 = new byte[Const.SHA512_DIGEST_LENGTH];
      sha512.digest(cache64, 0, Const.SHA512_DIGEST_LENGTH);
      ripemd160.update(cache64);
      ripemd160.digest(ripe, 0, Const.RIPEMD160_DIGEST_LENGTH);
    } catch (DigestException e) {
      throw new RuntimeException(e);
    }
  }

}
