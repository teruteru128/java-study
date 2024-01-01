package com.twitter.teruteru128.bitmessage;

import java.security.SecureRandom;
import java.util.HexFormat;
import java.util.concurrent.Callable;
import java.util.random.RandomGenerator;

public class OTPGenerator implements Callable<OTP> {
    private static final HexFormat FORMAT = HexFormat.of().withUpperCase();

    private SecureRandom random = (SecureRandom) RandomGenerator.of("SecureRandom");

    @Override
    public OTP call() throws Exception {
        var messagesize = random.nextInt(200, 2200);
        var sb = new StringBuilder(messagesize * 6 / 5);
        for (int i = 0; i < messagesize; i++) {
            sb.append((char) random.nextInt('0', '0' + 10));
            if ((i % 5) == 4 && (i % 50) != 49) {
                sb.append(' ');
            } else if ((i % 50) == 49) {
                sb.append('\n');
            }
        }
        var title = new byte[16];
        random.nextBytes(title);
        return new OTP(FORMAT.formatHex(title), sb.toString());
    }

}
