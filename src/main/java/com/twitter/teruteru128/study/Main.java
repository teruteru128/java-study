package com.twitter.teruteru128.study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        System.out.println("2つの整数を入力してください");

        //数値の入力
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));

        System.out.print("a = ");
        String a =br.readLine();  //aは文字列
        int num =Integer.parseInt(a); //numは数値

        System.out.print("b = ");
        String b =br.readLine();  //bは文字列
        int num2 =Integer.parseInt(b);  //num2は数値

        //出力
        System.out.println(a + " + " + b + " = " + (num+num2));
        System.out.println(a + " - " + b + " = " + (num-num2));
        System.out.println(a + " * " + b + " = " + (num*num2));
        System.out.println(a + " / " + b + " = " + (num/num2) + " 余り " + (num%num2));
        System.out.println(a + " / " + b + " = " + (((double)num/num2)));
    }
}
