package com.twitter.teruteru128.study;
import java.math.BigInteger;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.spec.RSAPublicKeySpec;
import java.security.spec.X509EncodedKeySpec;

class RSA1024{

  public static void main(String[] args) throws Exception{
    BigInteger n = new BigInteger("135066410865995223349603216278805969938881475605667027524485143851526510604859533833940287150571909441798207282164471551373680419703964191743046496589274256239341020864383202110372958725762358509643110564073501508187510676594629205563685529475213500852879416377328533906109750544334999811150056977236890927563", 10);
    BigInteger e = BigInteger.valueOf(65537);

    RSAPublicKeySpec pubSpec = new RSAPublicKeySpec(n, e);
    //System.out.println(n.bitLength());

    KeyFactory factory = KeyFactory.getInstance("RSA");
    PublicKey pubKey = factory.generatePublic(pubSpec);
    //System.out.println(pubKey);

    X509EncodedKeySpec x509Spec = factory.getKeySpec(pubKey, X509EncodedKeySpec.class);
    System.out.write(x509Spec.getEncoded());
  }

}

