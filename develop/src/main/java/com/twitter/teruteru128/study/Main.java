package com.twitter.teruteru128.study;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.security.Provider;
import java.security.Security;

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
