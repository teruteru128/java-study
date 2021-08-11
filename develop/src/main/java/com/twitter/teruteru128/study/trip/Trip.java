package com.twitter.teruteru128.study.trip;

import java.nio.charset.Charset;
import java.security.NoSuchAlgorithmException;

import javax.crypto.NoSuchPaddingException;

import org.apache.commons.codec.digest.UnixCrypt;

public class Trip {

    private Trip() {
    }

    public static String calcTrip(String tripkey) throws NoSuchAlgorithmException, NoSuchPaddingException {
        var salt = (tripkey + "H.").substring(1, 3);
        salt = salt.replaceAll("[^.-z]", ".");
        // tr
        salt = salt.replace(':', 'A');
        salt = salt.replace(';', 'B');
        salt = salt.replace('<', 'C');
        salt = salt.replace('=', 'D');
        salt = salt.replace('>', 'E');
        salt = salt.replace('?', 'F');
        salt = salt.replace('@', 'G');
        salt = salt.replace('[', 'a');
        salt = salt.replace('\\', 'b');
        salt = salt.replace(']', 'c');
        salt = salt.replace('^', 'd');
        salt = salt.replace('_', 'e');
        salt = salt.replace('`', 'f');

        var trip = UnixCrypt.crypt(tripkey.getBytes(Charset.forName("Shift-JIS")), salt);
        int length = trip.length();
        return trip.substring(length - 10, length);
    }

}
