package com.github.teruteru128.primesearch.search;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/** 候補を判定するスレッドプール。 */
final class WorkerPool {

  private WorkerPool() {
  }

  /**
   * 同時に判定する候補がthreads件を超えないプールを作る。投入した順(FIFO)に着手する。
   * <p>
   * ForkJoinPoolを使ってはいけない。ワーカーがProcess.waitFor()などでブロックすると、
   * 並列度を保つために代わりのスレッドを足していく(既定の上限は並列度+256)。PFGWを
   * 外部プロセスで待つようにしたところ、8スレッドのはずが270件以上を同時に走らせた
   * (2026-10-25 13:49)。mr2fsとGMPはネイティブ呼び出しの中で計算するので起きなかった。
   */
  static ExecutorService create(int threads) {
    return Executors.newFixedThreadPool(threads);
  }
}
