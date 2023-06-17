package com.twitter.teruteru128.tool;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.NetworkInterface;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Ctrl-Cで終了します");

        var e = NetworkInterface.getNetworkInterfaces();
        while(e.hasMoreElements()){
            var i = e.nextElement();
            System.out.printf("%s: %s%n", i.getName(), i.getDisplayName());
        }
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            System.out.print("インターフェイスのIPアドレスを入力してエンター >");
            String line = reader.readLine();
            var i = NetworkInterface.getByInetAddress(InetAddress.getByName(line));
            if (i != null) {
                System.out.printf("%s: %s%n", i.getName(), i.getDisplayName());
            }else{
                System.out.println("見つかりませんでした。");
            }
        }
    }
}
