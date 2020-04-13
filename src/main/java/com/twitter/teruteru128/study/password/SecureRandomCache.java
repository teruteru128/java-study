package com.twitter.teruteru128.study.password;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

public final class SecureRandomCache {
    private static SecureRandom cache = null;

    private SecureRandomCache() {
    }

    public static SecureRandom getInstance() {
        if (cache == null) {
            try {
                cache = SecureRandom.getInstance("SHA1PRNG");
            } catch (NoSuchAlgorithmException e) {
                e.printStackTrace();
            }
        }
        return cache;
    }
}