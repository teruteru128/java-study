package com.github.teruteru128.slime.slime;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.params.provider.Arguments.arguments;

import java.util.Random;
import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class SearchTaskTest {

  static Stream<Arguments> isSlimeChunkMethodSource() {
    var seed = 42056176818708L;
    var x = -196;
    var z = -150;
    var builder = Stream.<Arguments>builder();
    var random = new Random();
    for (int i = 0; i < 4; i++) {
      for (int j = 0; j < 4; j++) {
        builder.add(arguments(random, seed, x + i, z + j));
      }
    }
    return builder.build();
  }

  @ParameterizedTest
  @MethodSource("isSlimeChunkMethodSource")
  void isSlimeChunk(Random random, long seed, int x, int z) {
    assertTrue(SearchTask.isSlimeChunk(random, seed, x, z));
  }
}
