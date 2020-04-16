package com.twitter.teruteru128.study.stream;

import java.util.ArrayList;
import java.util.Random;
import java.util.stream.IntStream;

/**
 * @author Teruteru
 *
 */
public class Test {

    /**
     * @param args
     */
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        StringBuilder sb= new StringBuilder();
        Random r= new Random();
        for(char c = 'A' ;c <= 'Z';c++){
            for(int i=0;i<r.nextInt(200)+1;i++){
                sb.append(c);
            }
            list.add(sb.toString());
            sb.delete(0, sb.length());
        }
        IntStream is=list.stream().mapToInt(e->e.length());
        int sum=is.sum();
        System.out.println(sum);
    }

}
