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
        var setting = new UserSetting();
        var users = new ArrayList<User>();
        for (int i = 0; i < 10; i++) {
            users.add(new User());
        }
        setting.setUser(users);
        JAXB.marshal(setting, System.out);
        System.out.println("--");
        setting = JAXB.unmarshal(
                Paths.get("/mnt/c/Users/terut/AppData/Roaming/posite-c/NiconamaCommentViewer/UserSetting.xml").toFile(),
                UserSetting.class);
        setting.getUser().forEach(System.out::println);
    }

}
