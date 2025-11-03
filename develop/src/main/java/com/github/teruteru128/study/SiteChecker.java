package com.github.teruteru128.study;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UncheckedIOException;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.SocketException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.HashMap;
import java.util.StringJoiner;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import java.util.stream.IntStream;
import org.apache.commons.io.output.TeeOutputStream;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import picocli.CommandLine.Command;
import picocli.CommandLine.ExitCode;
import picocli.CommandLine.Parameters;

@Command(name = "sc")
public class SiteChecker implements Callable<Integer> {

  public static final Pattern PATTERN1 = Pattern.compile("<title>Tor板 v3 - (.*)</title>");
  public static final Pattern PATTERN2 = Pattern.compile(
      "http://jpchv3cnhonxxtzxiami4jojfnq3xvhccob5x3rchrmftrpbjjlh77qd.onion/tor/(\\d+)/l50");
  public static final Proxy PROXY = new Proxy(Proxy.Type.SOCKS,
      new InetSocketAddress("localhost", 9050));
  private static final Logger log = LoggerFactory.getLogger(SiteChecker.class);

  @Command(name = "check-tor")
  static void siteCheck(String url) throws IOException, URISyntaxException {
    try (var service = new ScheduledThreadPoolExecutor(1)) {
      var target = new URI(url).toURL();
      final var block = new Object();
      var future = service.scheduleWithFixedDelay(() -> {
        try {
          HttpURLConnection connection = (HttpURLConnection) target.openConnection(PROXY);
          connection.connect();
          var responseCode = connection.getResponseCode();
          log.trace("responce code: {}", responseCode);
          connection.disconnect();
          log.info("connected!");
          synchronized (block) {
            block.notify();
          }
        } catch (SocketException e) {
          log.error("socket exception");
        } catch (IOException e) {
          log.error("io exception");
        }
      }, 0, 1, TimeUnit.DAYS);
      synchronized (block) {
        block.wait();
      }
      future.cancel(false);
    } catch (InterruptedException e) {
      Thread.currentThread().interrupt();
    }
  }

  @Command(name = "search-tor")
  static void searchTor(@Parameters(defaultValue = "1") int min,
      @Parameters(defaultValue = "30000") int max) throws IOException {
    // TODO スレッド名をDBかなにかにまとめる
    log.info("min: {}, max: {}", min, max);
    try (var tee = new TeeOutputStream(System.out, new BufferedOutputStream(
        Files.newOutputStream(Path.of("subjects.txt"), StandardOpenOption.CREATE,
            StandardOpenOption.WRITE, StandardOpenOption.APPEND), 16384))) {
      final var lineSeparator = System.lineSeparator();
      // 4299
      IntStream.range(min, max).mapToObj(i -> {
        try {
          return (HttpURLConnection) new URI(
              "http://jpchv3cnhonxxtzxiami4jojfnq3xvhccob5x3rchrmftrpbjjlh77qd.onion/tor/%d/l50".formatted(
                  i)).toURL().openConnection(PROXY);
        } catch (URISyntaxException e) {
          throw new RuntimeException(e);
        } catch (IOException e) {
          throw new UncheckedIOException(e);
        }
      }).filter(connection -> {
        try {
          var responseCode = connection.getResponseCode();
          var b = responseCode == HttpURLConnection.HTTP_OK;
          if (!b) {
            log.error("{}: {}", connection.getURL().toString(), responseCode);
            try {
              Thread.sleep(3000);
            } catch (InterruptedException e) {
              Thread.currentThread().interrupt();
            }
          }
          return b;
        } catch (IOException e) {
          throw new UncheckedIOException(e);
        }
      }).map(c -> {
        var map = new HashMap<String, String>();
        try (var in = new BufferedReader(
            new InputStreamReader(c.getInputStream(), StandardCharsets.UTF_8))) {
          var string = in.lines()
              .collect(() -> new StringJoiner(System.lineSeparator()), StringJoiner::add,
                  StringJoiner::merge).toString();
          map.put("body", string);
          map.put("url", c.getURL().toString());
          return map;
        } catch (IOException e) {
          throw new UncheckedIOException(e);
        }
      }).forEach(b -> {
        var matcher2 = PATTERN1.matcher(b.get("body"));
        var matcher3 = PATTERN2.matcher(b.get("url"));
        if (matcher2.find() && matcher3.matches()) {
          var line = (matcher3.group(1) + "<>" + matcher2.group(1) + lineSeparator).getBytes(
              StandardCharsets.UTF_8);
          try {
            tee.write(line);
            tee.flush();
          } catch (IOException e) {
            throw new UncheckedIOException(e);
          }
          try {
            Thread.sleep(5000);
          } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
          }
        }
      });
    }
  }

  @Override
  public Integer call() throws Exception {
    return ExitCode.USAGE;
  }
}
