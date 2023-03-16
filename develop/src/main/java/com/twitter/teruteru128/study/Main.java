package com.twitter.teruteru128.study;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.security.DigestException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.Security;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Random;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadLocalRandom;
import java.util.random.RandomGenerator;

import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.sqlite.SQLiteDataSource;
import org.sqlite.jdbc4.JDBC4Connection;
import org.sqlite.jdbc4.JDBC4PreparedStatement;
import org.sqlite.jdbc4.JDBC4ResultSet;
import org.sqlite.jdbc4.JDBC4Statement;

import com.twitter.teruteru128.bitmessage.Protocol;
import com.twitter.teruteru128.bitmessage.VarintDecodeException;
import com.twitter.teruteru128.bitmessage.VarintTupple;
import com.twitter.teruteru128.bitmessage.app.Spammer;
import com.twitter.teruteru128.encode.Base58;

/**
 * Main
 * 秘密鍵かな？
 * ioxhJc1lIE2m+WFdBg3ieQb6rk8sSvg3wRv/ImJz2tc=
 * cm2E2vmE0Nd8aVP/4Ph2S1R6C5bkC1H7CiUBzbcDG3U=
 * BixgbLYk35GP+XHYdK/DgSWIUXyCTwCwEtY4h/G22dw=
 * BH4RDmdo0Yq0Ftiw0lm9ej5BmpZ35kEw2kaWZlZ0Do8=
 * lMhxDh6RPpWOsnJMeS12pTJ/j7EPn+ugpdbNQCGbiwc=
 * 9hZn+KDlwjgrbyFpaX5ibuaO4QfaFbIL79NUrwJlcRQ=
 * T+tDF4I700WFkFhGieYxWgQKPO/MDcntDYzMrqQSZjzwV2DzaI1OM/CsJWE30WBqMI1SxbEQHufR1A76I7ayWN==
 * nySkaCQxGErccmiqLznSQduXgFICpjnl2bo7n3FAhQMlku79plIeL85/etpN865GAnlUpErSppEYHvn4couGh3==
 * ns2bQQ4zlnfcCTSAxEH3gDDYHcBswKw92jQeEgm+9tse74XdX+LNwgfw7OsMUjOGtLMb7R/kXNRXYv1AHi71iV==
 * NxhJ5JwWhUtUccCfJNtVqzdpCMGOaAtknmcEKLyglZFNXE66EiFi9wPFekwekx3ln8m9v5wnfv7V8jSrpZ/SHQ==
 * +3n5qDbtpicXBy+Yyol/TJkg2IoQ01vZ/U2SvgpP+Fdm4DrIYngY7X0ZS53rc/KKIHT//jVqNwNBz1sGFyYUDg==
 * cLtHGFI7X/Xl6Ly03DczMzl2bsHJmI2BMQKKCckUek5vTIiltDPfT3PxdT6zxW1LzwVqJIsQEkxxPNTswgpSFg==
 * pMQBNF+F12AXT3T0mQq7S0l1VcCr/Dw2Q54zeuHH0/1ExLgbhHEsmAHf3WR9nK/Ku1Mc/eU3vaAO78yplJB76A==
 * QUFBQUFBQUFBQUFBQUFBQUFBQUFBQUFBQUFBQUFBQUFBQUFBQUFBQUFBQUFBQUFBQUFBQUFBQUFBQUFBQUFBQQ==
 * D8BH6DLNJekZ5jiiIVSnyS5ziE9XJSRG5bA9OdiFdjee6HTxHxFQXyEQdhfN+E69RKToLYXGDxK2X9v9eEcbUxdSp9tbptXegxkNQgIxg97BAq9gtmxPm4Ebngl/Q/I4
 * cLJlMSoCYBgR0d/bg7zG1B77BBWy7f1KLiJG5b8mPmlD8dAJKCZSEFRdWLuxSyRjgFFeiMm4+l+2SNIhL/SBma7ABhg232DeJkbUcZJKqBfAI9taPQ5Y9bwIXrcjxqMx
 * clock_gettimeを使って取得した時刻からtv_nsecの下1バイトを集めたやつ
 * ojHbK3vBB70XXaPfJWun7TNvtfs3fcP/RYvHDXvLB2Gn7SlvtfE3fbn/RYHHDV2j6SVrsfczebX7QX3DCWOf5Q==
 * b4Ohtcnd8QUZLUtfc4ebr83h9QknRVltgZWzx9vvAxc1SV1xhaO3y9/9ESU5V2t/k7HF2e0LHzNHW2+DobXJ3Q==
 * KEZaboKWqr7S5voYLEBUaHyQpLjM6v4SJjpOYnaUqLzQ5PgMIDRIZnqOorbK3vIGGjhMYHSInLDE2PYKHjJGWg==
 * hZmtwdXp/RElOVdrf5Onu8/j9wspPVFleY2htcnd8Q8jN0tfc4ebr8PX9QkdMUVZbYGVqcfb7wMXKz9TZ3uPrQ==
 * btRLuN4FP1H9vF3/ES0LPL757PPmfNY5xuIJszbhRFbiyxC7ADqoNVFjFVFOvM5Qs+QUEUsVl5RywYzvFXE1og==
 * 1bit右シフトしてみた。そのままだと1byteが奇数しか出ないっぽい
 * pQicBD8LZAewO48VT8ZlBGwZcsaDIhDSZ+iCNL9jII1Y95v+deF7z0auNNddtiOBwR5y5H4TolDldaYh2UuVSA==
 * Ya/piNyZ969sH/qUEPDazlnQVgRnbyLGN6RI+4YvGZoHGdbPw3tgQDktJs9pXYhF+KZoFo0T/bBjZuxUAmCqWA==
 * mgbBWuOBHpn/wEm10SiPBZgiulzISK44ngU/m/14uzvTrIXrKlqeDnq5ONvwM6TyYsQwM2dP4wR5/shIxymU4g==
 */
