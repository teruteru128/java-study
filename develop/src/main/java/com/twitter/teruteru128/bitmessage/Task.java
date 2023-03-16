package com.twitter.teruteru128.bitmessage;

import java.sql.PreparedStatement;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.temporal.ChronoUnit;
import java.util.HashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.ThreadLocalRandom;

import org.sqlite.SQLiteDataSource;
import org.sqlite.jdbc4.JDBC4Connection;
import org.sqlite.jdbc4.JDBC4PreparedStatement;
import org.sqlite.jdbc4.JDBC4Statement;

public class Task implements Callable<Long> {
    @Override
    public Long call() throws Exception {
        long count = 0;
        var today = LocalDateTime.now();
        var offset = ZoneOffset.ofHours(9);
        var dataSource = new SQLiteDataSource();
        dataSource.setUrl("jdbc:sqlite:C:\\Users\\terut\\AppData\\Roaming\\PyBitmessage\\messages.dat");
        long sumofdone = 0;
        try (var connection = (JDBC4Connection) dataSource.getConnection()) {
            var map = new HashMap<String, Integer>();
            try (var statement = (JDBC4Statement) connection.createStatement();
                    var set = statement.executeQuery(
                            "select toaddress from sent where folder = 'sent' and fromaddress = 'BM-NBJxKhQmidR2TBtD3H74yZhDHpzZ7TXM' and toaddress like 'BM-%' and date(sleeptill, 'unixepoch', 'localtime') < '2023-04-05' order by random();")) {
                var min = (int) today.plus(10, ChronoUnit.DAYS).truncatedTo(ChronoUnit.DAYS).toInstant(offset)
                        .getEpochSecond();
                var max = (int) today.plus(4, ChronoUnit.WEEKS).truncatedTo(ChronoUnit.DAYS).toInstant(offset)
                        .getEpochSecond();
                while (set.next()) {
                    map.put(set.getString("toaddress"), Integer.valueOf(ThreadLocalRandom.current().nextInt(min, max)));
                }
            }
            try (var statement1 = (JDBC4PreparedStatement) connection
                    .prepareStatement("update sent set sleeptill = ? where toaddress = ?;")) {
                for (var entry : map.entrySet()) {
                    statement1.setInt(1, entry.getValue());
                    statement1.setString(2, entry.getKey());
                    statement1.addBatch();
                    if (count >= 1000) {
                        var b = statement1.executeBatch();
                        for (int i : b) {
                            if (i != PreparedStatement.SUCCESS_NO_INFO && i != PreparedStatement.EXECUTE_FAILED) {
                                sumofdone += i;
                            }
                        }
                        count = 0;
                        statement1.clearBatch();
                    }
                }
                var b = statement1.executeBatch();
                for (int i : b) {
                    if (i != PreparedStatement.SUCCESS_NO_INFO && i != PreparedStatement.EXECUTE_FAILED) {
                        sumofdone += i;
                    }
                }
                statement1.clearBatch();
            }
        }
        return sumofdone;
    }
}
