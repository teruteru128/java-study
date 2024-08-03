package com.github.teruteru128.study;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Serializable;
import java.io.UncheckedIOException;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.SocketException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.StringJoiner;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import java.util.stream.IntStream;

public class SiteChecker {

  public static final Pattern PATTERN_1 = Pattern.compile(
      "<title>(.*(?:荒らし共栄圏|園田亮平).*)</title>");
  public static final Pattern PATTERN_2 = Pattern.compile("<title>Tor板 v3 - (.*)</title>");
  public static final Pattern PATTERN_3 = Pattern.compile(
      "http://jpchv3cnhonxxtzxiami4jojfnq3xvhccob5x3rchrmftrpbjjlh77qd.onion/tor/(\\d+)/l50");
  public static final Proxy PROXY = new Proxy(Proxy.Type.SOCKS,
      new InetSocketAddress("localhost", 9150));

  static void siteCheck(String url) throws IOException, URISyntaxException {
    try (var service = new ScheduledThreadPoolExecutor(1)) {
      var uri = new URI(url);
      var target = uri.toURL();
      final var block = new Object();
      service.scheduleWithFixedDelay(() -> {
        try {
          var connection = (HttpURLConnection) target.openConnection(PROXY);
          connection.connect();
          if (connection.getResponseCode() == HttpURLConnection.HTTP_OK) {
            connection.disconnect();
            System.out.println("found!");
            synchronized (block) {
              block.notify();
            }
          }
        } catch (SocketException e) {
          e.printStackTrace(System.err);
        } catch (IOException ignored) {
        }
      }, 0, 5, TimeUnit.MINUTES);
      synchronized (block) {
        block.wait();
      }
    } catch (InterruptedException e) {
      throw new RuntimeException(e);
    }
  }

  static void searchTor(int min, int max) throws IOException {
    // TODO スレッド名をDBかなにかにまとめる
    System.err.printf("min: %d, max: %d%n", min, max);
    try (var bos = new BufferedWriter(
        new OutputStreamWriter(new FileOutputStream("subjects-old.txt", true),
            StandardCharsets.UTF_8), 16384)) {
      // 4299
      IntStream.range(min, max).mapToObj(i -> {
        try {
          return (HttpURLConnection) new URI(
              "http://jpchv3cnhonxxtzxiami4jojfnq3xvhccob5x3rchrmftrpbjjlh77qd.onion/tor/%d/l50".formatted(
                  i)).toURL().openConnection(PROXY);
        } catch (URISyntaxException | IOException e) {
          throw new RuntimeException(e);
        }
      }).filter(connection -> {
        try {
          var responseCode = connection.getResponseCode();
          var b = responseCode == HttpURLConnection.HTTP_OK;
          if (!b) {
            System.err.printf("response code: %d%n", responseCode);
            try {
              Thread.sleep(3000);
            } catch (InterruptedException e) {
              throw new RuntimeException(e);
            }
          }
          return b;
        } catch (IOException e) {
          throw new UncheckedIOException(e);
        }
      }).map(c -> {
        var map = new HashMap<String, Serializable>();
        try (var in = new BufferedReader(
            new InputStreamReader(c.getInputStream(), StandardCharsets.UTF_8))) {
          var string = in.lines()
              .collect(() -> new StringJoiner(System.lineSeparator()), StringJoiner::add,
                  StringJoiner::merge).toString();
          map.put("body", string);
          map.put("url", c.getURL());
          return map;
        } catch (IOException e) {
          throw new UncheckedIOException(e);
        } finally {
          c.disconnect();
        }
      }).forEach(b -> {
        var matcher2 = PATTERN_2.matcher((String) b.get("body"));
        var matcher3 = PATTERN_3.matcher(b.get("url").toString());
        if (matcher2.find() && matcher3.matches()) {
          var line = matcher3.group(1) + "<>" + matcher2.group(1);
          try {
            bos.write(line);
            bos.newLine();
            bos.flush();
          } catch (IOException e) {
            throw new UncheckedIOException(e);
          }
          System.out.println(line);
          try {
            Thread.sleep(5000);
          } catch (InterruptedException e) {
            throw new RuntimeException(e);
          }
        }
      });
    }
  }
}
