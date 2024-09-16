package com.github.teruteru128.study;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.random.RandomGenerator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Lottery {

  private static final RandomGenerator random = RandomGenerator.of("SecureRandom");

  public static void getLotto7Numbers(int counts) {
    var numberOriginalList = IntStream.rangeClosed(1, 37).mapToObj(Integer::toString)
        .collect(Collectors.toCollection(ArrayList<String>::new));
    var list = new ArrayList<String>(7);
    var tmp = new ArrayList<String>();
    for (int i = 0; i < counts; i++) {
      tmp.clear();
      tmp.addAll(numberOriginalList);
      Collections.shuffle(tmp, random);
      list.add(tmp.removeFirst());
      list.add(tmp.removeLast());
      Collections.shuffle(tmp, random);
      list.add(tmp.removeFirst());
      list.add(tmp.removeLast());
      Collections.shuffle(tmp, random);
      list.add(tmp.removeFirst());
      list.add(tmp.removeLast());
      Collections.shuffle(tmp, random);
      list.add(tmp.removeFirst());
      Collections.sort(list);
      System.out.println(String.join(", ", list));
    }
  }

  public static void pattern1(int counts) {
    var listA = IntStream.rangeClosed(1, 37).boxed()
        .collect(Collectors.toCollection(ArrayList::new));
    // 固定する3つを選択する
    var fixed = new int[3];
    for (int i = 0; i < 3; i++) {
      Collections.shuffle(listA, random);
      fixed[i] = listA.removeFirst();
    }
    System.out.printf("fixed: %d, %d, %d%n", fixed[0], fixed[1], fixed[2]);
    // ランダムの4つを選ぶ
    var randomChoice = new int[4];
    var numbers = new int[7];
    var listB = new ArrayList<Integer>();
    for (int c = 0; c < counts; c++) {
      listB.addAll(listA);
      for (int i = 0; i < 4; i++) {
        Collections.shuffle(listB, random);
        randomChoice[i] = listB.removeFirst();
      }
      System.arraycopy(fixed, 0, numbers, 0, 3);
      System.arraycopy(randomChoice, 0, numbers, 3, 4);
      Arrays.sort(numbers);
      System.out.printf("%d, %d, %d, %d, %d, %d, %d%n", numbers[0], numbers[1], numbers[2],
          numbers[3], numbers[4], numbers[5], numbers[6]);
      listB.clear();
    }
  }

  public static void pattern2(int[] fixed, int counts) {
    var listA = IntStream.rangeClosed(1, 37).boxed()
        .collect(Collectors.toCollection(ArrayList::new));
    for (var f : fixed) {
      listA.remove((Integer) f);
    }
    // ランダムの4つを選ぶ
    var randomChoice = new int[4];
    var numbers = new int[7];
    var listB = new ArrayList<Integer>();
    for (int c = 0; c < counts; c++) {
      listB.addAll(listA);
      for (int i = 0; i < 2; i++) {
        Collections.shuffle(listB, random);
        randomChoice[i * 2] = listB.removeFirst();
        randomChoice[i * 2 + 1] = listB.removeLast();
      }
      System.arraycopy(fixed, 0, numbers, 0, 3);
      System.arraycopy(randomChoice, 0, numbers, 3, 4);
      Arrays.sort(numbers);
      System.out.printf("%d, %d, %d, %d, %d, %d, %d%n", numbers[0], numbers[1], numbers[2],
          numbers[3], numbers[4], numbers[5], numbers[6]);
      listB.clear();
    }
  }
}
