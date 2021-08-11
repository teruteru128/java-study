package com.twitter.teruteru128.study.rsa.test2;

import java.io.File;
import java.io.IOException;
import java.math.BigInteger;
import java.nio.file.Files;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.security.Security;
import java.security.interfaces.RSAPrivateCrtKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;

import org.bouncycastle.jce.provider.BouncyCastleProvider;

public class Main {

    public static void main(String[] args) throws NoSuchAlgorithmException, InvalidKeySpecException, IOException {
        Provider provider = Security.getProvider("bc");
        if (provider == null) {
            Security.addProvider(provider = new BouncyCastleProvider());
        }
        File in = new File(
                "D:\\Users\\teruteru128\\Documents\\RSA\\1024bit-887b2fef-34f4-431b-964b-02e94c1a2a66-prikey.der");
        String data = "MIICXQIBAAKBgQCE3pA746UfpC8sFk8ZJp0yupyJqj5jy6cjdxUYoP7mCm7c0mqQDeCcDNBYW2eSozCioPrH/9L+CDQEPLYakoem+jFnUKDH5+pru/0PJTJJF8Xh/ZT9eJlvsYBr1/qSfICf6RTs7kzwq9IuSZBw7/tfNEF9i0A8FVox6HOopXod1QIDAQABAoGANOFrYBqK5lvu1koOswDWQZFZqcSSzh8IZyoGwGWa7S0r0EECXlDXmuPSq8e9IfRG8ALHrH+ZlrbnFOSgyVSWHfpj3aH+qknoSX5TW2rMQHih8865xuqheMQ+RTZ7+BRDqNsYkzxB/Z8mqzpoJQSYf+H7nWxdDCgAJVYZzxl3DmUCQQD32iEjnwiwUjii8slcmvCEZl+z84DWNdvJOg6Z38sI4AvrfpKc1WAcDg1rNZCKrRgokh54wpLt08cpFcrD04c3AkEAiTzDmc0bdgfg5wj6xHFZpYlBwiGm/bjOR2PS57P0GNU5PsDllRbFqIuzArITutO5lvZZImzuYz7Lf+cQ73pxUwJBAOdEwmdaneDo17A0m2+to3/nhqWDMVSwLMU3RyiNigZeCMFU+bkd4PBMrHi9IoJDwacZsRU9eZwxYEUV8H2Jg0ECQEEkOqRSm2pXKwX/WSjNtQPCNxhy6NUeV6vDUmTxIjh3XYjP/ynZeVEbnoj1BjB0N2/U11Jj6nPpZqb7gyppMEkCQQCoGdVYDipU+hMMnvxa0zOIyQc/a+HE0lESqn+2ZPafYi9Z1RldRMvUXhP8U7s+OuhRwprdw2ivvOFrnWyz9lL2";
        KeyFactory factory = KeyFactory.getInstance("RSA");
        byte[] b = Files.readAllBytes(in.toPath());
        // b = Base64.getDecoder().decode(data);
        RSAPrivateCrtKey key = (RSAPrivateCrtKey) factory.generatePrivate(new PKCS8EncodedKeySpec(b));
        BigInteger n = key.getModulus();
        BigInteger e = key.getPublicExponent();
        BigInteger d = key.getPrivateExponent();
        BigInteger p = key.getPrimeP();
        BigInteger q = key.getPrimeQ();
        BigInteger exponent1 = key.getPrimeExponentP();
        BigInteger exponent2 = key.getPrimeExponentQ();
        BigInteger cofficent = key.getCrtCoefficient();

        BigInteger one = BigInteger.valueOf(1L);
        System.out.println(d);
        // calc d
        var dd = e.modInverse(p.subtract(one).multiply(q.subtract(one)));
        System.out.println(dd);
        // calc exp p
        BigInteger pex = d.mod(p.subtract(one));
        //calc exp q
        BigInteger qex = d.mod(q.subtract(one));
        // calc cof
        BigInteger cof = q.modInverse(p);
        System.out.println(d.equals(dd));
        System.out.println(cof.multiply(q).mod(p));
        System.out.println(pex);
        System.out.println(exponent1);
        System.out.println(qex);
        System.out.println(exponent2);
        System.out.println(cof);
        System.out.println(cofficent);
        System.out.println(pex.equals(exponent1));
        System.out.println(qex.equals(exponent2));
        System.out.println(cof.equals(cofficent));
    }

}
