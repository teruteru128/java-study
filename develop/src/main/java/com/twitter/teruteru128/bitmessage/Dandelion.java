package com.twitter.teruteru128.bitmessage;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.locks.ReentrantLock;

public class Dandelion {

    /**
     * randomise routes after 600 seconds
     */
    public static final int REASSIGN_INTERVAL = 600;
    /** trigger fluff due to expiration */
    public static final int FLUFF_TRIGGER_FIXED_DELAY = 10;
    public static final int FLUFF_TRIGGER_MEAN_DELAY = 30;

    private static final int MAX_STEMS = 2;

    /** currently assignable child stems */
    private ArrayList<Object> stem = new ArrayList<>();
    /** currently assigned parent <-> child mappings */
    private HashMap<Object, Object> nodeMap = new HashMap<>();
    /** currently existing objects in stem mode */
    private HashMap<InventoryVector, Stem> hashMap = new HashMap<>();
    /** when to rerandomise routes */
    private long refresh = Instant.now().getEpochSecond() + REASSIGN_INTERVAL;
    private ReentrantLock lock = new ReentrantLock();

    private Dandelion() {
    }

    private static final Dandelion INSTANCE = new Dandelion();

    public static Dandelion getInstance() {
        return INSTANCE;
    }

    public long getRefresh() {
        return refresh;
    }

    private static long poissonTimeout() {
        long start = Instant.now().getEpochSecond();
        long average = FLUFF_TRIGGER_MEAN_DELAY;
        return (long) (start - Math.log(ThreadLocalRandom.current().nextDouble()) * average
                + FLUFF_TRIGGER_FIXED_DELAY);
    }

    public void addHash(InventoryVector hashId, Object source, int stream) {
        lock.lock();
        try {
            hashMap.put(hashId, new Stem(source, stream, poissonTimeout()));
        } finally {
            lock.unlock();
        }
    }

    public void setHashStream(InventoryVector hashId, int stream) {
        lock.lock();
        try {
            if (hashMap.containsKey(hashId)) {
                hashMap.put(hashId, new Stem(hashMap.get(hashId).child(), stream, poissonTimeout()));
            }
        } finally {
            lock.unlock();
        }
    }

    public void removeHash(InventoryVector hashId) {
        removeHash(hashId, "no reason specified");
    }

    public void removeHash(InventoryVector hashId, String reason) {
        lock.lock();
        try {
            hashMap.remove(hashId);
        } finally {
            lock.unlock();
        }
    }

    public boolean hasHash(InventoryVector hashId) {
        return hashMap.containsKey(hashId);
    }

    public Object objectChildStem(InventoryVector hashId) {
        return hashMap.get(hashId).child();
    }

    public void maybeAddStem(Object connection) {
        lock.lock();
        try {
            if (stem.size() < MAX_STEMS) {
                stem.add(connection);
                for (Map.Entry<Object, Object> entry : nodeMap.entrySet()) {
                    if (entry.getValue() == null) {
                        nodeMap.put(entry.getKey(), connection);
                    }
                }
                for (Map.Entry<InventoryVector, Stem> entry : hashMap.entrySet()) {
                    if (entry.getValue().child() == null) {
                        hashMap.put(entry.getKey(), new Stem(connection, entry.getValue().stream(), poissonTimeout()));
                    }
                }
            }
        } finally {
            lock.unlock();
        }
    }

    public void maybeRemoveStem(Object connection) {
        lock.lock();
        try {
            if (stem.contains(connection)) {
                stem.remove(connection);
                for (var entry : nodeMap.entrySet()) {
                    if (entry.getValue() == connection) {
                        nodeMap.put(entry.getKey(), null);
                    }
                }
            }
        } finally {
            lock.unlock();
        }
    }

    public Object pickStem(Object parent) {
        var index = ThreadLocalRandom.current().nextInt(stem.size());
        try {
            if (stem.get(index).equals(parent)) {
                if (stem.size() == 1) {
                    return null;
                }
                return stem.get(1 - index);
            }
            return null;
        } catch (IndexOutOfBoundsException e) {
            return null;
        }
    }

    public Object getNodeStem(Object node) {
        lock.lock();
        try {
            if (nodeMap.containsKey(node)) {
                return nodeMap.get(node);
            } else {
                nodeMap.put(node, pickStem(node));
                return nodeMap.get(node);
            }
        } finally {
            lock.unlock();
        }
    }

    public List<Inventory> expire() {
        long deadline = Instant.now().getEpochSecond();
        LinkedList<Inventory> toDelete = new LinkedList<>();
        lock.lock();
        try {
            for (Map.Entry<InventoryVector, Stem> entry : hashMap.entrySet()) {
                if (entry.getValue().timeout() < deadline) {
                    toDelete.add(new Inventory(entry.getValue().stream(), entry.getKey(), entry.getValue().child()));
                }
            }
            for (Inventory inventory : toDelete) {
                removeHash(inventory.hashId(), "");
                Queues.getInstance().getInvQueue().add(inventory);
            }
        } finally {
            lock.unlock();
        }
        return toDelete;
    }

    public void reRandomiseStems() {
        var l = new ArrayList<>(ConnectionPool.getInstance().getOutboundConnections().values());
        Collections.shuffle(l);
        int length = Math.min(l.size(), 2);
        lock.lock();
        try {
            stem.clear();
            stem.addAll(l.subList(0, length));
        } finally {
            lock.unlock();
        }
        refresh = Instant.now().getEpochSecond() + REASSIGN_INTERVAL;
    }
}
