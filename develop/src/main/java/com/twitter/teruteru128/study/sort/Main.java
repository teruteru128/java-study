package com.twitter.teruteru128.study.sort;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

/**
 * 
 *
 */
public class Main implements AbstractIntSort{

    /**
     * @param args
     */
    public static void main(String[] args) {
        int[] table = new int[100000000];
        long shuffles;
        long shufflee;
        long sorts;
        long sorte;
        for (int i = 0, length = table.length; i < length; i++) {
            table[i] = i;
        }
        System.out.println("初期化終了");
        shuffles=System.nanoTime();
        try {
            shuffle(table, SecureRandom.getInstanceStrong());
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        shufflee=System.nanoTime();
        System.out.println("シャッフル終了");
        System.out.println("シャッフル"+((shufflee-shuffles)/1e9)+"ミリ秒");
        //System.out.println(Arrays.toString(table));
        AbstractIntSort m = new Main();
        sorts=System.nanoTime();
        m.sort(table);
        sorte=System.nanoTime();
        //System.out.println(Arrays.toString(table));
        System.out.println("ソート"+((sorte-sorts)/1e9)+"ミリ秒");
    }

    public static List<Integer> toList(int[] arg) {
        return Arrays.stream(arg).boxed().collect(Collectors.toList());
    }

    public static int[] toArray(List<Integer> arg) {
        return arg.stream().mapToInt(Integer::intValue).toArray();
    }

    /*
     * 軸要素の選択 順に見て、最初に見つかった異なる2つの要素のうち、 大きいほうの番号を返します。 全部同じ要素の場合は -1 を返します。
     */
    int pivot(int[] a, int i, int j) {
        int k = i + 1;
        while (k <= j && a[i] == a[k]) {
            k++;
        }
        if (k > j) {
            return -1;
        }
        if (a[i] >= a[k]) {
            return i;
        }
        return k;
    }

    /*
     * パーティション分割 a[i]～a[j]の間で、x を軸として分割します。 x より小さい要素は前に、大きい要素はうしろに来ます。
     * 大きい要素の開始番号を返します。
     */
    int partition(int[] a, int i, int j, int x) {
        int l = i, r = j;

        // 検索が交差するまで繰り返します
        while (l <= r) {

            // 軸要素以上のデータを探します
            while (l <= j && a[l] < x) {
                l++;
            }

            // 軸要素未満のデータを探します
            while (r >= i && a[r] >= x) {
                r--;
            }

            if (l > r) {
                break;
            }
            int t = a[l];
            a[l] = a[r];
            a[r] = t;
            l++;
            r--;
        }
        return l;
    }

    /*
     * クイックソート（再帰用） 配列aの、a[i]からa[j]を並べ替えます。
     */
    public void quickSort(int[] a, int i, int j) {
        if (i == j) {
            return;
        }
        int p = pivot(a, i, j);
        if (p != -1) {
            int k = partition(a, i, j, a[p]);
            quickSort(a, i, k - 1);
            quickSort(a, k, j);
        }
    }

    /*
     * ソート
     */
    public void sort(int[] a) {
        quickSort(a, 0, a.length - 1);
    }
    public static void shuffle(int[] array,Random rnd){
        int length=array.length;
        for (int i=length; i>1; i--){
            swap(array, i-1, rnd.nextInt(i));
        }
    }
    public static void swap(int[] arr,int i,int j){
        int tmp=arr[i];
        arr[i]=arr[j];
        arr[j]=tmp;
    }
}
