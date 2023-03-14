package com.twitter.teruteru128.study;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.net.http.HttpClient;
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
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;
import java.util.random.RandomGenerator;

import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.sqlite.SQLiteDataSource;
import org.sqlite.jdbc4.JDBC4Connection;
import org.sqlite.jdbc4.JDBC4PreparedStatement;
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

    /**
     * 
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {

        var dataSource = new SQLiteDataSource();
        dataSource.setUrl("jdbc:sqlite:address.db");
        if (!new File("address.db").exists()) {
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
            try (var c = dataSource.getConnection()) {
                try (var s = c.createStatement();) {
                    s.execute("create table address(address text, primary key(address))");
                }
                try (var ps = c.prepareStatement("insert into address(address) values (?)")) {
                    for (String address : main.addressList) {
                        ps.setString(1, address);
                        ps.addBatch();
                    }
                    ps.executeBatch();
                }
            }
        } else {
            Random random = (Random) RandomGenerator.of("SecureRandom");
            try (var c = dataSource.getConnection()) {
                var tmp = new LinkedList<String>();
                try (var s = c.createStatement()) {
                    try (var r = s.executeQuery("select address from address;")) {
                        while (r.next()) {
                            tmp.add(r.getString("address"));
                        }
                    }
                }
                var work = new ArrayList<>(tmp);
                Collections.shuffle(work, random);
                main.addressList = new LinkedList<>(work);
            }
        }
        //main.service = Executors.newScheduledThreadPool(2);
        //main.service.scheduleAtFixedRate(main, 0, 86, TimeUnit.SECONDS);
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

    public long send(byte[] msgid, String toAddress, String fromAddress, String subject, String message, String status,
            byte[] toripe, byte[] ackdata, long sentTime, long lastActionTime, long sleeptill, int retryNumber,
            int encoding, int ttl, String folder) {
        long a = 0;
        try {
            a = insert(msgid, toAddress, fromAddress, subject, message, status, toripe, ackdata,
                    sentTime, lastActionTime,
                    sleeptill, retryNumber,
                    encoding, ttl, folder);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return a;
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
        return send(msgid, toAddress, fromAddress, subject, message, status, toripe, ackdata,
                sentTime.toInstant(offset).getEpochSecond(), lastActionTime.toInstant(offset).getEpochSecond(),
                sleeptill, retryNumber, encoding, ttl, folder);
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
        dataSource.setUrl("jdbc:sqlite:address.db");
        try (var c = dataSource.getConnection();
                var ps = c.prepareStatement("delete from address where address = ?;")) {
            ps.setString(1, toAddress);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static long insert(byte[] msgid, String toAddress, String fromAddress, String subject, String message,
            String status,
            byte[] toripe, byte[] ackdata, long sentTime, long lastActionTime, long sleeptill, int retryNumber,
            int encoding, int ttl, String folder) throws SQLException {
        // toAddress.equals("[Broadcast subscribers]") ? fromaddress: toaddress;
        var ad = decodeAddress(fromAddress);
        if (ad == null) {
            return -1;
        }
        if (ackdata == null)
            ackdata = Protocol.genAckPayload(ad.streamNumber(), 2);
        var dataSource = new SQLiteDataSource();
        dataSource.setUrl("jdbc:sqlite:C:\\Users\\terut\\AppData\\Roaming\\PyBitmessage\\messages.dat");
        try (var connection = (JDBC4Connection) dataSource.getConnection()) {
            try (var s = connection.prepareStatement(
                    "insert into sent(msgid, toaddress, toripe, fromaddress, subject, message, ackdata, senttime, lastactiontime, sleeptill, status, retrynumber, folder, encodingtype, ttl) values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?);")) {
                s.setBytes(1, msgid);
                s.setString(2, toAddress);
                s.setBytes(3, toripe);
                s.setString(4, fromAddress);
                s.setBytes(5, subject.getBytes(StandardCharsets.UTF_8));
                s.setBytes(6, message.getBytes(StandardCharsets.UTF_8));
                s.setBytes(7, ackdata);
                s.setLong(8, sentTime);
                s.setLong(9, lastActionTime);
                s.setLong(10, sleeptill);
                s.setString(11, status);
                s.setInt(12, retryNumber);
                s.setString(13, folder);
                s.setInt(14, encoding);
                s.setInt(15, ttl);
                return s.executeUpdate();
            }
        }
    }

    public long name() throws SQLException {
        long count = 0;
        var today = LocalDateTime.now();
        var offset = ZoneOffset.ofHours(9);
        var dataSource = new SQLiteDataSource();
        dataSource.setUrl("jdbc:sqlite:C:\\Users\\terut\\AppData\\Roaming\\PyBitmessage\\messages.dat");
        long sumofdone = 0;
        try (var connection = (JDBC4Connection) dataSource.getConnection()) {
            var map = new HashMap<String, Integer>();
            try (var statement = (JDBC4Statement) connection.createStatement();
                    var set = statement.executeQuery(
                            "select toaddress from sent where folder = 'sent' and fromaddress = 'BM-NBJxKhQmidR2TBtD3H74yZhDHpzZ7TXM' and toaddress like 'BM-%' and date(sleeptill, 'unixepoch', 'localtime') < '2023-04-05' order by random();")) {
                var min = (int) today.plus(10, ChronoUnit.DAYS).truncatedTo(ChronoUnit.DAYS).toInstant(offset)
                        .getEpochSecond();
                var max = (int) today.plus(4, ChronoUnit.WEEKS).truncatedTo(ChronoUnit.DAYS).toInstant(offset)
                        .getEpochSecond();
                while (set.next()) {
                    map.put(set.getString("toaddress"), Integer.valueOf(ThreadLocalRandom.current().nextInt(min, max)));
                }
            }
            try (var statement1 = (JDBC4PreparedStatement) connection
                    .prepareStatement("update sent set sleeptill = ? where toaddress = ?;")) {
                for (var entry : map.entrySet()) {
                    statement1.setInt(1, entry.getValue());
                    statement1.setString(2, entry.getKey());
                    statement1.addBatch();
                    if (count >= 1000) {
                        var b = statement1.executeBatch();
                        for (int i : b) {
                            if (i != PreparedStatement.SUCCESS_NO_INFO && i != PreparedStatement.EXECUTE_FAILED) {
                                sumofdone += i;
                            }
                        }
                        count = 0;
                        statement1.clearBatch();
                    }
                }
                var b = statement1.executeBatch();
                for (int i : b) {
                    if (i != PreparedStatement.SUCCESS_NO_INFO && i != PreparedStatement.EXECUTE_FAILED) {
                        sumofdone += i;
                    }
                }
                statement1.clearBatch();
            }
        }
        return sumofdone;
    }

}
