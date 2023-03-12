package com.twitter.teruteru128.study;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.ByteBuffer;
import java.security.DigestException;
import java.security.KeyPairGenerator;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.Security;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HexFormat;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ThreadLocalRandom;

import org.bouncycastle.jce.interfaces.ECPrivateKey;
import org.bouncycastle.jce.interfaces.ECPublicKey;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.sqlite.SQLiteDataSource;
import org.sqlite.jdbc4.JDBC4Connection;
import org.sqlite.jdbc4.JDBC4PreparedStatement;
import org.sqlite.jdbc4.JDBC4Statement;

import com.twitter.teruteru128.bitmessage.Dandelion;
import com.twitter.teruteru128.bitmessage.ECIES;
import com.twitter.teruteru128.bitmessage.Structs;
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
public class Main implements Callable<Long> {

    static {
        if (Security.getProvider("BC") == null) {
            Security.addProvider(new BouncyCastleProvider());
        }
    }

    public Main() {
        super();
    }

    private static Main main = new Main();

    /**
     * {@link Dandelion#poissonTimeout()}のサンプル
     * 
     * @param average
     * @return
     */
    public static long poisson(long average) {
        double xp = 1. / (1 - ThreadLocalRandom.current().nextDouble());
        long count = 0;
        double exp_average = Math.exp(average);
        while (xp < exp_average) {
            xp /= (1 - ThreadLocalRandom.current().nextDouble());
            count++;
        }
        return count;
    }

    private static final HttpClient CLIENT = HttpClient.newBuilder().build();

