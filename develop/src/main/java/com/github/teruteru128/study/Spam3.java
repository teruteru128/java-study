package com.github.teruteru128.study;

import static java.net.http.HttpRequest.BodyPublishers.ofString;

import com.github.teruteru128.bitmessage.app.Spammer;
import java.io.IOException;
import java.net.http.HttpClient;
import java.net.http.HttpResponse;
import java.sql.SQLException;
import java.time.Instant;
import java.util.LinkedList;
import java.util.StringJoiner;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.sqlite.SQLiteDataSource;
import picocli.CommandLine.Command;
import picocli.CommandLine.ExitCode;
import picocli.CommandLine.Option;

@Command(name = "pk3", description = {"environment variables: $DB_URL, $BM_API_SERVER_URL"})
public class Spam3 implements Callable<Integer> {

  private static final Logger logger = LoggerFactory.getLogger(Spam3.class);
  private final String databaseUrl = System.getenv("DB_URL");

  @Option(names = "--ttl", defaultValue = "345600")
  private int ttl;

  @Option(names = "--minutes", defaultValue = "5")
  private int minutes;

  public Integer call() throws InterruptedException {
    var lockObject = new Object();
    var dataSource = new SQLiteDataSource();
    if (databaseUrl == null || databaseUrl.isEmpty()) {
      System.err.println("$DB_URL NOT FOUND");
      return ExitCode.SOFTWARE;
    }
    dataSource.setUrl(databaseUrl);
    try (var sch = new ScheduledThreadPoolExecutor(1)) {
      var task = sch.scheduleAtFixedRate(() -> {
        try (var connection = dataSource.getConnection()) {
          long taskNum = 0;
          try (var statement = connection.createStatement(); var set = statement.executeQuery(
              "select count(toaddress) A from task;")) {
            if (set.next()) {
              taskNum = set.getLong("A");
            }
          }
          if (taskNum == 0) {
            logger.trace("すべてのタスクが完了しています");
            synchronized (lockObject) {
              lockObject.notify();
            }
            return;
          }
          // DBからアドレスを読み込む
          var list = new LinkedList<String>();
          try (var prep = connection.prepareStatement(
              "select toaddress from task where senttime < ?;")) {
            prep.setLong(1, Instant.now().getEpochSecond());
            try (var set = prep.executeQuery()) {
              while (set.next()) {
                list.add(set.getString("toaddress"));
              }
            }
          }
          if (list.isEmpty()) {
            logger.trace("送信すべきアドレスが見つかりませんでした");
            return;
          }
          // 送信する
          var joiner = new StringJoiner(",", "[", "]");
          var builder = new StringBuilder();
          var counter = 1L;
          for (var address : list) {
            builder.append("{\"jsonrpc\":\"2.0\",\"method\":\"sendMessage\",\"params\":[\"")
                .append(address).append("\",\"BM-2cW67GEKkHGonXKZLCzouLLxnLym3azS8r\",\"\",\"\",2,")
                .append(ttl).append("],\"id\":").append(counter++).append("}");
            joiner.add(builder);
            builder.setLength(0);
          }
          try (var client = HttpClient.newHttpClient()) {
            client.send(Spammer.requestBuilder.POST(ofString(joiner.toString())).build(),
                HttpResponse.BodyHandlers.ofString());
          }
          // DBから削除する
          try (var prep = connection.prepareStatement("delete from task where toaddress = ?;")) {
            for (var address : list) {
              prep.setString(1, address);
              prep.addBatch();
            }
            prep.executeBatch();
          }
          logger.info("{}件送信しました", list.size());
        } catch (SQLException | IOException e) {
          logger.error("exception in task", e);
          synchronized (lockObject) {
            lockObject.notify();
          }
        } catch (InterruptedException e) {
          Thread.currentThread().interrupt();
          logger.error("interrupted exception in task", e);
          synchronized (lockObject) {
            lockObject.notify();
          }
        }
      }, 0, minutes, TimeUnit.MINUTES);
      logger.info("launched");
      synchronized (lockObject) {
        lockObject.wait();
      }
      task.cancel(false);
    }
    return ExitCode.OK;
  }
}
