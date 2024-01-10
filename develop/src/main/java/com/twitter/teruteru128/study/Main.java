package com.twitter.teruteru128.study;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.UncheckedIOException;
import java.lang.reflect.InvocationTargetException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.security.DigestException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.security.Security;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.IntStream;

import org.bouncycastle.util.Arrays;

import com.twitter.teruteru128.bitmessage.spec.BMAddress;

import java.nio.ByteBuffer;

/**
 * Main
 */
public class Main {

    static {
        try {
            Security.addProvider(Class.forName("org.bouncycastle.jce.provider.BouncyCastleProvider")
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
        if (args.length < 2) {
            System.exit(1);
        }
        getSha();
        /* 
        int signindex = Integer.valueOf(args[0], 10);
        int fileNumber = (signindex >> 24) & 0xff;
        int numberInFile = signindex & 0xffffff;
        Path p = first.resolve(String.format("publicKeys%d.bin", fileNumber));
        var signKey = new byte[65];
        try (var file = new RandomAccessFile(p.toFile(), "r")) {
            file.seek(numberInFile * 65);
            file.read(signKey, 0, signKey.length);
        }
        int encindex = Integer.valueOf(args[1], 10);
        var encKey = new byte[65];
        var sha512 = MessageDigest.getInstance("SHA512");
        var ripemd160 = MessageDigest.getInstance("RIPEMD160");
        var buffer = ByteBuffer.allocate(64);
        var hash = buffer.array();
        for (int i = 0; i < 256; i++) {
            p = first.resolve(String.format("publicKeys%d.bin", i));
            try (var file = new RandomAccessFile(p.toFile(), "r")) {
                file.seek(encindex * 65);
                file.read(encKey, 0, encKey.length);
            }
            sha512.update(signKey, 0, 65);
            sha512.update(encKey, 0, 65);
            sha512.digest(hash, 0, 64);
            ripemd160.update(hash, 0, 64);
            ripemd160.digest(hash, 0, 20);
            if (Long.compareUnsigned(buffer.getLong(0), 0x100000000L) < 0) {
                // AddressFormatter.(byte[] signPubkey, byte[] encPubkey);
                var address = BMAddress.encodeAddress(Arrays.copyOf(hash, 20));
                System.out.printf("%s: %d, %d%n", address, signindex & 0xffffffffL,
                        ((i << 24) | encindex) & 0xffffffffL);
                break;
            }
        } */
    }

    static Path first = Paths.get("D:\\keys\\public");

    private static void getSha() throws IOException, FileNotFoundException, NoSuchAlgorithmException {
        int index = ThreadLocalRandom.current().nextInt();
        int fileNumber = (index >> 24) & 0xff;
        int numberInFile = index & 0xffffff;
        Path p = first.resolve(String.format("publicKeys%d.bin", fileNumber));
        var signKey = new byte[65];
        try (var file = new RandomAccessFile(p.toFile(), "r")) {
            file.seek(numberInFile * 65);
            file.read(signKey, 0, signKey.length);
        }
        MessageDigest sha = MessageDigest.getInstance("sha512");
        sha.update(signKey, 0, 65);
        IntStream.range(0, 256).parallel().mapToObj(i -> {
            try {
                return new L(Files.readAllBytes(first.resolve(String.format("publicKeys%d.bin", i))), i);
            } catch (IOException e) {
                throw new UncheckedIOException(e);
            }
        }).flatMap(a -> IntStream.range(0, 16777216).mapToObj(i -> {
            try {
                return new M(a.a, a.number, i * 65, (MessageDigest) sha.clone());
            } catch (CloneNotSupportedException e) {
                throw new RuntimeException(e);
            }
        })).map(m -> {
            try {
                var sha512 = m.sha512;
                var ripemd160 = MessageDigest.getInstance("RIPEMD160");
                sha512.update(m.prt, m.offset, 65);
                var hash = m.buffer.array();
                sha512.digest(hash, 0, 64);
                ripemd160.update(hash, 0, 64);
                ripemd160.digest(hash, 0, 20);
                return m;
            } catch (NoSuchAlgorithmException | DigestException e) {
                throw new RuntimeException(e);
            }
        }).filter(m -> {
            return Long.compareUnsigned(m.buffer.getLong(0), 0x100000000L) < 0;
        }).forEach(m -> System.out.printf("%016x, %s: %d, %d%n", m.buffer.getLong(0),
                BMAddress.encodeAddress(Arrays.copyOf(m.buffer.array(), 20)), index & 0xffffffffL,
                ((m.fileNumber << 24) | (m.offset / 65)) & 0xffffffffL));
    }
}
