package com.github.teruteru128.bitmessage.app;

import com.github.teruteru128.bitmessage.Const;
import com.github.teruteru128.bitmessage.genaddress.BMAddressGenerator;
import com.github.teruteru128.bitmessage.genaddress.Response;
import com.github.teruteru128.bitmessage.spec.KeyPair;
import org.bouncycastle.jce.provider.BouncyCastleProvider;

import java.io.*;
import java.math.BigInteger;
import java.security.*;
import java.util.HexFormat;
import java.util.regex.Pattern;

public class RipeAndKeysConverter {

    private static final Pattern pattern = Pattern.compile(",");
    private static final HexFormat format = HexFormat.of();

    private static byte[] derivePublicKey(byte[] b) {
        return Const.SEC_P256_K1_G.multiply(new BigInteger(1, b)).normalize().getEncoded(false);
    }

    public static void main(String[] args) throws IOException, NoSuchAlgorithmException, DigestException {
        Provider provider = Security.getProvider("BC");
        if (provider == null) {
            Security.addProvider(provider = new BouncyCastleProvider());
        }
        try (BufferedReader reader = new BufferedReader(
                new InputStreamReader(new FileInputStream(new File("ripeandkeys.txt"))));
             PrintStream ps = new PrintStream(new File("keys.txt"))) {
            // 最初の一行は捨てる
            reader.readLine();
            reader.lines().forEach(line -> {
                final MessageDigest sha512;
                final MessageDigest ripemd160;
                try {
                    sha512 = MessageDigest.getInstance("SHA-512");
                    ripemd160 = MessageDigest.getInstance("RIPEMD160");
                } catch (NoSuchAlgorithmException e) {
                    throw new RuntimeException(e);
                }
                final byte[] cache64 = new byte[Const.SHA512_DIGEST_LENGTH];
                final byte[] ripe = new byte[Const.RIPEMD160_DIGEST_LENGTH];
                String[] a = pattern.split(line);
                byte[] privatesigningkey = format.parseHex(a[1]);
                byte[] privateencryptkey = format.parseHex(a[2]);
                byte[] publicsigningkey = derivePublicKey(privatesigningkey);
                byte[] publicencryptkey = derivePublicKey(privateencryptkey);
                sha512.update(publicsigningkey, 0, Const.PUBLIC_KEY_LENGTH);
                sha512.update(publicencryptkey, 0, Const.PUBLIC_KEY_LENGTH);
                try {
                    sha512.digest(cache64, 0, Const.SHA512_DIGEST_LENGTH);
                    ripemd160.update(cache64, 0, Const.SHA512_DIGEST_LENGTH);
                    ripemd160.digest(ripe, 0, Const.RIPEMD160_DIGEST_LENGTH);
                } catch (DigestException e) {
                    throw new RuntimeException(e);
                }
                Response response = new Response(new KeyPair(privatesigningkey, publicsigningkey),
                        new KeyPair(privateencryptkey, privateencryptkey), ripe);
                BMAddressGenerator.exportAddress(response, ps);
            });
        }
    }
}
