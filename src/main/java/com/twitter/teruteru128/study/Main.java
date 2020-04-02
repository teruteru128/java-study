package com.twitter.teruteru128.study;

import java.security.MessageDigest;
import java.util.Arrays;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) throws Exception {
        char[] b = "123456789ABCDEFGHJKLMNPQRSTUVWXYZabcdefghijkmnopqrstuvwxyz".toCharArray();
        StringBuilder a = new StringBuilder(32);
        a.append("NB3Ac4aH3dVRtvPnFnffRwHTgs9QeAAA");
        MessageDigest sha512 = MessageDigest.getInstance("SHA-512");
        for (char c : b) {
            a.setCharAt(29, c);
            for (char d : b) {
                a.setCharAt(30, d);
                for (char e : b) {
                    a.setCharAt(31, e);
                    String h = a.toString();
                    byte[] f = Base58.decode(h);
                    sha512.update(f, 0, 20);
                    byte[] g = sha512.digest(sha512.digest());
                    if (Arrays.equals(f, 20, 24, g, 0, 4)) {
                        System.out.print(h);
                        System.out.print(" : ");
                        System.out.println(Arrays.equals(f, 20, 24, g, 0, 4));
                    }
                }
            }
        }
    }
}
