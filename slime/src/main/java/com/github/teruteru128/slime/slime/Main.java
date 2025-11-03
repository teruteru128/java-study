package com.github.teruteru128.slime.slime;

import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

public class Main {

  public static void main(String[] args) throws InterruptedException, ExecutionException {
    int threadNum = 1;
    var context = new SearchContext();
    int length = args.length;
    for (int i = 0; i < length; i++) {
      if (args[i].equalsIgnoreCase("--help")) {
        System.err.println("args:");
        System.err.println("-t --thread <threadNum> : スレッド数");
        System.err.println("-s --start <startSeed> : 初期シード値");
        return;
      } else if ((args[i].equalsIgnoreCase("--thread") || args[i].equalsIgnoreCase("-t"))
                 && i + 1 < length) {
        try {
          threadNum = Integer.parseInt(args[i + 1]);
          System.err.printf("スレッド数が%dに設定されました%n", threadNum);
        } catch (NumberFormatException e) {
          System.err.println("threadの設定に失敗したから1にしておくゾ");
          threadNum = 1;
        }
        i++;
      } else if ((args[i].equalsIgnoreCase("--start") || args[i].equalsIgnoreCase("-s"))
                 && i + 1 < length) {
        try {
          long worldSeed = Long.parseLong(args[i + 1]);
          context.getWorldSeed().set(worldSeed);
          System.err.printf("初期ワールドシードが%dに設定されました%n", worldSeed);
        } catch (NumberFormatException e) {
          long worldSeed = (long) ThreadLocalRandom.current().nextInt(1 << 16) << 32;
          System.err.printf("startの設定に失敗したから%dにしておくゾ%n", worldSeed);
          context.getWorldSeed().set(worldSeed);
        }
        i++;
      }
    }
    var task = new SearchTask(context);
    var tasks = new ArrayList<SearchTask>(threadNum);
    for (int i = 0; i < threadNum; i++) {
      tasks.add(task);
    }
    try (var service = Executors.newCachedThreadPool()) {
      var re = service.invokeAny(tasks);
      System.out.println(re);
      service.shutdown();
      var b = service.awaitTermination(5, TimeUnit.MINUTES);
    }
  }
}
