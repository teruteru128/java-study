package com.twitter.teruteru128.bitmessage.app;

import com.twitter.teruteru128.bitmessage.Structs;
import com.twitter.teruteru128.bitmessage.spec.AddressFactory;
import com.twitter.teruteru128.encode.Base58;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.security.SecureRandom;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.time.Duration;
import java.time.Instant;
import java.util.*;
import java.util.random.RandomGenerator;

import static java.net.http.HttpRequest.BodyPublishers.ofString;

public class Spammer {

    public static final HttpRequest.Builder requestBuilder;
    private static final SecureRandom RANDOM = (SecureRandom) RandomGenerator.of("SecureRandom");

    static {
        var bmApiServerUrl = System.getenv("BM_API_SERVER_URL");
        var bmApiServerUrl2 = URI.create((bmApiServerUrl == null || bmApiServerUrl.isEmpty()) ? "http://localhost:8442/" : bmApiServerUrl);
        requestBuilder = HttpRequest.newBuilder(bmApiServerUrl2);
        requestBuilder.header("Content-Type", "application/json-rpc");
        requestBuilder.header("Authorization", "Basic " + System.getenv("BM_TOKEN"));
    }


    public Spammer() {
    }

    public static byte[] generateMessage(int length) {
        // FIXME Should I use RandomGenerator.getDefault() ?
        return Spammer.generateMessage(length, RANDOM);
    }

    public static byte[] generateMessage(int length, RandomGenerator random) {
        // capacity = (length * 6) / 5;
        int capacity = length + (length / 5);
        byte[] msg = new byte[capacity];
        for (int i = 0; i < capacity; i++) {
            if ((i % 60) == 59) {
                msg[i] = '\n';
            } else if ((i % 6) == 5) {
                msg[i] = ' ';
            } else {
                msg[i] = (byte) random.nextInt('0', 0x3a);
            }
        }
        // trim
        while ((0 < capacity) && (msg[capacity - 1] & 0xff) <= ' ') {
            capacity--;
        }
        return Arrays.copyOf(msg, capacity);
    }

    /**
     * @param random Random number generator for forging hashes(ハッシュを捏造するための乱数生成源)
     * @param num    捏造する件数
     * @throws IOException          入出力エラーが発生した場合
     * @throws InterruptedException 待機中に割込みが発生した場合
     */
    public static void getPubKeySpam(SecureRandom random, int num) throws IOException, InterruptedException {
        var hashes = new byte[19 * num];
        random.nextBytes(hashes);
        var builder = new StringBuilder(114514);
        builder.append('[');
        var encoder = Base64.getEncoder();
        for (int i = 0; i < num; i++) {
            if (i != 0) {
                builder.append(',');
            }
            var addressBody = AddressFactory.encodeAddress(4, 1, hashes, i * 19, 19);
            builder.append("{\"jsonrpc\":\"2.0\",\"method\":\"addAddressBookEntry\",\"params\":[\"BM-");
            builder.append(addressBody);
            builder.append("\",\"");
            var label = "fake-" + addressBody.substring(0, 6);
            var encodedLabel = encoder.encodeToString(label.getBytes(StandardCharsets.UTF_8));
            builder.append(encodedLabel);
            builder.append("\"],\"id\":");
            builder.append(i + 1);
            builder.append('}');
        }
        builder.append(']');
        try (var client = HttpClient.newHttpClient()) {
            var response = client.send(requestBuilder.POST(ofString(builder.toString())).build(), HttpResponse.BodyHandlers.ofString());
            var statusCode = response.statusCode();
            if (statusCode != 200) {
                System.err.printf("status code: %d%n", statusCode);
                return;
            }
            var body = response.body();
            System.out.println(body);
        }
    }

