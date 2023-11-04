package com.twitter.teruteru128.sample;

import java.math.BigInteger;
import java.security.AlgorithmParameters;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.spec.ECGenParameterSpec;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPublicKeySpec;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.InvalidParameterSpecException;
import java.sql.SQLException;

import org.sqlite.SQLiteDataSource;

public class DBAndECSample {

    public void sample(String url)
            throws InvalidKeySpecException, InvalidParameterSpecException, NoSuchAlgorithmException,
            NoSuchProviderException, SQLException {
        var parameters = AlgorithmParameters.getInstance("EC", "SunEC");
        parameters.init(new ECGenParameterSpec("secp256k1"));
        var parameterSpec = parameters.getParameterSpec(ECParameterSpec.class);
        var dataSource = new SQLiteDataSource();
        dataSource.setUrl(url);
        var factory = KeyFactory.getInstance("EC", "SunEC");
        try (var connection = dataSource.getConnection()) {
            var s = connection.createStatement();
            try (var set = s.executeQuery(
                    "select address, transmitdata from pubkeys where addressversion in (3, 4) limit 100;")) {
                while (set.next()) {
                    var address = set.getString("address");
                    var data = set.getBytes("transmitdata");
                    var key1 = factory.generatePublic(
                            new ECPublicKeySpec(new ECPoint(new BigInteger(1, data, 6, 32),
                                    new BigInteger(1, data, 38, 32)), parameterSpec));
                    var key2 = factory.generatePublic(
                            new ECPublicKeySpec(new ECPoint(new BigInteger(1, data, 70, 32),
                                    new BigInteger(1, data, 102, 32)), parameterSpec));
                    System.out.printf("%s: %s, %s%n", address, key1, key2);
                }
            }
        }
    }
}
