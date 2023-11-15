package com.twitter.teruteru128.study;

import java.util.ArrayList;
import java.util.HexFormat;
import java.util.StringJoiner;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

/**
 * Main
 */
public class Main {

    public static final HexFormat format = HexFormat.of();

    static {
        try {
            Class.forName("com.twitter.teruteru128.study.BCProviderLoader");
        } catch (ClassNotFoundException e) {
            throw new InternalError(e);
        }
    }

    /**
     * 
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        int threadNum = 1;
        var context = new SearchContext();
        int length = args.length;
        for (int i = 0; i < length; i++) {
            if (args[i].equalsIgnoreCase("--help")) {
                System.err.println("args:");
                System.err.println("-t --thread <threadNum> : スレッド数");
                System.err.println("-s --start <startSeed> : 初期シード値");
                return;
            } else if ((args[i].equalsIgnoreCase("--thread") || args[i].equalsIgnoreCase("-t")) && i + 1 < length) {
                try {
                    threadNum = Integer.parseInt(args[i + 1]);
                } catch (NumberFormatException e) {
                    System.err.println("threadの設定に失敗したから1にしておくゾ");
                    threadNum = 1;
                }
                i++;
            } else if ((args[i].equalsIgnoreCase("--start") || args[i].equalsIgnoreCase("-s")) && i + 1 < length) {
                try {
                    long worldSeed = Long.parseLong(args[i + 1]);
                    context.getWorldSeed().set(Long.parseLong(args[i + 1]));
                    System.err.printf("初期ワールドシードが%dに設定されました%n", worldSeed);
                } catch (NumberFormatException e) {
                    long worldSeed = ThreadLocalRandom.current().nextLong(1L << 32);
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
        var service = Executors.newCachedThreadPool();
        var re = service.invokeAny(tasks);
        System.out.println(re);
        service.shutdown();
        service.awaitTermination(5, TimeUnit.MINUTES);
    }

    /**
     * @see {@link String#join(String, String, String, String[], int)}
     * @param num
     * @param faces
     * @return
     */
    private static void _3d6(int num, int faces) {
        var p = ThreadLocalRandom.current().nextLong((long) Math.pow(faces, num));
        var array = new long[num];
        var sum = 0;
        var joiner = new StringJoiner(", ", "[", "]");
        for (int i = 0; i < num; i++) {
            array[i] = (p % faces) + 1;
            joiner.add(Long.toString(array[i]));
            p /= faces;
            sum += array[i];
        }
        System.out.printf("%s%n", joiner);
        System.out.printf("%d%n", sum);
    }
}
