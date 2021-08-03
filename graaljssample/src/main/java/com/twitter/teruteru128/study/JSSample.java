package com.twitter.teruteru128.study;

import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class JSSample {

    private JSSample() {
    }

    public static void main(String[] args) {
        var manager = new ScriptEngineManager();
        var engineFactories = manager.getEngineFactories();
        System.out.printf("List length : %d\n", engineFactories.size());
        System.out.println("--------");
        for (var factory : engineFactories) {
            System.out.printf("Engine: %s, Version: %s%n", factory.getEngineName(), factory.getEngineVersion());
            System.out.printf("Language: %s, Version: %s%n", factory.getLanguageName(), factory.getLanguageVersion());
            System.out.printf("Extensions: %s%n", factory.getExtensions());
            System.out.printf("MimeTypes: %s%n", factory.getMimeTypes());
            System.out.printf("Names: %s%n", factory.getNames());
            System.out.println("--------");
        }
        var graaljs = manager.getEngineByName("graal.js");
        if (graaljs != null) {
            System.err.println(graaljs);
        } else {
            System.out.println("graal.js not found");
        }
        var js = manager.getEngineByName("js");
        if (js != null) {
            try {
                var val = js.eval("var hoge = 'aaaaaaaa'; print(hoge); print('Hello? This is teruteru.'); hoge;");
                if (val != null) {
                    System.out.printf("%s, %s%n", val, val.getClass());
                } else {
                    System.out.printf("%s, (null)%n", val);
                }
            } catch (ScriptException e) {
                e.printStackTrace();
            }
        }
    }
}
