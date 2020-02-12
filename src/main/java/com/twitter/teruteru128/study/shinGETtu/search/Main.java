package com.twitter.teruteru128.study.shinGETtu.search;

import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.regex.Pattern;

import com.twitter.teruteru128.study.crypto.DataPrinter;

public class Main {

    private static final Pattern pattern1 = Pattern.compile("&");
    private static final Pattern pattern2 = Pattern.compile("&amp;(#\\d+|#[Xx][0-9A-Fa-f]+|[A-Za-z0-9]+);");
    private static final Pattern pattern3 = Pattern.compile("<");
    private static final Pattern pattern4 = Pattern.compile(">");
    private static final Pattern pattern5 = Pattern.compile("\r");
    private static final Pattern pattern6 = Pattern.compile("\n");

    private static String escape(String a) {
        String msg = pattern1.matcher(a).replaceAll("&amp;");
        msg = pattern2.matcher(msg).replaceAll("&$1;");
        msg = pattern3.matcher(msg).replaceAll("&lt;");
        msg = pattern4.matcher(msg).replaceAll("&gt;");
        msg = pattern5.matcher(msg).replaceAll("");
        msg = pattern6.matcher(msg).replaceAll("<br>");
        return msg;
    }

    public static void main(final String[] args) throws Exception {
        System.out.println(LocalDateTime.now());
        final MessageDigest md5 = MessageDigest.getInstance("md5");
        final byte[] prefix = "body:IGA".getBytes();
        String bodystr = null;
        String escapedStr = null;
        final byte[] id = new byte[16];
        final byte[] target = ByteBuffer.allocate(4).putInt(0x19190721).array();
        final long start = System.nanoTime();
        for (long i = 0x80000000L; i < 0x100000000L; i++) {
            md5.update(prefix);
            bodystr = Long.toString(i);
            escapedStr = escape(bodystr);
            md5.update(escapedStr.getBytes());
            md5.digest(id, 0 , 16);
            if (Arrays.equals(id, 0, 4, target, 0, 4)) {
                System.out.println(bodystr);
                System.out.println(escapedStr);
                System.out.println(DataPrinter.printHexBinary(id));
            }
        }
        final long end = System.nanoTime();
        final long diff = end - start;
        System.out.println((double)diff/1000000000);
        System.out.println(LocalDateTime.now());
    }

}
