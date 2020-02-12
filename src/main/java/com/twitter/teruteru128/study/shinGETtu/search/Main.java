package com.twitter.teruteru128.study.shinGETtu.search;

import java.nio.ByteBuffer;
import java.security.DigestException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.regex.Pattern;

import com.twitter.teruteru128.study.crypto.DataPrinter;

public class Main implements Runnable {

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

    private long start;
    private long end;

    public Main(long start, long end) {
        super();
        this.start = start;
        this.end = end;
    }

    @Override
    public void run() {
        {
            final var starttime = LocalDateTime.now();
            synchronized (System.out) {
                System.out.println(starttime);
            }
        }
        MessageDigest md5;
        long s = this.start;
        long en = this.end;
        try {
            md5 = MessageDigest.getInstance("md5");
            final byte[] prefix = "body:IGA".getBytes();
            String bodystr = null;
            String escapedStr = null;
            final byte[] id = new byte[16];
            final byte[] target = ByteBuffer.allocate(4).putInt(0x19190721).array();
            final long start = System.nanoTime();
            for (long i = s; i < en; i++) {
                md5.update(prefix);
                bodystr = Long.toString(i);
                escapedStr = escape(bodystr);
                md5.update(escapedStr.getBytes());
                md5.digest(id, 0, 16);
                if (Arrays.equals(id, 0, 4, target, 0, 4)) {
                    String binarystr = DataPrinter.printHexBinary(id);
                    synchronized (System.out) {
                        System.out.println(bodystr);
                        System.out.println(escapedStr);
                        System.out.println(binarystr);
                    }
                }
            }
            {
                final long end = System.nanoTime();
                final long diff = end - start;
                final double seconds = (double) diff / 1000000000;
                final var endtime = LocalDateTime.now();
                synchronized (System.out) {
                    System.out.println(seconds);
                    System.out.println(endtime);
                }
            }
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (DigestException e) {
            e.printStackTrace();
        }
    }

    public static void main(final String[] args) {
        System.out.printf("pid : %d%n", ProcessHandle.current().pid());
        Thread thread1 = new Thread(new Main(0x80000000L, 0xA0000000L));
        thread1.start();
        Thread thread2 = new Thread(new Main(0xA0000000L, 0xC0000000L));
        thread2.start();
        Thread thread3 = new Thread(new Main(0xC0000000L, 0xE0000000L));
        thread3.start();
        Thread thread4 = new Thread(new Main(0xE0000000L, 0x100000000L));
        thread4.start();
    }

}
