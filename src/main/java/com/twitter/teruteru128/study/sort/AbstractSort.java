package com.twitter.teruteru128.study.sort;

@FunctionalInterface
interface AbstractSort<T> {
    void sort(T[] arg);
}
