package com.twitter.teruteru128.study.bitmessage.genaddress;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.math.BigInteger;
import java.security.DigestException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.security.Security;
import java.util.regex.Pattern;

import com.twitter.teruteru128.study.bitmessage.Const;
import com.twitter.teruteru128.study.bitmessage.KeyPair;

import org.bouncycastle.jce.provider.BouncyCastleProvider;

import jakarta.xml.bind.DatatypeConverter;

public class RipeAndKeysConverter {

    private static byte[] derivePublicKey(byte[] b) {
        return Const.G.multiply(new BigInteger(1, b)).normalize().getEncoded(false);
    }

    public static void main(String[] args) throws IOException, NoSuchAlgorithmException, DigestException {
        Pattern pattern = Pattern.compile(",");
        Provider provider = Security.getProvider("BC");
        if (provider == null) {
            Security.addProvider(provider = new BouncyCastleProvider());
        }
        String[] a = null;
        byte[] privatesigningkey;
        byte[] privateencryptkey;
        byte[] publicsigningkey;
        byte[] publicencryptkey;
        final MessageDigest sha512 = MessageDigest.getInstance("SHA-512");
        final MessageDigest ripemd160 = MessageDigest.getInstance("RIPEMD160");
        final byte[] cache64 = new byte[Const.SHA512_DIGEST_LENGTH];
        final byte[] ripe = new byte[Const.RIPEMD160_DIGEST_LENGTH];
        String address4;
        try (BufferedReader reader = new BufferedReader(
                new InputStreamReader(ClassLoader.getSystemResourceAsStream("ripeandkeys.txt")));
                PrintStream ps = new PrintStream(new File("keys.txt"))) {
            String header = reader.readLine();
            String line = null;
            while ((line = reader.readLine()) != null) {
                a = pattern.split(line);
                privatesigningkey = DatatypeConverter.parseHexBinary(a[1]);
                privateencryptkey = DatatypeConverter.parseHexBinary(a[2]);
                publicsigningkey = derivePublicKey(privatesigningkey);
                publicencryptkey = derivePublicKey(privateencryptkey);
                sha512.update(publicsigningkey, 0, Const.PUBLIC_KEY_LENGTH);
                sha512.update(publicencryptkey, 0, Const.PUBLIC_KEY_LENGTH);
                sha512.digest(cache64, 0, Const.SHA512_DIGEST_LENGTH);
                ripemd160.update(cache64, 0, Const.SHA512_DIGEST_LENGTH);
                ripemd160.digest(ripe, 0, Const.RIPEMD160_DIGEST_LENGTH);
                Response response = new Response(new KeyPair(privatesigningkey, publicsigningkey),
                        new KeyPair(privateencryptkey, privateencryptkey), ripe);
                BMAddressGenerator.exportAddress(response, ps);
            }
        }
    }
}
