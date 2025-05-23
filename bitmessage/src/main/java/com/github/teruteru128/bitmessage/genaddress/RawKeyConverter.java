package com.github.teruteru128.bitmessage.genaddress;

import com.github.teruteru128.bitmessage.Const;
import com.github.teruteru128.bitmessage.spec.AddressFactory;
import com.github.teruteru128.bitmessage.spec.KeyPair;
import java.math.BigInteger;
import java.security.DigestException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.security.Security;
import java.util.Arrays;
import java.util.HexFormat;
import org.bouncycastle.jce.provider.BouncyCastleProvider;

public class RawKeyConverter {

  static {
    // RIPEMD160のためにプロバイダを追加
    if (Security.getProvider(BouncyCastleProvider.PROVIDER_NAME) == null) {
      Security.addProvider(new BouncyCastleProvider());
    }
  }

  private static byte[] convertPublicKey(byte[] privateKey) {
    return Const.SEC_P256_K1_G.multiply(new BigInteger(1, privateKey)).normalize()
        .getEncoded(false);
  }

  public static void main(String[] args) throws NoSuchAlgorithmException, DigestException {
    var format = HexFormat.of();
    final byte[] inputRipe = format.parseHex("00AEA57C192EA1A7E71FCCD70EBD219F5CF5D11A");
    final byte[] privateSigningKey = format.parseHex(args[0]);
    final byte[] privateEncrytionKey = format.parseHex(args[1]);

    final byte[] pubSigningKey = convertPublicKey(privateSigningKey);
    final byte[] pubEncryptionKey = convertPublicKey(privateEncrytionKey);
    final MessageDigest sha512 = MessageDigest.getInstance("SHA-512");
    final MessageDigest ripemd160 = MessageDigest.getInstance("RIPEMD160");
    final byte[] sha512hash = new byte[Const.SHA512_DIGEST_LENGTH];
    final byte[] ripe = new byte[Const.RIPEMD160_DIGEST_LENGTH];
    sha512.update(pubSigningKey, 0, Const.PUBLIC_KEY_LENGTH);
    sha512.update(pubEncryptionKey, 0, Const.PUBLIC_KEY_LENGTH);
    sha512.digest(sha512hash, 0, Const.SHA512_DIGEST_LENGTH);
    ripemd160.update(sha512hash, 0, Const.SHA512_DIGEST_LENGTH);
    ripemd160.digest(ripe, 0, Const.RIPEMD160_DIGEST_LENGTH);

    final String address4 = AddressFactory.encodeAddress(4, 1, ripe);
    System.out.print("ripe : ");
    System.out.print(format.formatHex(ripe));
    boolean isMatch = Arrays.equals(ripe, inputRipe);
    System.out.print(" (");
    System.out.print(isMatch ? "match" : "not match");
    System.out.println(")");
    System.out.print("v4 address calculated from ripe : ");
    System.out.println(address4);
    System.out.println();
    if (isMatch) {
      final Response response = new Response(new KeyPair(privateSigningKey, pubSigningKey),
          new KeyPair(privateEncrytionKey, pubEncryptionKey), ripe);
      BMAddressGenerator.exportAddress(response);
      System.out.println(BMAddressGenerator.encodeWIF(privateSigningKey));
      System.out.println(BMAddressGenerator.encodeWIF(privateEncrytionKey));
    }
  }
}
