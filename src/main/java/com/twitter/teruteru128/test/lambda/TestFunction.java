package com.twitter.teruteru128.test.lambda;

import java.util.stream.Stream;

@FunctionalInterface
public interface TestFunction {
     Stream<String> test();
}
