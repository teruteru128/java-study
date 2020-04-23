package com.twitter.teruteru128.study;

import java.security.MessageDigest;
import java.security.Provider;
import java.security.Security;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.util.Arrays;

import org.bouncycastle.jce.provider.BouncyCastleProvider;

import jakarta.xml.bind.DatatypeConverter;

/**
 * Main
 * 
 * TODO 将来的にエントリポイントをこのクラス一つにする
 */
public class Main {

    public static void main(String[] args) throws Exception {
        double a = (1099511627775D / 1099511627776D);
        double b = 5e-1;
        double min = 1e10;
        double max = 1e12;
        double middle = (min + max) / 2;
        for (int i = 0; i < 114514; i++) {
            b = Math.pow(a, middle);
            if (b > 0.5) {
                min = middle;
            } else if (b < 0.5) {
                max = middle;
            }
            middle = (min + max) / 2;
        }
        System.out.printf("%.25g%n", middle);
        System.out.printf("%.25g%n", Math.pow(a, 762123384785D));
        System.out.printf("%.25g%n", Math.pow(a, 762123384786D));
    }
}
