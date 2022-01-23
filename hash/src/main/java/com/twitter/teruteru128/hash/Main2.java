package com.twitter.teruteru128.hash;

import java.security.DigestException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Base64;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

import jakarta.xml.bind.DatatypeConverter;

/**
 * @author Teruteru
 *
 */
public class Main2 {
    private static ScheduledExecutorService ses = Executors.newScheduledThreadPool(16);

    /**
     * @param args
     */
    public static void main(String[] args) {
        try {
            byte[] input = new byte[32];
            // input = new byte[0];
            byte[] hash = new byte[32];
            SecureRandom sr = SecureRandom.getInstanceStrong();
            MessageDigest sha256 = null;
            int mode = 1;
            Date date = GregorianCalendar.getInstance(Locale.JAPAN).getTime();
            DateFormat df2 = new SimpleDateFormat("y年M月d日 k時m分s秒", Locale.JAPAN);
            switch (mode) {
                case 1:
                    sr.nextBytes(input);
                    try {
                        sha256 = MessageDigest.getInstance("SHA-256");
                        // hash = sha256.digest(input);
                        sha256.update(input);
                        sha256.digest(hash, 0, 32);
                    } catch (NoSuchAlgorithmException e) {
                        e.printStackTrace();
                        return;
                    } catch (DigestException e) {
                        e.printStackTrace();
                        return;
                    }
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
                    String dateformat = df2.format(date);
                    // Util.tweet(String.format("【BOT試験中】アップデート: %s", dateformat));
                    break;
                case 4:

                    break;
                default:
                    break;
            }
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } finally {
            ses.shutdown();
        }
    }

}
