package com.twitter.teruteru128.bitmessage;

import java.time.Instant;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.Callable;

import org.sqlite.SQLiteDataSource;

import com.twitter.teruteru128.time.DetailedChronoUnit;

public class Query implements Callable<Map<Instant, Integer>> {

    public Query(String url) {
        super();
    }

    private String url = "";

    @Override
    public Map<Instant, Integer> call() throws Exception {
        if (url == null || url.isEmpty()) {
            return Map.of();
        }
        var dataSource = new SQLiteDataSource();
        dataSource.setUrl(url);
        var map = new TreeMap<Instant, Integer>();
        long currentTime = Instant.now().getEpochSecond();
        try (var connection = dataSource.getConnection();
                var statement = connection.prepareStatement(
                        "SELECT sleeptill from sent where folder = 'sent' and fromaddress = ? and toaddress like 'BM-%' and sleeptill < ?");) {
            statement.setString(1, "BM-NBJxKhQmidR2TBtD3H74yZhDHpzZ7TXM");
            statement.setLong(2, currentTime);
            try (var set = statement.executeQuery()) {
                while (set.next()) {
                    var instant = Instant.ofEpochSecond(set.getLong("sleeptill"))
                            .truncatedTo(DetailedChronoUnit.FIVE_MINUTES);
                    if (map.containsKey(instant)) {
                        map.put(instant, Math.incrementExact(map.get(instant)));
                    } else {
                        map.put(instant, Integer.valueOf(1));
                    }
                }
            }
        }
        return map;
    }

}
