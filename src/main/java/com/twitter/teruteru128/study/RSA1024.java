package com.twitter.teruteru128.study;
import java.math.BigInteger;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.spec.RSAPublicKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.Base64;

class RSA1024 {

  /**
   * @param args
   * @throws Exception
   * @see https://en.wikipedia.org/wiki/RSA_numbers#RSA-1024
   */
  public static void main(String[] args) throws Exception {
    BigInteger n = new BigInteger("13506641086599522334960321627880596993888147560566702752448514385152651060"
        + "48595338339402871505719094417982072821644715513736804197039641917430464965"
        + "89274256239341020864383202110372958725762358509643110564073501508187510676"
        + "59462920556368552947521350085287941637732853390610975054433499981115005697" + "7236890927563", 10);
    BigInteger e = BigInteger.valueOf(65537);

    RSAPublicKeySpec pubSpec = new RSAPublicKeySpec(n, e);
    // System.out.println(n.bitLength());

    KeyFactory factory = KeyFactory.getInstance("RSA");
    PublicKey pubKey = factory.generatePublic(pubSpec);
    // System.out.println(pubKey);

    X509EncodedKeySpec x509Spec = factory.getKeySpec(pubKey, X509EncodedKeySpec.class);
    System.out.write(Base64.getMimeEncoder().encode(x509Spec.getEncoded()));
  }

}
