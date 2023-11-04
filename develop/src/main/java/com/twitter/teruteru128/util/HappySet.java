package com.twitter.teruteru128.util;

import java.util.AbstractSet;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;

/**
 * @author Teruteru
 *
 */
public class HappySet<E> extends AbstractSet<E> {
    private transient HashMap<E, Object> map;
    // Dummy value to associate with an Object in the backing Map
    private static final Object PRESENT = new Object();

    /**
     * 
     */
    public HappySet() {
        map = new HashMap<E, Object>();
    }

    public HappySet(Collection<? extends E> c) {
        map = new HashMap<E, Object>(Math.max((int) (c.size() / .75f) + 1, 16));
        addAll(c);
    }

    public HappySet(int initialCapacity, float loadFactor) {
        map = new HashMap<E, Object>(initialCapacity, loadFactor);
    }

    public HappySet(int initialCapacity) {
        map = new HashMap<E, Object>(initialCapacity);
    }

    /***/
    HappySet(int initialCapacity, float loadFactor, boolean dummy) {
        map = new LinkedHashMap<E, Object>(initialCapacity, loadFactor);
    }

    /**
     * (非 Javadoc)
     * 
     * @see java.util.AbstractCollection#iterator()
     */
    @Override
    public Iterator<E> iterator() {
        return map.keySet().iterator();
    }

    /**
     * (非 Javadoc)
     * 
     * @see java.util.AbstractCollection#size()
     */
    @Override
    public int size() {
        return map.size();
    }

    @Override
    public boolean add(E e) {
        return map.put(e, PRESENT) == null;
    }

    @Override
    public boolean remove(Object o) {
        return map.remove(o) == PRESENT;
    }
}
