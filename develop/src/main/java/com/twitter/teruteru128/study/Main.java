package com.twitter.teruteru128.study;

import java.io.File;
import java.util.HexFormat;
import java.util.regex.Pattern;

import org.openapitools.jackson.nullable.JsonNullableModule;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Main
 */
public class Main {

    public static final HexFormat format = HexFormat.of();

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
        var pattern = Pattern.compile("^[0-9a-z]{16}\\.onion$");
        var nodes = new ObjectMapper().setSerializationInclusion(JsonInclude.Include.NON_NULL)
                .registerModule(new JsonNullableModule()).readerFor(Node[].class)
                .<Node[]>readValue(new File("C:\\Users\\terut\\AppData\\Roaming\\PyBitmessage\\knownnodes.dat"));
        for (Node node : nodes) {
            var peer = node.getPeer();
            var matcher = pattern.matcher(peer.getHostString());
            if (matcher.matches()) {
                System.out.printf("%s, %s, %s%n", peer, peer.getHostName(), peer.getHostString());
            }
        }
    }
}
