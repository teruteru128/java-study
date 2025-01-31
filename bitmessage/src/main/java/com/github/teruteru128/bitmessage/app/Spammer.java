package com.github.teruteru128.bitmessage.app;

import static java.net.http.HttpRequest.BodyPublishers.ofString;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.teruteru128.bitmessage.Structs;
import com.github.teruteru128.encode.Base58;
import java.io.IOException;
import java.io.Serializable;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.ByteBuffer;
import java.security.SecureRandom;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.time.Duration;
import java.time.Instant;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.StringJoiner;
import java.util.UUID;
import java.util.random.RandomGenerator;

public class Spammer {

  // ENDPOINT
  public static final HttpRequest.Builder requestBuilder = HttpRequest.newBuilder(URI.create(
          Objects.requireNonNull(System.getenv("BM_API_SERVER_URL"), "BM API URL NOT FOUND")))
      .header("Content-Type", "application/json-rpc")
      .header("Authorization", "Basic " + System.getenv("BM_TOKEN"));
  public static final ObjectMapper OBJECT_MAPPER = new ObjectMapper();
  private static final SecureRandom RANDOM = (SecureRandom) RandomGenerator.of("SecureRandom");


  public Spammer() {
  }

  public static List<Address> getFakeAddresses()
      throws IOException, InterruptedException {
    var req = "{\"jsonrpc\": \"2.0\",\"method\":\"listAddressBookEntries\",\"id\":1}";
    try (var client = HttpClient.newHttpClient(); var in = client.send(
            requestBuilder.POST(ofString(req)).build(), HttpResponse.BodyHandlers.ofInputStream())
        .body()) {
      return Arrays.asList(
          OBJECT_MAPPER.treeToValue(OBJECT_MAPPER.readTree(in).get("result").get("addresses"), Address[].class));
    }
  }

  public static void unitSpam(List<String> addresses, int unitSize, Duration d, int offset)
      throws IOException, InterruptedException {
    int length = addresses.size();
    var builder = new StringBuilder(
        "{\"jsonrpc\":\"2.0\",\"method\":\"sendMessage\",\"params\":[\"");
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
        System.out.println(client.send(requestBuilder.POST(ofString(joiner.toString())).build(),
            HttpResponse.BodyHandlers.ofString()).body());
        Thread.sleep(d);
      }
    }
  }

  public static void unitSpam2(List<String> addresses, int unitSize, int offset)
      throws SQLException {
    int length = addresses.size();
    System.err.printf("addresses size: %d%n", length);
    var sqlitePath = System.getenv("SQLITE_PATH");
    if (sqlitePath == null || sqlitePath.isEmpty()) {
      System.err.println("sql path not found!");
      return;
    }
    try (var connection = DriverManager.getConnection("jdbc:sqlite:" + sqlitePath)) {
      var ps = connection.prepareStatement(
          "INSERT INTO sent VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?);");
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
          UUID uuid = UUID.randomUUID();
          ps.setBytes(1, ByteBuffer.allocate(16).putLong(uuid.getMostSignificantBits())
              .putLong(uuid.getLeastSignificantBits()).array());
          // address
          ps.setString(2, address);
          // ripe
          if (!address.startsWith("BM-")) {
            throw new IllegalArgumentException("invalid prefix");
          }
          var encoded = Base58.decode(address.substring(3));
          var shortedRipe = Arrays.copyOfRange(encoded, 2, encoded.length - 4);
          var ripe1 = new byte[20];
          System.arraycopy(shortedRipe, 0, ripe1, 20 - shortedRipe.length, shortedRipe.length);
          ps.setBytes(3, ripe1);
          // ack data
          byte[] ackData = new byte[64];
          int ackType = 2;
          int version = 1;
          var ackTypePacket = ByteBuffer.allocate(4).putInt(ackType).flip();
          var versionPacket = Structs.encodeVarint(version);
          var streamNumberPacket = Structs.encodeVarint(1);
          ps.setBytes(7, ByteBuffer.allocate(
                  ackTypePacket.limit() + versionPacket.length + streamNumberPacket.length
                  + ackData.length).put(ackTypePacket).put(versionPacket).put(streamNumberPacket)
              .put(ackData).array());
          // sent time & last action time
          var epochSecond = Instant.now().getEpochSecond();
          ps.setLong(8, epochSecond);
          ps.setLong(9, epochSecond);
          ps.addBatch();
        }
        System.err.printf("%s, %s%n", list.getFirst(), list.getLast());
        System.out.println(
            "Arrays.stream(ps.executeBatch()).sum() = " + Arrays.stream(ps.executeBatch()).sum());
      }
    }
  }

  public record Address(String label, String address) implements Serializable {

  }

}
