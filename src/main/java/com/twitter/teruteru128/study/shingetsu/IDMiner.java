package com.twitter.teruteru128.study.shingetsu;

import java.nio.ByteBuffer;
import java.security.DigestException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.regex.Pattern;

import com.twitter.teruteru128.study.crypto.DataPrinter;

public class IDMiner implements Runnable {

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

    public IDMiner(long start, long end) {
        super();
        this.start = start;
        this.end = end;
    }

    @Override
    public void run() {
        {
            final var starttime = LocalDateTime.now();
            final var threadname = Thread.currentThread().getName();
            synchronized (System.out) {
                System.out.printf("%s : %s%n", threadname, starttime);
            }
        }
        MessageDigest md5;
        long s = this.start;
        long en = this.end;
        try {
            md5 = MessageDigest.getInstance("md5");
            final byte[] prefix = "body:♂♂♂♂".getBytes();
            String bodystr = null;
            String escapedStr = null;
            final byte[] id = new byte[16];
            final byte[] target = ByteBuffer.allocate(4).putInt(0x19191919).array();
            final long start = System.nanoTime();
            byte[] bytes = null;
            for (long i = s; i < en; i++) {
                md5.update(prefix);
                bodystr = Long.toString(i);
                escapedStr = escape(bodystr);
                bytes = escapedStr.getBytes();
                md5.update(bytes, 0, bytes.length);
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
                final var threadname = Thread.currentThread().getName();
                synchronized (System.out) {
                    System.out.printf("%s : %s %s%n", threadname, endtime, seconds);
                }
            }
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (DigestException e) {
            e.printStackTrace();
        }
    }

    public static void main(final String[] args) {
        var handle = ProcessHandle.current();
        System.out.printf("pid : %d%n", handle.pid());
        ExecutorService service = Executors.newFixedThreadPool(6);
        for (long i = 0; i < 0x20; i++) {
            service.execute(new IDMiner(i * 0x10000000L, (i + 1) * 0x10000000L));
        }
        service.shutdown();
    }

}
