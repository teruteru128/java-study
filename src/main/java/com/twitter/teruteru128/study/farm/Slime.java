package com.twitter.teruteru128.study.farm;

class Slime {

    /**
     * セクション(シード値を一定数ごとに塊にする) シード値ループ ブランチループ(南北ループ1) 東西方向ループ
     * if(!(nチャンク目がスライムチャンク)){ nチャンクスキップ } ブランチの壁を掘る(南北ループ2)
     */
    public static void main(String[] args) {
        long mask = (1L << 48) - 1;
        long seed1 = -3213054711323627496L;
        System.out.printf("%d%n", seed1);
        System.out.printf("%d%n", mask);
        System.out.printf("%016x%n", seed1);
        System.out.printf("%016x%n", mask);
        System.out.printf("%,d%n", seed1 & mask);
        System.out.printf("%016x%n", seed1 & mask);
        var seed2 = 1613738097659009556L;
        System.out.printf("%,d%n", seed2 & mask);
        System.out.printf("%016x%n", seed2 & mask);
        long clusterSize = 5;
        long seed_MAX = 0xffffffffL;
        long seed_MIN = 0x00000000L;

        for (long seed = seed_MIN; seed < seed_MAX; seed++) {
            for (long branchZ = -309; branchZ < 312; branchZ += clusterSize) {
                for (long x = -313; x < 312; x++) {
                }
            }
        }
    }
}
