package com.twitter.teruteru128.study.lambda;

import java.util.function.Supplier;
import java.util.stream.Stream;

@FunctionalInterface
public interface StreamSupplier<T> extends Supplier<Stream<T>> {
     Stream<T> get();
}
