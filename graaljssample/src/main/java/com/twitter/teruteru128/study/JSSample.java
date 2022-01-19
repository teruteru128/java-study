package com.twitter.teruteru128.study;

import java.util.function.Predicate;

import javax.script.Bindings;
import javax.script.ScriptContext;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class JSSample {

    private JSSample() {
    }

    /**
     * @see https://www.hos.co.jp/blog/20211101/
    */
    public static void main(String[] args) throws ScriptException {
        System.setProperty("polyglot.js.nashorn-compat", "true");
        var manager = new ScriptEngineManager();
        var engine = manager.getEngineByName("JavaScript");
        System.out.printf("engine : %s%n", engine);
        Bindings bindings = engine.getBindings(ScriptContext.ENGINE_SCOPE);
        bindings.put("polyglot.js.allowHostAccess", true);
        bindings.put("polyglot.js.allowHostClassLookup", (Predicate<String>) s -> true);
        bindings.put("javaObj", new Object());
        engine.eval("(javaObj instanceof Java.type('java.lang.Object'));"); // it will not work without allowHostAccess and allowHostClassLookup
        
        var graaljs = manager.getEngineByName("graal.js");
        if (graaljs != null) {
            System.err.printf("graal.js : %s%n", graaljs);
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
