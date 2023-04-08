package com.twitter.teruteru128.study;

import java.sql.SQLException;
import java.time.Instant;
import java.time.OffsetDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import org.sqlite.SQLiteDataSource;

public class SleeptillQueryGenerator {
    public List<String> generate(String url) throws SQLException {
        var dataSource = new SQLiteDataSource();
        dataSource.setUrl(url);
        TreeMap<Instant, Integer> map = new TreeMap<>();
        try (var connection = dataSource.getConnection();
                var s = connection.createStatement();
                var r = s.executeQuery(
                        "select senttime from sent where folder = 'trash' and status = 'msgqueued' and retrynumber = 0")) {
            while (r.next()) {
                var time = Instant.ofEpochSecond(r.getLong("senttime"));
                time = time.truncatedTo(DetailedChronoUnit.FIVE_MINUTES);
                if (map.containsKey(time)) {
                    int count = map.get(time);
                    map.put(time, count + 1);
                } else {
                    map.put(time, 1);
                }
            }
        }
        Instant targetSleeptill = OffsetDateTime.now().plus(4, ChronoUnit.DAYS).truncatedTo(ChronoUnit.DAYS)
                .toInstant();
        Instant start = null;
        Instant finish = null;
        List<String> list = new ArrayList<>(map.size() * 2);
        for (Map.Entry<Instant, Integer> entry : map.entrySet()) {
            list.add(String.format("-- [%s]: %d%n", entry.getKey(), entry.getValue()));
            start = entry.getKey();
            finish = start.plusSeconds(300);
            list.add(String.format(
                    "update sent set status = 'msgqueued', folder = 'sent' where folder = 'trash' and status = 'msgqueued' and retrynumber = 0 and %d <= senttime and senttime < %d;%n",
                    start.getEpochSecond(), finish.getEpochSecond()));
            targetSleeptill = targetSleeptill.plusSeconds(86400);
        }
        return list;
    }
}
