package com.twitter.teruteru128.jaxb;

import java.nio.file.Paths;
import java.util.ArrayList;

import jakarta.xml.bind.JAXB;

/**
 * NiconamaCommnetViewerのUserSetting.xml読み込みテスト
 * 
 * @author Teruteru
 * @see {@link https://qiita.com/opengl-8080/items/f7112240c72d61d4cdf4
 *      JAXB使い方メモ}
 */
public class Main {

    /**
     * @param args
     */
    public static void main(String[] args) throws Exception {
        if (args.length < 1) {
            System.out.println("コマンド(output|input)とUserSetting.xmlのパスを指定してください");
            Runtime.getRuntime().exit(1);
        }
        if (args[0].equals("output")) {
            var setting = new UserSetting();
            var users = new ArrayList<User>();
            for (int i = 0; i < 10; i++) {
                users.add(new User());
            }
            setting.setUser(users);
            JAXB.marshal(setting, System.out);
        } else if (args[0].equals("input")) {
            if (args.length < 2) {
                System.out.println("コマンドinputとUserSetting.xmlのパスを指定してください");
                Runtime.getRuntime().exit(1);
            }
            var setting = JAXB.unmarshal(Paths.get(args[1]).toFile(), UserSetting.class);
            setting.getUser().forEach(System.out::println);
        } else {
            System.out.println("不明なコマンドです");
        }
    }

}
