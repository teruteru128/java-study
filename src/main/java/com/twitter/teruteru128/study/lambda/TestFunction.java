package com.twitter.teruteru128.study.lambda;

import java.util.stream.Stream;

@FunctionalInterface
public interface TestFunction {
     Stream<String> test();
}
