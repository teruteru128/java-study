package com.github.teruteru128.primesearch.search;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.atomic.AtomicInteger;
import org.junit.jupiter.api.Test;

class WorkerPoolTest {

  /** 外部プロセスを待つタスクでも、同時に走るのはthreads件まで。 */
  @Test
  void blockingOnProcessDoesNotAddThreads() throws Exception {
    var threads = 3;
    var tasks = 12;
    var running = new AtomicInteger();
    var max = new AtomicInteger();
    try (var pool = WorkerPool.create(threads)) {
      var service = new ExecutorCompletionService<Integer>(pool);
      for (int i = 0; i < tasks; i++) {
        service.submit(() -> {
          max.accumulateAndGet(running.incrementAndGet(), Math::max);
          try {
            return new ProcessBuilder("sleep", "0.3").start().waitFor();
          } finally {
            running.decrementAndGet();
          }
        });
      }
      for (int i = 0; i < tasks; i++) {
        assertEquals(0, service.take().get());
      }
    }
    assertEquals(threads, max.get());
  }
}
