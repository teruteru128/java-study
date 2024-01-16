package com.twitter.teruteru128.study;

import java.lang.reflect.InvocationTargetException;
import java.nio.ByteBuffer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.security.MessageDigest;
import java.security.Provider;
import java.security.Security;
import java.util.Collections;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadLocalRandom;

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
        int n;
        try {
            n = args.length > 0 ? Integer.parseInt(args[0]) : Runtime.getRuntime().availableProcessors();
        } catch (NumberFormatException e) {
            n = Runtime.getRuntime().availableProcessors();
        }
        final var buf = new byte[1635778560];
        {
            var buf2 = Files.readAllBytes(first.resolve("publicKeys0.bin"));
            System.arraycopy(buf2, 0, buf, 0, 1090519040);
        }
        {
            Path path = first.resolve("publicKeys1.bin");
            var buf2 = Files.readAllBytes(path);
            System.arraycopy(buf2, 0, buf, 1090519040, 545259520);
        }
        var executor = Executors.newWorkStealingPool();
        System.out.println(executor.invokeAny(Collections.nCopies(n, (Callable<Result>) () -> {
            int index = 0;
            var sha512 = MessageDigest.getInstance("SHA-512");
            var ripemd160 = MessageDigest.getInstance("RIPEMD160");
            var buffer = ByteBuffer.allocate(64);
            var hash = buffer.array();
            var cache = new byte[65];
            int i = 0;
            while (true) {
                // pow(1.5 files, 2)
                index = ThreadLocalRandom.current().nextInt(25165824);
                // index *= 65;
                index = (index << 6) + index;
                System.arraycopy(buf, index, cache, 0, 65);
                for (i = 0; i < 1635778560; i += 65) {
                    sha512.update(cache, 0, 65);
                    sha512.update(buf, i, 65);
                    sha512.digest(hash, 0, 64);
                    ripemd160.update(hash, 0, 64);
                    ripemd160.digest(hash, 0, 20);
                    if (Long.compareUnsigned(buffer.getLong(0), 0x10000L) < 0) {
                        return new Result(buffer.getLong(0), index / 65, i / 65);
                    }
                }
            }
        })));
    }

    private static final Path first = Paths.get("D:\\keys\\public");

}