public class Main implements Callable<Long>, Runnable {

    static {
        if (Security.getProvider("BC") == null) {
            Security.addProvider(new BouncyCastleProvider());
        }
    }

    public Main() {
        super();
    }

    private static Main main = new Main();

    private LinkedList<String> addressList = null;

    private static void a() throws Exception {
        var dataSource = new SQLiteDataSource();
        dataSource.setUrl("jdbc:sqlite:D:\\address.db");
        if (!new File("D:\\address.db").exists()) {
            {
                LinkedList<String> lista = new LinkedList<>();
                try (var r = new BufferedReader(new InputStreamReader(ClassLoader.getSystemResourceAsStream("out.txt")))) {
                    String line = null;
                    while ((line = r.readLine()) != null) {
                        lista.add(line.trim());
                    }
                }
                ArrayList<String> listb = new ArrayList<>(lista);
                System.out.printf("address list size: %d%n", listb.size());
                lista = null;
                Collections.sort(listb);
                main.addressList = new LinkedList<>(listb);
                listb = null;
            }
            try (var c = dataSource.getConnection()) {
                int count = 0;
                int p = 0;
                try (var s = c.createStatement()) {
                    s.execute("create table address(address text, count integer default 0, primary key(address))");
                }
                try (var ps = c.prepareStatement("insert into address(address) values (?)")) {
                    for (String address : main.addressList) {
                        ps.setString(1, address);
                        ps.addBatch();
                        count++;
                        if(count >= 1000) {
                            ps.executeBatch();
                            System.err.printf("batch: %d%n", p);
                            count = 0;
                            p++;
                        }
                    }
                    if(count > 0) {
                        ps.executeBatch();
                        count = 0;
                    }
                }
            }
        } else {
            Random random = (Random) RandomGenerator.of("SecureRandom");
            try (JDBC4Connection c = (JDBC4Connection)dataSource.getConnection()) {
                var insertedAddresses = new LinkedList<String>();
                try (JDBC4Statement s = (JDBC4Statement)c.createStatement()) {
                    try (JDBC4ResultSet r = (JDBC4ResultSet)s.executeQuery("select address from address;")) {
                        while (r.next()) {
                            insertedAddresses.add(r.getString("address"));
                        }
                    }
                }
                var work = new ArrayList<>(insertedAddresses);
                Collections.shuffle(work, random);
                main.addressList = new LinkedList<>(work);
                /* 
                LinkedList<String> lista = new LinkedList<>();
                try (var r = new BufferedReader(new InputStreamReader(ClassLoader.getSystemResourceAsStream("out.txt")))) {
                    String line = null;
                    while ((line = r.readLine()) != null) {
                        lista.add(line.trim());
                    }
                }
                var listb = new ArrayList<String>(lista);
                System.out.printf("address list size: %d%n", listb.size());
                lista = null;
                Collections.sort(listb);
                main.addressList = new LinkedList<>(listb);
                int count = 0;
                int p = 0;
                try (JDBC4PreparedStatement s = (JDBC4PreparedStatement)c.prepareStatement("insert into address(address) values(?);")) {
                    for (var address : main.addressList) {
                        if(Collections.binarySearch(d, address) < 0) {
                            s.setString(1, address);
                            s.addBatch();
                            count++;
                            if(count >= 1000) {
                                System.err.printf("バッチ実行: %d%n", p);
                                s.executeLargeBatch();
                                count = 0;
                                p++;
                            }
                        }
                    }
                    System.err.println("検索完了");
                    if(count > 0) {
                        s.executeBatch();
                        count = 0;
                    }
                    s.executeBatch();
                } */
            }
        }
        //main.service = Executors.newScheduledThreadPool(2);
        //main.service.scheduleAtFixedRate(main, 0, 86, TimeUnit.SECONDS);
    }

