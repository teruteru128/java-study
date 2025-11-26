package com.github.teruteru128.bitmessage.app;

import com.github.teruteru128.bitmessage.Const;
import com.github.teruteru128.bitmessage.Structs;
import com.github.teruteru128.bitmessage.genaddress.BMAddressGenerator;
import com.github.teruteru128.bitmessage.spec.AddressFactory;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.VarHandle;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.security.DigestException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;

public class DeterministicAddressGenerator implements Function<String, DeterministicAddress> {
  private static final VarHandle LONG_HANDLE = MethodHandles.byteArrayViewVarHandle(long[].class,
      ByteOrder.BIG_ENDIAN);

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
    return Const.SEC_P256_K1_G.multiply(new BigInteger(1, privateKey, 0, Const.PRIVATE_KEY_LENGTH))
        .normalize().getEncoded(false);
  }

  @Override
  public DeterministicAddress apply(String passphrase) {
    int numberOfNullBytesDemandedOnFrontOfRipeHash = 8;
    long signingKeyNonce = 0;
    long encryptionKeyNonce = 1;
    final byte[] potentialPrivateSigningKey = new byte[64];
    byte[] potentialPubSigningKey;
    final byte[] potentialPrivateEncryptionKey = new byte[64];
    byte[] potentialPubEncryptionKey;

    final byte[] ripe = new byte[Const.SHA512_DIGEST_LENGTH];
    final byte[] passphraseBytes = passphrase.getBytes(StandardCharsets.UTF_8);
    ByteBuffer nonceBuffer = ByteBuffer.allocate(9);

    try {
      MessageDigest sha512 = MessageDigest.getInstance("SHA-512");
      MessageDigest sha512work;
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
        try {
          sha512work.update(potentialPubSigningKey);
          sha512work.update(potentialPubEncryptionKey);

          sha512work.digest(ripe, 0, Const.SHA512_DIGEST_LENGTH);
          ripemd160.update(ripe, 0, 64);
          ripemd160.digest(ripe, 0, Const.RIPEMD160_DIGEST_LENGTH);
        } catch (DigestException e) {
          throw new RuntimeException(e);
        }
        if (Long.numberOfLeadingZeros((long) LONG_HANDLE.get(ripe, 0))
            >= numberOfNullBytesDemandedOnFrontOfRipeHash) {
          var e1 = AddressFactory.encodeAddress(3, 1, ripe);
          var e2 = AddressFactory.encodeAddress(4, 1, ripe);
          var addresses = List.of(e1, e2);
          var signingKey = BMAddressGenerator.encodeWIF(potentialPrivateSigningKey);
          var encryptingKey = BMAddressGenerator.encodeWIF(potentialPrivateEncryptionKey);
          return new DeterministicAddress(passphrase, addresses, signingKey, encryptingKey);
        }
        signingKeyNonce += 2;
        encryptionKeyNonce += 2;
        nonceBuffer.clear();
      }
    } catch (CloneNotSupportedException | DigestException | NoSuchAlgorithmException e) {
      throw new InternalError(e);
    }
  }

}