    public static void jsonRPCRequestSample() throws IOException, InterruptedException {
        var request = HttpRequest.newBuilder(URI.create("http://192.168.12.8:8442/"))
                .header("Content-Type", "application/json-rpc")
                .header("Authorization", "Basic dGVydXRlcnUxMjg6YW5hbGJlYWRz")
                .POST(HttpRequest.BodyPublishers.ofString(
                        "{\"jsonrpc\": \"2.0\", \"method\": \"helloWorld\", \"params\": [\"33\", \"4\"], \"id\": 1}"))
                .build();
        var response = CLIENT.send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.statusCode());
        System.out.println(response.body());

    }

    /**
     * @see org.apache.commons.math3.distribution.TriangularDistribution
     * @param min
     * @param max
     * @param mean
     * @param x
     * @return
     */
    public static double triangularDistribution(double min, double max, double mean, double x) {
        if (min >= mean || mean >= max || min >= max) {
            throw new IllegalArgumentException();
        }
        double frac = (mean - min) / (max - min);
        if (x < frac) {
            return Math.sqrt(x * (mean - min) * (max - min)) + min;
        }
        return -Math.sqrt((1 - x) * (max - mean) * (max - min)) + max;
    }

    /***/
    public static void chinpo() {
        double penisSize1 = 0;
        double penisSize2 = 0;
        double penisSize3 = 0;
        double penisSize4 = 0;

        for (int i = 0; i < 10; i++) {
            penisSize1 = ThreadLocalRandom.current().nextGaussian(21, 9);
            penisSize2 = ThreadLocalRandom.current().nextDouble(9, 17);
            System.out.printf("%s, %s%n", Double.toString(penisSize1), Double.toString(penisSize2));
        }
        for (int i = 0; i < 10; i++) {
            penisSize3 = triangularDistribution(18, 30, 24, ThreadLocalRandom.current().nextDouble());
            penisSize4 = triangularDistribution(9, 17, 15, ThreadLocalRandom.current().nextDouble());
            System.out.printf("%s, %s%n", Double.toString(penisSize3), Double.toString(penisSize4));
        }
    }

    /**
     * @see org.apache.commons.math3.distribution.ExponentialDistribution
     */
    public static void anyDistributionSample() {
        double r = 0;
        double s = 0;
        for (int i = 0; i < 10; i++) {
            // ここ指数分布
            r = -Math.log(1 - ThreadLocalRandom.current().nextDouble());
            s = Math.sqrt(r);
            System.out.printf("%f, %f%n", r * 600, s * 600);
        }
    }

    /**
     * 
     * @param length
     * @param ttl
     * @param proofOfWorkNonceTrialsPerByte
     * @param payloadLengthExtraBytes
     * @return
     */
    static long calcTarget(int length, int ttl, int proofOfWorkNonceTrialsPerByte, int payloadLengthExtraBytes) {
        return (long) (0x1p64 / (proofOfWorkNonceTrialsPerByte
                * (length + 8 + payloadLengthExtraBytes + ((ttl * (length + 8 + payloadLengthExtraBytes)) / 0x1p16))));
    }

    private static ForkJoinPool pool = (ForkJoinPool) Executors.newWorkStealingPool();

    public void eciesSample() {
        var pair = ECIES.generateEcKeyPair();
        var message = Arrays.copyOf(
                "ｳｧｧ!!ｵﾚﾓｲｯﾁｬｳｩｩｩ!!!ｳｳｳｳｳｳｳｳｳｩｩｩｩｩｩｩｩｳｳｳｳｳｳｳｳ!ｲｨｨｲｨｨｨｲｲｲｨｲｲｲｲｲｲｲｲｲｲｲｲ!!".getBytes(), 800);
        var ciphertext = ECIES.encrypt(message, (ECPublicKey) pair.getPublic());
        var cleartext = ECIES.decrypt(ciphertext, (ECPrivateKey) pair.getPrivate());
        if (Arrays.equals(message, cleartext)) {
            System.out.println("OK");
        } else {
            System.out.println("NG");
            var format = HexFormat.of();
            System.out.println(format.formatHex(message));
            System.out.println(cleartext == null ? "null" : format.formatHex(cleartext));
        }
    }

    /**
     * 
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        /*
         * var s = pool.submit(main);
         * System.out.println(s.get().longValue());
         * pool.shutdown();
         */
        System.out.println(ThreadLocalRandom.current().nextInt(1310682));
        // BM-2cXde9jCYY658eZ7Lv4FEZkjf2vRXgx47f
        new Spammer().send("BM-2cXde9jCYY658eZ7Lv4FEZkjf2vRXgx47f", "BM-5oFytgcgzmQnytTfuLSR9wXAZAqNUD4", "ad",
                "vvvvv");
        /*
         * var uuid = UUID.fromString("c61c9854-2913-4024-bde6-f141745d1712");
         * System.out.println(uuid);
         * System.out.println(HexFormat.of().withUpperCase().formatHex(uuidToBytes(uuid)
         * ));
         */
        /*
         * var today = Instant.now();
         * var tomorrow = LocalDateTime.ofInstant(today, ZoneId.systemDefault()).plus(1,
         * ChronoUnit.DAYS)
         * .truncatedTo(ChronoUnit.DAYS).toInstant(ZoneOffset.ofHours(9));
         * var twoweekslater = LocalDateTime.ofInstant(today,
         * ZoneId.systemDefault()).plus(2, ChronoUnit.WEEKS)
         * .truncatedTo(ChronoUnit.DAYS).toInstant(ZoneOffset.ofHours(9));
         * var fiveweekslater = LocalDateTime.ofInstant(today,
         * ZoneId.systemDefault()).plus(5, ChronoUnit.WEEKS)
         * .truncatedTo(ChronoUnit.DAYS).toInstant(ZoneOffset.ofHours(9));
         * var nextYear = LocalDateTime.ofInstant(today, ZoneId.systemDefault()).plus(1,
         * ChronoUnit.YEARS)
         * .truncatedTo(ChronoUnit.DAYS).toInstant(ZoneOffset.ofHours(9));
         * System.out.printf("%s, %d%n", today, today.getEpochSecond());
         * System.out.printf("%s, %d%n", tomorrow, tomorrow.getEpochSecond());
         * System.out.printf("%s, %d%n", twoweekslater, twoweekslater.getEpochSecond());
         * System.out.printf("%s, %d%n", fiveweekslater,
         * fiveweekslater.getEpochSecond());
         * System.out.printf("%s, %d%n", nextYear, nextYear.getEpochSecond());
         */
    }

    private SQLiteDataSource dataSource = new SQLiteDataSource();

    private static byte[] uuidToBytes(UUID uuid) {
        return ByteBuffer.allocate(16).putLong(uuid.getMostSignificantBits()).putLong(uuid.getLeastSignificantBits())
                .array();
    }

    private DecodedAddress decodeAddress(String address) {
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

    public void send(byte[] msgid, String toAddress, String fromAddress, String subject, String message, String status,
            byte[] ripe, byte[] ackdata, long sentTime, long lastActionTime, long sleeptill, int retryNumber,
            int encoding, long ttl, String folder) {
        boolean validAddr = true;

        if (ripe == null || ackdata == null) {
            String addr = toAddress.equals("[Broadcast subscribers]") ? fromAddress : toAddress;

        }
    }

    private SecureRandom random = new SecureRandom();

    /**
     * @see {@link https://github.com/Bitmessage/PyBitmessage/blob/3d19c3f23fad2c7a26e8606cd95c6b3df417cfbc/src/helper_ackPayload.py#L13}
     * @param streamNumber
     * @param stealthLevel
     * @return
     */
    private byte[] genAckPayload(int streamNumber, int stealthLevel) {
        byte[] ackdata = null;
        int acktype = 0;
        int version = 0;
        switch (stealthLevel) {
            case 1:
                ackdata = new byte[32];
                random.nextBytes(ackdata);
                acktype = 0; // getpubkey
                version = 4;
                break;

            case 2:
                ECPublicKey key = ECIES.generateEcPublicKey();
                int len = ThreadLocalRandom.current().nextInt(234, 801);
                byte[] dummyMessage = new byte[len];
                random.nextBytes(dummyMessage);
                ackdata = ECIES.encrypt(dummyMessage, key);
                acktype = 2; // message
                version = 1;
                break;

            default:
                ackdata = new byte[32];
                random.nextBytes(ackdata);
                acktype = 2; // message
                version = 1;
                break;
        }
        var o = new ByteArrayOutputStream(6 + ackdata.length);
        try (DataOutputStream dos = new DataOutputStream(o)) {
            dos.writeInt(acktype);
            dos.write(Structs.encodeVarint(version));
            dos.write(Structs.encodeVarint(streamNumber));
            dos.write(ackdata);
        } catch (IOException e) {
        }
        return o.toByteArray();
    }

    @Override
    public Long call() throws Exception {
        long a = 0;
        var uuid = UUID.randomUUID();
        byte[] msgid = uuidToBytes(uuid);
        String toAddress = "BM-2cXrRXWPR3TdbnmdRdggCXmZjf34vEQHBK";
        var d = decodeAddress(toAddress);
        byte[] toripe = d.ripe();
        String fromAddress = "BM-5oSNKUHN6pgfQ8GetUHJJhzXpBYSRET";
        String subject = "test";
        String message = uuid.toString();
        String status = "msgqueued";
        byte[] ackdata = genAckPayload(d.streamNumber(), 2);
        System.out.printf("ackdata length: %d%n", ackdata.length);
        LocalDateTime sentTime = LocalDateTime.now();
        LocalDateTime lastActionTime = sentTime;
        long sleeptill = 0;
        ZoneOffset offset = ZoneOffset.ofHours(9);
        int retryNumber = 0;
        int encoding = 2;
        int ttl = 86400 * 4 + ThreadLocalRandom.current().nextInt(-300, 300);
        String folder = "sent";
        a = insert(msgid, toAddress, fromAddress, subject, message, status, toripe, ackdata,
                sentTime.toInstant(offset).getEpochSecond(), lastActionTime.toInstant(offset).getEpochSecond(),
                sleeptill, retryNumber,
                encoding, ttl, folder);
        return a;
    }

    public long insert(byte[] msgid, String toAddress, String fromAddress, String subject, String message,
            String status,
            byte[] toripe, byte[] ackdata, long sentTime, long lastActionTime, long sleeptill, int retryNumber,
            int encoding, int ttl, String folder) throws SQLException {
        // toAddress.equals("[Broadcast subscribers]") ? fromaddress: toaddress;
        var ad = decodeAddress(fromAddress);
        if (ad == null) {
            return -1;
        }
        if (ackdata == null)
            ackdata = genAckPayload(ad.streamNumber(), 2);
        dataSource.setUrl("jdbc:sqlite:C:\\Users\\terut\\AppData\\Roaming\\PyBitmessage\\messages.dat");
        try (var connection = (JDBC4Connection) dataSource.getConnection()) {
            try (var s = connection.prepareStatement("insert into sent values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?);")) {
                s.setBytes(1, msgid);
                s.setString(2, toAddress);
                s.setBytes(3, toripe);
                s.setString(4, fromAddress);
                s.setString(5, subject);
                s.setString(6, message);
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

    private long name() throws SQLException {
        long count = 0;
        var today = LocalDateTime.now();
        var offset = ZoneOffset.ofHours(9);
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
