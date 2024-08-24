package com.github.teruteru128.study;

import java.sql.SQLException;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.Callable;
import org.sqlite.SQLiteDataSource;

public class Spam implements Callable<Void> {

  private String url;

  public Spam(String url) {
    this.url = url;
  }

  @Override
  public Void call() throws SQLException {
    var source = new SQLiteDataSource();
    source.setUrl(url);
    try (var connect = source.getConnection()) {
      var toAddressList = new ArrayList<String>(1300000);
      try (var statement = connect.createStatement()) {
        try (var set = statement.executeQuery(
            "select toaddress from sent where folder = 'trash' and date(senttime, 'unixepoch', 'localtime') in ('2023-03-26', '2023-03-27') and subject = '';")) {
          while (set.next()) {
            toAddressList.add(set.getString("toaddress"));
          }
        }
      }
      try (var prep = connect.prepareStatement("update sent set sleeptill = ? where toaddress = ? and date(senttime, 'unixepoch', 'localtime') in ('2023-03-26', '2023-03-27');")) {
        long i = 0;
        var rules = ZoneId.of("Asia/Tokyo").getRules();
        var newSleepTillTime = LocalDateTime.of(2024, 9, 1, 0, 0, 0);
        long newSleepTill = newSleepTillTime.toInstant(rules.getOffset(newSleepTillTime)).getEpochSecond();
        prep.setInt(1, (int)newSleepTill);
        for (var toaddress : toAddressList) {
          prep.setString(2, toaddress);
          prep.addBatch();
          if((i & 4095L) == 4095L) {
            System.out.printf("execute: %d%n", Arrays.stream(prep.executeBatch()).sum());
            newSleepTillTime = newSleepTillTime.plusDays(1);
            newSleepTill = newSleepTillTime.toInstant(rules.getOffset(newSleepTillTime)).getEpochSecond();
            prep.setLong(1, newSleepTill);
          }
          i++;
        }
        System.out.printf("execute: %d%n", Arrays.stream(prep.executeBatch()).sum());
      }
    }
    return null;
  }
}
