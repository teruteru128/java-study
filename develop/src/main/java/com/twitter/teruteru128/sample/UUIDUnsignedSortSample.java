package com.twitter.teruteru128.sample;

import java.sql.SQLException;
import java.util.TreeSet;
import java.util.UUID;

import org.sqlite.SQLiteDataSource;

import com.twitter.teruteru128.util.UUIDUnsignedComparator;

public class UUIDUnsignedSortSample implements Sample {
    void sample(String url) throws SQLException {
        var set = new TreeSet<UUID>(new UUIDUnsignedComparator());
        var dataSource = new SQLiteDataSource();
        dataSource.setUrl(url);
        try (var connection = dataSource.getConnection();
                var s = connection.createStatement();
                var r = s.executeQuery("select most, least from temp")) {
            while (r.next()) {
                set.add(new UUID(r.getLong("most"), r.getLong("least")));
            }
        }
        long count = 0;
        for (UUID uuid : set) {
            System.out.printf("%s%n", uuid);
            if (++count >= 10) {
                break;
            }
        }
        count = 0;
        for (UUID uuid : set.descendingSet()) {
            System.out.printf("%s%n", uuid);
            if (++count >= 10) {
                break;
            }
        }
    }

    @Override
    public void sample() throws Exception {
        sample("");
    }
}
