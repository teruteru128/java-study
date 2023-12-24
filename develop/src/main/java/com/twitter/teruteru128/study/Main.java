package com.twitter.teruteru128.study;

import java.math.BigInteger;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Arrays;
import java.util.TreeMap;

import org.openapitools.jackson.nullable.JsonNullableModule;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Main
 */
public class Main {

    private static final BigInteger F;

    static {
        byte[] array = new byte[157827];
        array[0] = (byte) '3';
        Arrays.fill(array, 1, 157827, (byte) '7');
        F = new BigInteger(new String(array), 10);
    }

    static {
        try {
            Class.forName("com.twitter.teruteru128.study.BCProviderLoader");
        } catch (ClassNotFoundException e) {
            throw new InternalError(e);
        }
    }

    /**
     * 
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        if (args.length < 1) {
            System.exit(1);
        }
        // knownnodesのlastseedがどれくらい前なのか気になった
        var mapper = new ObjectMapper().setSerializationInclusion(JsonInclude.Include.NON_NULL)
                .registerModule(new JsonNullableModule());
        var nodes = mapper.readValue(Files.readString(Paths.get(args[0])), Node[].class);
        var id = ZoneId.systemDefault();
        System.out.printf("system default zone id: %s%n", id);
        var dateMap = new TreeMap<LocalDate, Long>();
        var ONE = Long.valueOf(1);
        for (var node : nodes) {
            var date = Instant.ofEpochSecond(node.getInfo().getLastseen()).atZone(id).toLocalDate();
            dateMap.put(date, dateMap.containsKey(date) ? Long.valueOf(dateMap.get(date) + 1) : ONE);
        }
        for (var entry : dateMap.entrySet()) {
            System.out.printf("%s, %d%n", entry.getKey(), entry.getValue());
        }
        System.out.println(BigInteger.valueOf(6).pow(100).bitLength());
    }
}
