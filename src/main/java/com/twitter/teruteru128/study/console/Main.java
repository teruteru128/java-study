package com.twitter.teruteru128.study.console;

import java.io.Console;
import java.security.SecureRandom;
import java.util.Arrays;

import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;

import jakarta.xml.bind.DatatypeConverter;

/**
 * @author Teruteru
 *
 */
public class Main {

    /**
     * @param args
     */
    public static void main(String[] args) throws Exception {
        Console console = System.console();
        if (console == null) {
            throw new NullPointerException("Console not Found!");
        }
        byte[] salt = new byte[64];
        new SecureRandom().nextBytes(salt);
        console.format("salt : %s%n", DatatypeConverter.printHexBinary(salt));
        SecretKeyFactory factory = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA512");
        for (int i = 0;; i++) {
            char[] password = console.readPassword("パスワード %d: ", i);
            if (password == null) {
                break;
            }

            console.printf("パスワード: %s%n", new String(password));
            PBEKeySpec spec = new PBEKeySpec(password, salt, 65536, 512);
            Arrays.fill(password, '\0');
            SecretKey key = factory.generateSecret(spec);
            System.out.println(DatatypeConverter.printHexBinary(key.getEncoded()));
        }

    }

}
