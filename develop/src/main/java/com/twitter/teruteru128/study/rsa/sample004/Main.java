package com.twitter.teruteru128.study.rsa.sample004;

import java.math.BigInteger;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Random;

import com.twitter.teruteru128.study.rsa.util.Const;

/**
 * @author Teruteru
 *
 */
public class Main {

    /**
     * @param args
     */
    public static void main(String[] args) {
        final BigInteger n = Const.N;
        Random rand;
        try {
            rand = SecureRandom.getInstanceStrong();
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
        BigInteger p = new BigInteger(1365, rand).setBit(1364);
        BigInteger mod = n.mod(p);
        BigInteger minmodu = new BigInteger(
                "435112929664060571307625278437721309074955685553644354922352615213061036632005328166489982144192819487561021523740113928633052313536814002732152243132490724124356317300015603092001479236058656678747244748253939187495776965987676864693137548678791417732528459883845481881949883207723355557684307462577447951606333252147212770709480186105987768654252991794714683735600596967856910169247087979908670718397039793593",
                10);
        BigInteger minmod = n.mod(minmodu);
        System.out.println(n.mod(minmodu.add(BigInteger.valueOf(1))));
        System.out.println(n.mod(minmodu));
        System.out.println(n.mod(minmodu.subtract(BigInteger.valueOf(1))));
        int minmodlen = minmod.bitLength();
        int curmodlen = mod.bitLength();
        for (int i = 0; i < 200000; i++) {
            p = new BigInteger(1365, rand).setBit(1364);
            mod = n.mod(p);
            curmodlen = mod.bitLength();
            if (minmodlen > curmodlen) {
                System.out.println("update!");
                minmodlen = curmodlen;
                minmod = mod;
                minmodu = p;
            }
        }
        System.out.printf("minmodubitlength : %d%n", minmodu.bitLength());
        System.out.printf("%dbit%n", minmodlen);
        System.out.printf("(%dbit)%d%n", minmod.bitLength(), minmod);
        System.out.printf("(%dbit)%d%n", minmodu.bitLength(), minmodu);
    }

}
