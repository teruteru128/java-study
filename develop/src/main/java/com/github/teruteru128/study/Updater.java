package com.github.teruteru128.study;

import java.sql.SQLException;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import org.sqlite.SQLiteDataSource;

public class Updater implements Callable<Void> {

  private final String url;

  public Updater(String url) {
    this.url = url;
  }

  @Override
  public Void call() throws SQLException {
    var source = new SQLiteDataSource();
    source.setUrl(url);
    try (var con = source.getConnection()) {
      var messages = new ArrayList<Message>(460000);
      try (var statement = con.createStatement()) {
        try (var set = statement.executeQuery(
            "select toaddress, senttime from sent where folder is null;")) {
          while (set.next()) {
            messages.add(new Message(set.getString("toaddress"), set.getLong("senttime")));
          }
        }
      }
      try (var prep = con.prepareStatement(
          "update sent set folder = 'sent', sleeptill = ? where toaddress = ? and senttime = ?;")) {
        int i = 2191;
        var newSleepTillTime = LocalDateTime.of(2025, 7, 11, 0, 0, 0);
        var rules = ZoneId.of("Asia/Tokyo").getRules();
        long newSleepTill = newSleepTillTime.toInstant(rules.getOffset(newSleepTillTime))
            .getEpochSecond();
        prep.setLong(1, newSleepTill);
        for (var message : messages) {
          prep.setString(2, message.toaddress());
          prep.setLong(3, message.senttime());
          prep.addBatch();
          if ((i & 4095L) == 4095L) {
            newSleepTillTime = newSleepTillTime.plusDays(1);
            newSleepTill = newSleepTillTime.toInstant(rules.getOffset(newSleepTillTime))
                .getEpochSecond();
            prep.setLong(1, newSleepTill);
          }
          i++;
        }
        prep.executeBatch();
      }
    }
    return null;
  }
}
