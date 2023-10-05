package com.twitter.teruteru128.study;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.security.DigestException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.security.Security;
import java.util.random.RandomGenerator;

import com.twitter.teruteru128.bitmessage.app.DeterministicAddressesGenerator;
import com.twitter.teruteru128.bitmessage.genaddress.BMAddressGenerator;
import com.twitter.teruteru128.bitmessage.spec.BMAddress;

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
    public static void main(String[] args) throws IOException {
        if (args.length < 1) {
            System.exit(1);
        }
        var buffer = getBuffer(Paths.get(args[0]));
        var buffers = new MappedByteBuffer[16777216];
        for (int i = 0, index = 0; i < 16777216; i++, index += 65) {
            buffers[i] = buffer.slice(index, 65);
        }
        var random = RandomGenerator.of("SecureRandom");
        long l = 0;
        try {
            var sha512 = MessageDigest.getInstance("SHA-512");
            var ripemd160 = MessageDigest.getInstance("RIPEMD160");
            var digest = new byte[64];
            var wrappedBuffer = ByteBuffer.wrap(digest, 0, 64);
            while (true) {
                int sigIndex = random.nextInt(16777216);
                for (int j = 0; j < 16777216; j++) {
                    l = A.extracted(buffers, sha512, ripemd160, digest, wrappedBuffer, sigIndex, j);
                    // TODO Searching for better judgment methods
                    // 大小比較、もしくはビットマスク比較
                    if ((l & 0xffffffffffff0000L) == 0) {
                        System.out.printf("%d, %d%n", sigIndex, j);
                    }
                    l = A.extracted(buffers, sha512, ripemd160, digest, wrappedBuffer, j, sigIndex);
                    if ((l & 0xffffffffffff0000L) == 0) {
                        System.out.printf("%d, %d%n", j, sigIndex);
                    }
                }
            }
        } catch (NoSuchAlgorithmException | DigestException e) {
            e.printStackTrace();
        }
    }

    private static MappedByteBuffer getBuffer(Path path) throws IOException {
        try (var channel = FileChannel.open(path)) {
            var size = channel.size();
            return channel.map(FileChannel.MapMode.READ_ONLY, 0, size);
        }
    }

    public static void getWif2() throws IOException {
        var path1 = Paths.get("");
        var offset1 = 390319104;

        var path2 = Paths.get("");
        var offset2 = 523366656;

        var length = 32;

        var buffer1 = getKey(path1, offset1, length);
        var buffer2 = getKey(path2, offset2, length);

        // TODO bitmessage API整理(鍵変換関連)
        var public1 = DeterministicAddressesGenerator.deriviedPublicKey(buffer1.array());
        var public2 = DeterministicAddressesGenerator.deriviedPublicKey(buffer2.array());

        // calc ripe
        var ripe = new byte[20];
        DeterministicAddressesGenerator.deriviedRipeHash(ripe, public1, public2);
        // encode address
        var address = BMAddress.encodeAddress(ripe);
        var wif1 = BMAddressGenerator.encodeWIF(buffer1.array());
        var wif2 = BMAddressGenerator.encodeWIF(buffer2.array());
        System.out.printf("[%s]%n%s%n%s%n", address, wif2, wif1);
    }

    private static ByteBuffer getKey(Path path, int offset, int length) throws IOException {
        try (var channel = FileChannel.open(path)) {
            var buffer = ByteBuffer.allocate(length);
            channel.position(offset);
            channel.read(buffer);
            return buffer.flip();
        }
    }

}
