package com.twitter.teruteru128.study;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.charset.StandardCharsets;
import java.time.Instant;
import java.util.Base64;
import java.util.HexFormat;
import java.util.UUID;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Main
 */
public class Main {

    public static final HexFormat format = HexFormat.of();

    static {
        try {
            Class.forName("com.twitter.teruteru128.study.BCProviderLoader");
        } catch (ClassNotFoundException e) {
            throw new InternalError(e);
        }
    }

    /**
     * 
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        if (args.length < 2 || !args[0].equalsIgnoreCase("--in")) {
            out();
        } else {
            in(args[1]);
        }
    }

    private static void out() throws IOException {
        var encoder = Base64.getEncoder();
        try (var oos = new ObjectOutputStream(new BufferedOutputStream(encoder.wrap(System.out)))) {
            oos.writeObject(new S(ThreadLocalRandom.current().nextLong(), UUID.randomUUID(), Instant.now()));
        }
    }

    private static void in(String name) throws IOException, ClassNotFoundException {
        var in = System.getenv(name);
        if (in == null || in.isEmpty()) {
            return;
        }
        var decoder = Base64.getDecoder();
        try (var ois = new ObjectInputStream(
                new BufferedInputStream(decoder.wrap(new ByteArrayInputStream(in.getBytes(StandardCharsets.UTF_8)))))) {
            var obj = ois.readObject();
            if (obj instanceof S s) {
                System.out.printf("%d, %s, %s%n", s.seed(), s.uuid(), s.time());
            }
        }
    }
}
