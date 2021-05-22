package com.twitter.teruteru128.util;

import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * リストからランダムに要素を取得するユーティリティーを提供します。
 * 
 * @author
 */
public class ListRandomChoicer<E> {
    private List<E> list;
    private Random random;
    /**
     * 連続で同じ要素が出ることを抑止する
     */
    private boolean collision;
    private E element = null;

    public ListRandomChoicer(List<E> list) {
        this(list, new Random(), false);
    }

    public ListRandomChoicer(List<E> list, Random r) {
        this(list, r, false);
    }

    public ListRandomChoicer(List<E> list, boolean collision) {
        this(list, new Random(), collision);
    }

    public ListRandomChoicer(List<E> list, Random r, boolean collision) {
        Collections.shuffle(list, r);
        this.list = list;
        this.random = r;
        this.collision = collision;
    }

    public E randamGet() {
        E e = null;
        do {
            e = this.list.get(random.nextInt(list.size()));
        } while (collision && element == e);
        element = e;
        return e;
    }

    public E randamRemove() {
        var e = this.list.remove(0);
        element = e;
        return e;
    }
}