    public static void unitSpam(List<String> addresses, int unitSize, Duration d, int offset) throws IOException, InterruptedException {
        int length = addresses.size();
        var builder = new StringBuilder("{\"jsonrpc\":\"2.0\",\"method\":\"sendMessage\",\"params\":[\"");
        var prefixLength = builder.length();
        int k = offset;
        try (var client = HttpClient.newHttpClient()) {
            for (int i = offset; i < length; i += unitSize) {
                var joiner = new StringJoiner(",", "[", "]");
                var list = addresses.subList(i, Math.min(length, i + unitSize));
                for (var address : list) {
                    builder.append(address);
                    builder.append("\",\"BM-2cVPhC8Bdrx2ZemLw98oGUsgjDAfwsigyc\",\"\",\"\",2,3600],\"id\":");
                    builder.append(k++);
                    builder.append("}");
                    joiner.add(builder.toString());
                    builder.setLength(prefixLength);
                }
                var r = client.send(requestBuilder.POST(ofString(joiner.toString())).build(), HttpResponse.BodyHandlers.ofString());
                System.out.println(r.body());
                Thread.sleep(d);
            }
        }
    }

    public static void unitSpam2(List<String> addresses, int unitSize, int offset) throws SQLException {
        int length = addresses.size();
        System.err.printf("addresses size: %d%n", length);
        var sqlitePath = System.getenv("SQLITE_PATH");
        if (sqlitePath == null || sqlitePath.isEmpty()) {
            System.err.println("sql path not found!");
            return;
        }
        try (var connection = DriverManager.getConnection("jdbc:sqlite:" + sqlitePath)) {
            var ps = connection.prepareStatement("INSERT INTO sent VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?);");
            // from address
            ps.setString(4, "BM-2cVPhC8Bdrx2ZemLw98oGUsgjDAfwsigyc");
            // subject
            ps.setString(5, "");
            // message
            ps.setString(6, "");
            // sleep till
            ps.setLong(10, 0);
            // status
            ps.setString(11, "msgqueued");
            // retry number
            ps.setInt(12, 0);
            // folder
            ps.setString(13, "trash");
            // encoding type
            ps.setInt(14, 2);
            // ttl
            ps.setInt(15, 3600);
            for (int i = offset; i < length; i += unitSize) {
                var list = addresses.subList(i, Math.min(length, i + unitSize));
                for (var address : list) {
                    // msg id
                    ps.setBytes(1, uuidToBytes(UUID.randomUUID()));
                    // address
                    ps.setString(2, address);
                    // ripe
                    var ripe = addressToRipe(address);
                    ps.setBytes(3, ripe);
                    // ack data
                    ps.setBytes(7, genAckPayload(1, 1));
                    // sent time & last action time
                    var epochSecond = Instant.now().getEpochSecond();
                    ps.setLong(8, epochSecond);
                    ps.setLong(9, epochSecond);
                    ps.addBatch();
                }
                System.err.printf("%s, %s%n", list.getFirst(), list.getLast());
                System.out.println("Arrays.stream(ps.executeBatch()).sum() = " + Arrays.stream(ps.executeBatch()).sum());
            }
        }
    }

    private static byte[] genAckPayload(int streamNumber, int stealthLevel) {
        int ackType;
        int version;
        byte[] ackData;
        switch (stealthLevel) {
            case 2 -> {
                ackData = new byte[64];
                ackType = 2;
                version = 1;
            }
            case 1 -> {
                ackData = new byte[32];
                RANDOM.nextBytes(ackData);
                ackType = 0;
                version = 4;
            }
            default -> {
                ackData = new byte[32];
                RANDOM.nextBytes(ackData);
                ackType = 2;
                version = 1;
            }
        }
        var ackTypePacket = ByteBuffer.allocate(4).putInt(ackType).flip();
        var versionPacket = Structs.encodeVarint(version);
        var streamNumberPacket = Structs.encodeVarint(streamNumber);
        return ByteBuffer.allocate(ackTypePacket.limit() + versionPacket.length + streamNumberPacket.length + ackData.length).put(ackTypePacket).put(versionPacket).put(streamNumberPacket).put(ackData).array();
    }

    private static byte[] addressToRipe(String address) {
        if (!address.startsWith("BM-")) {
            throw new IllegalArgumentException("");
        }
        var encoded = Base58.decode(address.substring(3));
        var shortedRipe = Arrays.copyOfRange(encoded, 2, encoded.length - 4);
        var ripe = new byte[20];
        System.arraycopy(shortedRipe, 0, ripe, 20 - shortedRipe.length, shortedRipe.length);
        return ripe;
    }

    private static byte[] uuidToBytes(UUID uuid) {
        return ByteBuffer.allocate(16).putLong(uuid.getMostSignificantBits()).putLong(uuid.getLeastSignificantBits()).array();
    }
}
