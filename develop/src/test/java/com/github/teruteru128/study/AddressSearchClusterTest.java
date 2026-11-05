package com.github.teruteru128.study;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.github.teruteru128.study.AddressSearchCluster.Unit;
import java.util.BitSet;
import java.util.List;
import org.junit.jupiter.api.Test;

class AddressSearchClusterTest {

  private static BitSet bits(int... ranges) {
    var set = new BitSet();
    for (var i = 0; i < ranges.length; i += 2) {
      set.set(ranges[i], ranges[i + 1]);
    }
    return set;
  }

  @Test
  void splitsEmptyProgressIntoUnits() {
    assertEquals(List.of(new Unit(0, 4), new Unit(4, 8), new Unit(8, 10)),
        AddressSearchCluster.splitRange(new BitSet(), 10, 4, false));
    assertEquals(List.of(), AddressSearchCluster.splitRange(new BitSet(), 10, 4, true));
  }

  @Test
  void keepsFinishedRunsWholeAndChopsOnlyTodo() {
    var done = bits(0, 3, 5, 15);
    assertEquals(List.of(new Unit(3, 5), new Unit(15, 16)),
        AddressSearchCluster.splitRange(done, 16, 4, false));
    assertEquals(List.of(new Unit(0, 3), new Unit(5, 15)),
        AddressSearchCluster.splitRange(done, 16, 4, true));
  }

  @Test
  void handlesFullyFinished() {
    var done = bits(0, 16);
    assertEquals(List.of(), AddressSearchCluster.splitRange(done, 16, 4, false));
    assertEquals(List.of(new Unit(0, 16)), AddressSearchCluster.splitRange(done, 16, 4, true));
  }
}
