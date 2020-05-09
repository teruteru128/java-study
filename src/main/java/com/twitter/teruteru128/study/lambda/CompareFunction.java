package com.twitter.teruteru128.study.lambda;

import java.util.function.ToIntFunction;

interface CompareFunction<T extends Comparable<? super T>> extends ToIntFunction<T> {
}
