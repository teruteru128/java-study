package com.twitter.teruteru128.study;

import java.util.List;

import javax.script.ScriptEngineFactory;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class JSSample {

    public JSSample() {
    }

    public static void main(String[] args) {
        ScriptEngineManager manager = new ScriptEngineManager();
        List<ScriptEngineFactory> engineFactories = manager.getEngineFactories();
        System.out.printf("List length : %d\n", engineFactories.size());
        System.out.println("--------");
        for (ScriptEngineFactory factory : engineFactories) {
            System.out.printf("Engine: %s, Version: %s%n", factory.getEngineName(), factory.getEngineVersion());
            System.out.printf("Language: %s, Version: %s%n", factory.getLanguageName(), factory.getLanguageVersion());
            System.out.printf("Extensions: %s%n", factory.getExtensions());
            System.out.printf("MimeTypes: %s%n", factory.getMimeTypes());
            System.out.printf("Names: %s%n", factory.getNames());
            System.out.println("--------");
        }
        var engine = manager.getEngineByName("graal.js");
        if (engine != null) {
            System.out.println(engine);
        } else {
            System.out.println("graal.js not found");
        }
        engine = new ScriptEngineManager().getEngineByName("js");
        try {
            Object val = engine.eval("var hoge = 'aaaaaaaa'; print(hoge); hoge;");
            System.out.printf("%s, %s%n", val, val.getClass());
        } catch (ScriptException e) {
            e.printStackTrace();
        }
    }
}
