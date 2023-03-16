package com.twitter.teruteru128.bitmessage;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Random;
import java.util.UUID;
import java.util.concurrent.ThreadLocalRandom;
import java.util.random.RandomGenerator;

import org.sqlite.SQLiteDataSource;
import org.sqlite.jdbc4.JDBC4Connection;
import org.sqlite.jdbc4.JDBC4PreparedStatement;
import org.sqlite.jdbc4.JDBC4ResultSet;
import org.sqlite.jdbc4.JDBC4Statement;

import com.twitter.teruteru128.bitmessage.app.Spammer;
import com.twitter.teruteru128.study.Main;

public class ScheduledPostTask implements Runnable {

    public ScheduledPostTask() {
        super();
        try {
            loadAddressList();
        } catch (IOException | SQLException e) {
            throw new RuntimeException(e);
        }
        init();
    }

    private SQLiteDataSource dataSource = new SQLiteDataSource();
    private JDBC4Connection connection;
    private JDBC4PreparedStatement preparedStatement;

    private LinkedList<String> addressList = null;

    private void loadAddressList() throws IOException, SQLException {
        var dataSource = new SQLiteDataSource();
        dataSource.setUrl("jdbc:sqlite:D:\\address.db");
        Path dbfile = Paths.get("out.txt");
        if (!Files.exists(dbfile)) {
            {
                LinkedList<String> lista = new LinkedList<>();
                for (String line : Files.readAllLines(Paths.get("out.txt"))) {
                    lista.add(line.trim());
                }
                ArrayList<String> listb = new ArrayList<>(lista);
                System.out.printf("address list size: %d%n", listb.size());
                lista = null;
                Collections.sort(listb);
                addressList = new LinkedList<>(listb);
                listb = null;
            }
            try (var c = dataSource.getConnection()) {
                int count = 0;
                int p = 0;
                try (var s = c.createStatement()) {
                    s.execute("create table address(address text, count integer default 0, primary key(address))");
                }
                try (var ps = c.prepareStatement("insert into address(address) values (?)")) {
                    for (String address : addressList) {
                        ps.setString(1, address);
                        ps.addBatch();
                        count++;
                        if(count >= 1000) {
                            ps.executeBatch();
                            System.err.printf("batch: %d%n", p);
                            count = 0;
                            p++;
                        }
                    }
                    if(count > 0) {
                        ps.executeBatch();
                        count = 0;
                    }
                }
            }
        } else {
            var random = (Random) RandomGenerator.of("SecureRandom");
            try (JDBC4Connection c = (JDBC4Connection)dataSource.getConnection()) {
                var insertedAddresses = new LinkedList<String>();
                try (JDBC4Statement s = (JDBC4Statement)c.createStatement()) {
                    try (JDBC4ResultSet r = (JDBC4ResultSet)s.executeQuery("select address from address;")) {
                        while (r.next()) {
                            insertedAddresses.add(r.getString("address"));
                        }
                    }
                }
                var work = new ArrayList<>(insertedAddresses);
                Collections.shuffle(work, random);
                addressList = new LinkedList<>(work);
            }
        }
    }

    private void init() {
        try {
            dataSource.setUrl("jdbc:sqlite:D:\\address.db");
            connection = (JDBC4Connection) dataSource.getConnection();
            preparedStatement = (JDBC4PreparedStatement) connection.prepareStatement("delete from address where address = ?;");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        var toAddress = addressList.poll();
        if (toAddress == null) {
            try {
                preparedStatement.close();
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            return;
        }
        var fromAddress = "BM-5oGHd345R1y5zaHCQFwLXQ36NzjT1XG";
        var subject = UUID.randomUUID().toString();
        var message = Main.generateMessage(ThreadLocalRandom.current().nextInt(4, 801));
        Spammer.send(toAddress, fromAddress, subject, message);
        try {
            preparedStatement.setString(1, toAddress);
            preparedStatement.execute();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
