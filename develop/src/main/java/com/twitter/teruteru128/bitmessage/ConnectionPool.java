package com.twitter.teruteru128.bitmessage;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public class ConnectionPool {
    private ConnectionPool() {
    }

    private static final ConnectionPool INSTANCE = new ConnectionPool();

    public static ConnectionPool getInstance() {
        return INSTANCE;
    }

    private ConcurrentHashMap<Object, Object> outboundConnections = new ConcurrentHashMap<>();
    private ConcurrentHashMap<Object, Object> inboundConnections = new ConcurrentHashMap<>();
    private ConcurrentHashMap<Object, Object> listeningSockets = new ConcurrentHashMap<>();
    private ConcurrentHashMap<Object, Object> udpSockets = new ConcurrentHashMap<>();
    private CopyOnWriteArrayList<Integer> streams = new CopyOnWriteArrayList<>();
    private int _lastSpawned = 0;
    private int _spawnWait = 2;
    private boolean _bootstrapped = false;

    public ConcurrentHashMap<Object, Object> getOutboundConnections() {
        return outboundConnections;
    }

    public ConcurrentHashMap<Object, Object> getInboundConnections() {
        return inboundConnections;
    }

    public ConcurrentHashMap<Object, Object> getListeningSockets() {
        return listeningSockets;
    }

    public ConcurrentHashMap<Object, Object> getUdpSockets() {
        return udpSockets;
    }

    public CopyOnWriteArrayList<Integer> getStreams() {
        return streams;
    }
}
