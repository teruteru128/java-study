package com.github.teruteru128.study;

import com.github.teruteru128.bitmessage.app.Spammer;
import java.io.IOException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.Duration;
import java.util.List;
import java.util.StringJoiner;
import java.util.concurrent.Callable;
import picocli.CommandLine.Command;
import picocli.CommandLine.Parameters;

@Command(name = "spam2")
public class Spam2 implements Callable<Void> {

  @Parameters
  private Path path;
  @Parameters
  private long skip = 0;

  @Override
  public Void call() throws IOException, InterruptedException {
    List<String> lines;
    try (var stream = Files.lines(path)) {
      // pathからreadalllineしてserverに投げる
      lines = stream.skip(skip).map(l -> l.split("\\|")[1]).toList();
    }
    var body = createBody();
    long i = 0;
    var du = Duration.ofHours(12);
    try (var client = HttpClient.newHttpClient()) {
      for (var line : lines) {
        body.add("{\"jsonrpc\":\"2.0\",\"method\":\"sendMessage\",\"params\":[\"" + line
                 + "\",\"BM-2cUFVh1JtEc8v7Gc1TwCPTLjrct4a7nU1Y\",\"\",\"\",2,2419200], \"id\":"
                 + (i++)
                 + "}");
        if ((i & 4095) == 0) {
          client.send(
              Spammer.requestBuilder.POST(HttpRequest.BodyPublishers.ofString(body.toString())).build(),
              HttpResponse.BodyHandlers.ofString());
          System.err.println(
              "id " + i + " ok(" + (skip + i) + " items completed, including skipped addresses).");
          body = createBody();
          Thread.sleep(du);
        }
      }
      System.err.println("lines finished");
      var res = client.send(
          Spammer.requestBuilder.POST(HttpRequest.BodyPublishers.ofString(body.toString())).build(),
          HttpResponse.BodyHandlers.ofString());
      System.err.println(res.body());
      System.err.println("done");
    }
    return null;
  }

  private static StringJoiner createBody() {
    return new StringJoiner(",", "[", "]");
  }
}