    /**
     * 
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        //a();
        var dataSource = new SQLiteDataSource();
        dataSource.setUrl("jdbc:sqlite:D:\\uuid.db");
        try (var c = dataSource.getConnection()) {
            /* 
            try(var s = c.createStatement()){
                s.execute("create table if not exists uuid(leastSigBits integer, mostSigBits integer, primary key(leastSigBits, mostSigBits));");
            }
            */
            
            try(var ps = c.prepareStatement("insert into temp(most, least) values(?, ?);")) {
                long most;
                long least;
                int count = 0;
                long num = 0xffffffffL - 6819868;
                for(long i = 0; i < num; i++) {
                    most = ThreadLocalRandom.current().nextLong();
                    most &= 0xffffffffffff0fffL;
                    most |= 0x0000000000004000L;
                    ps.setLong(1, most);
                    least = ThreadLocalRandom.current().nextLong();
                    least &= 0x3fffffffffffffffL;
                    least |= 0x8000000000000000L;
                    ps.setLong(2, least);
                    ps.addBatch();
                    count++;
                    if(count >= 8192) {
                        ps.executeLargeBatch();
                        count = 0;
                    }
                }
                if(count > 0) {
                    ps.executeLargeBatch();
                }
            }
           
            /* 
            try(var s = c.createStatement()){
                try(var rs = s.executeQuery("select leastSigBits, mostSigBits from uuid limit 1000;")){
                    long least;
                    long most;
                    UUID uuid;
                    while (rs.next()) {
                        least = rs.getLong("leastSigBits");
                        most = rs.getLong("mostSigBits");
                        uuid = new UUID(least, most);
                        System.out.printf("%d %d: %016x%016x%n", uuid.variant(), uuid.version(), least, most);
                    }
                }
            }
            try(var s = c.prepareStatement("select leastSigBits, mostSigBits from uuid where leastSigBits = ? and mostSigBits = ?;")){
                s.setLong(1, -6099378376856909065L);
                s.setLong(2, 9061201999060942868L);
                try(var rs = s.executeQuery()){
                    long least;
                    long most;
                    UUID uuid;
                    while (rs.next()) {
                        least = rs.getLong("leastSigBits");
                        most = rs.getLong("mostSigBits");
                        uuid = new UUID(most, least);
                        System.out.printf("!%d %d: %016x%016x%n", uuid.variant(), uuid.version(), least, most);
                    }
                }
            } */
        }
    }

    private ScheduledExecutorService service;

    private static DecodedAddress decodeAddress(String address) {
        address = address.strip();
        byte[] data = null;
        if (address.substring(0, 3).equals("BM-")) {
            data = Base58.decode(address.substring(3));
        } else {
            data = Base58.decode(address);
        }
        byte[] checksum = Arrays.copyOfRange(data, data.length - 4, data.length);
        byte[] hash = new byte[64];
        try {
            MessageDigest sha512 = MessageDigest.getInstance("sha-512");
            sha512.update(data, 0, data.length - 4);
            sha512.digest(hash, 0, 64);
            sha512.update(hash, 0, 64);
            sha512.digest(hash, 0, 64);
        } catch (NoSuchAlgorithmException | DigestException e) {
            throw new InternalError(e);
        }
        if (!MessageDigest.isEqual(checksum, Arrays.copyOf(hash, 4))) {
            return null;
        }
        VarintTupple addressVersionNumnerTupple = null;
        try {
            addressVersionNumnerTupple = VarintTupple.newInstance(data, 0, 9);
        } catch (VarintDecodeException e) {
            return null;
        }
        int addressVersionNumner = (int) addressVersionNumnerTupple.value();
        if (addressVersionNumner > 4) {
            return null;
        } else if (addressVersionNumner == 0) {
            return null;
        }
        VarintTupple streamNumberTupple = null;
        try {
            streamNumberTupple = VarintTupple.newInstance(data, addressVersionNumnerTupple.length(), 9);
        } catch (VarintDecodeException e) {
            return null;
        }
        int streamNumber = (int) streamNumberTupple.value();
        if (addressVersionNumner == 1) {
        } else if (addressVersionNumner == 2 || addressVersionNumner == 3) {
            var trimedripe = Arrays.copyOfRange(data,
                    addressVersionNumnerTupple.length() + streamNumberTupple.length(),
                    data.length - 4);
            var ripe = new byte[20];
            System.arraycopy(trimedripe, 0, ripe, 20 - trimedripe.length, trimedripe.length);
            return new DecodedAddress(addressVersionNumner, streamNumber, ripe);
        } else if (addressVersionNumner == 4) {
            var trimedripe = Arrays.copyOfRange(data,
                    addressVersionNumnerTupple.length() + streamNumberTupple.length(),
                    data.length - 4);
            var ripe = new byte[20];
            System.arraycopy(trimedripe, 0, ripe, 20 - trimedripe.length, trimedripe.length);
            return new DecodedAddress(addressVersionNumner, streamNumber, ripe);
        }
        return null;
    }

    public long send() {
        var uuid = UUID.randomUUID();
        byte[] msgid = Encode.uuidToBytes(uuid);
        String toAddress = "BM-2cXrRXWPR3TdbnmdRdggCXmZjf34vEQHBK";
        var d = decodeAddress(toAddress);
        byte[] toripe = d.ripe();
        String fromAddress = "BM-5oSNKUHN6pgfQ8GetUHJJhzXpBYSRET";
        String subject = "test";
        String message = uuid.toString();
        String status = "msgqueued";
        byte[] ackdata = Protocol.genAckPayload(d.streamNumber(), 2);
        System.out.printf("ackdata length: %d%n", ackdata.length);
        LocalDateTime sentTime = LocalDateTime.now();
        LocalDateTime lastActionTime = sentTime;
        long sleeptill = 0;
        ZoneOffset offset = ZoneOffset.ofHours(9);
        int retryNumber = 0;
        int encoding = 2;
        int ttl = ThreadLocalRandom.current().nextInt(345300, 345900);
        String folder = "sent";
        return 0;
    }

    @Override
    public Long call() throws Exception {
        long a = 0;
        long count = 0;
        var fromAddress = "BM-5oGHd345R1y5zaHCQFwLXQ36NzjT1XG";
        String subject = "";
        String message = "";
        UUID uuid = null;
        int capacity = 2;
        int size = addressList.size();
        // method body
        capacity += size * 1200;
        if (size >= 1) {
            // num of delimiter
            capacity += size - 1;
        }
        for (long i = 1; i <= size; i++) {
            // ids
            capacity += Spammer.s(i);
        }
        Base64.Encoder encoder = Base64.getEncoder();
        for (String toAddress : addressList) {
            Spammer.send(toAddress, fromAddress, subject, message);
        }
        return a;
    }

    private String generateMessage(int length) {
        char[] msg = new char[length];
        Random random = (Random) RandomGenerator.of("SecureRandom");
        for (int i = 0; i < length; i++) {
            if ((i % 60) == 59) {
                msg[i] = '\n';
            } else if ((i % 6) == 5) {
                msg[i] = ' ';
            } else {
                msg[i] = (char) random.nextInt('0', 0x3a);
            }
        }
        // trim
        while ((0 < length) && (msg[length - 1] & 0xff) <= ' ') {
            length--;
        }
        return new String(msg, 0, length);
    }

    @Override
    public void run() {
        var toAddress = addressList.poll();
        if (toAddress == null) {
            service.shutdown();
            return;
        }
        var fromAddress = "BM-5oGHd345R1y5zaHCQFwLXQ36NzjT1XG";
        var subject = UUID.randomUUID().toString();
        var message = generateMessage(ThreadLocalRandom.current().nextInt(4, 801));
        Spammer.send(toAddress, fromAddress, subject, message);
        var dataSource = new SQLiteDataSource();
        dataSource.setUrl("jdbc:sqlite:D:\\address.db");
        try (var c = dataSource.getConnection();
                var ps = c.prepareStatement("delete from address where address = ?;")) {
            ps.setString(1, toAddress);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
