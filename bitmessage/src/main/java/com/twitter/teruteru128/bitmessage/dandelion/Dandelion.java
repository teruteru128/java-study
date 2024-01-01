package com.twitter.teruteru128.bitmessage.dandelion;

import java.time.Instant;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.locks.ReentrantLock;

import com.twitter.teruteru128.bitmessage.ConnectionPool;
import com.twitter.teruteru128.bitmessage.Queues;
import com.twitter.teruteru128.bitmessage.Stem;
import com.twitter.teruteru128.bitmessage.inventory.InventoryVector;

/**
 * Dandelion class for tracking stem/fluff stages.
 */
public class Dandelion {

    /**
     * randomise routes after 600 seconds
     */
    private static final int REASSIGN_INTERVAL = 600;
    /** trigger fluff due to expiration */
    private static final int FLUFF_TRIGGER_FIXED_DELAY = 10;
    private static final int FLUFF_TRIGGER_MEAN_DELAY = 30;

    private static final int MAX_STEMS = 2;

    /** currently assignable child stems */
    private ArrayList<Object> stem = new ArrayList<>();
    /** currently assigned parent <-> child mappings */
    private HashMap<Object, Object> nodeMap = new HashMap<>();
    /** currently existing objects in stem mode */
    private HashMap<InventoryVector, Stem> hashMap = new HashMap<>();
    /** when to rerandomise routes */
    private ZonedDateTime refresh = ZonedDateTime.now().plusSeconds(REASSIGN_INTERVAL);
    private ReentrantLock lock = new ReentrantLock();

    private Dandelion() {
    }

    private static final Dandelion INSTANCE = new Dandelion();

    public static Dandelion getInstance() {
        return INSTANCE;
    }

    public ZonedDateTime getRefresh() {
        return refresh;
    }

    public boolean isStemsExpired() {
        return refresh.compareTo(ZonedDateTime.now()) < 0;
    }

    private static long poisson(long average) {
        double xp = 1. / (1 - ThreadLocalRandom.current().nextDouble());
        long count = 0;
        double exp_average = Math.exp(average);
        while (xp < exp_average) {
            xp /= (1 - ThreadLocalRandom.current().nextDouble());
            count++;
        }
        return count;
    }

    /**
     * ポアソン分布に基づくタイムアウト時間選定。
     * 
     * なんかアルゴリズム間違ってるらしいよ？
     * 
     * @see org.apache.commons.math3.distribution.PoissonDistribution
     * @return
     */
    private static long poissonTimeout() {
        long start = Instant.now().getEpochSecond();
        long average = FLUFF_TRIGGER_MEAN_DELAY;
        return start + poisson(average) + FLUFF_TRIGGER_FIXED_DELAY;
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
        // TODO insert debug message here
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
                removeHash(inventory.hashId(), "expired");
                Queues.getInstance().getInvQueue().add(inventory);
            }
        } finally {
            lock.unlock();
        }
        return toDelete;
    }

    /**
     * resellect child stems from connection pool
     */
    public void reRandomiseStems() {
        var l = new ArrayList<>(ConnectionPool.getInstance().getOutboundConnections().values());
        lock.lock();
        try {
            stem.clear();
            if (l.size() < MAX_STEMS) {
                stem.addAll(l);
            } else {
                Collections.shuffle(l);
                stem.addAll(l.subList(0, MAX_STEMS));
            }
        } finally {
            lock.unlock();
        }
        refresh = ZonedDateTime.now().plusSeconds(REASSIGN_INTERVAL);
    }
}
