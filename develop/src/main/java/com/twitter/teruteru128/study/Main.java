package com.twitter.teruteru128.study;

import java.lang.reflect.InvocationTargetException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.security.MessageDigest;
import java.security.Provider;
import java.security.Security;
import java.util.HexFormat;

/**
 * Main
 */
public class Main {

    private static final String ORG_BOUNCYCASTLE_JCE_PROVIDER_BOUNCY_CASTLE_PROVIDER = "org.bouncycastle.jce.provider.BouncyCastleProvider";

    static {
        try {
            Security.addProvider(Class.forName(ORG_BOUNCYCASTLE_JCE_PROVIDER_BOUNCY_CASTLE_PROVIDER)
                    .asSubclass(Provider.class).getConstructor().newInstance());
        } catch (ClassNotFoundException | NoSuchMethodException | InstantiationException | IllegalAccessException
                | IllegalArgumentException | InvocationTargetException | SecurityException e) {
            throw new InternalError(e);
        }
    }

    /**
     * 
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        if (args.length < 1) {
            System.exit(1);
        }

        var format = HexFormat.of();
        var key2 = new byte[65];
        var key1 = format.parseHex("");
        var first = 0;
        var sha512 = MessageDigest.getInstance("SHA-512");
        var ripemd160 = MessageDigest.getInstance("RIPEMD160");
        var hash = new byte[64];
        var min_fn = 0;
        var min_index = 0;
        var wrappedBuffer = ByteBuffer.wrap(hash);
        var minhash = 0xffffffffffffffffL;
        for (int fn = 0; fn < 256; fn++) {
            try (var channel = FileChannel.open(Paths.get(String.format("", fn)),
                    StandardOpenOption.READ)) {
                var buffer = channel.map(FileChannel.MapMode.READ_ONLY, 0, 65 * 16777216L);
                int index = 0;
                for (int i = 0; i < 16777216; i++, index += 65) {
                    buffer.get(key2);

                    sha512.update(key1);
                    sha512.update(key2);
                    sha512.digest(hash, 0, 64);
                    ripemd160.update(hash);
                    ripemd160.digest(hash, 0, 20);
                    var tmphash = wrappedBuffer.getLong(0);
                    if (Long.compareUnsigned(minhash, tmphash) > 0) {
                        minhash = tmphash;
                        min_fn = fn;
                        min_index = index;
                        first = 1;
                        System.err.printf("Updated1: %d%n", Long.numberOfLeadingZeros(minhash));
                    }

                    sha512.update(key2);
                    sha512.update(key1);
                    sha512.digest(hash, 0, 64);
                    ripemd160.update(hash);
                    ripemd160.digest(hash, 0, 20);
                    tmphash = wrappedBuffer.getLong(0);
                    if (Long.compareUnsigned(minhash, tmphash) > 0) {
                        minhash = tmphash;
                        min_fn = fn;
                        min_index = index;
                        first = -1;
                        System.err.printf("Updated2: %d%n", Long.numberOfLeadingZeros(minhash));
                    }
                }
                buffer = null;
            }
            System.err.printf("%d done. current: %d%n", fn, Long.numberOfLeadingZeros(minhash));
        }
        System.err.printf("done. current: %d, %d, %d(first is: %s)%n", Long.numberOfLeadingZeros(minhash), min_fn,
                min_index, first == 1 ? "key1" : "key2");
    }

}
