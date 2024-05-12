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
    ArrayList<Integer> numberOriginalList = IntStream.rangeClosed(1, 37).boxed()
        .collect(Collectors.toCollection(ArrayList<Integer>::new));
    var selectedNumberArray = new int[7];
    for (int i = 0; i < counts; i++) {
      Collections.shuffle(numberOriginalList, random);
      for (int j = 0; j < 7; j++) {
        selectedNumberArray[j] = numberOriginalList.get(j);
      }
      Arrays.sort(selectedNumberArray);
      System.out.printf("%d, %d, %d, %d, %d, %d, %d%n", selectedNumberArray[0],
          selectedNumberArray[1], selectedNumberArray[2], selectedNumberArray[3],
          selectedNumberArray[4], selectedNumberArray[5], selectedNumberArray[6]);
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
}
