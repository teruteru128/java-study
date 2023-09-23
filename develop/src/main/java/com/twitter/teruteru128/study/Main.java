package com.twitter.teruteru128.study;

import java.lang.reflect.InvocationTargetException;
import java.security.Provider;
import java.security.Security;

import org.sqlite.SQLiteDataSource;

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
        /*
         * var buffers = new MappedByteBuffer[16777216];
         * try (var channel =
         * FileChannel.open(Paths.get(args[0]),
         * StandardOpenOption.READ)) {
         * var buffer = channel.map(FileChannel.MapMode.READ_ONLY, 0, 65 * 16777216L);
         * int index = 0;
         * for (int i = 0; i < 16777216; i++, index += 65) {
         * buffers[i] = buffer.slice(index, 65);
         * }
         * }
         */
/* 
        var dataSource = new SQLiteDataSource();
        dataSource.setUrl(args[0]);
        try (var con = dataSource.getConnection()) {
            System.out.println("connected!");
        } */

        int length = Integer.parseInt(args[0], 10);
        char[] cbuf = ToranoanaPasswordGenerator.generatePassword(length);
        System.out.println(cbuf);
    }

}
