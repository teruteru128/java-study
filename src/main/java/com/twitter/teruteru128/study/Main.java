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
        Provider provider = Security.getProvider("BC");
        if (provider == null) {
            Security.addProvider(provider = new BouncyCastleProvider());
        }
        MessageDigest sha512 = MessageDigest.getInstance("SHA-512");
        MessageDigest ripemd160 = MessageDigest.getInstance("RIPEMD160");
        byte[] data = DatatypeConverter.parseBase64Binary(
                "BDqSvUHjvfN4zpH1r9Dqk1c3Zo7x8bs9O4MJ+Ap6bUMwpnX+yhZrc5iCgN/VWzp3X5zCjLPg5gY5CjsJ7XTOhmgE/tKAaBmHu2XluynxS37dnJBx+2dNXccTLc/ojM872iBYudGgO8DWYHSTrQt3ZKO1bcNdr5ut/QS0ywRn4HL9lg==");
        System.out.println(DatatypeConverter.printHexBinary(ripemd160.digest(sha512.digest(data))));
        long step = 604800L;
        ZonedDateTime currentTime = ZonedDateTime.now();
        Instant currentInstant = currentTime.toInstant();
        long currentEpoch = currentInstant.getEpochSecond();
        System.out.println((currentEpoch / step) * step);
        System.out.println(((currentEpoch + (step - 1)) / step) * step);
    }
}
