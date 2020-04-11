package com.twitter.teruteru128.test.hash2;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Base64;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import twitter4j.StatusUpdate;
import twitter4j.Twitter;
import twitter4j.TwitterBase;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.auth.AccessToken;
import twitter4j.auth.RequestToken;
import twitter4j.conf.Configuration;
import twitter4j.conf.ConfigurationBuilder;

import com.twitter.teruteru128.test.password.SecureRandomCache;
import com.twitter.teruteru128.test.twitter.util.Util;
import com.twitter.teruteru128.util.Arrays;

/**
 * @author Teruteru
 *
 */
public class Main {
    private static ScheduledExecutorService ses = Executors.newScheduledThreadPool(16);
    /**
     * @param args
     */
    public static void main(String[] args) {
        byte[] input = new byte[32];
        input = new byte[0];
        byte[] hash = null;
        SecureRandom sr = SecureRandomCache.getInstance();
        MessageDigest sha256 = null;
        int mode = 4;
        java.util.Date date = GregorianCalendar.getInstance(Locale.JAPAN)
                .getTime();
        DateFormat df = DateFormat.getDateTimeInstance(DateFormat.FULL,
                DateFormat.FULL, Locale.JAPAN);
        df = new SimpleDateFormat("y年M月d日 k時m分s秒", Locale.JAPAN);
        switch (mode) {
        case 1:
            // sr.nextBytes(input);
            try {
                sha256 = MessageDigest.getInstance("SHA-256");
                hash = sha256.digest(input);
            } catch (NoSuchAlgorithmException e) {
                e.printStackTrace();
                return;
            }
            String strinput = null;
            String strhash = null;
            strinput = Arrays.toHexString(input);
            strhash = Arrays.toHexString(hash);
            System.out.printf("input: %s, hash: %s%n", strinput, strhash);
            System.out.printf("input: %d, hash: %d%n", strinput.length(),
                    strhash.length());
            Base64.Encoder enc = Base64.getEncoder();
            strinput = enc.encodeToString(input);
            strhash = enc.encodeToString(hash);
            System.out.printf("input: %s, hash: %s%n", strinput, strhash);
            System.out.printf("input: %d, hash: %d%n", strinput.length(),
                    strhash.length());
            break;
        case 2:
            Util.tweet("ねくろいど");
            break;
        case 3:
            String dateformat = df.format(date);
            Util.tweet(String.format("【BOT試験中】アップデート: %s", dateformat));
            break;
        case 4:
            
            break;
        default:
            break;
        }
    }

}
