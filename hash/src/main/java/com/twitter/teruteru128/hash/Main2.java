package com.twitter.teruteru128.hash;

import java.security.DigestException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Base64;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import jakarta.xml.bind.DatatypeConverter;

/**
 * @author Teruteru
 *
 */
public class Main2 implements Callable<Void> {

    /**
     * 
     */
    public Void call() {
        try {
            byte[] input = new byte[32];
            // input = new byte[0];
            byte[] hash = new byte[32];
            SecureRandom sr = SecureRandom.getInstanceStrong();
            MessageDigest sha256 = null;
            int mode = 1;
            var datetime = LocalDateTime.now(ZoneId.of("Asia/Tokyo"));
            var formatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL);
            switch (mode) {
                case 1:
                    sr.nextBytes(input);
                    sha256 = MessageDigest.getInstance("SHA-256");
                    // hash = sha256.digest(input);
                    sha256.update(input);
                    sha256.digest(hash, 0, 32);
                    String strinput = null;
                    String strhash = null;
                    strinput = DatatypeConverter.printHexBinary(input);
                    strhash = DatatypeConverter.printHexBinary(hash);
                    System.out.printf("input: %s, hash: %s%n", strinput, strhash);
                    System.out.printf("input: %d, hash: %d%n", strinput.length(), strhash.length());
                    Base64.Encoder enc = Base64.getEncoder();
                    strinput = enc.encodeToString(input);
                    strhash = enc.encodeToString(hash);
                    System.out.printf("input: %s, hash: %s%n", strinput, strhash);
                    System.out.printf("input: %d, hash: %d%n", strinput.length(), strhash.length());
                    break;
                case 2:
                    // Util.tweet("ねくろいど");
                    break;
                case 3:
                    String dateformat = formatter.format(datetime);
                    System.out.println(dateformat);
                    // Util.tweet(String.format("【BOT試験中】アップデート: %s", dateformat));
                    break;
                case 4:

                    break;
                default:
                    break;
            }
        } catch (NoSuchAlgorithmException | DigestException e) {
            // NONE
        }
        return null;
    }

    public static void main(String[] args) {
        ScheduledThreadPoolExecutor service = (ScheduledThreadPoolExecutor) Executors.newScheduledThreadPool(16);
        service.schedule(new Main2(), 0, TimeUnit.NANOSECONDS);
        service.schedule(service::shutdown, 1, TimeUnit.HOURS);
    }

}
