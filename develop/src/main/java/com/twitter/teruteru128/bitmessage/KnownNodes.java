package com.twitter.teruteru128.bitmessage;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

public class KnownNodes {
    private KnownNodes() {
    }

    private static final Peer[] DEFAULT_NODES = {
            new Peer("5.45.99.75", 8444),
            new Peer("75.167.159.54", 8444),
            new Peer("95.165.168.168", 8444),
            new Peer("85.180.139.241", 8444),
            new Peer("158.222.217.190", 8080),
            new Peer("178.62.12.187", 8448),
            new Peer("24.188.198.204", 8111),
            new Peer("109.147.204.113", 1195),
            new Peer("178.11.46.221", 8444)
    };

    private static final ConcurrentHashMap<Integer, HashMap<Peer, PeerInfo>> knownNodes;

    static {
        var map = new ConcurrentHashMap<Integer, HashMap<Peer, PeerInfo>>();
        for (int i = 1; i < 4; i++) {
            map.put(Integer.valueOf(i), new HashMap<>());
        }
        knownNodes = map;
    }

    public static boolean addKnownNode(int stream, Peer peer, long lastseen, boolean isSelf) {

        float rating = 0;
        var info = knownNodes.get(stream).get(peer);
        if (info != null && lastseen > info.lastseen()) {
            knownNodes.get(stream).put(peer, new PeerInfo(lastseen, info.rating(), info.self()));
        }
        if (!isSelf) {
            // maxnodes check
        }

        knownNodes.get(stream).put(peer, new PeerInfo(lastseen, isSelf ? 1 : rating, isSelf));
        return true;
    }

    public static boolean addKnownNode(int stream, Peer peer, long lastseen) {
        return addKnownNode(stream, peer, lastseen, false);
    }

    public static boolean addKnownNode(int stream, Peer peer) {
        return addKnownNode(stream, peer, System.currentTimeMillis() / 1000);
    }

    public static void saveKnownNodes(Path dir) {
        if (dir == null) {
            // dir = state.appdata
        }
        try (var bw = Files.newBufferedWriter(dir.resolve(dir.getFileSystem().getPath("knownnodes.dat")))) {
        } catch (IOException e) {
        }
    }

    public static void saveKnownNodes() {
        saveKnownNodes(null);
    }

    public static void createDefaultKnownNodes() {
        long past = (System.currentTimeMillis() / 1000) - 2418600;
        for (Peer peer : DEFAULT_NODES) {
            addKnownNode(1, peer, past);
        }
        saveKnownNodes();
    }

    public static void readKnownNodes() {

    }

    public static void increaseRating(Peer peer) {

    }

    public static void decreaseRating(Peer peer) {

    }

    public static void trimKnownNodes(int recAddrStream) {

    }

    public static void trimKnownNodes() {
        trimKnownNodes(1);
    }

    public static void dns() {
        for (int port : new int[] { 8080, 8444 }) {
            addKnownNode(1, new Peer(String.format("bootstrap%d.bitmessage.org", port), port));
        }
    }

    private static boolean knownNodesActual = false;

    public static void cleanupKnownNodes() {
        long now = System.currentTimeMillis() / 1000;
        boolean needToWriteKnownNodesToDisk = false;

        // lock
        for (var entry : knownNodes.entrySet()) {
            if (entry.getValue().size() <= 1) {
                if (entry.getKey() == 1) {
                    knownNodesActual = false;
                }
                break;
            }
            for (var iterator = entry.getValue().entrySet().iterator(); iterator.hasNext();) {
                var peer = iterator.next();
                long age = now - peer.getValue().lastseen();
                if (age > 2419200) {
                    needToWriteKnownNodesToDisk = true;
                    iterator.remove();
                    continue;
                }
                if (age > 10800 && peer.getValue().rating() < -0.5) {
                    needToWriteKnownNodesToDisk = true;
                    iterator.remove();
                    continue;
                }
            }
        }
        if (needToWriteKnownNodesToDisk) {
            saveKnownNodes();
        }
    }
}
