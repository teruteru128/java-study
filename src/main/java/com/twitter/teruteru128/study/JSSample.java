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
            System.out.println("Engine: " + factory.getEngineName() + ", Version: " + factory.getEngineVersion());
            System.out.println("Language: " + factory.getLanguageName() + ", Version: " + factory.getLanguageVersion());
            System.out.println("Extensions: " + factory.getExtensions());
            System.out.println("MimeTypes: " + factory.getMimeTypes());
            System.out.println("Names: " + factory.getNames());
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
