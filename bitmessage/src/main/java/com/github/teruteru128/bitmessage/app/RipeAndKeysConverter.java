package com.github.teruteru128.bitmessage.app;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.math.BigInteger;
import java.security.DigestException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.security.Security;
import java.util.HexFormat;
import java.util.regex.Pattern;

import com.github.teruteru128.bitmessage.spec.KeyPair;
import org.bouncycastle.jce.provider.BouncyCastleProvider;

import com.github.teruteru128.bitmessage.Const;
import com.github.teruteru128.bitmessage.genaddress.BMAddressGenerator;
import com.github.teruteru128.bitmessage.genaddress.Response;

public class RipeAndKeysConverter {

    private static byte[] derivePublicKey(byte[] b) {
        return Const.SEC_P256_K1_G.multiply(new BigInteger(1, b)).normalize().getEncoded(false);
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
        try (BufferedReader reader = new BufferedReader(
                new InputStreamReader(new FileInputStream(new File("ripeandkeys.txt"))));
                PrintStream ps = new PrintStream(new File("keys.txt"))) {
            // 最初の一行は捨てる
            reader.readLine();
            String line = null;
            var format = HexFormat.of();
            while ((line = reader.readLine()) != null) {
                a = pattern.split(line);
                privatesigningkey = format.parseHex(a[1]);
                privateencryptkey = format.parseHex(a[2]);
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
